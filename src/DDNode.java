
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
			CobolParser.DataDescriptionEntryContext ctx
			, Logger LOGGER
			) {
		this.ddeCtx = ctx;
		this.LOGGER = LOGGER;
		this.initialize();
	}

	public void initialize() {
		if (this.ddeCtx.dataDescriptionEntryFormat1() == null) {
			if (this.ddeCtx.dataDescriptionEntryFormat2() == null) {
				if (this.ddeCtx.dataDescriptionEntryFormat3() == null) {
					this.LOGGER.info(myName + " ! dataDescriptionEntryExecSql ignored");
				} else {
					this.dde3Ctx = this.ddeCtx.dataDescriptionEntryFormat3();
					this.setIdentifierFromDDE3CTX();
					this.setLevelFromDDE3CTX();
					this.setValueFromDDE3CTX();
				}
			} else {
				this.dde2Ctx = this.ddeCtx.dataDescriptionEntryFormat2();
				this.setIdentifierFromDDE2CTX();
				this.setLevelFromDDE2CTX();
				this.setRenamesFromDDE2CTX();
			}
		} else {
			this.dde1Ctx = this.ddeCtx.dataDescriptionEntryFormat1();
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
			if (this.psCtx != null) {
				this.setLengthFromPictureStringContext();
			}
		}
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

	private void setIdentifierFromDDE2CTX() {
		this.identifier = this.dde2Ctx.dataName().cobolWord().getText();
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

	private void setLevelFromDDE2CTX() {
		this.level = Integer.parseInt(this.dde2Ctx.LEVEL_NUMBER_66().toString());
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

	private void setRenamesFromDDE2CTX() {
		this.renamesIdentifier = new ArrayList<>();

		for (CobolParser.QualifiedDataNameContext qdnc: this.dde2Ctx.dataRenamesClause().qualifiedDataName()) {
			if (qdnc.qualifiedDataNameFormat1().dataName() == null) {
				this.renamesIdentifier.add(qdnc.qualifiedDataNameFormat1().conditionName().cobolWord().IDENTIFIER().toString());
			} else {
				this.renamesIdentifier.add(qdnc.qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString());
			}
		}
	}

	private void setTypeFromDDE1CTX() {

		List<CobolParser.DataPictureClauseContext> dpcc = this.dde1Ctx.dataPictureClause();
		if (dpcc != null && dpcc.size() > 0) {
			this.psCtx = dpcc.get(0).pictureString();
			Boolean num = false;
			Boolean nonNum = false;
			for (CobolParser.PictureCharsContext pcCtx: this.psCtx.pictureChars()) {
				String picString = pcCtx.getText();
				switch(picString.charAt(0)) {
					case '9':
						num = true;
						break;
					case 's':
						num = true;
						break;
					case 'S':
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
			} else if (dutc.COMP_5() != null) {
				this.type = DDNodeType.COMP5;
			} else if (dutc.COMP_3() != null || dutc.PACKED_DECIMAL() != null) {
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
	
	}

	public void setContext(ArrayList<DDNode> nodes) {
		for (DDNode node: nodes) {
			if (node == this) {
				break;
			}
			
		}
	}

	public Boolean isSpecialLevel() {
		return(this.level.intValue() == 66 || this.level.intValue() == 77 || this.level.intValue() == 88);
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

	public String toString() {
		StringBuffer sb = new StringBuffer(this.level.toString());
		sb.append(" " + this.identifier);
		/*
		switch(this.type) {
			case DDNode.COMP:
				sb.append( " COMP");
				break;
			case DDNodeType.COMP5:
				sb.append( " COMP5");
				break;
			case DDNodeType.COMP3:
				sb.append(" COMP3");
				break;
			case DDNodeType.ZONED:
				sb.append(" ZONED");
				break;
			case DDNodeType.CHAR:
				sb.append(" CHAR");
				break;
			case DDNodeType.UNSUPPORTED:
				sb.append(" UNSUPPORTED");
				break;
			default:
				sb.append(" logic error in " + this.myName);
		}
		*/
		sb.append(" " + this.type);
		if (this.numeric) {
			sb.append(" numeric");
		}
		if (this.group) {
			sb.append(" group");
		}
		return sb.toString();
	}

}
