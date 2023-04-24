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

	public static void main(String[] args) throws Exception {

		Handler fileHandler  = null;
		String inFileName = args[0];
		String outFileName = args[1];
		ArrayList<DDNode> ddNodes = new ArrayList<>();
	
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

		LOGGER.finest("ddNodes: " + ddNodes);


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

}

