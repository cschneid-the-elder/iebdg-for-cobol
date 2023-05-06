
import java.util.*;
import java.util.logging.Logger;

/**

*/

class DDNode {
	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private String redefinesIdentifier = null;
	private List<String> renamesIdentifier = null;
	private Integer level = null;
	private int nb = 0;
	private String identifier = null;
	private String valueInValueClause = null;
	private List<String> valuesSet = new ArrayList<>();
	private Boolean global = false;
	private Boolean external = false;
	private Boolean sync = false;
	private DDNodeType type = null;
	private Boolean numeric = false;
	private Boolean group = false;
	private Integer length = 0;
	private CobolParser.PictureStringContext psCtx = null;
	private CobolParser.DataDescriptionEntryContext ddeCtx = null;
	private CobolParser.DataDescriptionEntryFormat1Context dde1Ctx = null;
	private CobolParser.DataDescriptionEntryFormat2Context dde2Ctx = null;
	private CobolParser.DataDescriptionEntryFormat3Context dde3Ctx = null;
	
	public DDNode(
			CobolParser.DataDescriptionEntryFormat1Context ctx
			, Logger LOGGER
			) {
		this.LOGGER = LOGGER;
		this.dde1Ctx = ctx;
		this.setIdentifierFromDDE1CTX();
		this.setLevelFromDDE1CTX();
		this.setValueFromDDE1CTX();
		this.setRedefinesFromDDE1CTX();
		if (dde1Ctx.dataGlobalClause() != null && dde1Ctx.dataGlobalClause().size() > 0) {
			this.global = true;
		}
		if (dde1Ctx.dataExternalClause() != null && dde1Ctx.dataExternalClause().size() > 0) {
			this.external = true;
		}
		if (dde1Ctx.dataSynchronizedClause() != null && dde1Ctx.dataSynchronizedClause().size() > 0) {
			this.sync = true;
		}
		this.setTypeFromDDE1CTX();
	}

	private void setIdentifierFromDDE1CTX() {
		if (this.dde1Ctx.dataName() == null) {
			if (this.dde1Ctx.FILLER() == null) {
				this.identifier = "";
			} else {
				this.identifier = "FILLER";
			}
		} else {
			this.identifier = this.dde1Ctx.dataName().cobolWord().getText();
		}

	}

	private void setIdentifierFromDDE3CTX() {
		this.identifier = this.dde3Ctx.conditionName().cobolWord().getText();
	}

	private void setLevelFromDDE1CTX() {
		if (this.dde1Ctx.INTEGERLITERAL() == null) {
			this.level = Integer.parseInt(this.dde1Ctx.LEVEL_NUMBER_77().toString());
		} else {
			this.level = Integer.parseInt(this.dde1Ctx.INTEGERLITERAL().toString());
		}
	}

	private void setLevelFromDDE3CTX() {
		this.level = Integer.parseInt(this.dde3Ctx.LEVEL_NUMBER_88().toString());
	}

	private void setValueFromDDE1CTX() {
		if (this.dde1Ctx.dataValueClause() == null || this.dde1Ctx.dataValueClause().size() == 0) {
			return;
		} else {
			/**
				There is a List of dataValueClauses, but for our purposes we
				only care about identifiers where there is exactly one.  So 
				we're going to pretend there's only one for all identifiers.
			*/
			if (this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal() == null) {
				return;
			} else {
				if (this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL() == null) {
					return;
				} else {
					this.valueInValueClause = this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL().toString();
				}
			}
		}

	}

	private void setValueFromDDE3CTX() {
		if (this.dde3Ctx.dataValueClause() == null) {
			return;
		} else {
			/**
				There is a List of dataValueClauses, but for our purposes we
				only care about identifiers where there is exactly one.  So 
				we're going to pretend there's only one for all identifiers.
			*/
			if (this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal() == null) {
				return;
			} else {
				if (this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL() == null) {
					return;
				} else {
					this.valueInValueClause = this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL().toString();
				}
			}
		}

	}

	private void setRedefinesFromDDE1CTX() {
		if (this.dde1Ctx.dataRedefinesClause() == null | this.dde1Ctx.dataRedefinesClause().size() == 0) {
			return;
		} else {
			this.redefinesIdentifier = this.dde1Ctx.dataRedefinesClause(0).dataName().cobolWord().IDENTIFIER().toString();
		}
	}

	private void setTypeFromDDE1CTX() {

		if (this.type != null) {
			this.LOGGER.fine(this.myName + " setTypeFromDDE1CTX() type already set to " + this.type);
			return;
		}
		
		List<CobolParser.DataPictureClauseContext> dpcc = this.dde1Ctx.dataPictureClause();
		if (dpcc != null && dpcc.size() > 0) {
			this.psCtx = dpcc.get(0).pictureString();
			Boolean num = false;
			Boolean nonNum = false;
			for (CobolParser.PictureCharAndCardinalityContext pcacCtx: this.psCtx.pictureCharAndCardinality()) {
				String picString = pcacCtx.pictureChars().getText();
				switch(picString.toUpperCase().charAt(0)) {
					case '9':
						num = true;
						break;
					case 'S':
						num = true;
						break;
					case 'V':
						num = true;
						break;
					default:
						nonNum = true;
						break;
				}
			}
			if (num && !nonNum) {
				this.numeric = true;
			}
		} else {
			this.group = true;
		}
		
		List<CobolParser.DataUsageClauseContext> ducc = this.dde1Ctx.dataUsageClause();
		if (ducc != null && ducc.size() > 0) {
			CobolParser.DataUsageTypeContext dutc = ducc.get(0).dataUsageType();
			if (dutc.BINARY() != null || dutc.COMP() != null || dutc.COMP_4() != null) {
				this.type = DDNodeType.COMP;
			} else if (dutc.COMPUTATIONAL() != null || dutc.COMPUTATIONAL_4() != null) {
				this.type = DDNodeType.COMP;
			} else if (dutc.COMP_5() != null || dutc.COMPUTATIONAL_5() != null) {
				this.type = DDNodeType.COMP5;
			} else if (dutc.COMP_3() != null  || dutc.COMPUTATIONAL_3() != null || dutc.PACKED_DECIMAL() != null) {
				this.type = DDNodeType.COMP3;
			} else if (dutc.DISPLAY() != null) {
				if (this.numeric) {
					this.type = DDNodeType.ZONED;
				} else {
					this.type = DDNodeType.CHAR;
				}
			} else {
				this.type = DDNodeType.UNSUPPORTED;
			}
		} else if (!this.group) {
			if (this.numeric) {
				this.type = DDNodeType.ZONED;
			} else {
				this.type = DDNodeType.CHAR;
			}
		}
	}
	
	private void setLengthFromPictureStringContext() {
		if (this.length > 0) return;
		LOGGER.finest(this.identifier);
		
		List<CobolParser.PictureCharAndCardinalityContext> pcacCtxList = 
			this.psCtx.pictureCharAndCardinality();
		
		if (pcacCtxList != null) {
			for (CobolParser.PictureCharAndCardinalityContext pcacCtx: pcacCtxList) {
				String picChar = pcacCtx.pictureChars().getText();
				LOGGER.finest("picChar = |" + picChar + "|");
				CobolParser.PictureCardinalityContext pcCtx = pcacCtx.pictureCardinality();
				if (pcCtx == null) {
					switch(picChar.toUpperCase()) {
						case "S":
						case "V":
							break;
						case "A":
						case "B":
						case "X":
						case "9":
						case "0":
						case "/":
						case ".":
						case ",":
						case "+":
						case "-":
							this.length++;
							break;
						default:
							this.type = DDNodeType.UNSUPPORTED;
							break;
					}
				} else {
					String picCardinality = pcCtx.getText();
					LOGGER.finest("picCardinality = |" + picCardinality + "|");
					String lengthString = picCardinality.substring(1, picCardinality.length() - 1);
					this.length = this.length + Integer.valueOf(lengthString);
				}
			}
		}
		
		switch(this.type) {
			case COMP:
			case COMP5:
				if (this.length < 5) {
					this.length = 2;
				} else if (this.length < 10) {
					this.length = 4;
				} else {
					this.length = 8;
				}
				break;
			case COMP3:
				Integer i = this.length / 2;
				if (this.length > 1) {
					this.length = i + 1;
				}
				break;
			default:
				break;
		}
		LOGGER.finest(this.identifier + " length " + this.length);
	}

	public void setTypeFromContext(ArrayList<DDNode> nodes) {
		this.LOGGER.fine(this.myName + " setTypeFromContext()");
		for (int i = 0; i < nodes.size(); i++) {
			this.nb++;
			DDNode node = nodes.get(i);
			if (node == this) {
				break;
			}
		}
		
		if (this.level == 77 || this.level == 1) {
			this.LOGGER.fine("return due to this.level = " + this.level);
			return;
		}

		Boolean andSoItBegins = false;
				 
		for (int i = nodes.size() - 1; i >= 0; i--) {
			DDNode node = nodes.get(i);
			if (node == this) {
				andSoItBegins = true;
				this.LOGGER.finest("found this node in nodes");
			}
			this.LOGGER.finest("node = |" + node + "|");
			if (andSoItBegins) {
				if (this.level > node.getLevel()) {
					this.LOGGER.finest(this.level + " > " + node.getLevel());
					if (node.getType() != null) {
						this.type = node.getType();
						break;
					}
				}
			}
		}
		if (this.psCtx != null) {
			this.setLengthFromPictureStringContext();
		}
	}

	public Boolean hasNoParent() {
		return(this.level.intValue() == 77 || this.level.intValue() == 1);
	}

	public Boolean isNewRoot() {
		return(this.level.intValue() == 1);
	}

	public Boolean isCondition() {
		return(this.level.intValue() == 88);
	}

	public Boolean isGlobal() {
		return this.global;
	}

	public Boolean isExternal() {
		return this.external;
	}

	public void setGlobal(Boolean global) {
		this.global = global;
	}

	public void setExternal(Boolean external) {
		this.external = external;
	}

	public Integer getLevel() {
		return this.level;
	}

	public String getValueInValueClause() {
		return this.valueInValueClause;
	}

	public DDNodeType getType() {
		return this.type;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer(this.level.toString());
		sb.append(" " + this.identifier);
		sb.append(" " + this.type);
		if (this.numeric) {
			sb.append(" numeric");
		}
		if (this.group) {
			sb.append(" group");
		}
		sb.append(" " + this.length.toString());
		return sb.toString();
	}

	public void writeIEBDG(StringBuffer out) {
		out.append(String.format("\n  FD NAME=FD%06d", this.nb));
		out.append(String.format(",\n     LENGTH=%d", this.length.intValue()));
		if (this.numeric) {
			out.append(",\n     FORMAT=");
			switch(this.type) {
				case COMP:
				case COMP5:
					out.append("BI");
					break;
				case COMP3:
					out.append("PD");
					break;
				case ZONED:
					out.append("ZD");
					break;
				default:
			}
		}
	}
}
