import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**



*/

public class Main {

	public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	private static ArrayList<DDNode> ddNodes = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Handler fileHandler  = null;
		String inFileName = args[0];
		String outFileName = args[1];
	
		switch (args.length) {
			case 0:
			case 1:
				System.out.println("at least 2 arguments must be specified");
				System.exit(4);
				break;
			case 2:
				inFileName = args[0];
				outFileName = args[1];
				LOGGER.setLevel(Level.INFO);
				break;
			default:
				inFileName = args[0];
				outFileName = args[1];
				switch(args[2].toUpperCase()) {
					case "SEVERE":
						LOGGER.setLevel(Level.SEVERE);
						break;
					case "WARNING":
						LOGGER.setLevel(Level.WARNING);
						break;
					case "INFO":
						LOGGER.setLevel(Level.INFO);
						break;
					case "CONFIG":
						LOGGER.setLevel(Level.CONFIG);
						break;
					case "FINE":
						LOGGER.setLevel(Level.FINE);
						break;
					case "FINER":
						LOGGER.setLevel(Level.FINER);
						break;
					case "FINEST":
						LOGGER.setLevel(Level.FINEST);
						break;
					default:
						LOGGER.config("Unrecognized logging level option " + args[2]);
				}
		}

		System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tc] %4$s: %5$s%n");

		try {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
			fileHandler = new FileHandler("./iebdg-for-cobol-" + LocalDateTime.now().format(df) +".log");
			fileHandler.setFormatter(new SimpleFormatter());
			LOGGER.addHandler(fileHandler);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
			LOGGER.info("Logger Name: " + LOGGER.getName());
		} catch (Exception e) {
			LOGGER.severe("Exception " + e + " encountered setting logger attributes");
			System.exit(16);
		}

		LOGGER.info("Processing " + inFileName);

		CharStream aCharStream = fromFileName(inFileName);  //load the file
		CobolLexer lexer = new CobolLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		DataDescriptionEntryListener listener = 
			new DataDescriptionEntryListener(ddNodes, LOGGER);

		walker.walk(listener, tree);

		String dsdStmt = String.format("%-80s\n", "  DSD     OUTPUT=(OUTPUT01)");
		StringBuffer out = new StringBuffer(dsdStmt);
		for (DDNode node: ddNodes) {
			node.setTypeFromContext(ddNodes);
			if (node.getLevel() == 1) continue;
			node.writeIEBDG(out);
		}

		LOGGER.finest("ddNodes: " + ddNodes);
		System.out.println(ddNodes);

		/*
		for (DDNode thisNode: ddNodes) {
			if (thisNode.getLevel() == 1) continue;
			switch(thisNode.getType()) {
				case COMP:
				case COMP5:
				case COMP3:
					for (String s: thisNode.getIEBDGFields()) {
						for (DDNode otherNode: ddNodes) {
							if (otherNode.getLevel() == 1) continue;
							if (thisNode == otherNode) continue;
						}
					}
					break;
				case ZONED:
				case CHAR:
					break;
				case UNSUPPORTED:
					break;
				default:
			}
		}
		*/

		makeCreateCards(out, 0, false);
		System.out.println(out);

	/*
		LOGGER.info("writing to " + outFileName);
		File outFile = new File(outFileName);
		PrintWriter pw = new PrintWriter(outFile);
		LOGGER.finest("writing output");
		for (CobolSource cs: allTheCobolSource) {
			LOGGER.finest(cs.toString());
			cs.writeOn(pw);
		}
		pw.close();
	*/

		LOGGER.info("Processing complete");
	}

	private static void makeCreateCards(StringBuffer out, int i, Boolean start) {
		LOGGER.fine("makeCreateCards(..., " + i + ", " + start);
		ArrayList<String> iebdgFields = ddNodes.get(i).getIEBDGFields();
		if (ddNodes.get(i).getLevel() == 1) {
			makeCreateCards(out, ++i, true);
		} else if (start) {
			String fmt1 = new String("%-71s%-9s\n");
			String fmt2 = new String("%15s%-56s%-9s\n");
			for (String iebdgField: iebdgFields) {
				out.append(String.format(fmt1, "  CREATE QUANTITY=100,", "X"));
				out.append(String.format(fmt2, "NAME=(", iebdgField, "X"));
				makeCreateCards(out, ++i, false);
			}
		} else if (i == ddNodes.size() - 1) {
			String fmt3 = new String("%15s%-56s%-9s\n");
			int nbFields = 0;
			for (String iebdgField: iebdgFields) {
				nbFields++;
				if (nbFields == iebdgFields.size()) {
					String s = iebdgField + ")"; //last one
					out.append(String.format(fmt3, ",", s, " "));
				} else {
					out.append(String.format(fmt3, ",", iebdgField, "X"));
				}
			}
			out.append("  END\n"); //done
		} else {
			String fmt4 = new String("%15s%-56s%-9s\n");
			for (String iebdgField: iebdgFields) {
				out.append(String.format(fmt4, ",", ddNodes.get(i).getIEBDGFields().get(0), "X"));
				if (i < ddNodes.size() - 1) {
					makeCreateCards(out, ++i, false);
				}
			}
		}
	}
}

