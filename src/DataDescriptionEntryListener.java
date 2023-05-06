
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DataDescriptionEntryListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	private ArrayList<DDNode> ddNodes = null;

	public DataDescriptionEntryListener(
			ArrayList<DDNode> ddNodes
			, Logger LOGGER
			) {
		super();
		this.ddNodes = ddNodes;
		this.LOGGER = LOGGER;
	}

	public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterDataDescriptionEntryFormat1(CobolParser.DataDescriptionEntryFormat1Context ctx) {
		/**
		*/
		DDNode node = new DDNode(ctx, this.LOGGER);
		this.ddNodes.add(node);
	}

}
