// Generated from src/CobolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CobolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASSIC_COMMENT_INDICATOR=1, CLASSIC_COMMENTLINE=2, CLASSIC_LINE_NUMBER=3, 
		CLASSIC_DEBUG_INDICATOR=4, CLASSIC_DEBUG_LINE=5, CLASSIC_EOL_COMMENT=6, 
		CLASSIC_CONTINUATION=7, ACTIVE_CLASS=8, ALIGNED=9, ALL=10, ANY=11, ARE=12, 
		AREA=13, AS=14, ASCENDING=15, BASED=16, BINARY=17, BINARY_CHAR=18, BINARY_DOUBLE=19, 
		BINARY_ENCODING=20, BINARY_LONG=21, BINARY_SHORT=22, BIT=23, BLANK=24, 
		BLOB=25, BLOB_LOCATOR=26, BOUNDS=27, BY=28, BYTE_LENGTH=29, CHARACTER=30, 
		CLOB=31, CLOB_LOCATOR=32, COBOL=33, COMMA=34, COMMON=35, COMP=36, COMP_1=37, 
		COMP_2=38, COMP_3=39, COMP_4=40, COMP_5=41, COMPUTATIONAL=42, COMPUTATIONAL_1=43, 
		COMPUTATIONAL_2=44, COMPUTATIONAL_3=45, COMPUTATIONAL_4=46, COMPUTATIONAL_5=47, 
		CONSTANT=48, CONTENT=49, CONTROL_POINT=50, CONVENTION=51, DATE=52, DBCLOB=53, 
		DBCLOB_LOCATOR=54, DECIMAL_ENCODING=55, DEPENDING=56, DESCENDING=57, DISPLAY=58, 
		DISPLAY_1=59, DOUBLE=60, DYNAMIC=61, EVENT=62, EXTENDED=63, EXTERNAL=64, 
		FACTORY=65, FALSE=66, FILLER=67, FINAL=68, FLOAT_BINARY=69, FLOAT_BINARY_32=70, 
		FLOAT_BINARY_64=71, FLOAT_BINARY_128=72, FLOAT_DECIMAL=73, FLOAT_DECIMAL_16=74, 
		FLOAT_DECIMAL_34=75, FLOAT_EXTENDED=76, FLOAT_LONG=77, FLOAT_SHORT=78, 
		FOR=79, FUNCTION_POINTER=80, GET=81, GLOBAL=82, GROUP_USAGE=83, HIGH_ORDER_LEFT=84, 
		HIGH_ORDER_RIGHT=85, HIGH_VALUE=86, HIGH_VALUES=87, IN=88, INDEX=89, INDEXED=90, 
		INTEGER=91, IS=92, JUST=93, JUSTIFIED=94, KANJI=95, KEY=96, LANGUAGE=97, 
		LEADING=98, LEFT=99, LENGTH=100, LIMIT=101, LINAGE_COUNTER=102, LOCAL=103, 
		LOCALE=104, LOCK=105, LONG_DATE=106, LONG_TIME=107, LOWER=108, LOW_VALUE=109, 
		LOW_VALUES=110, MESSAGE_TAG=111, NATIONAL=112, NATIONAL_EDITED=113, NATIVE=114, 
		NEGATIVE=115, NO=116, NONNUMERIC=117, NULL=118, NULLS=119, NUMERIC_DATE=120, 
		NUMERIC_EDITED=121, NUMERIC_TIME=122, OBJECT_REFERENCE=123, OCCURS=124, 
		OF=125, ON=126, ONLY=127, OTHER=128, OWN=129, PACKED_DECIMAL=130, PIC=131, 
		PICTURE=132, POINTER=133, POINTER_32=134, POSITIVE=135, PROCEDURE_POINTER=136, 
		PROGRAM_POINTER=137, PROPERTY=138, QUOTE=139, QUOTES=140, REAL=141, RECEIVED=142, 
		RECORD=143, REDEFINES=144, REF=145, REFERENCE=146, RENAMES=147, RIGHT=148, 
		ROWID=149, SAME=150, SELECT=151, SEPARATE=152, SET=153, SHORT_DATE=154, 
		SIGN=155, SIGNED=156, SIZE=157, SPACE=158, SPACES=159, SQL=160, STRING=161, 
		STRONG=162, SYNC=163, SYNCHRONIZED=164, TASK=165, THREAD_LOCAL=166, THROUGH=167, 
		THRU=168, TIMES=169, TO=170, TRAILING=171, TRUE=172, TRUNCATED=173, TYPE=174, 
		TYPEDEF=175, UNSIGNED=176, USAGE=177, USING=178, UTF_8=179, UTF_16=180, 
		VALUE=181, VALUES=182, VARBINARY=183, VOLATILE=184, WHEN=185, WITH=186, 
		XML=187, ZERO=188, ZEROS=189, ZEROES=190, AMPCHAR=191, ASTERISKCHAR=192, 
		DOUBLEASTERISKCHAR=193, COLONCHAR=194, COMMACHAR=195, COMMENTENTRYTAG=196, 
		COMMENTTAG=197, COMPILER_DIRECTIVE=198, DOLLARCHAR=199, DOUBLEQUOTE=200, 
		DOT_FS=201, DOT=202, EQUALCHAR=203, LESSTHANCHAR=204, LESSTHANOREQUAL=205, 
		LPARENCHAR=206, MINUSCHAR=207, MORETHANCHAR=208, MORETHANOREQUAL=209, 
		NOTEQUALCHAR=210, PLUSCHAR=211, SINGLEQUOTE=212, RPARENCHAR=213, SLASHCHAR=214, 
		NONNUMERICLITERAL=215, CONTINUED_HEXNUMBER=216, CONTINUED_NULLTERMINATED=217, 
		CONTINUED_STRINGLITERAL=218, CONTINUED_DBCSLITERAL=219, LEVEL_NUMBER_66=220, 
		LEVEL_NUMBER_77=221, LEVEL_NUMBER_88=222, INTEGERLITERAL=223, NUMERICLITERAL=224, 
		IDENTIFIER=225, NEWLINE=226, COMMENTENTRYLINE=227, COMMENTLINE=228, WS=229, 
		SEPARATOR=230, TEXTA=231, DOT_WS=232, EDITING=233, PICTURE_SYMBOLS=234, 
		PICTURE_CARDINALITY=235, WS_PIC=236, NEWLINE_PIC=237, CLASSIC_COMMENTLINE_PIC=238, 
		CLASSIC_LINE_NUMBER_PIC=239, CLASSIC_DEBUG_LINE_PIC=240, CLASSIC_EOL_COMMENT_PIC=241, 
		WS_E1=242, EDITING_CHARACTER=243, WS_E2=244, WS_LOCALE=245;
	public static final int
		RULE_startRule = 0, RULE_dataStructure = 1, RULE_encodingPhrase = 2, RULE_endiannessPhrase = 3, 
		RULE_dataDescriptionEntry = 4, RULE_dataDescriptionEntryFormat1 = 5, RULE_dataDescriptionEntryFormat2 = 6, 
		RULE_dataDescriptionEntryFormat3 = 7, RULE_dataAlignedClause = 8, RULE_dataAnyLengthClause = 9, 
		RULE_dataBlankWhenZeroClause = 10, RULE_dataBasedClause = 11, RULE_dataCommonOwnLocalClause = 12, 
		RULE_dataConstantRecordClause = 13, RULE_dataDynamicLengthClause = 14, 
		RULE_dataExternalClause = 15, RULE_dataGlobalClause = 16, RULE_dataGroupUsageClause = 17, 
		RULE_dataIntegerStringClause = 18, RULE_dataJustifiedClause = 19, RULE_dataOccursClause = 20, 
		RULE_dataOccursTo = 21, RULE_dataOccursDepending = 22, RULE_dataOccursSort = 23, 
		RULE_dataOccursIndexed = 24, RULE_dataPictureClause = 25, RULE_pictureString = 26, 
		RULE_pictureChars = 27, RULE_pictureCardinality = 28, RULE_pictureEditingPhrase = 29, 
		RULE_pictureLocalePhrase = 30, RULE_dataPropertyClause = 31, RULE_dataReceivedByClause = 32, 
		RULE_dataRecordAreaClause = 33, RULE_dataRedefinesClause = 34, RULE_dataRenamesClause = 35, 
		RULE_dataSameAsClause = 36, RULE_dataSelectWhenClause = 37, RULE_dataSignClause = 38, 
		RULE_dataSynchronizedClause = 39, RULE_dataThreadLocalClause = 40, RULE_dataTypeClause = 41, 
		RULE_dataTypeDefClause = 42, RULE_dataUsageClause = 43, RULE_dataUsageType = 44, 
		RULE_dataUsageObjectReferenceFactoryPhrase = 45, RULE_dataUsingClause = 46, 
		RULE_dataValueClause = 47, RULE_dataValueInterval = 48, RULE_dataValueIntervalFrom = 49, 
		RULE_dataValueIntervalTo = 50, RULE_dataVolatileClause = 51, RULE_dataWithLowerBoundsClause = 52, 
		RULE_identifier = 53, RULE_tableCall = 54, RULE_subscript = 55, RULE_argument = 56, 
		RULE_qualifiedDataName = 57, RULE_qualifiedDataNameFormat1 = 58, RULE_qualifiedInData = 59, 
		RULE_alphabetName = 60, RULE_className = 61, RULE_conditionName = 62, 
		RULE_constantName = 63, RULE_dataName = 64, RULE_dataDescName = 65, RULE_indexName = 66, 
		RULE_interfaceName = 67, RULE_localeName = 68, RULE_paragraphName = 69, 
		RULE_programName = 70, RULE_cobolWord = 71, RULE_literal = 72, RULE_continuedLiteral = 73, 
		RULE_booleanLiteral = 74, RULE_numericLiteral = 75, RULE_integerLiteral = 76, 
		RULE_figurativeConstant = 77, RULE_commentEntry = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule", "dataStructure", "encodingPhrase", "endiannessPhrase", "dataDescriptionEntry", 
			"dataDescriptionEntryFormat1", "dataDescriptionEntryFormat2", "dataDescriptionEntryFormat3", 
			"dataAlignedClause", "dataAnyLengthClause", "dataBlankWhenZeroClause", 
			"dataBasedClause", "dataCommonOwnLocalClause", "dataConstantRecordClause", 
			"dataDynamicLengthClause", "dataExternalClause", "dataGlobalClause", 
			"dataGroupUsageClause", "dataIntegerStringClause", "dataJustifiedClause", 
			"dataOccursClause", "dataOccursTo", "dataOccursDepending", "dataOccursSort", 
			"dataOccursIndexed", "dataPictureClause", "pictureString", "pictureChars", 
			"pictureCardinality", "pictureEditingPhrase", "pictureLocalePhrase", 
			"dataPropertyClause", "dataReceivedByClause", "dataRecordAreaClause", 
			"dataRedefinesClause", "dataRenamesClause", "dataSameAsClause", "dataSelectWhenClause", 
			"dataSignClause", "dataSynchronizedClause", "dataThreadLocalClause", 
			"dataTypeClause", "dataTypeDefClause", "dataUsageClause", "dataUsageType", 
			"dataUsageObjectReferenceFactoryPhrase", "dataUsingClause", "dataValueClause", 
			"dataValueInterval", "dataValueIntervalFrom", "dataValueIntervalTo", 
			"dataVolatileClause", "dataWithLowerBoundsClause", "identifier", "tableCall", 
			"subscript", "argument", "qualifiedDataName", "qualifiedDataNameFormat1", 
			"qualifiedInData", "alphabetName", "className", "conditionName", "constantName", 
			"dataName", "dataDescName", "indexName", "interfaceName", "localeName", 
			"paragraphName", "programName", "cobolWord", "literal", "continuedLiteral", 
			"booleanLiteral", "numericLiteral", "integerLiteral", "figurativeConstant", 
			"commentEntry"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'&'", 
			"'*'", "'**'", "':'", "','", "'*>CE'", "'*>'", null, "'$'", "'\"'", null, 
			"'.'", "'='", "'<'", "'<='", "'('", "'-'", "'>'", "'>='", "'<>'", "'+'", 
			"'''", "')'", "'/'", null, null, null, null, null, "'66'", "'77'", "'88'", 
			null, null, null, null, null, null, null, "', '", null, "'. '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASSIC_COMMENT_INDICATOR", "CLASSIC_COMMENTLINE", "CLASSIC_LINE_NUMBER", 
			"CLASSIC_DEBUG_INDICATOR", "CLASSIC_DEBUG_LINE", "CLASSIC_EOL_COMMENT", 
			"CLASSIC_CONTINUATION", "ACTIVE_CLASS", "ALIGNED", "ALL", "ANY", "ARE", 
			"AREA", "AS", "ASCENDING", "BASED", "BINARY", "BINARY_CHAR", "BINARY_DOUBLE", 
			"BINARY_ENCODING", "BINARY_LONG", "BINARY_SHORT", "BIT", "BLANK", "BLOB", 
			"BLOB_LOCATOR", "BOUNDS", "BY", "BYTE_LENGTH", "CHARACTER", "CLOB", "CLOB_LOCATOR", 
			"COBOL", "COMMA", "COMMON", "COMP", "COMP_1", "COMP_2", "COMP_3", "COMP_4", 
			"COMP_5", "COMPUTATIONAL", "COMPUTATIONAL_1", "COMPUTATIONAL_2", "COMPUTATIONAL_3", 
			"COMPUTATIONAL_4", "COMPUTATIONAL_5", "CONSTANT", "CONTENT", "CONTROL_POINT", 
			"CONVENTION", "DATE", "DBCLOB", "DBCLOB_LOCATOR", "DECIMAL_ENCODING", 
			"DEPENDING", "DESCENDING", "DISPLAY", "DISPLAY_1", "DOUBLE", "DYNAMIC", 
			"EVENT", "EXTENDED", "EXTERNAL", "FACTORY", "FALSE", "FILLER", "FINAL", 
			"FLOAT_BINARY", "FLOAT_BINARY_32", "FLOAT_BINARY_64", "FLOAT_BINARY_128", 
			"FLOAT_DECIMAL", "FLOAT_DECIMAL_16", "FLOAT_DECIMAL_34", "FLOAT_EXTENDED", 
			"FLOAT_LONG", "FLOAT_SHORT", "FOR", "FUNCTION_POINTER", "GET", "GLOBAL", 
			"GROUP_USAGE", "HIGH_ORDER_LEFT", "HIGH_ORDER_RIGHT", "HIGH_VALUE", "HIGH_VALUES", 
			"IN", "INDEX", "INDEXED", "INTEGER", "IS", "JUST", "JUSTIFIED", "KANJI", 
			"KEY", "LANGUAGE", "LEADING", "LEFT", "LENGTH", "LIMIT", "LINAGE_COUNTER", 
			"LOCAL", "LOCALE", "LOCK", "LONG_DATE", "LONG_TIME", "LOWER", "LOW_VALUE", 
			"LOW_VALUES", "MESSAGE_TAG", "NATIONAL", "NATIONAL_EDITED", "NATIVE", 
			"NEGATIVE", "NO", "NONNUMERIC", "NULL", "NULLS", "NUMERIC_DATE", "NUMERIC_EDITED", 
			"NUMERIC_TIME", "OBJECT_REFERENCE", "OCCURS", "OF", "ON", "ONLY", "OTHER", 
			"OWN", "PACKED_DECIMAL", "PIC", "PICTURE", "POINTER", "POINTER_32", "POSITIVE", 
			"PROCEDURE_POINTER", "PROGRAM_POINTER", "PROPERTY", "QUOTE", "QUOTES", 
			"REAL", "RECEIVED", "RECORD", "REDEFINES", "REF", "REFERENCE", "RENAMES", 
			"RIGHT", "ROWID", "SAME", "SELECT", "SEPARATE", "SET", "SHORT_DATE", 
			"SIGN", "SIGNED", "SIZE", "SPACE", "SPACES", "SQL", "STRING", "STRONG", 
			"SYNC", "SYNCHRONIZED", "TASK", "THREAD_LOCAL", "THROUGH", "THRU", "TIMES", 
			"TO", "TRAILING", "TRUE", "TRUNCATED", "TYPE", "TYPEDEF", "UNSIGNED", 
			"USAGE", "USING", "UTF_8", "UTF_16", "VALUE", "VALUES", "VARBINARY", 
			"VOLATILE", "WHEN", "WITH", "XML", "ZERO", "ZEROS", "ZEROES", "AMPCHAR", 
			"ASTERISKCHAR", "DOUBLEASTERISKCHAR", "COLONCHAR", "COMMACHAR", "COMMENTENTRYTAG", 
			"COMMENTTAG", "COMPILER_DIRECTIVE", "DOLLARCHAR", "DOUBLEQUOTE", "DOT_FS", 
			"DOT", "EQUALCHAR", "LESSTHANCHAR", "LESSTHANOREQUAL", "LPARENCHAR", 
			"MINUSCHAR", "MORETHANCHAR", "MORETHANOREQUAL", "NOTEQUALCHAR", "PLUSCHAR", 
			"SINGLEQUOTE", "RPARENCHAR", "SLASHCHAR", "NONNUMERICLITERAL", "CONTINUED_HEXNUMBER", 
			"CONTINUED_NULLTERMINATED", "CONTINUED_STRINGLITERAL", "CONTINUED_DBCSLITERAL", 
			"LEVEL_NUMBER_66", "LEVEL_NUMBER_77", "LEVEL_NUMBER_88", "INTEGERLITERAL", 
			"NUMERICLITERAL", "IDENTIFIER", "NEWLINE", "COMMENTENTRYLINE", "COMMENTLINE", 
			"WS", "SEPARATOR", "TEXTA", "DOT_WS", "EDITING", "PICTURE_SYMBOLS", "PICTURE_CARDINALITY", 
			"WS_PIC", "NEWLINE_PIC", "CLASSIC_COMMENTLINE_PIC", "CLASSIC_LINE_NUMBER_PIC", 
			"CLASSIC_DEBUG_LINE_PIC", "CLASSIC_EOL_COMMENT_PIC", "WS_E1", "EDITING_CHARACTER", 
			"WS_E2", "WS_LOCALE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CobolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public CobolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartRuleContext extends ParserRuleContext {
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CobolParser.EOF, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			dataStructure();
			setState(159);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataStructureContext extends ParserRuleContext {
		public List<DataDescriptionEntryContext> dataDescriptionEntry() {
			return getRuleContexts(DataDescriptionEntryContext.class);
		}
		public DataDescriptionEntryContext dataDescriptionEntry(int i) {
			return getRuleContext(DataDescriptionEntryContext.class,i);
		}
		public DataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureContext dataStructure() throws RecognitionException {
		DataStructureContext _localctx = new DataStructureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataStructure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				dataDescriptionEntry();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (LEVEL_NUMBER_66 - 220)) | (1L << (LEVEL_NUMBER_77 - 220)) | (1L << (LEVEL_NUMBER_88 - 220)) | (1L << (INTEGERLITERAL - 220)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncodingPhraseContext extends ParserRuleContext {
		public TerminalNode BINARY_ENCODING() { return getToken(CobolParser.BINARY_ENCODING, 0); }
		public TerminalNode DECIMAL_ENCODING() { return getToken(CobolParser.DECIMAL_ENCODING, 0); }
		public EncodingPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodingPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterEncodingPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitEncodingPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitEncodingPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodingPhraseContext encodingPhrase() throws RecognitionException {
		EncodingPhraseContext _localctx = new EncodingPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_encodingPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==BINARY_ENCODING || _la==DECIMAL_ENCODING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndiannessPhraseContext extends ParserRuleContext {
		public TerminalNode HIGH_ORDER_LEFT() { return getToken(CobolParser.HIGH_ORDER_LEFT, 0); }
		public TerminalNode HIGH_ORDER_RIGHT() { return getToken(CobolParser.HIGH_ORDER_RIGHT, 0); }
		public EndiannessPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endiannessPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterEndiannessPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitEndiannessPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitEndiannessPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndiannessPhraseContext endiannessPhrase() throws RecognitionException {
		EndiannessPhraseContext _localctx = new EndiannessPhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endiannessPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==HIGH_ORDER_LEFT || _la==HIGH_ORDER_RIGHT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescriptionEntryContext extends ParserRuleContext {
		public DataDescriptionEntryFormat1Context dataDescriptionEntryFormat1() {
			return getRuleContext(DataDescriptionEntryFormat1Context.class,0);
		}
		public DataDescriptionEntryFormat2Context dataDescriptionEntryFormat2() {
			return getRuleContext(DataDescriptionEntryFormat2Context.class,0);
		}
		public DataDescriptionEntryFormat3Context dataDescriptionEntryFormat3() {
			return getRuleContext(DataDescriptionEntryFormat3Context.class,0);
		}
		public DataDescriptionEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDescriptionEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDescriptionEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDescriptionEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDescriptionEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescriptionEntryContext dataDescriptionEntry() throws RecognitionException {
		DataDescriptionEntryContext _localctx = new DataDescriptionEntryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataDescriptionEntry);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEVEL_NUMBER_77:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				dataDescriptionEntryFormat1();
				}
				break;
			case LEVEL_NUMBER_66:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				dataDescriptionEntryFormat2();
				}
				break;
			case LEVEL_NUMBER_88:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				dataDescriptionEntryFormat3();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescriptionEntryFormat1Context extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public TerminalNode LEVEL_NUMBER_77() { return getToken(CobolParser.LEVEL_NUMBER_77, 0); }
		public TerminalNode DOT_WS() { return getToken(CobolParser.DOT_WS, 0); }
		public TerminalNode DOT_FS() { return getToken(CobolParser.DOT_FS, 0); }
		public TerminalNode DOT() { return getToken(CobolParser.DOT, 0); }
		public TerminalNode FILLER() { return getToken(CobolParser.FILLER, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public List<DataRedefinesClauseContext> dataRedefinesClause() {
			return getRuleContexts(DataRedefinesClauseContext.class);
		}
		public DataRedefinesClauseContext dataRedefinesClause(int i) {
			return getRuleContext(DataRedefinesClauseContext.class,i);
		}
		public List<DataIntegerStringClauseContext> dataIntegerStringClause() {
			return getRuleContexts(DataIntegerStringClauseContext.class);
		}
		public DataIntegerStringClauseContext dataIntegerStringClause(int i) {
			return getRuleContext(DataIntegerStringClauseContext.class,i);
		}
		public List<DataExternalClauseContext> dataExternalClause() {
			return getRuleContexts(DataExternalClauseContext.class);
		}
		public DataExternalClauseContext dataExternalClause(int i) {
			return getRuleContext(DataExternalClauseContext.class,i);
		}
		public List<DataGlobalClauseContext> dataGlobalClause() {
			return getRuleContexts(DataGlobalClauseContext.class);
		}
		public DataGlobalClauseContext dataGlobalClause(int i) {
			return getRuleContext(DataGlobalClauseContext.class,i);
		}
		public List<DataGroupUsageClauseContext> dataGroupUsageClause() {
			return getRuleContexts(DataGroupUsageClauseContext.class);
		}
		public DataGroupUsageClauseContext dataGroupUsageClause(int i) {
			return getRuleContext(DataGroupUsageClauseContext.class,i);
		}
		public List<DataTypeDefClauseContext> dataTypeDefClause() {
			return getRuleContexts(DataTypeDefClauseContext.class);
		}
		public DataTypeDefClauseContext dataTypeDefClause(int i) {
			return getRuleContext(DataTypeDefClauseContext.class,i);
		}
		public List<DataThreadLocalClauseContext> dataThreadLocalClause() {
			return getRuleContexts(DataThreadLocalClauseContext.class);
		}
		public DataThreadLocalClauseContext dataThreadLocalClause(int i) {
			return getRuleContext(DataThreadLocalClauseContext.class,i);
		}
		public List<DataPictureClauseContext> dataPictureClause() {
			return getRuleContexts(DataPictureClauseContext.class);
		}
		public DataPictureClauseContext dataPictureClause(int i) {
			return getRuleContext(DataPictureClauseContext.class,i);
		}
		public List<DataCommonOwnLocalClauseContext> dataCommonOwnLocalClause() {
			return getRuleContexts(DataCommonOwnLocalClauseContext.class);
		}
		public DataCommonOwnLocalClauseContext dataCommonOwnLocalClause(int i) {
			return getRuleContext(DataCommonOwnLocalClauseContext.class,i);
		}
		public List<DataTypeClauseContext> dataTypeClause() {
			return getRuleContexts(DataTypeClauseContext.class);
		}
		public DataTypeClauseContext dataTypeClause(int i) {
			return getRuleContext(DataTypeClauseContext.class,i);
		}
		public List<DataUsingClauseContext> dataUsingClause() {
			return getRuleContexts(DataUsingClauseContext.class);
		}
		public DataUsingClauseContext dataUsingClause(int i) {
			return getRuleContext(DataUsingClauseContext.class,i);
		}
		public List<DataUsageClauseContext> dataUsageClause() {
			return getRuleContexts(DataUsageClauseContext.class);
		}
		public DataUsageClauseContext dataUsageClause(int i) {
			return getRuleContext(DataUsageClauseContext.class,i);
		}
		public List<DataValueClauseContext> dataValueClause() {
			return getRuleContexts(DataValueClauseContext.class);
		}
		public DataValueClauseContext dataValueClause(int i) {
			return getRuleContext(DataValueClauseContext.class,i);
		}
		public List<DataReceivedByClauseContext> dataReceivedByClause() {
			return getRuleContexts(DataReceivedByClauseContext.class);
		}
		public DataReceivedByClauseContext dataReceivedByClause(int i) {
			return getRuleContext(DataReceivedByClauseContext.class,i);
		}
		public List<DataOccursClauseContext> dataOccursClause() {
			return getRuleContexts(DataOccursClauseContext.class);
		}
		public DataOccursClauseContext dataOccursClause(int i) {
			return getRuleContext(DataOccursClauseContext.class,i);
		}
		public List<DataSignClauseContext> dataSignClause() {
			return getRuleContexts(DataSignClauseContext.class);
		}
		public DataSignClauseContext dataSignClause(int i) {
			return getRuleContext(DataSignClauseContext.class,i);
		}
		public List<DataSynchronizedClauseContext> dataSynchronizedClause() {
			return getRuleContexts(DataSynchronizedClauseContext.class);
		}
		public DataSynchronizedClauseContext dataSynchronizedClause(int i) {
			return getRuleContext(DataSynchronizedClauseContext.class,i);
		}
		public List<DataJustifiedClauseContext> dataJustifiedClause() {
			return getRuleContexts(DataJustifiedClauseContext.class);
		}
		public DataJustifiedClauseContext dataJustifiedClause(int i) {
			return getRuleContext(DataJustifiedClauseContext.class,i);
		}
		public List<DataBlankWhenZeroClauseContext> dataBlankWhenZeroClause() {
			return getRuleContexts(DataBlankWhenZeroClauseContext.class);
		}
		public DataBlankWhenZeroClauseContext dataBlankWhenZeroClause(int i) {
			return getRuleContext(DataBlankWhenZeroClauseContext.class,i);
		}
		public List<DataWithLowerBoundsClauseContext> dataWithLowerBoundsClause() {
			return getRuleContexts(DataWithLowerBoundsClauseContext.class);
		}
		public DataWithLowerBoundsClauseContext dataWithLowerBoundsClause(int i) {
			return getRuleContext(DataWithLowerBoundsClauseContext.class,i);
		}
		public List<DataAlignedClauseContext> dataAlignedClause() {
			return getRuleContexts(DataAlignedClauseContext.class);
		}
		public DataAlignedClauseContext dataAlignedClause(int i) {
			return getRuleContext(DataAlignedClauseContext.class,i);
		}
		public List<DataRecordAreaClauseContext> dataRecordAreaClause() {
			return getRuleContexts(DataRecordAreaClauseContext.class);
		}
		public DataRecordAreaClauseContext dataRecordAreaClause(int i) {
			return getRuleContext(DataRecordAreaClauseContext.class,i);
		}
		public List<DataDynamicLengthClauseContext> dataDynamicLengthClause() {
			return getRuleContexts(DataDynamicLengthClauseContext.class);
		}
		public DataDynamicLengthClauseContext dataDynamicLengthClause(int i) {
			return getRuleContext(DataDynamicLengthClauseContext.class,i);
		}
		public List<DataConstantRecordClauseContext> dataConstantRecordClause() {
			return getRuleContexts(DataConstantRecordClauseContext.class);
		}
		public DataConstantRecordClauseContext dataConstantRecordClause(int i) {
			return getRuleContext(DataConstantRecordClauseContext.class,i);
		}
		public List<DataPropertyClauseContext> dataPropertyClause() {
			return getRuleContexts(DataPropertyClauseContext.class);
		}
		public DataPropertyClauseContext dataPropertyClause(int i) {
			return getRuleContext(DataPropertyClauseContext.class,i);
		}
		public List<DataSameAsClauseContext> dataSameAsClause() {
			return getRuleContexts(DataSameAsClauseContext.class);
		}
		public DataSameAsClauseContext dataSameAsClause(int i) {
			return getRuleContext(DataSameAsClauseContext.class,i);
		}
		public List<DataSelectWhenClauseContext> dataSelectWhenClause() {
			return getRuleContexts(DataSelectWhenClauseContext.class);
		}
		public DataSelectWhenClauseContext dataSelectWhenClause(int i) {
			return getRuleContext(DataSelectWhenClauseContext.class,i);
		}
		public List<DataBasedClauseContext> dataBasedClause() {
			return getRuleContexts(DataBasedClauseContext.class);
		}
		public DataBasedClauseContext dataBasedClause(int i) {
			return getRuleContext(DataBasedClauseContext.class,i);
		}
		public List<DataAnyLengthClauseContext> dataAnyLengthClause() {
			return getRuleContexts(DataAnyLengthClauseContext.class);
		}
		public DataAnyLengthClauseContext dataAnyLengthClause(int i) {
			return getRuleContext(DataAnyLengthClauseContext.class,i);
		}
		public List<DataVolatileClauseContext> dataVolatileClause() {
			return getRuleContexts(DataVolatileClauseContext.class);
		}
		public DataVolatileClauseContext dataVolatileClause(int i) {
			return getRuleContext(DataVolatileClauseContext.class,i);
		}
		public DataDescriptionEntryFormat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDescriptionEntryFormat1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDescriptionEntryFormat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDescriptionEntryFormat1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDescriptionEntryFormat1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescriptionEntryFormat1Context dataDescriptionEntryFormat1() throws RecognitionException {
		DataDescriptionEntryFormat1Context _localctx = new DataDescriptionEntryFormat1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataDescriptionEntryFormat1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==LEVEL_NUMBER_77 || _la==INTEGERLITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(176);
				match(FILLER);
				}
				break;
			case 2:
				{
				setState(177);
				dataName();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIGNED) | (1L << ANY) | (1L << BASED) | (1L << BINARY) | (1L << BINARY_CHAR) | (1L << BINARY_DOUBLE) | (1L << BINARY_LONG) | (1L << BINARY_SHORT) | (1L << BIT) | (1L << BLANK) | (1L << BY) | (1L << COMMON) | (1L << COMP) | (1L << COMP_1) | (1L << COMP_2) | (1L << COMP_3) | (1L << COMP_4) | (1L << COMP_5) | (1L << COMPUTATIONAL) | (1L << COMPUTATIONAL_1) | (1L << COMPUTATIONAL_2) | (1L << COMPUTATIONAL_3) | (1L << COMPUTATIONAL_4) | (1L << COMPUTATIONAL_5) | (1L << CONSTANT) | (1L << CONTENT) | (1L << CONTROL_POINT) | (1L << DATE) | (1L << DISPLAY) | (1L << DISPLAY_1) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EVENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTERNAL - 64)) | (1L << (FLOAT_BINARY_32 - 64)) | (1L << (FLOAT_BINARY_64 - 64)) | (1L << (FLOAT_BINARY_128 - 64)) | (1L << (FLOAT_DECIMAL_16 - 64)) | (1L << (FLOAT_DECIMAL_34 - 64)) | (1L << (FLOAT_EXTENDED - 64)) | (1L << (FLOAT_LONG - 64)) | (1L << (FLOAT_SHORT - 64)) | (1L << (FUNCTION_POINTER - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUP_USAGE - 64)) | (1L << (INDEX - 64)) | (1L << (INTEGER - 64)) | (1L << (IS - 64)) | (1L << (JUST - 64)) | (1L << (JUSTIFIED - 64)) | (1L << (KANJI - 64)) | (1L << (LEADING - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCK - 64)) | (1L << (LOWER - 64)) | (1L << (MESSAGE_TAG - 64)) | (1L << (NATIONAL - 64)) | (1L << (OBJECT_REFERENCE - 64)) | (1L << (OCCURS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OWN - 129)) | (1L << (PACKED_DECIMAL - 129)) | (1L << (PIC - 129)) | (1L << (PICTURE - 129)) | (1L << (POINTER - 129)) | (1L << (POINTER_32 - 129)) | (1L << (PROCEDURE_POINTER - 129)) | (1L << (PROGRAM_POINTER - 129)) | (1L << (PROPERTY - 129)) | (1L << (REAL - 129)) | (1L << (RECEIVED - 129)) | (1L << (RECORD - 129)) | (1L << (REDEFINES - 129)) | (1L << (REF - 129)) | (1L << (REFERENCE - 129)) | (1L << (SAME - 129)) | (1L << (SELECT - 129)) | (1L << (SIGN - 129)) | (1L << (SQL - 129)) | (1L << (STRING - 129)) | (1L << (SYNC - 129)) | (1L << (SYNCHRONIZED - 129)) | (1L << (TASK - 129)) | (1L << (THREAD_LOCAL - 129)) | (1L << (TRAILING - 129)) | (1L << (TYPE - 129)) | (1L << (TYPEDEF - 129)) | (1L << (USAGE - 129)) | (1L << (USING - 129)) | (1L << (UTF_8 - 129)) | (1L << (VALUE - 129)) | (1L << (VALUES - 129)) | (1L << (VOLATILE - 129)) | (1L << (WITH - 129)))) != 0)) {
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(180);
					dataRedefinesClause();
					}
					break;
				case 2:
					{
					setState(181);
					dataIntegerStringClause();
					}
					break;
				case 3:
					{
					setState(182);
					dataExternalClause();
					}
					break;
				case 4:
					{
					setState(183);
					dataGlobalClause();
					}
					break;
				case 5:
					{
					setState(184);
					dataGroupUsageClause();
					}
					break;
				case 6:
					{
					setState(185);
					dataTypeDefClause();
					}
					break;
				case 7:
					{
					setState(186);
					dataThreadLocalClause();
					}
					break;
				case 8:
					{
					setState(187);
					dataPictureClause();
					}
					break;
				case 9:
					{
					setState(188);
					dataCommonOwnLocalClause();
					}
					break;
				case 10:
					{
					setState(189);
					dataTypeClause();
					}
					break;
				case 11:
					{
					setState(190);
					dataUsingClause();
					}
					break;
				case 12:
					{
					setState(191);
					dataUsageClause();
					}
					break;
				case 13:
					{
					setState(192);
					dataValueClause();
					}
					break;
				case 14:
					{
					setState(193);
					dataReceivedByClause();
					}
					break;
				case 15:
					{
					setState(194);
					dataOccursClause();
					}
					break;
				case 16:
					{
					setState(195);
					dataSignClause();
					}
					break;
				case 17:
					{
					setState(196);
					dataSynchronizedClause();
					}
					break;
				case 18:
					{
					setState(197);
					dataJustifiedClause();
					}
					break;
				case 19:
					{
					setState(198);
					dataBlankWhenZeroClause();
					}
					break;
				case 20:
					{
					setState(199);
					dataWithLowerBoundsClause();
					}
					break;
				case 21:
					{
					setState(200);
					dataAlignedClause();
					}
					break;
				case 22:
					{
					setState(201);
					dataRecordAreaClause();
					}
					break;
				case 23:
					{
					setState(202);
					dataDynamicLengthClause();
					}
					break;
				case 24:
					{
					setState(203);
					dataConstantRecordClause();
					}
					break;
				case 25:
					{
					setState(204);
					dataPropertyClause();
					}
					break;
				case 26:
					{
					setState(205);
					dataSameAsClause();
					}
					break;
				case 27:
					{
					setState(206);
					dataSelectWhenClause();
					}
					break;
				case 28:
					{
					setState(207);
					dataBasedClause();
					}
					break;
				case 29:
					{
					setState(208);
					dataAnyLengthClause();
					}
					break;
				case 30:
					{
					setState(209);
					dataVolatileClause();
					}
					break;
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_la = _input.LA(1);
			if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (DOT_FS - 201)) | (1L << (DOT - 201)) | (1L << (DOT_WS - 201)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescriptionEntryFormat2Context extends ParserRuleContext {
		public TerminalNode LEVEL_NUMBER_66() { return getToken(CobolParser.LEVEL_NUMBER_66, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public DataRenamesClauseContext dataRenamesClause() {
			return getRuleContext(DataRenamesClauseContext.class,0);
		}
		public TerminalNode DOT_FS() { return getToken(CobolParser.DOT_FS, 0); }
		public TerminalNode DOT() { return getToken(CobolParser.DOT, 0); }
		public DataDescriptionEntryFormat2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDescriptionEntryFormat2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDescriptionEntryFormat2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDescriptionEntryFormat2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDescriptionEntryFormat2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescriptionEntryFormat2Context dataDescriptionEntryFormat2() throws RecognitionException {
		DataDescriptionEntryFormat2Context _localctx = new DataDescriptionEntryFormat2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataDescriptionEntryFormat2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LEVEL_NUMBER_66);
			setState(218);
			dataName();
			setState(219);
			dataRenamesClause();
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==DOT_FS || _la==DOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescriptionEntryFormat3Context extends ParserRuleContext {
		public TerminalNode LEVEL_NUMBER_88() { return getToken(CobolParser.LEVEL_NUMBER_88, 0); }
		public ConditionNameContext conditionName() {
			return getRuleContext(ConditionNameContext.class,0);
		}
		public DataValueClauseContext dataValueClause() {
			return getRuleContext(DataValueClauseContext.class,0);
		}
		public TerminalNode DOT_FS() { return getToken(CobolParser.DOT_FS, 0); }
		public TerminalNode DOT() { return getToken(CobolParser.DOT, 0); }
		public DataDescriptionEntryFormat3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDescriptionEntryFormat3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDescriptionEntryFormat3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDescriptionEntryFormat3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDescriptionEntryFormat3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescriptionEntryFormat3Context dataDescriptionEntryFormat3() throws RecognitionException {
		DataDescriptionEntryFormat3Context _localctx = new DataDescriptionEntryFormat3Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataDescriptionEntryFormat3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LEVEL_NUMBER_88);
			setState(223);
			conditionName();
			setState(224);
			dataValueClause();
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==DOT_FS || _la==DOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataAlignedClauseContext extends ParserRuleContext {
		public TerminalNode ALIGNED() { return getToken(CobolParser.ALIGNED, 0); }
		public DataAlignedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataAlignedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataAlignedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataAlignedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataAlignedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataAlignedClauseContext dataAlignedClause() throws RecognitionException {
		DataAlignedClauseContext _localctx = new DataAlignedClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dataAlignedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ALIGNED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataAnyLengthClauseContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(CobolParser.ANY, 0); }
		public TerminalNode LENGTH() { return getToken(CobolParser.LENGTH, 0); }
		public DataAnyLengthClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataAnyLengthClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataAnyLengthClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataAnyLengthClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataAnyLengthClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataAnyLengthClauseContext dataAnyLengthClause() throws RecognitionException {
		DataAnyLengthClauseContext _localctx = new DataAnyLengthClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataAnyLengthClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			match(ANY);
			setState(230);
			match(LENGTH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataBlankWhenZeroClauseContext extends ParserRuleContext {
		public TerminalNode BLANK() { return getToken(CobolParser.BLANK, 0); }
		public TerminalNode ZERO() { return getToken(CobolParser.ZERO, 0); }
		public TerminalNode ZEROS() { return getToken(CobolParser.ZEROS, 0); }
		public TerminalNode ZEROES() { return getToken(CobolParser.ZEROES, 0); }
		public TerminalNode WHEN() { return getToken(CobolParser.WHEN, 0); }
		public DataBlankWhenZeroClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBlankWhenZeroClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataBlankWhenZeroClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataBlankWhenZeroClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataBlankWhenZeroClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBlankWhenZeroClauseContext dataBlankWhenZeroClause() throws RecognitionException {
		DataBlankWhenZeroClauseContext _localctx = new DataBlankWhenZeroClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataBlankWhenZeroClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(BLANK);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(233);
				match(WHEN);
				}
			}

			setState(236);
			_la = _input.LA(1);
			if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ZERO - 188)) | (1L << (ZEROS - 188)) | (1L << (ZEROES - 188)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataBasedClauseContext extends ParserRuleContext {
		public TerminalNode BASED() { return getToken(CobolParser.BASED, 0); }
		public DataBasedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataBasedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataBasedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataBasedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataBasedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataBasedClauseContext dataBasedClause() throws RecognitionException {
		DataBasedClauseContext _localctx = new DataBasedClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataBasedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(BASED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataCommonOwnLocalClauseContext extends ParserRuleContext {
		public TerminalNode COMMON() { return getToken(CobolParser.COMMON, 0); }
		public TerminalNode OWN() { return getToken(CobolParser.OWN, 0); }
		public TerminalNode LOCAL() { return getToken(CobolParser.LOCAL, 0); }
		public DataCommonOwnLocalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataCommonOwnLocalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataCommonOwnLocalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataCommonOwnLocalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataCommonOwnLocalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataCommonOwnLocalClauseContext dataCommonOwnLocalClause() throws RecognitionException {
		DataCommonOwnLocalClauseContext _localctx = new DataCommonOwnLocalClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataCommonOwnLocalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==LOCAL || _la==OWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataConstantRecordClauseContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(CobolParser.CONSTANT, 0); }
		public TerminalNode RECORD() { return getToken(CobolParser.RECORD, 0); }
		public DataConstantRecordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataConstantRecordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataConstantRecordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataConstantRecordClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataConstantRecordClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataConstantRecordClauseContext dataConstantRecordClause() throws RecognitionException {
		DataConstantRecordClauseContext _localctx = new DataConstantRecordClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataConstantRecordClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CONSTANT);
			setState(243);
			match(RECORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDynamicLengthClauseContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(CobolParser.DYNAMIC, 0); }
		public TerminalNode LENGTH() { return getToken(CobolParser.LENGTH, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(CobolParser.LIMIT, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataDynamicLengthClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDynamicLengthClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDynamicLengthClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDynamicLengthClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDynamicLengthClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDynamicLengthClauseContext dataDynamicLengthClause() throws RecognitionException {
		DataDynamicLengthClauseContext _localctx = new DataDynamicLengthClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dataDynamicLengthClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(DYNAMIC);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LENGTH) {
				{
				setState(246);
				match(LENGTH);
				}
			}

			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(249);
				dataName();
				}
				break;
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(252);
				match(LIMIT);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(253);
					match(IS);
					}
				}

				setState(256);
				match(INTEGERLITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataExternalClauseContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(CobolParser.EXTERNAL, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode BY() { return getToken(CobolParser.BY, 0); }
		public TerminalNode AS() { return getToken(CobolParser.AS, 0); }
		public DataExternalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataExternalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataExternalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataExternalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataExternalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataExternalClauseContext dataExternalClause() throws RecognitionException {
		DataExternalClauseContext _localctx = new DataExternalClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dataExternalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(259);
				match(IS);
				}
			}

			setState(262);
			match(EXTERNAL);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==BY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				literal();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataGlobalClauseContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(CobolParser.GLOBAL, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataGlobalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataGlobalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataGlobalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataGlobalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataGlobalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataGlobalClauseContext dataGlobalClause() throws RecognitionException {
		DataGlobalClauseContext _localctx = new DataGlobalClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dataGlobalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(267);
				match(IS);
				}
			}

			setState(270);
			match(GLOBAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataGroupUsageClauseContext extends ParserRuleContext {
		public TerminalNode GROUP_USAGE() { return getToken(CobolParser.GROUP_USAGE, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolParser.NATIONAL, 0); }
		public TerminalNode UTF_8() { return getToken(CobolParser.UTF_8, 0); }
		public TerminalNode BIT() { return getToken(CobolParser.BIT, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataGroupUsageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataGroupUsageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataGroupUsageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataGroupUsageClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataGroupUsageClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataGroupUsageClauseContext dataGroupUsageClause() throws RecognitionException {
		DataGroupUsageClauseContext _localctx = new DataGroupUsageClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataGroupUsageClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(GROUP_USAGE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(273);
				match(IS);
				}
			}

			setState(276);
			_la = _input.LA(1);
			if ( !(_la==BIT || _la==NATIONAL || _la==UTF_8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataIntegerStringClauseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CobolParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CobolParser.STRING, 0); }
		public DataIntegerStringClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataIntegerStringClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataIntegerStringClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataIntegerStringClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataIntegerStringClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataIntegerStringClauseContext dataIntegerStringClause() throws RecognitionException {
		DataIntegerStringClauseContext _localctx = new DataIntegerStringClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataIntegerStringClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataJustifiedClauseContext extends ParserRuleContext {
		public TerminalNode JUSTIFIED() { return getToken(CobolParser.JUSTIFIED, 0); }
		public TerminalNode JUST() { return getToken(CobolParser.JUST, 0); }
		public TerminalNode RIGHT() { return getToken(CobolParser.RIGHT, 0); }
		public DataJustifiedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataJustifiedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataJustifiedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataJustifiedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataJustifiedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataJustifiedClauseContext dataJustifiedClause() throws RecognitionException {
		DataJustifiedClauseContext _localctx = new DataJustifiedClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataJustifiedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==JUST || _la==JUSTIFIED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHT) {
				{
				setState(281);
				match(RIGHT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataOccursClauseContext extends ParserRuleContext {
		public TerminalNode OCCURS() { return getToken(CobolParser.OCCURS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DataOccursToContext dataOccursTo() {
			return getRuleContext(DataOccursToContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(CobolParser.TIMES, 0); }
		public DataOccursDependingContext dataOccursDepending() {
			return getRuleContext(DataOccursDependingContext.class,0);
		}
		public List<DataOccursSortContext> dataOccursSort() {
			return getRuleContexts(DataOccursSortContext.class);
		}
		public DataOccursSortContext dataOccursSort(int i) {
			return getRuleContext(DataOccursSortContext.class,i);
		}
		public List<DataOccursIndexedContext> dataOccursIndexed() {
			return getRuleContexts(DataOccursIndexedContext.class);
		}
		public DataOccursIndexedContext dataOccursIndexed(int i) {
			return getRuleContext(DataOccursIndexedContext.class,i);
		}
		public DataOccursClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataOccursClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataOccursClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataOccursClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataOccursClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataOccursClauseContext dataOccursClause() throws RecognitionException {
		DataOccursClauseContext _localctx = new DataOccursClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dataOccursClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(OCCURS);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BOUNDS:
			case CLOB:
			case CONTROL_POINT:
			case CONVENTION:
			case DBCLOB:
			case EVENT:
			case EXTENDED:
			case FUNCTION_POINTER:
			case INTEGER:
			case LANGUAGE:
			case LOCAL:
			case LONG_DATE:
			case LONG_TIME:
			case LOWER:
			case NATIONAL:
			case NUMERIC_DATE:
			case NUMERIC_TIME:
			case OWN:
			case REAL:
			case RECEIVED:
			case REF:
			case SHORT_DATE:
			case SQL:
			case STRONG:
			case TASK:
			case THREAD_LOCAL:
			case TRUNCATED:
			case TYPEDEF:
			case IDENTIFIER:
				{
				setState(285);
				identifier();
				}
				break;
			case LEVEL_NUMBER_66:
			case LEVEL_NUMBER_77:
			case LEVEL_NUMBER_88:
			case INTEGERLITERAL:
				{
				setState(286);
				integerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(289);
				dataOccursTo();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(292);
				match(TIMES);
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEPENDING) {
				{
				setState(295);
				dataOccursDepending();
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASCENDING || _la==DESCENDING || _la==INDEXED) {
				{
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASCENDING:
				case DESCENDING:
					{
					setState(298);
					dataOccursSort();
					}
					break;
				case INDEXED:
					{
					setState(299);
					dataOccursIndexed();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataOccursToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(CobolParser.TO, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DataOccursToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataOccursTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataOccursTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataOccursTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataOccursTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataOccursToContext dataOccursTo() throws RecognitionException {
		DataOccursToContext _localctx = new DataOccursToContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataOccursTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(TO);
			setState(306);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataOccursDependingContext extends ParserRuleContext {
		public TerminalNode DEPENDING() { return getToken(CobolParser.DEPENDING, 0); }
		public QualifiedDataNameContext qualifiedDataName() {
			return getRuleContext(QualifiedDataNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(CobolParser.ON, 0); }
		public DataOccursDependingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataOccursDepending; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataOccursDepending(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataOccursDepending(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataOccursDepending(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataOccursDependingContext dataOccursDepending() throws RecognitionException {
		DataOccursDependingContext _localctx = new DataOccursDependingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataOccursDepending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(DEPENDING);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(309);
				match(ON);
				}
			}

			setState(312);
			qualifiedDataName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataOccursSortContext extends ParserRuleContext {
		public TerminalNode ASCENDING() { return getToken(CobolParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CobolParser.DESCENDING, 0); }
		public TerminalNode KEY() { return getToken(CobolParser.KEY, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public List<QualifiedDataNameContext> qualifiedDataName() {
			return getRuleContexts(QualifiedDataNameContext.class);
		}
		public QualifiedDataNameContext qualifiedDataName(int i) {
			return getRuleContext(QualifiedDataNameContext.class,i);
		}
		public DataOccursSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataOccursSort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataOccursSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataOccursSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataOccursSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataOccursSortContext dataOccursSort() throws RecognitionException {
		DataOccursSortContext _localctx = new DataOccursSortContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dataOccursSort);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==ASCENDING || _la==DESCENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY) {
				{
				setState(315);
				match(KEY);
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(318);
				match(IS);
				}
			}

			setState(322); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(321);
					qualifiedDataName();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataOccursIndexedContext extends ParserRuleContext {
		public TerminalNode INDEXED() { return getToken(CobolParser.INDEXED, 0); }
		public TerminalNode BY() { return getToken(CobolParser.BY, 0); }
		public TerminalNode LOCAL() { return getToken(CobolParser.LOCAL, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolParser.COMMACHAR, i);
		}
		public DataOccursIndexedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataOccursIndexed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataOccursIndexed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataOccursIndexed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataOccursIndexed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataOccursIndexedContext dataOccursIndexed() throws RecognitionException {
		DataOccursIndexedContext _localctx = new DataOccursIndexedContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dataOccursIndexed);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(INDEXED);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(327);
				match(BY);
				}
			}

			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(330);
				match(LOCAL);
				}
				break;
			}
			setState(337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(333);
					indexName();
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(334);
						match(COMMACHAR);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataPictureClauseContext extends ParserRuleContext {
		public PictureStringContext pictureString() {
			return getRuleContext(PictureStringContext.class,0);
		}
		public TerminalNode PICTURE() { return getToken(CobolParser.PICTURE, 0); }
		public TerminalNode PIC() { return getToken(CobolParser.PIC, 0); }
		public List<TerminalNode> IS() { return getTokens(CobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CobolParser.IS, i);
		}
		public TerminalNode BYTE_LENGTH() { return getToken(CobolParser.BYTE_LENGTH, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public PictureEditingPhraseContext pictureEditingPhrase() {
			return getRuleContext(PictureEditingPhraseContext.class,0);
		}
		public PictureLocalePhraseContext pictureLocalePhrase() {
			return getRuleContext(PictureLocalePhraseContext.class,0);
		}
		public DataPictureClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPictureClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataPictureClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataPictureClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataPictureClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPictureClauseContext dataPictureClause() throws RecognitionException {
		DataPictureClauseContext _localctx = new DataPictureClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dataPictureClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==PIC || _la==PICTURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(342);
				match(IS);
				}
			}

			setState(345);
			pictureString();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_LENGTH) {
				{
				setState(346);
				match(BYTE_LENGTH);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(347);
					match(IS);
					}
				}

				setState(350);
				match(INTEGERLITERAL);
				}
			}

			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDITING:
				{
				setState(353);
				pictureEditingPhrase();
				}
				break;
			case LOCALE:
				{
				setState(354);
				pictureLocalePhrase();
				}
				break;
			case ALIGNED:
			case ANY:
			case BASED:
			case BINARY:
			case BINARY_CHAR:
			case BINARY_DOUBLE:
			case BINARY_LONG:
			case BINARY_SHORT:
			case BIT:
			case BLANK:
			case BY:
			case COMMON:
			case COMP:
			case COMP_1:
			case COMP_2:
			case COMP_3:
			case COMP_4:
			case COMP_5:
			case COMPUTATIONAL:
			case COMPUTATIONAL_1:
			case COMPUTATIONAL_2:
			case COMPUTATIONAL_3:
			case COMPUTATIONAL_4:
			case COMPUTATIONAL_5:
			case CONSTANT:
			case CONTENT:
			case CONTROL_POINT:
			case DATE:
			case DISPLAY:
			case DISPLAY_1:
			case DOUBLE:
			case DYNAMIC:
			case EVENT:
			case EXTERNAL:
			case FLOAT_BINARY_32:
			case FLOAT_BINARY_64:
			case FLOAT_BINARY_128:
			case FLOAT_DECIMAL_16:
			case FLOAT_DECIMAL_34:
			case FLOAT_EXTENDED:
			case FLOAT_LONG:
			case FLOAT_SHORT:
			case FUNCTION_POINTER:
			case GLOBAL:
			case GROUP_USAGE:
			case INDEX:
			case INTEGER:
			case IS:
			case JUST:
			case JUSTIFIED:
			case KANJI:
			case LEADING:
			case LOCAL:
			case LOCK:
			case LOWER:
			case MESSAGE_TAG:
			case NATIONAL:
			case OBJECT_REFERENCE:
			case OCCURS:
			case OWN:
			case PACKED_DECIMAL:
			case PIC:
			case PICTURE:
			case POINTER:
			case POINTER_32:
			case PROCEDURE_POINTER:
			case PROGRAM_POINTER:
			case PROPERTY:
			case REAL:
			case RECEIVED:
			case RECORD:
			case REDEFINES:
			case REF:
			case REFERENCE:
			case SAME:
			case SELECT:
			case SIGN:
			case SQL:
			case STRING:
			case SYNC:
			case SYNCHRONIZED:
			case TASK:
			case THREAD_LOCAL:
			case TRAILING:
			case TYPE:
			case TYPEDEF:
			case USAGE:
			case USING:
			case UTF_8:
			case VALUE:
			case VALUES:
			case VOLATILE:
			case WITH:
			case DOT_FS:
			case DOT:
			case DOT_WS:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureStringContext extends ParserRuleContext {
		public List<PictureCharsContext> pictureChars() {
			return getRuleContexts(PictureCharsContext.class);
		}
		public PictureCharsContext pictureChars(int i) {
			return getRuleContext(PictureCharsContext.class,i);
		}
		public List<PictureCardinalityContext> pictureCardinality() {
			return getRuleContexts(PictureCardinalityContext.class);
		}
		public PictureCardinalityContext pictureCardinality(int i) {
			return getRuleContext(PictureCardinalityContext.class,i);
		}
		public PictureStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterPictureString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitPictureString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitPictureString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PictureStringContext pictureString() throws RecognitionException {
		PictureStringContext _localctx = new PictureStringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pictureString);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(358); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(357);
							pictureChars();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(360); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PICTURE_CARDINALITY) {
						{
						setState(362);
						pictureCardinality();
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureCharsContext extends ParserRuleContext {
		public TerminalNode DOLLARCHAR() { return getToken(CobolParser.DOLLARCHAR, 0); }
		public TerminalNode PICTURE_SYMBOLS() { return getToken(CobolParser.PICTURE_SYMBOLS, 0); }
		public TerminalNode SLASHCHAR() { return getToken(CobolParser.SLASHCHAR, 0); }
		public TerminalNode COMMACHAR() { return getToken(CobolParser.COMMACHAR, 0); }
		public TerminalNode DOT() { return getToken(CobolParser.DOT, 0); }
		public TerminalNode ASTERISKCHAR() { return getToken(CobolParser.ASTERISKCHAR, 0); }
		public TerminalNode DOUBLEASTERISKCHAR() { return getToken(CobolParser.DOUBLEASTERISKCHAR, 0); }
		public TerminalNode PLUSCHAR() { return getToken(CobolParser.PLUSCHAR, 0); }
		public TerminalNode MINUSCHAR() { return getToken(CobolParser.MINUSCHAR, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public PictureCharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureChars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterPictureChars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitPictureChars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitPictureChars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PictureCharsContext pictureChars() throws RecognitionException {
		PictureCharsContext _localctx = new PictureCharsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pictureChars);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(DOLLARCHAR);
				}
				break;
			case PICTURE_SYMBOLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(PICTURE_SYMBOLS);
				}
				break;
			case SLASHCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(SLASHCHAR);
				}
				break;
			case COMMACHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(COMMACHAR);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(DOT);
				}
				break;
			case ASTERISKCHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(ASTERISKCHAR);
				}
				break;
			case DOUBLEASTERISKCHAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				match(DOUBLEASTERISKCHAR);
				}
				break;
			case PLUSCHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				match(PLUSCHAR);
				}
				break;
			case MINUSCHAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(377);
				match(MINUSCHAR);
				}
				break;
			case LEVEL_NUMBER_66:
			case LEVEL_NUMBER_77:
			case LEVEL_NUMBER_88:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(378);
				integerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureCardinalityContext extends ParserRuleContext {
		public TerminalNode PICTURE_CARDINALITY() { return getToken(CobolParser.PICTURE_CARDINALITY, 0); }
		public PictureCardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureCardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterPictureCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitPictureCardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitPictureCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PictureCardinalityContext pictureCardinality() throws RecognitionException {
		PictureCardinalityContext _localctx = new PictureCardinalityContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pictureCardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(PICTURE_CARDINALITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureEditingPhraseContext extends ParserRuleContext {
		public TerminalNode EDITING() { return getToken(CobolParser.EDITING, 0); }
		public TerminalNode EDITING_CHARACTER() { return getToken(CobolParser.EDITING_CHARACTER, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode NEGATIVE() { return getToken(CobolParser.NEGATIVE, 0); }
		public TerminalNode POSITIVE() { return getToken(CobolParser.POSITIVE, 0); }
		public List<TerminalNode> IS() { return getTokens(CobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CobolParser.IS, i);
		}
		public TerminalNode FOR() { return getToken(CobolParser.FOR, 0); }
		public PictureEditingPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureEditingPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterPictureEditingPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitPictureEditingPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitPictureEditingPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PictureEditingPhraseContext pictureEditingPhrase() throws RecognitionException {
		PictureEditingPhraseContext _localctx = new PictureEditingPhraseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pictureEditingPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(EDITING);
			setState(384);
			match(EDITING_CHARACTER);
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				{
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(385);
					match(IS);
					}
				}

				setState(388);
				literal();
				}
				}
				break;
			case 2:
				{
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(389);
					match(FOR);
					}
				}

				setState(392);
				match(NEGATIVE);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(393);
					match(IS);
					}
				}

				setState(396);
				literal();
				setState(397);
				match(POSITIVE);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(398);
					match(IS);
					}
				}

				setState(401);
				literal();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PictureLocalePhraseContext extends ParserRuleContext {
		public TerminalNode LOCALE() { return getToken(CobolParser.LOCALE, 0); }
		public TerminalNode SIZE() { return getToken(CobolParser.SIZE, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public LocaleNameContext localeName() {
			return getRuleContext(LocaleNameContext.class,0);
		}
		public List<TerminalNode> IS() { return getTokens(CobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CobolParser.IS, i);
		}
		public PictureLocalePhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pictureLocalePhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterPictureLocalePhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitPictureLocalePhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitPictureLocalePhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PictureLocalePhraseContext pictureLocalePhrase() throws RecognitionException {
		PictureLocalePhraseContext _localctx = new PictureLocalePhraseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pictureLocalePhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LOCALE);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY) | (1L << BIT) | (1L << BOUNDS) | (1L << CLOB) | (1L << CONTROL_POINT) | (1L << CONVENTION) | (1L << DBCLOB) | (1L << EVENT) | (1L << EXTENDED))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (FUNCTION_POINTER - 80)) | (1L << (INTEGER - 80)) | (1L << (IS - 80)) | (1L << (LANGUAGE - 80)) | (1L << (LOCAL - 80)) | (1L << (LONG_DATE - 80)) | (1L << (LONG_TIME - 80)) | (1L << (LOWER - 80)) | (1L << (NATIONAL - 80)) | (1L << (NUMERIC_DATE - 80)) | (1L << (NUMERIC_TIME - 80)) | (1L << (OWN - 80)) | (1L << (REAL - 80)) | (1L << (RECEIVED - 80)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (REF - 145)) | (1L << (SHORT_DATE - 145)) | (1L << (SQL - 145)) | (1L << (STRONG - 145)) | (1L << (TASK - 145)) | (1L << (THREAD_LOCAL - 145)) | (1L << (TRUNCATED - 145)) | (1L << (TYPEDEF - 145)))) != 0) || _la==IDENTIFIER) {
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(406);
					match(IS);
					}
				}

				setState(409);
				localeName();
				}
			}

			setState(412);
			match(SIZE);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(413);
				match(IS);
				}
			}

			setState(416);
			match(INTEGERLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataPropertyClauseContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(CobolParser.PROPERTY, 0); }
		public TerminalNode NO() { return getToken(CobolParser.NO, 0); }
		public TerminalNode FINAL() { return getToken(CobolParser.FINAL, 0); }
		public TerminalNode GET() { return getToken(CobolParser.GET, 0); }
		public TerminalNode SET() { return getToken(CobolParser.SET, 0); }
		public TerminalNode WITH() { return getToken(CobolParser.WITH, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataPropertyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataPropertyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataPropertyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataPropertyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataPropertyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataPropertyClauseContext dataPropertyClause() throws RecognitionException {
		DataPropertyClauseContext _localctx = new DataPropertyClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dataPropertyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			match(PROPERTY);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(419);
					match(WITH);
					}
				}

				setState(422);
				match(NO);
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==GET || _la==SET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(426);
					match(IS);
					}
				}

				setState(429);
				match(FINAL);
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataReceivedByClauseContext extends ParserRuleContext {
		public TerminalNode CONTENT() { return getToken(CobolParser.CONTENT, 0); }
		public TerminalNode REFERENCE() { return getToken(CobolParser.REFERENCE, 0); }
		public TerminalNode REF() { return getToken(CobolParser.REF, 0); }
		public TerminalNode RECEIVED() { return getToken(CobolParser.RECEIVED, 0); }
		public TerminalNode BY() { return getToken(CobolParser.BY, 0); }
		public DataReceivedByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataReceivedByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataReceivedByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataReceivedByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataReceivedByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataReceivedByClauseContext dataReceivedByClause() throws RecognitionException {
		DataReceivedByClauseContext _localctx = new DataReceivedByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dataReceivedByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECEIVED) {
				{
				setState(432);
				match(RECEIVED);
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(435);
				match(BY);
				}
			}

			setState(438);
			_la = _input.LA(1);
			if ( !(_la==CONTENT || _la==REF || _la==REFERENCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRecordAreaClauseContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(CobolParser.RECORD, 0); }
		public TerminalNode AREA() { return getToken(CobolParser.AREA, 0); }
		public DataRecordAreaClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRecordAreaClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataRecordAreaClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataRecordAreaClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataRecordAreaClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRecordAreaClauseContext dataRecordAreaClause() throws RecognitionException {
		DataRecordAreaClauseContext _localctx = new DataRecordAreaClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dataRecordAreaClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(RECORD);
			setState(441);
			match(AREA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRedefinesClauseContext extends ParserRuleContext {
		public TerminalNode REDEFINES() { return getToken(CobolParser.REDEFINES, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public DataRedefinesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRedefinesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataRedefinesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataRedefinesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataRedefinesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRedefinesClauseContext dataRedefinesClause() throws RecognitionException {
		DataRedefinesClauseContext _localctx = new DataRedefinesClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dataRedefinesClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(REDEFINES);
			setState(444);
			dataName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataRenamesClauseContext extends ParserRuleContext {
		public TerminalNode RENAMES() { return getToken(CobolParser.RENAMES, 0); }
		public List<QualifiedDataNameContext> qualifiedDataName() {
			return getRuleContexts(QualifiedDataNameContext.class);
		}
		public QualifiedDataNameContext qualifiedDataName(int i) {
			return getRuleContext(QualifiedDataNameContext.class,i);
		}
		public TerminalNode THROUGH() { return getToken(CobolParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(CobolParser.THRU, 0); }
		public DataRenamesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRenamesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataRenamesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataRenamesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataRenamesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRenamesClauseContext dataRenamesClause() throws RecognitionException {
		DataRenamesClauseContext _localctx = new DataRenamesClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dataRenamesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(RENAMES);
			setState(447);
			qualifiedDataName();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROUGH || _la==THRU) {
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				qualifiedDataName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSameAsClauseContext extends ParserRuleContext {
		public TerminalNode SAME() { return getToken(CobolParser.SAME, 0); }
		public TerminalNode AS() { return getToken(CobolParser.AS, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public DataSameAsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSameAsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataSameAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataSameAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataSameAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSameAsClauseContext dataSameAsClause() throws RecognitionException {
		DataSameAsClauseContext _localctx = new DataSameAsClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dataSameAsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			match(SAME);
			setState(453);
			match(AS);
			setState(454);
			dataName();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSelectWhenClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CobolParser.SELECT, 0); }
		public TerminalNode WHEN() { return getToken(CobolParser.WHEN, 0); }
		public TerminalNode OTHER() { return getToken(CobolParser.OTHER, 0); }
		public ConditionNameContext conditionName() {
			return getRuleContext(ConditionNameContext.class,0);
		}
		public DataSelectWhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSelectWhenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataSelectWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataSelectWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataSelectWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSelectWhenClauseContext dataSelectWhenClause() throws RecognitionException {
		DataSelectWhenClauseContext _localctx = new DataSelectWhenClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dataSelectWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(456);
			match(SELECT);
			setState(457);
			match(WHEN);
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTHER:
				{
				setState(458);
				match(OTHER);
				}
				break;
			case BINARY:
			case BIT:
			case BOUNDS:
			case CLOB:
			case CONTROL_POINT:
			case CONVENTION:
			case DBCLOB:
			case EVENT:
			case EXTENDED:
			case FUNCTION_POINTER:
			case INTEGER:
			case LANGUAGE:
			case LOCAL:
			case LONG_DATE:
			case LONG_TIME:
			case LOWER:
			case NATIONAL:
			case NUMERIC_DATE:
			case NUMERIC_TIME:
			case OWN:
			case REAL:
			case RECEIVED:
			case REF:
			case SHORT_DATE:
			case SQL:
			case STRONG:
			case TASK:
			case THREAD_LOCAL:
			case TRUNCATED:
			case TYPEDEF:
			case IDENTIFIER:
				{
				setState(459);
				conditionName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSignClauseContext extends ParserRuleContext {
		public TerminalNode LEADING() { return getToken(CobolParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(CobolParser.TRAILING, 0); }
		public TerminalNode SIGN() { return getToken(CobolParser.SIGN, 0); }
		public TerminalNode SEPARATE() { return getToken(CobolParser.SEPARATE, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public TerminalNode CHARACTER() { return getToken(CobolParser.CHARACTER, 0); }
		public DataSignClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSignClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataSignClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataSignClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataSignClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSignClauseContext dataSignClause() throws RecognitionException {
		DataSignClauseContext _localctx = new DataSignClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dataSignClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(462);
				match(SIGN);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(463);
					match(IS);
					}
				}

				}
			}

			setState(468);
			_la = _input.LA(1);
			if ( !(_la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATE) {
				{
				setState(469);
				match(SEPARATE);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(470);
					match(CHARACTER);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSynchronizedClauseContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(CobolParser.SYNCHRONIZED, 0); }
		public TerminalNode SYNC() { return getToken(CobolParser.SYNC, 0); }
		public TerminalNode LEFT() { return getToken(CobolParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(CobolParser.RIGHT, 0); }
		public DataSynchronizedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSynchronizedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataSynchronizedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataSynchronizedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataSynchronizedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSynchronizedClauseContext dataSynchronizedClause() throws RecognitionException {
		DataSynchronizedClauseContext _localctx = new DataSynchronizedClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dataSynchronizedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==SYNC || _la==SYNCHRONIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT || _la==RIGHT) {
				{
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataThreadLocalClauseContext extends ParserRuleContext {
		public TerminalNode THREAD_LOCAL() { return getToken(CobolParser.THREAD_LOCAL, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataThreadLocalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataThreadLocalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataThreadLocalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataThreadLocalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataThreadLocalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataThreadLocalClauseContext dataThreadLocalClause() throws RecognitionException {
		DataThreadLocalClauseContext _localctx = new DataThreadLocalClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dataThreadLocalClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(479);
				match(IS);
				}
			}

			setState(482);
			match(THREAD_LOCAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeClauseContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CobolParser.TYPE, 0); }
		public TerminalNode SHORT_DATE() { return getToken(CobolParser.SHORT_DATE, 0); }
		public TerminalNode LONG_DATE() { return getToken(CobolParser.LONG_DATE, 0); }
		public TerminalNode NUMERIC_DATE() { return getToken(CobolParser.NUMERIC_DATE, 0); }
		public TerminalNode NUMERIC_TIME() { return getToken(CobolParser.NUMERIC_TIME, 0); }
		public TerminalNode LONG_TIME() { return getToken(CobolParser.LONG_TIME, 0); }
		public TerminalNode CLOB_LOCATOR() { return getToken(CobolParser.CLOB_LOCATOR, 0); }
		public TerminalNode BLOB_LOCATOR() { return getToken(CobolParser.BLOB_LOCATOR, 0); }
		public TerminalNode DBCLOB_LOCATOR() { return getToken(CobolParser.DBCLOB_LOCATOR, 0); }
		public TerminalNode ROWID() { return getToken(CobolParser.ROWID, 0); }
		public TerminalNode LPARENCHAR() { return getToken(CobolParser.LPARENCHAR, 0); }
		public TerminalNode RPARENCHAR() { return getToken(CobolParser.RPARENCHAR, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolParser.IDENTIFIER, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public TerminalNode CLOB() { return getToken(CobolParser.CLOB, 0); }
		public TerminalNode BLOB() { return getToken(CobolParser.BLOB, 0); }
		public TerminalNode DBCLOB() { return getToken(CobolParser.DBCLOB, 0); }
		public TerminalNode VARBINARY() { return getToken(CobolParser.VARBINARY, 0); }
		public TerminalNode XML() { return getToken(CobolParser.XML, 0); }
		public TerminalNode AS() { return getToken(CobolParser.AS, 0); }
		public DataTypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataTypeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataTypeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataTypeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeClauseContext dataTypeClause() throws RecognitionException {
		DataTypeClauseContext _localctx = new DataTypeClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataTypeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(TYPE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(485);
				match(IS);
				}
			}

			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT_DATE:
				{
				setState(488);
				match(SHORT_DATE);
				}
				break;
			case LONG_DATE:
				{
				setState(489);
				match(LONG_DATE);
				}
				break;
			case NUMERIC_DATE:
				{
				setState(490);
				match(NUMERIC_DATE);
				}
				break;
			case NUMERIC_TIME:
				{
				setState(491);
				match(NUMERIC_TIME);
				}
				break;
			case LONG_TIME:
				{
				setState(492);
				match(LONG_TIME);
				}
				break;
			case CLOB_LOCATOR:
				{
				setState(493);
				match(CLOB_LOCATOR);
				}
				break;
			case BLOB_LOCATOR:
				{
				setState(494);
				match(BLOB_LOCATOR);
				}
				break;
			case DBCLOB_LOCATOR:
				{
				setState(495);
				match(DBCLOB_LOCATOR);
				}
				break;
			case ROWID:
				{
				setState(496);
				match(ROWID);
				}
				break;
			case BLOB:
			case CLOB:
			case DBCLOB:
			case VARBINARY:
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLOB:
					{
					setState(497);
					match(CLOB);
					}
					break;
				case BLOB:
					{
					setState(498);
					match(BLOB);
					}
					break;
				case DBCLOB:
					{
					setState(499);
					match(DBCLOB);
					}
					break;
				case VARBINARY:
					{
					setState(500);
					match(VARBINARY);
					{
					setState(501);
					match(XML);
					setState(502);
					match(AS);
					setState(503);
					match(CLOB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(506);
				match(LPARENCHAR);
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==INTEGERLITERAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				match(RPARENCHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeDefClauseContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(CobolParser.TYPEDEF, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public TerminalNode STRONG() { return getToken(CobolParser.STRONG, 0); }
		public DataTypeDefClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDefClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataTypeDefClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataTypeDefClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataTypeDefClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeDefClauseContext dataTypeDefClause() throws RecognitionException {
		DataTypeDefClauseContext _localctx = new DataTypeDefClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dataTypeDefClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(511);
				match(IS);
				}
			}

			setState(514);
			match(TYPEDEF);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRONG) {
				{
				setState(515);
				match(STRONG);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataUsageClauseContext extends ParserRuleContext {
		public DataUsageTypeContext dataUsageType() {
			return getRuleContext(DataUsageTypeContext.class,0);
		}
		public TerminalNode USAGE() { return getToken(CobolParser.USAGE, 0); }
		public TerminalNode NATIVE() { return getToken(CobolParser.NATIVE, 0); }
		public TerminalNode IS() { return getToken(CobolParser.IS, 0); }
		public DataUsageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataUsageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataUsageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataUsageClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataUsageClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataUsageClauseContext dataUsageClause() throws RecognitionException {
		DataUsageClauseContext _localctx = new DataUsageClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dataUsageClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USAGE) {
				{
				setState(518);
				match(USAGE);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(519);
					match(IS);
					}
				}

				}
			}

			setState(524);
			dataUsageType();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(525);
				match(NATIVE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataUsageTypeContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(CobolParser.BINARY, 0); }
		public TerminalNode BIT() { return getToken(CobolParser.BIT, 0); }
		public TerminalNode COMP() { return getToken(CobolParser.COMP, 0); }
		public TerminalNode COMP_1() { return getToken(CobolParser.COMP_1, 0); }
		public TerminalNode COMP_2() { return getToken(CobolParser.COMP_2, 0); }
		public TerminalNode COMP_3() { return getToken(CobolParser.COMP_3, 0); }
		public TerminalNode COMP_4() { return getToken(CobolParser.COMP_4, 0); }
		public TerminalNode COMP_5() { return getToken(CobolParser.COMP_5, 0); }
		public TerminalNode COMPUTATIONAL() { return getToken(CobolParser.COMPUTATIONAL, 0); }
		public TerminalNode COMPUTATIONAL_1() { return getToken(CobolParser.COMPUTATIONAL_1, 0); }
		public TerminalNode COMPUTATIONAL_2() { return getToken(CobolParser.COMPUTATIONAL_2, 0); }
		public TerminalNode COMPUTATIONAL_3() { return getToken(CobolParser.COMPUTATIONAL_3, 0); }
		public TerminalNode COMPUTATIONAL_4() { return getToken(CobolParser.COMPUTATIONAL_4, 0); }
		public TerminalNode COMPUTATIONAL_5() { return getToken(CobolParser.COMPUTATIONAL_5, 0); }
		public TerminalNode CONTROL_POINT() { return getToken(CobolParser.CONTROL_POINT, 0); }
		public TerminalNode DATE() { return getToken(CobolParser.DATE, 0); }
		public TerminalNode DISPLAY() { return getToken(CobolParser.DISPLAY, 0); }
		public TerminalNode DISPLAY_1() { return getToken(CobolParser.DISPLAY_1, 0); }
		public TerminalNode DOUBLE() { return getToken(CobolParser.DOUBLE, 0); }
		public TerminalNode EVENT() { return getToken(CobolParser.EVENT, 0); }
		public TerminalNode FLOAT_EXTENDED() { return getToken(CobolParser.FLOAT_EXTENDED, 0); }
		public TerminalNode FLOAT_LONG() { return getToken(CobolParser.FLOAT_LONG, 0); }
		public TerminalNode FLOAT_SHORT() { return getToken(CobolParser.FLOAT_SHORT, 0); }
		public TerminalNode INDEX() { return getToken(CobolParser.INDEX, 0); }
		public TerminalNode KANJI() { return getToken(CobolParser.KANJI, 0); }
		public TerminalNode LOCK() { return getToken(CobolParser.LOCK, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolParser.NATIONAL, 0); }
		public TerminalNode POINTER_32() { return getToken(CobolParser.POINTER_32, 0); }
		public TerminalNode PROCEDURE_POINTER() { return getToken(CobolParser.PROCEDURE_POINTER, 0); }
		public TerminalNode REAL() { return getToken(CobolParser.REAL, 0); }
		public TerminalNode SQL() { return getToken(CobolParser.SQL, 0); }
		public TerminalNode TASK() { return getToken(CobolParser.TASK, 0); }
		public TerminalNode UTF_8() { return getToken(CobolParser.UTF_8, 0); }
		public TerminalNode MESSAGE_TAG() { return getToken(CobolParser.MESSAGE_TAG, 0); }
		public TerminalNode OBJECT_REFERENCE() { return getToken(CobolParser.OBJECT_REFERENCE, 0); }
		public TerminalNode BINARY_CHAR() { return getToken(CobolParser.BINARY_CHAR, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(CobolParser.BINARY_DOUBLE, 0); }
		public TerminalNode BINARY_LONG() { return getToken(CobolParser.BINARY_LONG, 0); }
		public TerminalNode BINARY_SHORT() { return getToken(CobolParser.BINARY_SHORT, 0); }
		public TerminalNode FLOAT_BINARY_32() { return getToken(CobolParser.FLOAT_BINARY_32, 0); }
		public TerminalNode FLOAT_BINARY_64() { return getToken(CobolParser.FLOAT_BINARY_64, 0); }
		public TerminalNode FLOAT_BINARY_128() { return getToken(CobolParser.FLOAT_BINARY_128, 0); }
		public TerminalNode FLOAT_DECIMAL_16() { return getToken(CobolParser.FLOAT_DECIMAL_16, 0); }
		public TerminalNode FLOAT_DECIMAL_34() { return getToken(CobolParser.FLOAT_DECIMAL_34, 0); }
		public TerminalNode FUNCTION_POINTER() { return getToken(CobolParser.FUNCTION_POINTER, 0); }
		public TerminalNode PACKED_DECIMAL() { return getToken(CobolParser.PACKED_DECIMAL, 0); }
		public TerminalNode POINTER() { return getToken(CobolParser.POINTER, 0); }
		public TerminalNode PROGRAM_POINTER() { return getToken(CobolParser.PROGRAM_POINTER, 0); }
		public TerminalNode SIGNED() { return getToken(CobolParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(CobolParser.UNSIGNED, 0); }
		public DataUsageObjectReferenceFactoryPhraseContext dataUsageObjectReferenceFactoryPhrase() {
			return getRuleContext(DataUsageObjectReferenceFactoryPhraseContext.class,0);
		}
		public TerminalNode TRUNCATED() { return getToken(CobolParser.TRUNCATED, 0); }
		public TerminalNode EXTENDED() { return getToken(CobolParser.EXTENDED, 0); }
		public EndiannessPhraseContext endiannessPhrase() {
			return getRuleContext(EndiannessPhraseContext.class,0);
		}
		public EncodingPhraseContext encodingPhrase() {
			return getRuleContext(EncodingPhraseContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public TerminalNode NO() { return getToken(CobolParser.NO, 0); }
		public TerminalNode SIGN() { return getToken(CobolParser.SIGN, 0); }
		public TerminalNode TO() { return getToken(CobolParser.TO, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(CobolParser.WITH, 0); }
		public DataUsageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataUsageType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataUsageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataUsageType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataUsageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataUsageTypeContext dataUsageType() throws RecognitionException {
		DataUsageTypeContext _localctx = new DataUsageTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dataUsageType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				{
				setState(528);
				match(BINARY);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDED || _la==TRUNCATED) {
					{
					setState(529);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==TRUNCATED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case BINARY_CHAR:
				{
				{
				setState(532);
				match(BINARY_CHAR);
				setState(533);
				_la = _input.LA(1);
				if ( !(_la==SIGNED || _la==UNSIGNED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case BINARY_DOUBLE:
				{
				{
				setState(534);
				match(BINARY_DOUBLE);
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==SIGNED || _la==UNSIGNED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case BINARY_LONG:
				{
				{
				setState(536);
				match(BINARY_LONG);
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==SIGNED || _la==UNSIGNED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case BINARY_SHORT:
				{
				{
				setState(538);
				match(BINARY_SHORT);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==SIGNED || _la==UNSIGNED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case BIT:
				{
				setState(540);
				match(BIT);
				}
				break;
			case COMP:
				{
				setState(541);
				match(COMP);
				}
				break;
			case COMP_1:
				{
				setState(542);
				match(COMP_1);
				}
				break;
			case COMP_2:
				{
				setState(543);
				match(COMP_2);
				}
				break;
			case COMP_3:
				{
				setState(544);
				match(COMP_3);
				}
				break;
			case COMP_4:
				{
				setState(545);
				match(COMP_4);
				}
				break;
			case COMP_5:
				{
				setState(546);
				match(COMP_5);
				}
				break;
			case COMPUTATIONAL:
				{
				setState(547);
				match(COMPUTATIONAL);
				}
				break;
			case COMPUTATIONAL_1:
				{
				setState(548);
				match(COMPUTATIONAL_1);
				}
				break;
			case COMPUTATIONAL_2:
				{
				setState(549);
				match(COMPUTATIONAL_2);
				}
				break;
			case COMPUTATIONAL_3:
				{
				setState(550);
				match(COMPUTATIONAL_3);
				}
				break;
			case COMPUTATIONAL_4:
				{
				setState(551);
				match(COMPUTATIONAL_4);
				}
				break;
			case COMPUTATIONAL_5:
				{
				setState(552);
				match(COMPUTATIONAL_5);
				}
				break;
			case CONTROL_POINT:
				{
				setState(553);
				match(CONTROL_POINT);
				}
				break;
			case DATE:
				{
				setState(554);
				match(DATE);
				}
				break;
			case DISPLAY:
				{
				setState(555);
				match(DISPLAY);
				}
				break;
			case DISPLAY_1:
				{
				setState(556);
				match(DISPLAY_1);
				}
				break;
			case DOUBLE:
				{
				setState(557);
				match(DOUBLE);
				}
				break;
			case EVENT:
				{
				setState(558);
				match(EVENT);
				}
				break;
			case FLOAT_BINARY_32:
				{
				{
				setState(559);
				match(FLOAT_BINARY_32);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGH_ORDER_LEFT || _la==HIGH_ORDER_RIGHT) {
					{
					setState(560);
					endiannessPhrase();
					}
				}

				}
				}
				break;
			case FLOAT_BINARY_64:
				{
				{
				setState(563);
				match(FLOAT_BINARY_64);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGH_ORDER_LEFT || _la==HIGH_ORDER_RIGHT) {
					{
					setState(564);
					endiannessPhrase();
					}
				}

				}
				}
				break;
			case FLOAT_BINARY_128:
				{
				{
				setState(567);
				match(FLOAT_BINARY_128);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGH_ORDER_LEFT || _la==HIGH_ORDER_RIGHT) {
					{
					setState(568);
					endiannessPhrase();
					}
				}

				}
				}
				break;
			case FLOAT_DECIMAL_16:
				{
				{
				setState(571);
				match(FLOAT_DECIMAL_16);
				setState(574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINARY_ENCODING:
				case DECIMAL_ENCODING:
					{
					setState(572);
					encodingPhrase();
					}
					break;
				case HIGH_ORDER_LEFT:
				case HIGH_ORDER_RIGHT:
					{
					setState(573);
					endiannessPhrase();
					}
					break;
				case ALIGNED:
				case ANY:
				case BASED:
				case BINARY:
				case BINARY_CHAR:
				case BINARY_DOUBLE:
				case BINARY_LONG:
				case BINARY_SHORT:
				case BIT:
				case BLANK:
				case BY:
				case COMMON:
				case COMP:
				case COMP_1:
				case COMP_2:
				case COMP_3:
				case COMP_4:
				case COMP_5:
				case COMPUTATIONAL:
				case COMPUTATIONAL_1:
				case COMPUTATIONAL_2:
				case COMPUTATIONAL_3:
				case COMPUTATIONAL_4:
				case COMPUTATIONAL_5:
				case CONSTANT:
				case CONTENT:
				case CONTROL_POINT:
				case DATE:
				case DISPLAY:
				case DISPLAY_1:
				case DOUBLE:
				case DYNAMIC:
				case EVENT:
				case EXTERNAL:
				case FLOAT_BINARY_32:
				case FLOAT_BINARY_64:
				case FLOAT_BINARY_128:
				case FLOAT_DECIMAL_16:
				case FLOAT_DECIMAL_34:
				case FLOAT_EXTENDED:
				case FLOAT_LONG:
				case FLOAT_SHORT:
				case FUNCTION_POINTER:
				case GLOBAL:
				case GROUP_USAGE:
				case INDEX:
				case INTEGER:
				case IS:
				case JUST:
				case JUSTIFIED:
				case KANJI:
				case LEADING:
				case LOCAL:
				case LOCK:
				case LOWER:
				case MESSAGE_TAG:
				case NATIONAL:
				case NATIVE:
				case OBJECT_REFERENCE:
				case OCCURS:
				case OWN:
				case PACKED_DECIMAL:
				case PIC:
				case PICTURE:
				case POINTER:
				case POINTER_32:
				case PROCEDURE_POINTER:
				case PROGRAM_POINTER:
				case PROPERTY:
				case REAL:
				case RECEIVED:
				case RECORD:
				case REDEFINES:
				case REF:
				case REFERENCE:
				case SAME:
				case SELECT:
				case SIGN:
				case SQL:
				case STRING:
				case SYNC:
				case SYNCHRONIZED:
				case TASK:
				case THREAD_LOCAL:
				case TRAILING:
				case TYPE:
				case TYPEDEF:
				case USAGE:
				case USING:
				case UTF_8:
				case VALUE:
				case VALUES:
				case VOLATILE:
				case WITH:
				case DOT_FS:
				case DOT:
				case DOT_WS:
					break;
				default:
					break;
				}
				}
				}
				break;
			case FLOAT_DECIMAL_34:
				{
				{
				setState(576);
				match(FLOAT_DECIMAL_34);
				setState(579);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINARY_ENCODING:
				case DECIMAL_ENCODING:
					{
					setState(577);
					encodingPhrase();
					}
					break;
				case HIGH_ORDER_LEFT:
				case HIGH_ORDER_RIGHT:
					{
					setState(578);
					endiannessPhrase();
					}
					break;
				case ALIGNED:
				case ANY:
				case BASED:
				case BINARY:
				case BINARY_CHAR:
				case BINARY_DOUBLE:
				case BINARY_LONG:
				case BINARY_SHORT:
				case BIT:
				case BLANK:
				case BY:
				case COMMON:
				case COMP:
				case COMP_1:
				case COMP_2:
				case COMP_3:
				case COMP_4:
				case COMP_5:
				case COMPUTATIONAL:
				case COMPUTATIONAL_1:
				case COMPUTATIONAL_2:
				case COMPUTATIONAL_3:
				case COMPUTATIONAL_4:
				case COMPUTATIONAL_5:
				case CONSTANT:
				case CONTENT:
				case CONTROL_POINT:
				case DATE:
				case DISPLAY:
				case DISPLAY_1:
				case DOUBLE:
				case DYNAMIC:
				case EVENT:
				case EXTERNAL:
				case FLOAT_BINARY_32:
				case FLOAT_BINARY_64:
				case FLOAT_BINARY_128:
				case FLOAT_DECIMAL_16:
				case FLOAT_DECIMAL_34:
				case FLOAT_EXTENDED:
				case FLOAT_LONG:
				case FLOAT_SHORT:
				case FUNCTION_POINTER:
				case GLOBAL:
				case GROUP_USAGE:
				case INDEX:
				case INTEGER:
				case IS:
				case JUST:
				case JUSTIFIED:
				case KANJI:
				case LEADING:
				case LOCAL:
				case LOCK:
				case LOWER:
				case MESSAGE_TAG:
				case NATIONAL:
				case NATIVE:
				case OBJECT_REFERENCE:
				case OCCURS:
				case OWN:
				case PACKED_DECIMAL:
				case PIC:
				case PICTURE:
				case POINTER:
				case POINTER_32:
				case PROCEDURE_POINTER:
				case PROGRAM_POINTER:
				case PROPERTY:
				case REAL:
				case RECEIVED:
				case RECORD:
				case REDEFINES:
				case REF:
				case REFERENCE:
				case SAME:
				case SELECT:
				case SIGN:
				case SQL:
				case STRING:
				case SYNC:
				case SYNCHRONIZED:
				case TASK:
				case THREAD_LOCAL:
				case TRAILING:
				case TYPE:
				case TYPEDEF:
				case USAGE:
				case USING:
				case UTF_8:
				case VALUE:
				case VALUES:
				case VOLATILE:
				case WITH:
				case DOT_FS:
				case DOT:
				case DOT_WS:
					break;
				default:
					break;
				}
				}
				}
				break;
			case FLOAT_EXTENDED:
				{
				setState(581);
				match(FLOAT_EXTENDED);
				}
				break;
			case FLOAT_LONG:
				{
				setState(582);
				match(FLOAT_LONG);
				}
				break;
			case FLOAT_SHORT:
				{
				setState(583);
				match(FLOAT_SHORT);
				}
				break;
			case FUNCTION_POINTER:
				{
				{
				setState(584);
				match(FUNCTION_POINTER);
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TO) {
						{
						setState(585);
						match(TO);
						}
					}

					setState(588);
					cobolWord();
					}
					break;
				}
				}
				}
				break;
			case INDEX:
				{
				setState(591);
				match(INDEX);
				}
				break;
			case KANJI:
				{
				setState(592);
				match(KANJI);
				}
				break;
			case LOCK:
				{
				setState(593);
				match(LOCK);
				}
				break;
			case NATIONAL:
				{
				setState(594);
				match(NATIONAL);
				}
				break;
			case PACKED_DECIMAL:
				{
				{
				setState(595);
				match(PACKED_DECIMAL);
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(596);
						match(WITH);
						}
					}

					setState(599);
					match(NO);
					setState(600);
					match(SIGN);
					}
					break;
				}
				}
				}
				break;
			case POINTER:
				{
				{
				setState(603);
				match(POINTER);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(604);
					match(TO);
					setState(605);
					dataName();
					}
				}

				}
				}
				break;
			case POINTER_32:
				{
				setState(608);
				match(POINTER_32);
				}
				break;
			case PROCEDURE_POINTER:
				{
				setState(609);
				match(PROCEDURE_POINTER);
				}
				break;
			case REAL:
				{
				setState(610);
				match(REAL);
				}
				break;
			case SQL:
				{
				setState(611);
				match(SQL);
				}
				break;
			case TASK:
				{
				setState(612);
				match(TASK);
				}
				break;
			case UTF_8:
				{
				setState(613);
				match(UTF_8);
				}
				break;
			case PROGRAM_POINTER:
				{
				{
				setState(614);
				match(PROGRAM_POINTER);
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TO) {
						{
						setState(615);
						match(TO);
						}
					}

					setState(618);
					cobolWord();
					}
					break;
				}
				}
				}
				break;
			case MESSAGE_TAG:
				{
				setState(621);
				match(MESSAGE_TAG);
				}
				break;
			case OBJECT_REFERENCE:
				{
				setState(622);
				match(OBJECT_REFERENCE);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FACTORY) {
					{
					setState(623);
					dataUsageObjectReferenceFactoryPhrase();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataUsageObjectReferenceFactoryPhraseContext extends ParserRuleContext {
		public TerminalNode FACTORY() { return getToken(CobolParser.FACTORY, 0); }
		public InterfaceNameContext interfaceName() {
			return getRuleContext(InterfaceNameContext.class,0);
		}
		public TerminalNode ACTIVE_CLASS() { return getToken(CobolParser.ACTIVE_CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(CobolParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(CobolParser.ONLY, 0); }
		public DataUsageObjectReferenceFactoryPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataUsageObjectReferenceFactoryPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataUsageObjectReferenceFactoryPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataUsageObjectReferenceFactoryPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataUsageObjectReferenceFactoryPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataUsageObjectReferenceFactoryPhraseContext dataUsageObjectReferenceFactoryPhrase() throws RecognitionException {
		DataUsageObjectReferenceFactoryPhraseContext _localctx = new DataUsageObjectReferenceFactoryPhraseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dataUsageObjectReferenceFactoryPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(628);
			match(FACTORY);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(629);
				match(OF);
				}
			}

			}
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(632);
				interfaceName();
				}
				break;
			case 2:
				{
				setState(633);
				match(ACTIVE_CLASS);
				}
				break;
			case 3:
				{
				{
				setState(634);
				className();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(635);
					match(ONLY);
					}
				}

				}
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataUsingClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(CobolParser.USING, 0); }
		public TerminalNode LANGUAGE() { return getToken(CobolParser.LANGUAGE, 0); }
		public TerminalNode CONVENTION() { return getToken(CobolParser.CONVENTION, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(CobolParser.OF, 0); }
		public DataUsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataUsingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataUsingClauseContext dataUsingClause() throws RecognitionException {
		DataUsingClauseContext _localctx = new DataUsingClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dataUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(USING);
			setState(641);
			_la = _input.LA(1);
			if ( !(_la==CONVENTION || _la==LANGUAGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(642);
				match(OF);
				}
			}

			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(645);
				cobolWord();
				}
				break;
			case 2:
				{
				setState(646);
				dataName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValueClauseContext extends ParserRuleContext {
		public List<DataValueIntervalContext> dataValueInterval() {
			return getRuleContexts(DataValueIntervalContext.class);
		}
		public DataValueIntervalContext dataValueInterval(int i) {
			return getRuleContext(DataValueIntervalContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(CobolParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(CobolParser.VALUES, 0); }
		public AlphabetNameContext alphabetName() {
			return getRuleContext(AlphabetNameContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(CobolParser.FALSE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> IS() { return getTokens(CobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CobolParser.IS, i);
		}
		public TerminalNode ARE() { return getToken(CobolParser.ARE, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolParser.COMMACHAR, i);
		}
		public TerminalNode IN() { return getToken(CobolParser.IN, 0); }
		public TerminalNode WHEN() { return getToken(CobolParser.WHEN, 0); }
		public TerminalNode SET() { return getToken(CobolParser.SET, 0); }
		public TerminalNode TO() { return getToken(CobolParser.TO, 0); }
		public DataValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValueClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataValueClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataValueClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataValueClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueClauseContext dataValueClause() throws RecognitionException {
		DataValueClauseContext _localctx = new DataValueClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataValueClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARE || _la==IS) {
				{
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==ARE || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(653);
			dataValueInterval();
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMACHAR) {
						{
						setState(654);
						match(COMMACHAR);
						}
					}

					setState(657);
					dataValueInterval();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(663);
					match(IN);
					}
				}

				setState(666);
				alphabetName();
				}
				break;
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (SET - 153)) | (1L << (TO - 153)) | (1L << (WHEN - 153)))) != 0)) {
				{
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHEN) {
					{
					setState(669);
					match(WHEN);
					}
				}

				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(672);
					match(SET);
					}
				}

				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(675);
					match(TO);
					}
				}

				setState(678);
				match(FALSE);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(679);
					match(IS);
					}
				}

				setState(682);
				literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValueIntervalContext extends ParserRuleContext {
		public DataValueIntervalFromContext dataValueIntervalFrom() {
			return getRuleContext(DataValueIntervalFromContext.class,0);
		}
		public DataValueIntervalToContext dataValueIntervalTo() {
			return getRuleContext(DataValueIntervalToContext.class,0);
		}
		public DataValueIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValueInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataValueInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataValueInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataValueInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueIntervalContext dataValueInterval() throws RecognitionException {
		DataValueIntervalContext _localctx = new DataValueIntervalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dataValueInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			dataValueIntervalFrom();
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(686);
				dataValueIntervalTo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValueIntervalFromContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public ContinuedLiteralContext continuedLiteral() {
			return getRuleContext(ContinuedLiteralContext.class,0);
		}
		public DataValueIntervalFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValueIntervalFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataValueIntervalFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataValueIntervalFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataValueIntervalFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueIntervalFromContext dataValueIntervalFrom() throws RecognitionException {
		DataValueIntervalFromContext _localctx = new DataValueIntervalFromContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dataValueIntervalFrom);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				cobolWord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				continuedLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataValueIntervalToContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(CobolParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(CobolParser.THRU, 0); }
		public ContinuedLiteralContext continuedLiteral() {
			return getRuleContext(ContinuedLiteralContext.class,0);
		}
		public DataValueIntervalToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValueIntervalTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataValueIntervalTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataValueIntervalTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataValueIntervalTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueIntervalToContext dataValueIntervalTo() throws RecognitionException {
		DataValueIntervalToContext _localctx = new DataValueIntervalToContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dataValueIntervalTo);
		int _la;
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROUGH:
			case THRU:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==THROUGH || _la==THRU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				literal();
				}
				break;
			case CONTINUED_HEXNUMBER:
			case CONTINUED_NULLTERMINATED:
			case CONTINUED_STRINGLITERAL:
			case CONTINUED_DBCSLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				continuedLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataVolatileClauseContext extends ParserRuleContext {
		public TerminalNode VOLATILE() { return getToken(CobolParser.VOLATILE, 0); }
		public DataVolatileClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataVolatileClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataVolatileClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataVolatileClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataVolatileClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataVolatileClauseContext dataVolatileClause() throws RecognitionException {
		DataVolatileClauseContext _localctx = new DataVolatileClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dataVolatileClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(VOLATILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataWithLowerBoundsClauseContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(CobolParser.LOWER, 0); }
		public TerminalNode BOUNDS() { return getToken(CobolParser.BOUNDS, 0); }
		public TerminalNode WITH() { return getToken(CobolParser.WITH, 0); }
		public DataWithLowerBoundsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataWithLowerBoundsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataWithLowerBoundsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataWithLowerBoundsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataWithLowerBoundsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataWithLowerBoundsClauseContext dataWithLowerBoundsClause() throws RecognitionException {
		DataWithLowerBoundsClauseContext _localctx = new DataWithLowerBoundsClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dataWithLowerBoundsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(701);
				match(WITH);
				}
			}

			setState(704);
			match(LOWER);
			setState(705);
			match(BOUNDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TableCallContext tableCall() {
			return getRuleContext(TableCallContext.class,0);
		}
		public QualifiedDataNameContext qualifiedDataName() {
			return getRuleContext(QualifiedDataNameContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifier);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				tableCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				qualifiedDataName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableCallContext extends ParserRuleContext {
		public QualifiedDataNameContext qualifiedDataName() {
			return getRuleContext(QualifiedDataNameContext.class,0);
		}
		public TerminalNode LPARENCHAR() { return getToken(CobolParser.LPARENCHAR, 0); }
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public TerminalNode RPARENCHAR() { return getToken(CobolParser.RPARENCHAR, 0); }
		public List<TerminalNode> COMMACHAR() { return getTokens(CobolParser.COMMACHAR); }
		public TerminalNode COMMACHAR(int i) {
			return getToken(CobolParser.COMMACHAR, i);
		}
		public TableCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterTableCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitTableCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitTableCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCallContext tableCall() throws RecognitionException {
		TableCallContext _localctx = new TableCallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tableCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			qualifiedDataName();
			{
			setState(712);
			match(LPARENCHAR);
			setState(713);
			subscript();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << BINARY) | (1L << BIT) | (1L << BOUNDS) | (1L << CLOB) | (1L << CONTROL_POINT) | (1L << CONVENTION) | (1L << DBCLOB) | (1L << EVENT) | (1L << EXTENDED))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (FUNCTION_POINTER - 80)) | (1L << (INTEGER - 80)) | (1L << (LANGUAGE - 80)) | (1L << (LOCAL - 80)) | (1L << (LONG_DATE - 80)) | (1L << (LONG_TIME - 80)) | (1L << (LOWER - 80)) | (1L << (NATIONAL - 80)) | (1L << (NUMERIC_DATE - 80)) | (1L << (NUMERIC_TIME - 80)) | (1L << (OWN - 80)) | (1L << (REAL - 80)) | (1L << (RECEIVED - 80)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (REF - 145)) | (1L << (SHORT_DATE - 145)) | (1L << (SQL - 145)) | (1L << (STRONG - 145)) | (1L << (TASK - 145)) | (1L << (THREAD_LOCAL - 145)) | (1L << (TRUNCATED - 145)) | (1L << (TYPEDEF - 145)) | (1L << (COMMACHAR - 145)))) != 0) || ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (LEVEL_NUMBER_66 - 220)) | (1L << (LEVEL_NUMBER_77 - 220)) | (1L << (LEVEL_NUMBER_88 - 220)) | (1L << (INTEGERLITERAL - 220)) | (1L << (IDENTIFIER - 220)))) != 0)) {
				{
				{
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMACHAR) {
					{
					setState(714);
					match(COMMACHAR);
					}
				}

				setState(717);
				subscript();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(RPARENCHAR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CobolParser.ALL, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public QualifiedDataNameContext qualifiedDataName() {
			return getRuleContext(QualifiedDataNameContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_subscript);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(ALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				integerLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				qualifiedDataName();
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(728);
					integerLiteral();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				indexName();
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(732);
					integerLiteral();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedDataNameContext qualifiedDataName() {
			return getRuleContext(QualifiedDataNameContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argument);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				qualifiedDataName();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (LEVEL_NUMBER_66 - 220)) | (1L << (LEVEL_NUMBER_77 - 220)) | (1L << (LEVEL_NUMBER_88 - 220)) | (1L << (INTEGERLITERAL - 220)))) != 0)) {
					{
					setState(740);
					integerLiteral();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(743);
				indexName();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (LEVEL_NUMBER_66 - 220)) | (1L << (LEVEL_NUMBER_77 - 220)) | (1L << (LEVEL_NUMBER_88 - 220)) | (1L << (INTEGERLITERAL - 220)))) != 0)) {
					{
					setState(744);
					integerLiteral();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedDataNameContext extends ParserRuleContext {
		public QualifiedDataNameFormat1Context qualifiedDataNameFormat1() {
			return getRuleContext(QualifiedDataNameFormat1Context.class,0);
		}
		public QualifiedDataNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedDataName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterQualifiedDataName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitQualifiedDataName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitQualifiedDataName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedDataNameContext qualifiedDataName() throws RecognitionException {
		QualifiedDataNameContext _localctx = new QualifiedDataNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualifiedDataName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			qualifiedDataNameFormat1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedDataNameFormat1Context extends ParserRuleContext {
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public ConditionNameContext conditionName() {
			return getRuleContext(ConditionNameContext.class,0);
		}
		public List<QualifiedInDataContext> qualifiedInData() {
			return getRuleContexts(QualifiedInDataContext.class);
		}
		public QualifiedInDataContext qualifiedInData(int i) {
			return getRuleContext(QualifiedInDataContext.class,i);
		}
		public QualifiedDataNameFormat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedDataNameFormat1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterQualifiedDataNameFormat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitQualifiedDataNameFormat1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitQualifiedDataNameFormat1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedDataNameFormat1Context qualifiedDataNameFormat1() throws RecognitionException {
		QualifiedDataNameFormat1Context _localctx = new QualifiedDataNameFormat1Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_qualifiedDataNameFormat1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(751);
				dataName();
				}
				break;
			case 2:
				{
				setState(752);
				conditionName();
				}
				break;
			}
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OF) {
				{
				setState(756); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(755);
					qualifiedInData();
					}
					}
					setState(758); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IN || _la==OF );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedInDataContext extends ParserRuleContext {
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(CobolParser.IN, 0); }
		public TerminalNode OF() { return getToken(CobolParser.OF, 0); }
		public QualifiedInDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedInData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterQualifiedInData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitQualifiedInData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitQualifiedInData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedInDataContext qualifiedInData() throws RecognitionException {
		QualifiedInDataContext _localctx = new QualifiedInDataContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_qualifiedInData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(763);
			dataName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphabetNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public AlphabetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterAlphabetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitAlphabetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitAlphabetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphabetNameContext alphabetName() throws RecognitionException {
		AlphabetNameContext _localctx = new AlphabetNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alphabetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public ConditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterConditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitConditionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitConditionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionNameContext conditionName() throws RecognitionException {
		ConditionNameContext _localctx = new ConditionNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_conditionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public ConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantNameContext constantName() throws RecognitionException {
		ConstantNameContext _localctx = new ConstantNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public DataNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataNameContext dataName() throws RecognitionException {
		DataNameContext _localctx = new DataNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dataName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDescNameContext extends ParserRuleContext {
		public TerminalNode FILLER() { return getToken(CobolParser.FILLER, 0); }
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public DataDescNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDescName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterDataDescName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitDataDescName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitDataDescName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDescNameContext dataDescName() throws RecognitionException {
		DataDescNameContext _localctx = new DataDescNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dataDescName);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILLER:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				match(FILLER);
				}
				break;
			case BINARY:
			case BIT:
			case BOUNDS:
			case CLOB:
			case CONTROL_POINT:
			case CONVENTION:
			case DBCLOB:
			case EVENT:
			case EXTENDED:
			case FUNCTION_POINTER:
			case INTEGER:
			case LANGUAGE:
			case LOCAL:
			case LONG_DATE:
			case LONG_TIME:
			case LOWER:
			case NATIONAL:
			case NUMERIC_DATE:
			case NUMERIC_TIME:
			case OWN:
			case REAL:
			case RECEIVED:
			case REF:
			case SHORT_DATE:
			case SQL:
			case STRONG:
			case TASK:
			case THREAD_LOCAL:
			case TRUNCATED:
			case TYPEDEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				dataName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public InterfaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterInterfaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitInterfaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitInterfaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceNameContext interfaceName() throws RecognitionException {
		InterfaceNameContext _localctx = new InterfaceNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_interfaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocaleNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public LocaleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterLocaleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitLocaleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitLocaleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocaleNameContext localeName() throws RecognitionException {
		LocaleNameContext _localctx = new LocaleNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			cobolWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagraphNameContext extends ParserRuleContext {
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public ParagraphNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterParagraphName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitParagraphName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitParagraphName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphNameContext paragraphName() throws RecognitionException {
		ParagraphNameContext _localctx = new ParagraphNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_paragraphName);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BOUNDS:
			case CLOB:
			case CONTROL_POINT:
			case CONVENTION:
			case DBCLOB:
			case EVENT:
			case EXTENDED:
			case FUNCTION_POINTER:
			case INTEGER:
			case LANGUAGE:
			case LOCAL:
			case LONG_DATE:
			case LONG_TIME:
			case LOWER:
			case NATIONAL:
			case NUMERIC_DATE:
			case NUMERIC_TIME:
			case OWN:
			case REAL:
			case RECEIVED:
			case REF:
			case SHORT_DATE:
			case SQL:
			case STRONG:
			case TASK:
			case THREAD_LOCAL:
			case TRUNCATED:
			case TYPEDEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				cobolWord();
				}
				break;
			case LEVEL_NUMBER_66:
			case LEVEL_NUMBER_77:
			case LEVEL_NUMBER_88:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				integerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramNameContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(CobolParser.NONNUMERICLITERAL, 0); }
		public CobolWordContext cobolWord() {
			return getRuleContext(CobolWordContext.class,0);
		}
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterProgramName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitProgramName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitProgramName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_programName);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONNUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(NONNUMERICLITERAL);
				}
				break;
			case BINARY:
			case BIT:
			case BOUNDS:
			case CLOB:
			case CONTROL_POINT:
			case CONVENTION:
			case DBCLOB:
			case EVENT:
			case EXTENDED:
			case FUNCTION_POINTER:
			case INTEGER:
			case LANGUAGE:
			case LOCAL:
			case LONG_DATE:
			case LONG_TIME:
			case LOWER:
			case NATIONAL:
			case NUMERIC_DATE:
			case NUMERIC_TIME:
			case OWN:
			case REAL:
			case RECEIVED:
			case REF:
			case SHORT_DATE:
			case SQL:
			case STRONG:
			case TASK:
			case THREAD_LOCAL:
			case TRUNCATED:
			case TYPEDEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				cobolWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CobolWordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CobolParser.IDENTIFIER, 0); }
		public TerminalNode BINARY() { return getToken(CobolParser.BINARY, 0); }
		public TerminalNode BIT() { return getToken(CobolParser.BIT, 0); }
		public TerminalNode BOUNDS() { return getToken(CobolParser.BOUNDS, 0); }
		public TerminalNode CLOB() { return getToken(CobolParser.CLOB, 0); }
		public TerminalNode CONTROL_POINT() { return getToken(CobolParser.CONTROL_POINT, 0); }
		public TerminalNode CONVENTION() { return getToken(CobolParser.CONVENTION, 0); }
		public TerminalNode DBCLOB() { return getToken(CobolParser.DBCLOB, 0); }
		public TerminalNode DOUBLE() { return getToken(CobolParser.DOUBLE, 0); }
		public TerminalNode EVENT() { return getToken(CobolParser.EVENT, 0); }
		public TerminalNode EXTENDED() { return getToken(CobolParser.EXTENDED, 0); }
		public TerminalNode FUNCTION_POINTER() { return getToken(CobolParser.FUNCTION_POINTER, 0); }
		public TerminalNode INTEGER() { return getToken(CobolParser.INTEGER, 0); }
		public TerminalNode LANGUAGE() { return getToken(CobolParser.LANGUAGE, 0); }
		public TerminalNode LOCAL() { return getToken(CobolParser.LOCAL, 0); }
		public TerminalNode LONG_DATE() { return getToken(CobolParser.LONG_DATE, 0); }
		public TerminalNode LONG_TIME() { return getToken(CobolParser.LONG_TIME, 0); }
		public TerminalNode LOWER() { return getToken(CobolParser.LOWER, 0); }
		public TerminalNode NATIONAL() { return getToken(CobolParser.NATIONAL, 0); }
		public TerminalNode NUMERIC_DATE() { return getToken(CobolParser.NUMERIC_DATE, 0); }
		public TerminalNode NUMERIC_TIME() { return getToken(CobolParser.NUMERIC_TIME, 0); }
		public TerminalNode OWN() { return getToken(CobolParser.OWN, 0); }
		public TerminalNode REAL() { return getToken(CobolParser.REAL, 0); }
		public TerminalNode RECEIVED() { return getToken(CobolParser.RECEIVED, 0); }
		public TerminalNode REF() { return getToken(CobolParser.REF, 0); }
		public TerminalNode SHORT_DATE() { return getToken(CobolParser.SHORT_DATE, 0); }
		public TerminalNode SQL() { return getToken(CobolParser.SQL, 0); }
		public TerminalNode STRONG() { return getToken(CobolParser.STRONG, 0); }
		public TerminalNode TASK() { return getToken(CobolParser.TASK, 0); }
		public TerminalNode THREAD_LOCAL() { return getToken(CobolParser.THREAD_LOCAL, 0); }
		public TerminalNode TRUNCATED() { return getToken(CobolParser.TRUNCATED, 0); }
		public TerminalNode TYPEDEF() { return getToken(CobolParser.TYPEDEF, 0); }
		public CobolWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobolWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterCobolWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitCobolWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitCobolWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CobolWordContext cobolWord() throws RecognitionException {
		CobolWordContext _localctx = new CobolWordContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cobolWord);
		try {
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				match(IDENTIFIER);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(BINARY);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				match(BIT);
				}
				break;
			case BOUNDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				match(BOUNDS);
				}
				break;
			case CLOB:
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				match(CLOB);
				}
				break;
			case CONTROL_POINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(798);
				match(CONTROL_POINT);
				}
				break;
			case CONVENTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(799);
				match(CONVENTION);
				}
				break;
			case DBCLOB:
				enterOuterAlt(_localctx, 8);
				{
				setState(800);
				match(DBCLOB);
				setState(801);
				match(DOUBLE);
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(802);
				match(EVENT);
				}
				break;
			case EXTENDED:
				enterOuterAlt(_localctx, 10);
				{
				setState(803);
				match(EXTENDED);
				}
				break;
			case FUNCTION_POINTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(804);
				match(FUNCTION_POINTER);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 12);
				{
				setState(805);
				match(INTEGER);
				}
				break;
			case LANGUAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(806);
				match(LANGUAGE);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(807);
				match(LOCAL);
				}
				break;
			case LONG_DATE:
				enterOuterAlt(_localctx, 15);
				{
				setState(808);
				match(LONG_DATE);
				}
				break;
			case LONG_TIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(809);
				match(LONG_TIME);
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 17);
				{
				setState(810);
				match(LOWER);
				}
				break;
			case NATIONAL:
				enterOuterAlt(_localctx, 18);
				{
				setState(811);
				match(NATIONAL);
				}
				break;
			case NUMERIC_DATE:
				enterOuterAlt(_localctx, 19);
				{
				setState(812);
				match(NUMERIC_DATE);
				}
				break;
			case NUMERIC_TIME:
				enterOuterAlt(_localctx, 20);
				{
				setState(813);
				match(NUMERIC_TIME);
				}
				break;
			case OWN:
				enterOuterAlt(_localctx, 21);
				{
				setState(814);
				match(OWN);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 22);
				{
				setState(815);
				match(REAL);
				}
				break;
			case RECEIVED:
				enterOuterAlt(_localctx, 23);
				{
				setState(816);
				match(RECEIVED);
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 24);
				{
				setState(817);
				match(REF);
				}
				break;
			case SHORT_DATE:
				enterOuterAlt(_localctx, 25);
				{
				setState(818);
				match(SHORT_DATE);
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 26);
				{
				setState(819);
				match(SQL);
				}
				break;
			case STRONG:
				enterOuterAlt(_localctx, 27);
				{
				setState(820);
				match(STRONG);
				}
				break;
			case TASK:
				enterOuterAlt(_localctx, 28);
				{
				setState(821);
				match(TASK);
				}
				break;
			case THREAD_LOCAL:
				enterOuterAlt(_localctx, 29);
				{
				setState(822);
				match(THREAD_LOCAL);
				}
				break;
			case TRUNCATED:
				enterOuterAlt(_localctx, 30);
				{
				setState(823);
				match(TRUNCATED);
				}
				break;
			case TYPEDEF:
				enterOuterAlt(_localctx, 31);
				{
				setState(824);
				match(TYPEDEF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(CobolParser.NONNUMERICLITERAL, 0); }
		public FigurativeConstantContext figurativeConstant() {
			return getRuleContext(FigurativeConstantContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ContinuedLiteralContext continuedLiteral() {
			return getRuleContext(ContinuedLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literal);
		try {
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(NONNUMERICLITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				figurativeConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(829);
				numericLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				booleanLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				continuedLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuedLiteralContext extends ParserRuleContext {
		public TerminalNode NONNUMERICLITERAL() { return getToken(CobolParser.NONNUMERICLITERAL, 0); }
		public List<TerminalNode> CLASSIC_CONTINUATION() { return getTokens(CobolParser.CLASSIC_CONTINUATION); }
		public TerminalNode CLASSIC_CONTINUATION(int i) {
			return getToken(CobolParser.CLASSIC_CONTINUATION, i);
		}
		public List<TerminalNode> CONTINUED_STRINGLITERAL() { return getTokens(CobolParser.CONTINUED_STRINGLITERAL); }
		public TerminalNode CONTINUED_STRINGLITERAL(int i) {
			return getToken(CobolParser.CONTINUED_STRINGLITERAL, i);
		}
		public List<TerminalNode> CONTINUED_DBCSLITERAL() { return getTokens(CobolParser.CONTINUED_DBCSLITERAL); }
		public TerminalNode CONTINUED_DBCSLITERAL(int i) {
			return getToken(CobolParser.CONTINUED_DBCSLITERAL, i);
		}
		public List<TerminalNode> CONTINUED_HEXNUMBER() { return getTokens(CobolParser.CONTINUED_HEXNUMBER); }
		public TerminalNode CONTINUED_HEXNUMBER(int i) {
			return getToken(CobolParser.CONTINUED_HEXNUMBER, i);
		}
		public List<TerminalNode> CONTINUED_NULLTERMINATED() { return getTokens(CobolParser.CONTINUED_NULLTERMINATED); }
		public TerminalNode CONTINUED_NULLTERMINATED(int i) {
			return getToken(CobolParser.CONTINUED_NULLTERMINATED, i);
		}
		public ContinuedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuedLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterContinuedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitContinuedLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitContinuedLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuedLiteralContext continuedLiteral() throws RecognitionException {
		ContinuedLiteralContext _localctx = new ContinuedLiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_continuedLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(834);
				_la = _input.LA(1);
				if ( !(((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (CONTINUED_HEXNUMBER - 216)) | (1L << (CONTINUED_NULLTERMINATED - 216)) | (1L << (CONTINUED_STRINGLITERAL - 216)) | (1L << (CONTINUED_DBCSLITERAL - 216)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				match(CLASSIC_CONTINUATION);
				}
				}
				setState(838); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (CONTINUED_HEXNUMBER - 216)) | (1L << (CONTINUED_NULLTERMINATED - 216)) | (1L << (CONTINUED_STRINGLITERAL - 216)) | (1L << (CONTINUED_DBCSLITERAL - 216)))) != 0) );
			setState(840);
			match(NONNUMERICLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CobolParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CobolParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUMERICLITERAL() { return getToken(CobolParser.NUMERICLITERAL, 0); }
		public TerminalNode ZERO() { return getToken(CobolParser.ZERO, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_numericLiteral);
		try {
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(NUMERICLITERAL);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(ZERO);
				}
				break;
			case LEVEL_NUMBER_66:
			case LEVEL_NUMBER_77:
			case LEVEL_NUMBER_88:
			case INTEGERLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(846);
				integerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(CobolParser.INTEGERLITERAL, 0); }
		public TerminalNode LEVEL_NUMBER_66() { return getToken(CobolParser.LEVEL_NUMBER_66, 0); }
		public TerminalNode LEVEL_NUMBER_77() { return getToken(CobolParser.LEVEL_NUMBER_77, 0); }
		public TerminalNode LEVEL_NUMBER_88() { return getToken(CobolParser.LEVEL_NUMBER_88, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_la = _input.LA(1);
			if ( !(((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (LEVEL_NUMBER_66 - 220)) | (1L << (LEVEL_NUMBER_77 - 220)) | (1L << (LEVEL_NUMBER_88 - 220)) | (1L << (INTEGERLITERAL - 220)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FigurativeConstantContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CobolParser.ALL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode HIGH_VALUE() { return getToken(CobolParser.HIGH_VALUE, 0); }
		public TerminalNode HIGH_VALUES() { return getToken(CobolParser.HIGH_VALUES, 0); }
		public TerminalNode LOW_VALUE() { return getToken(CobolParser.LOW_VALUE, 0); }
		public TerminalNode LOW_VALUES() { return getToken(CobolParser.LOW_VALUES, 0); }
		public TerminalNode NULL() { return getToken(CobolParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(CobolParser.NULLS, 0); }
		public TerminalNode QUOTE() { return getToken(CobolParser.QUOTE, 0); }
		public TerminalNode QUOTES() { return getToken(CobolParser.QUOTES, 0); }
		public TerminalNode SPACE() { return getToken(CobolParser.SPACE, 0); }
		public TerminalNode SPACES() { return getToken(CobolParser.SPACES, 0); }
		public TerminalNode ZERO() { return getToken(CobolParser.ZERO, 0); }
		public TerminalNode ZEROS() { return getToken(CobolParser.ZEROS, 0); }
		public TerminalNode ZEROES() { return getToken(CobolParser.ZEROES, 0); }
		public FigurativeConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figurativeConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterFigurativeConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitFigurativeConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitFigurativeConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigurativeConstantContext figurativeConstant() throws RecognitionException {
		FigurativeConstantContext _localctx = new FigurativeConstantContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_figurativeConstant);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(ALL);
				setState(852);
				literal();
				}
				break;
			case HIGH_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(HIGH_VALUE);
				}
				break;
			case HIGH_VALUES:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(HIGH_VALUES);
				}
				break;
			case LOW_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				match(LOW_VALUE);
				}
				break;
			case LOW_VALUES:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(LOW_VALUES);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
				match(NULL);
				}
				break;
			case NULLS:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				match(NULLS);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(859);
				match(QUOTE);
				}
				break;
			case QUOTES:
				enterOuterAlt(_localctx, 9);
				{
				setState(860);
				match(QUOTES);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 10);
				{
				setState(861);
				match(SPACE);
				}
				break;
			case SPACES:
				enterOuterAlt(_localctx, 11);
				{
				setState(862);
				match(SPACES);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 12);
				{
				setState(863);
				match(ZERO);
				}
				break;
			case ZEROS:
				enterOuterAlt(_localctx, 13);
				{
				setState(864);
				match(ZEROS);
				}
				break;
			case ZEROES:
				enterOuterAlt(_localctx, 14);
				{
				setState(865);
				match(ZEROES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentEntryContext extends ParserRuleContext {
		public List<TerminalNode> COMMENTENTRYLINE() { return getTokens(CobolParser.COMMENTENTRYLINE); }
		public TerminalNode COMMENTENTRYLINE(int i) {
			return getToken(CobolParser.COMMENTENTRYLINE, i);
		}
		public CommentEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).enterCommentEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolParserListener ) ((CobolParserListener)listener).exitCommentEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolParserVisitor ) return ((CobolParserVisitor<? extends T>)visitor).visitCommentEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentEntryContext commentEntry() throws RecognitionException {
		CommentEntryContext _localctx = new CommentEntryContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_commentEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(868);
				match(COMMENTENTRYLINE);
				}
				}
				setState(871); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMENTENTRYLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f7\u036c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\3\6\3\u00a5"+
		"\n\3\r\3\16\3\u00a6\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6\u00b0\n\6\3\7\3\7"+
		"\3\7\5\7\u00b5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00d5\n\7\f\7\16\7\u00d8\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00ed\n\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\5\20\u00fa\n\20\3\20\5\20\u00fd"+
		"\n\20\3\20\3\20\5\20\u0101\n\20\3\20\5\20\u0104\n\20\3\21\5\21\u0107\n"+
		"\21\3\21\3\21\3\21\5\21\u010c\n\21\3\22\5\22\u010f\n\22\3\22\3\22\3\23"+
		"\3\23\5\23\u0115\n\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u011d\n\25\3"+
		"\26\3\26\3\26\5\26\u0122\n\26\3\26\5\26\u0125\n\26\3\26\5\26\u0128\n\26"+
		"\3\26\5\26\u012b\n\26\3\26\3\26\7\26\u012f\n\26\f\26\16\26\u0132\13\26"+
		"\3\27\3\27\3\27\3\30\3\30\5\30\u0139\n\30\3\30\3\30\3\31\3\31\5\31\u013f"+
		"\n\31\3\31\5\31\u0142\n\31\3\31\6\31\u0145\n\31\r\31\16\31\u0146\3\32"+
		"\3\32\5\32\u014b\n\32\3\32\5\32\u014e\n\32\3\32\3\32\5\32\u0152\n\32\6"+
		"\32\u0154\n\32\r\32\16\32\u0155\3\33\3\33\5\33\u015a\n\33\3\33\3\33\3"+
		"\33\5\33\u015f\n\33\3\33\5\33\u0162\n\33\3\33\3\33\5\33\u0166\n\33\3\34"+
		"\6\34\u0169\n\34\r\34\16\34\u016a\3\34\5\34\u016e\n\34\6\34\u0170\n\34"+
		"\r\34\16\34\u0171\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u017e\n\35\3\36\3\36\3\37\3\37\3\37\5\37\u0185\n\37\3\37\3\37\5\37"+
		"\u0189\n\37\3\37\3\37\5\37\u018d\n\37\3\37\3\37\3\37\5\37\u0192\n\37\3"+
		"\37\3\37\5\37\u0196\n\37\3 \3 \5 \u019a\n \3 \5 \u019d\n \3 \3 \5 \u01a1"+
		"\n \3 \3 \3!\3!\5!\u01a7\n!\3!\3!\5!\u01ab\n!\3!\5!\u01ae\n!\3!\5!\u01b1"+
		"\n!\3\"\5\"\u01b4\n\"\3\"\5\"\u01b7\n\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3%\5%\u01c5\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01cf\n\'\3(\3(\5"+
		"(\u01d3\n(\5(\u01d5\n(\3(\3(\3(\5(\u01da\n(\5(\u01dc\n(\3)\3)\5)\u01e0"+
		"\n)\3*\5*\u01e3\n*\3*\3*\3+\3+\5+\u01e9\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u01fb\n+\3+\3+\3+\5+\u0200\n+\3,\5,\u0203\n,"+
		"\3,\3,\5,\u0207\n,\3-\3-\5-\u020b\n-\5-\u020d\n-\3-\3-\5-\u0211\n-\3."+
		"\3.\5.\u0215\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0234\n.\3.\3.\5.\u0238\n.\3.\3."+
		"\5.\u023c\n.\3.\3.\3.\5.\u0241\n.\3.\3.\3.\5.\u0246\n.\3.\3.\3.\3.\3."+
		"\5.\u024d\n.\3.\5.\u0250\n.\3.\3.\3.\3.\3.\3.\5.\u0258\n.\3.\3.\5.\u025c"+
		"\n.\3.\3.\3.\5.\u0261\n.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u026b\n.\3.\5.\u026e"+
		"\n.\3.\3.\3.\5.\u0273\n.\5.\u0275\n.\3/\3/\5/\u0279\n/\3/\3/\3/\3/\5/"+
		"\u027f\n/\5/\u0281\n/\3\60\3\60\3\60\5\60\u0286\n\60\3\60\3\60\5\60\u028a"+
		"\n\60\3\61\3\61\5\61\u028e\n\61\3\61\3\61\5\61\u0292\n\61\3\61\7\61\u0295"+
		"\n\61\f\61\16\61\u0298\13\61\3\61\5\61\u029b\n\61\3\61\5\61\u029e\n\61"+
		"\3\61\5\61\u02a1\n\61\3\61\5\61\u02a4\n\61\3\61\5\61\u02a7\n\61\3\61\3"+
		"\61\5\61\u02ab\n\61\3\61\5\61\u02ae\n\61\3\62\3\62\5\62\u02b2\n\62\3\63"+
		"\3\63\3\63\5\63\u02b7\n\63\3\64\3\64\3\64\5\64\u02bc\n\64\3\65\3\65\3"+
		"\66\5\66\u02c1\n\66\3\66\3\66\3\66\3\67\3\67\5\67\u02c8\n\67\38\38\38"+
		"\38\58\u02ce\n8\38\78\u02d1\n8\f8\168\u02d4\138\38\38\39\39\39\39\59\u02dc"+
		"\n9\39\39\59\u02e0\n9\59\u02e2\n9\3:\3:\3:\3:\5:\u02e8\n:\3:\3:\5:\u02ec"+
		"\n:\5:\u02ee\n:\3;\3;\3<\3<\5<\u02f4\n<\3<\6<\u02f7\n<\r<\16<\u02f8\5"+
		"<\u02fb\n<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\5C\u030c\nC\3"+
		"D\3D\3E\3E\3F\3F\3G\3G\5G\u0316\nG\3H\3H\5H\u031a\nH\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\5I\u033c\nI\3J\3J\3J\3J\3J\5J\u0343\nJ\3K\3K\6K\u0347\nK\r"+
		"K\16K\u0348\3K\3K\3L\3L\3M\3M\3M\5M\u0352\nM\3N\3N\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0365\nO\3P\6P\u0368\nP\rP\16P\u0369\3P\2"+
		"\2Q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\2\37\4\2\26\26"+
		"99\3\2VW\4\2\u00df\u00df\u00e1\u00e1\4\2\u00cb\u00cc\u00ea\u00ea\3\2\u00cb"+
		"\u00cc\3\2\u00be\u00c0\5\2%%ii\u0083\u0083\4\2\20\20\36\36\5\2\31\31r"+
		"r\u00b5\u00b5\4\2]]\u00a3\u00a3\3\2_`\4\2\21\21;;\3\2\u0085\u0086\4\2"+
		"SS\u009b\u009b\4\2\63\63\u0093\u0094\3\2\u00a9\u00aa\4\2dd\u00ad\u00ad"+
		"\3\2\u00a5\u00a6\4\2ee\u0096\u0096\4\2\u00e1\u00e1\u00e3\u00e3\4\2AA\u00af"+
		"\u00af\4\2\u009e\u009e\u00b2\u00b2\4\2\65\65cc\3\2\u00b7\u00b8\4\2\16"+
		"\16^^\4\2ZZ\177\177\3\2\u00da\u00dd\4\2DD\u00ae\u00ae\3\2\u00de\u00e1"+
		"\2\u042b\2\u00a0\3\2\2\2\4\u00a4\3\2\2\2\6\u00a8\3\2\2\2\b\u00aa\3\2\2"+
		"\2\n\u00af\3\2\2\2\f\u00b1\3\2\2\2\16\u00db\3\2\2\2\20\u00e0\3\2\2\2\22"+
		"\u00e5\3\2\2\2\24\u00e7\3\2\2\2\26\u00ea\3\2\2\2\30\u00f0\3\2\2\2\32\u00f2"+
		"\3\2\2\2\34\u00f4\3\2\2\2\36\u00f7\3\2\2\2 \u0106\3\2\2\2\"\u010e\3\2"+
		"\2\2$\u0112\3\2\2\2&\u0118\3\2\2\2(\u011a\3\2\2\2*\u011e\3\2\2\2,\u0133"+
		"\3\2\2\2.\u0136\3\2\2\2\60\u013c\3\2\2\2\62\u0148\3\2\2\2\64\u0157\3\2"+
		"\2\2\66\u016f\3\2\2\28\u017d\3\2\2\2:\u017f\3\2\2\2<\u0181\3\2\2\2>\u0197"+
		"\3\2\2\2@\u01a4\3\2\2\2B\u01b3\3\2\2\2D\u01ba\3\2\2\2F\u01bd\3\2\2\2H"+
		"\u01c0\3\2\2\2J\u01c6\3\2\2\2L\u01ca\3\2\2\2N\u01d4\3\2\2\2P\u01dd\3\2"+
		"\2\2R\u01e2\3\2\2\2T\u01e6\3\2\2\2V\u0202\3\2\2\2X\u020c\3\2\2\2Z\u0274"+
		"\3\2\2\2\\\u0276\3\2\2\2^\u0282\3\2\2\2`\u028b\3\2\2\2b\u02af\3\2\2\2"+
		"d\u02b6\3\2\2\2f\u02bb\3\2\2\2h\u02bd\3\2\2\2j\u02c0\3\2\2\2l\u02c7\3"+
		"\2\2\2n\u02c9\3\2\2\2p\u02e1\3\2\2\2r\u02ed\3\2\2\2t\u02ef\3\2\2\2v\u02f3"+
		"\3\2\2\2x\u02fc\3\2\2\2z\u02ff\3\2\2\2|\u0301\3\2\2\2~\u0303\3\2\2\2\u0080"+
		"\u0305\3\2\2\2\u0082\u0307\3\2\2\2\u0084\u030b\3\2\2\2\u0086\u030d\3\2"+
		"\2\2\u0088\u030f\3\2\2\2\u008a\u0311\3\2\2\2\u008c\u0315\3\2\2\2\u008e"+
		"\u0319\3\2\2\2\u0090\u033b\3\2\2\2\u0092\u0342\3\2\2\2\u0094\u0346\3\2"+
		"\2\2\u0096\u034c\3\2\2\2\u0098\u0351\3\2\2\2\u009a\u0353\3\2\2\2\u009c"+
		"\u0364\3\2\2\2\u009e\u0367\3\2\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\2"+
		"\2\3\u00a2\3\3\2\2\2\u00a3\u00a5\5\n\6\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\5\3\2\2\2\u00a8"+
		"\u00a9\t\2\2\2\u00a9\7\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\t\3\2\2\2\u00ac"+
		"\u00b0\5\f\7\2\u00ad\u00b0\5\16\b\2\u00ae\u00b0\5\20\t\2\u00af\u00ac\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\13\3\2\2\2\u00b1"+
		"\u00b4\t\4\2\2\u00b2\u00b5\7E\2\2\u00b3\u00b5\5\u0082B\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00d6\3\2\2\2\u00b6"+
		"\u00d5\5F$\2\u00b7\u00d5\5&\24\2\u00b8\u00d5\5 \21\2\u00b9\u00d5\5\"\22"+
		"\2\u00ba\u00d5\5$\23\2\u00bb\u00d5\5V,\2\u00bc\u00d5\5R*\2\u00bd\u00d5"+
		"\5\64\33\2\u00be\u00d5\5\32\16\2\u00bf\u00d5\5T+\2\u00c0\u00d5\5^\60\2"+
		"\u00c1\u00d5\5X-\2\u00c2\u00d5\5`\61\2\u00c3\u00d5\5B\"\2\u00c4\u00d5"+
		"\5*\26\2\u00c5\u00d5\5N(\2\u00c6\u00d5\5P)\2\u00c7\u00d5\5(\25\2\u00c8"+
		"\u00d5\5\26\f\2\u00c9\u00d5\5j\66\2\u00ca\u00d5\5\22\n\2\u00cb\u00d5\5"+
		"D#\2\u00cc\u00d5\5\36\20\2\u00cd\u00d5\5\34\17\2\u00ce\u00d5\5@!\2\u00cf"+
		"\u00d5\5J&\2\u00d0\u00d5\5L\'\2\u00d1\u00d5\5\30\r\2\u00d2\u00d5\5\24"+
		"\13\2\u00d3\u00d5\5h\65\2\u00d4\u00b6\3\2\2\2\u00d4\u00b7\3\2\2\2\u00d4"+
		"\u00b8\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00ba\3\2\2\2\u00d4\u00bb\3\2"+
		"\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00bd\3\2\2\2\u00d4\u00be\3\2\2\2\u00d4"+
		"\u00bf\3\2\2\2\u00d4\u00c0\3\2\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c2\3\2"+
		"\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4"+
		"\u00c6\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9\3\2"+
		"\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\5\2\2\u00da\r\3\2\2\2\u00db\u00dc"+
		"\7\u00de\2\2\u00dc\u00dd\5\u0082B\2\u00dd\u00de\5H%\2\u00de\u00df\t\6"+
		"\2\2\u00df\17\3\2\2\2\u00e0\u00e1\7\u00e0\2\2\u00e1\u00e2\5~@\2\u00e2"+
		"\u00e3\5`\61\2\u00e3\u00e4\t\6\2\2\u00e4\21\3\2\2\2\u00e5\u00e6\7\13\2"+
		"\2\u00e6\23\3\2\2\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\7f\2\2\u00e9\25\3"+
		"\2\2\2\u00ea\u00ec\7\32\2\2\u00eb\u00ed\7\u00bb\2\2\u00ec\u00eb\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\t\7\2\2\u00ef\27"+
		"\3\2\2\2\u00f0\u00f1\7\22\2\2\u00f1\31\3\2\2\2\u00f2\u00f3\t\b\2\2\u00f3"+
		"\33\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f6\7\u0091\2\2\u00f6\35\3\2"+
		"\2\2\u00f7\u00f9\7?\2\2\u00f8\u00fa\7f\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5\u0082B\2\u00fc\u00fb\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd\u0103\3\2\2\2\u00fe\u0100\7g\2\2\u00ff\u0101"+
		"\7^\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\7\u00e1\2\2\u0103\u00fe\3\2\2\2\u0103\u0104\3\2\2\2\u0104\37\3"+
		"\2\2\2\u0105\u0107\7^\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010b\7B\2\2\u0109\u010a\t\t\2\2\u010a\u010c\5\u0092"+
		"J\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c!\3\2\2\2\u010d\u010f"+
		"\7^\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7T\2\2\u0111#\3\2\2\2\u0112\u0114\7U\2\2\u0113\u0115\7^\2\2\u0114"+
		"\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\t\n"+
		"\2\2\u0117%\3\2\2\2\u0118\u0119\t\13\2\2\u0119\'\3\2\2\2\u011a\u011c\t"+
		"\f\2\2\u011b\u011d\7\u0096\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d)\3\2\2\2\u011e\u0121\7~\2\2\u011f\u0122\5l\67\2\u0120\u0122\5\u009a"+
		"N\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0125\5,\27\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0128\7\u00ab\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u012b\5.\30\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u0130\3\2\2\2\u012c\u012f\5\60\31\2\u012d\u012f\5\62\32\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131+\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134"+
		"\7\u00ac\2\2\u0134\u0135\5\u009aN\2\u0135-\3\2\2\2\u0136\u0138\7:\2\2"+
		"\u0137\u0139\7\u0080\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\5t;\2\u013b/\3\2\2\2\u013c\u013e\t\r\2\2\u013d"+
		"\u013f\7b\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u0142\7^\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\5t;\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2"+
		"\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\61\3\2\2\2\u0148\u014a"+
		"\7\\\2\2\u0149\u014b\7\36\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014d\3\2\2\2\u014c\u014e\7i\2\2\u014d\u014c\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0153\3\2\2\2\u014f\u0151\5\u0086D\2\u0150\u0152\7\u00c5"+
		"\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u014f\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\63\3\2\2\2\u0157\u0159\t\16\2\2\u0158\u015a\7^\2\2\u0159\u0158"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0161\5\66\34\2"+
		"\u015c\u015e\7\37\2\2\u015d\u015f\7^\2\2\u015e\u015d\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7\u00e1\2\2\u0161\u015c\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0166\5<\37\2\u0164\u0166"+
		"\5> \2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\65\3\2\2\2\u0167\u0169\58\35\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2"+
		"\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e"+
		"\5:\36\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0168\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\67\3\2\2\2\u0173\u017e\7\u00c9\2\2\u0174\u017e\7\u00ec\2\2"+
		"\u0175\u017e\7\u00d8\2\2\u0176\u017e\7\u00c5\2\2\u0177\u017e\7\u00cc\2"+
		"\2\u0178\u017e\7\u00c2\2\2\u0179\u017e\7\u00c3\2\2\u017a\u017e\7\u00d5"+
		"\2\2\u017b\u017e\7\u00d1\2\2\u017c\u017e\5\u009aN\2\u017d\u0173\3\2\2"+
		"\2\u017d\u0174\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017d\u0177"+
		"\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e9\3\2\2\2\u017f\u0180\7\u00ed"+
		"\2\2\u0180;\3\2\2\2\u0181\u0182\7\u00eb\2\2\u0182\u0195\7\u00f5\2\2\u0183"+
		"\u0185\7^\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0196\5\u0092J\2\u0187\u0189\7Q\2\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\7u\2\2\u018b\u018d\7^\2"+
		"\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\5\u0092J\2\u018f\u0191\7\u0089\2\2\u0190\u0192\7^\2\2\u0191\u0190\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\5\u0092J\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0184\3\2\2\2\u0195\u0188\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196=\3\2\2\2\u0197\u019c\7j\2\2\u0198\u019a\7^\2\2\u0199\u0198"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\5\u008aF"+
		"\2\u019c\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0"+
		"\7\u009f\2\2\u019f\u01a1\7^\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7\u00e1\2\2\u01a3?\3\2\2\2\u01a4\u01aa"+
		"\7\u008c\2\2\u01a5\u01a7\7\u00bc\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3"+
		"\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7v\2\2\u01a9\u01ab\t\17\2\2\u01aa"+
		"\u01a6\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b0\3\2\2\2\u01ac\u01ae\7^"+
		"\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\7F\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1A\3\2\2\2\u01b2"+
		"\u01b4\7\u0090\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01b7\7\36\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2"+
		"\u01b7\u01b8\3\2\2\2\u01b8\u01b9\t\20\2\2\u01b9C\3\2\2\2\u01ba\u01bb\7"+
		"\u0091\2\2\u01bb\u01bc\7\17\2\2\u01bcE\3\2\2\2\u01bd\u01be\7\u0092\2\2"+
		"\u01be\u01bf\5\u0082B\2\u01bfG\3\2\2\2\u01c0\u01c1\7\u0095\2\2\u01c1\u01c4"+
		"\5t;\2\u01c2\u01c3\t\21\2\2\u01c3\u01c5\5t;\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5I\3\2\2\2\u01c6\u01c7\7\u0098\2\2\u01c7\u01c8\7\20"+
		"\2\2\u01c8\u01c9\5\u0082B\2\u01c9K\3\2\2\2\u01ca\u01cb\7\u0099\2\2\u01cb"+
		"\u01ce\7\u00bb\2\2\u01cc\u01cf\7\u0082\2\2\u01cd\u01cf\5~@\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfM\3\2\2\2\u01d0\u01d2\7\u009d\2\2\u01d1"+
		"\u01d3\7^\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d0\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01db\t\22\2\2\u01d7\u01d9\7\u009a\2\2\u01d8\u01da\7 \2\2\u01d9\u01d8"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d7\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dcO\3\2\2\2\u01dd\u01df\t\23\2\2\u01de\u01e0\t\24\2"+
		"\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0Q\3\2\2\2\u01e1\u01e3"+
		"\7^\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\7\u00a8\2\2\u01e5S\3\2\2\2\u01e6\u01e8\7\u00b0\2\2\u01e7\u01e9"+
		"\7^\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ff\3\2\2\2\u01ea"+
		"\u0200\7\u009c\2\2\u01eb\u0200\7l\2\2\u01ec\u0200\7z\2\2\u01ed\u0200\7"+
		"|\2\2\u01ee\u0200\7m\2\2\u01ef\u0200\7\"\2\2\u01f0\u0200\7\34\2\2\u01f1"+
		"\u0200\78\2\2\u01f2\u0200\7\u0097\2\2\u01f3\u01fb\7!\2\2\u01f4\u01fb\7"+
		"\33\2\2\u01f5\u01fb\7\67\2\2\u01f6\u01f7\7\u00b9\2\2\u01f7\u01f8\7\u00bd"+
		"\2\2\u01f8\u01f9\7\20\2\2\u01f9\u01fb\7!\2\2\u01fa\u01f3\3\2\2\2\u01fa"+
		"\u01f4\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fd\7\u00d0\2\2\u01fd\u01fe\t\25\2\2\u01fe\u0200\7\u00d7"+
		"\2\2\u01ff\u01ea\3\2\2\2\u01ff\u01eb\3\2\2\2\u01ff\u01ec\3\2\2\2\u01ff"+
		"\u01ed\3\2\2\2\u01ff\u01ee\3\2\2\2\u01ff\u01ef\3\2\2\2\u01ff\u01f0\3\2"+
		"\2\2\u01ff\u01f1\3\2\2\2\u01ff\u01f2\3\2\2\2\u01ff\u01fa\3\2\2\2\u0200"+
		"U\3\2\2\2\u0201\u0203\7^\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\7\u00b1\2\2\u0205\u0207\7\u00a4\2\2\u0206\u0205"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207W\3\2\2\2\u0208\u020a\7\u00b3\2\2\u0209"+
		"\u020b\7^\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2"+
		"\2\2\u020c\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0210\5Z.\2\u020f\u0211\7t\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2"+
		"\2\u0211Y\3\2\2\2\u0212\u0214\7\23\2\2\u0213\u0215\t\26\2\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0275\3\2\2\2\u0216\u0217\7\24\2\2"+
		"\u0217\u0275\t\27\2\2\u0218\u0219\7\25\2\2\u0219\u0275\t\27\2\2\u021a"+
		"\u021b\7\27\2\2\u021b\u0275\t\27\2\2\u021c\u021d\7\30\2\2\u021d\u0275"+
		"\t\27\2\2\u021e\u0275\7\31\2\2\u021f\u0275\7&\2\2\u0220\u0275\7\'\2\2"+
		"\u0221\u0275\7(\2\2\u0222\u0275\7)\2\2\u0223\u0275\7*\2\2\u0224\u0275"+
		"\7+\2\2\u0225\u0275\7,\2\2\u0226\u0275\7-\2\2\u0227\u0275\7.\2\2\u0228"+
		"\u0275\7/\2\2\u0229\u0275\7\60\2\2\u022a\u0275\7\61\2\2\u022b\u0275\7"+
		"\64\2\2\u022c\u0275\7\66\2\2\u022d\u0275\7<\2\2\u022e\u0275\7=\2\2\u022f"+
		"\u0275\7>\2\2\u0230\u0275\7@\2\2\u0231\u0233\7H\2\2\u0232\u0234\5\b\5"+
		"\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0275\3\2\2\2\u0235\u0237"+
		"\7I\2\2\u0236\u0238\5\b\5\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0275\3\2\2\2\u0239\u023b\7J\2\2\u023a\u023c\5\b\5\2\u023b\u023a\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u0275\3\2\2\2\u023d\u0240\7L\2\2\u023e"+
		"\u0241\5\6\4\2\u023f\u0241\5\b\5\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0275\3\2\2\2\u0242\u0245\7M\2\2\u0243"+
		"\u0246\5\6\4\2\u0244\u0246\5\b\5\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u0275\3\2\2\2\u0247\u0275\7N\2\2\u0248"+
		"\u0275\7O\2\2\u0249\u0275\7P\2\2\u024a\u024f\7R\2\2\u024b\u024d\7\u00ac"+
		"\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0250\5\u0090I\2\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0275"+
		"\3\2\2\2\u0251\u0275\7[\2\2\u0252\u0275\7a\2\2\u0253\u0275\7k\2\2\u0254"+
		"\u0275\7r\2\2\u0255\u025b\7\u0084\2\2\u0256\u0258\7\u00bc\2\2\u0257\u0256"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\7v\2\2\u025a"+
		"\u025c\7\u009d\2\2\u025b\u0257\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u0275"+
		"\3\2\2\2\u025d\u0260\7\u0087\2\2\u025e\u025f\7\u00ac\2\2\u025f\u0261\5"+
		"\u0082B\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0275\3\2\2\2"+
		"\u0262\u0275\7\u0088\2\2\u0263\u0275\7\u008a\2\2\u0264\u0275\7\u008f\2"+
		"\2\u0265\u0275\7\u00a2\2\2\u0266\u0275\7\u00a7\2\2\u0267\u0275\7\u00b5"+
		"\2\2\u0268\u026d\7\u008b\2\2\u0269\u026b\7\u00ac\2\2\u026a\u0269\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\5\u0090I\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0275\3\2\2\2\u026f\u0275\7q"+
		"\2\2\u0270\u0272\7}\2\2\u0271\u0273\5\\/\2\u0272\u0271\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0212\3\2\2\2\u0274\u0216\3\2\2\2\u0274"+
		"\u0218\3\2\2\2\u0274\u021a\3\2\2\2\u0274\u021c\3\2\2\2\u0274\u021e\3\2"+
		"\2\2\u0274\u021f\3\2\2\2\u0274\u0220\3\2\2\2\u0274\u0221\3\2\2\2\u0274"+
		"\u0222\3\2\2\2\u0274\u0223\3\2\2\2\u0274\u0224\3\2\2\2\u0274\u0225\3\2"+
		"\2\2\u0274\u0226\3\2\2\2\u0274\u0227\3\2\2\2\u0274\u0228\3\2\2\2\u0274"+
		"\u0229\3\2\2\2\u0274\u022a\3\2\2\2\u0274\u022b\3\2\2\2\u0274\u022c\3\2"+
		"\2\2\u0274\u022d\3\2\2\2\u0274\u022e\3\2\2\2\u0274\u022f\3\2\2\2\u0274"+
		"\u0230\3\2\2\2\u0274\u0231\3\2\2\2\u0274\u0235\3\2\2\2\u0274\u0239\3\2"+
		"\2\2\u0274\u023d\3\2\2\2\u0274\u0242\3\2\2\2\u0274\u0247\3\2\2\2\u0274"+
		"\u0248\3\2\2\2\u0274\u0249\3\2\2\2\u0274\u024a\3\2\2\2\u0274\u0251\3\2"+
		"\2\2\u0274\u0252\3\2\2\2\u0274\u0253\3\2\2\2\u0274\u0254\3\2\2\2\u0274"+
		"\u0255\3\2\2\2\u0274\u025d\3\2\2\2\u0274\u0262\3\2\2\2\u0274\u0263\3\2"+
		"\2\2\u0274\u0264\3\2\2\2\u0274\u0265\3\2\2\2\u0274\u0266\3\2\2\2\u0274"+
		"\u0267\3\2\2\2\u0274\u0268\3\2\2\2\u0274\u026f\3\2\2\2\u0274\u0270\3\2"+
		"\2\2\u0275[\3\2\2\2\u0276\u0278\7C\2\2\u0277\u0279\7\177\2\2\u0278\u0277"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0280\3\2\2\2\u027a\u0281\5\u0088E"+
		"\2\u027b\u0281\7\n\2\2\u027c\u027e\5|?\2\u027d\u027f\7\u0081\2\2\u027e"+
		"\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027a\3\2"+
		"\2\2\u0280\u027b\3\2\2\2\u0280\u027c\3\2\2\2\u0281]\3\2\2\2\u0282\u0283"+
		"\7\u00b4\2\2\u0283\u0285\t\30\2\2\u0284\u0286\7\177\2\2\u0285\u0284\3"+
		"\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u028a\5\u0090I\2"+
		"\u0288\u028a\5\u0082B\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028a"+
		"_\3\2\2\2\u028b\u028d\t\31\2\2\u028c\u028e\t\32\2\2\u028d\u028c\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0296\5b\62\2\u0290\u0292"+
		"\7\u00c5\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2"+
		"\2\u0293\u0295\5b\62\2\u0294\u0291\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029d\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029b\7Z\2\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029e\5z>\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02ad"+
		"\3\2\2\2\u029f\u02a1\7\u00bb\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2"+
		"\2\u02a1\u02a3\3\2\2\2\u02a2\u02a4\7\u009b\2\2\u02a3\u02a2\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\7\u00ac\2\2\u02a6\u02a5"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\7D\2\2\u02a9"+
		"\u02ab\7^\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\5\u0092J\2\u02ad\u02a0\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"a\3\2\2\2\u02af\u02b1\5d\63\2\u02b0\u02b2\5f\64\2\u02b1\u02b0\3\2\2\2"+
		"\u02b1\u02b2\3\2\2\2\u02b2c\3\2\2\2\u02b3\u02b7\5\u0092J\2\u02b4\u02b7"+
		"\5\u0090I\2\u02b5\u02b7\5\u0094K\2\u02b6\u02b3\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b7e\3\2\2\2\u02b8\u02b9\t\21\2\2\u02b9\u02bc"+
		"\5\u0092J\2\u02ba\u02bc\5\u0094K\2\u02bb\u02b8\3\2\2\2\u02bb\u02ba\3\2"+
		"\2\2\u02bcg\3\2\2\2\u02bd\u02be\7\u00ba\2\2\u02bei\3\2\2\2\u02bf\u02c1"+
		"\7\u00bc\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u02c3\7n\2\2\u02c3\u02c4\7\35\2\2\u02c4k\3\2\2\2\u02c5\u02c8"+
		"\5n8\2\u02c6\u02c8\5t;\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8"+
		"m\3\2\2\2\u02c9\u02ca\5t;\2\u02ca\u02cb\7\u00d0\2\2\u02cb\u02d2\5p9\2"+
		"\u02cc\u02ce\7\u00c5\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d1\5p9\2\u02d0\u02cd\3\2\2\2\u02d1\u02d4\3\2\2"+
		"\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2"+
		"\3\2\2\2\u02d5\u02d6\7\u00d7\2\2\u02d6o\3\2\2\2\u02d7\u02e2\7\f\2\2\u02d8"+
		"\u02e2\5\u009aN\2\u02d9\u02db\5t;\2\u02da\u02dc\5\u009aN\2\u02db\u02da"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02e2\3\2\2\2\u02dd\u02df\5\u0086D"+
		"\2\u02de\u02e0\5\u009aN\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e2\3\2\2\2\u02e1\u02d7\3\2\2\2\u02e1\u02d8\3\2\2\2\u02e1\u02d9\3\2"+
		"\2\2\u02e1\u02dd\3\2\2\2\u02e2q\3\2\2\2\u02e3\u02ee\5\u0092J\2\u02e4\u02ee"+
		"\5l\67\2\u02e5\u02e7\5t;\2\u02e6\u02e8\5\u009aN\2\u02e7\u02e6\3\2\2\2"+
		"\u02e7\u02e8\3\2\2\2\u02e8\u02ee\3\2\2\2\u02e9\u02eb\5\u0086D\2\u02ea"+
		"\u02ec\5\u009aN\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee"+
		"\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e4\3\2\2\2\u02ed\u02e5\3\2\2\2\u02ed"+
		"\u02e9\3\2\2\2\u02ees\3\2\2\2\u02ef\u02f0\5v<\2\u02f0u\3\2\2\2\u02f1\u02f4"+
		"\5\u0082B\2\u02f2\u02f4\5~@\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2"+
		"\u02f4\u02fa\3\2\2\2\u02f5\u02f7\5x=\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa"+
		"\u02f6\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fbw\3\2\2\2\u02fc\u02fd\t\33\2\2"+
		"\u02fd\u02fe\5\u0082B\2\u02fey\3\2\2\2\u02ff\u0300\5\u0090I\2\u0300{\3"+
		"\2\2\2\u0301\u0302\5\u0090I\2\u0302}\3\2\2\2\u0303\u0304\5\u0090I\2\u0304"+
		"\177\3\2\2\2\u0305\u0306\5\u0090I\2\u0306\u0081\3\2\2\2\u0307\u0308\5"+
		"\u0090I\2\u0308\u0083\3\2\2\2\u0309\u030c\7E\2\2\u030a\u030c\5\u0082B"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u0085\3\2\2\2\u030d\u030e"+
		"\5\u0090I\2\u030e\u0087\3\2\2\2\u030f\u0310\5\u0090I\2\u0310\u0089\3\2"+
		"\2\2\u0311\u0312\5\u0090I\2\u0312\u008b\3\2\2\2\u0313\u0316\5\u0090I\2"+
		"\u0314\u0316\5\u009aN\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316"+
		"\u008d\3\2\2\2\u0317\u031a\7\u00d9\2\2\u0318\u031a\5\u0090I\2\u0319\u0317"+
		"\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u008f\3\2\2\2\u031b\u033c\7\u00e3\2"+
		"\2\u031c\u033c\7\23\2\2\u031d\u033c\7\31\2\2\u031e\u033c\7\35\2\2\u031f"+
		"\u033c\7!\2\2\u0320\u033c\7\64\2\2\u0321\u033c\7\65\2\2\u0322\u0323\7"+
		"\67\2\2\u0323\u033c\7>\2\2\u0324\u033c\7@\2\2\u0325\u033c\7A\2\2\u0326"+
		"\u033c\7R\2\2\u0327\u033c\7]\2\2\u0328\u033c\7c\2\2\u0329\u033c\7i\2\2"+
		"\u032a\u033c\7l\2\2\u032b\u033c\7m\2\2\u032c\u033c\7n\2\2\u032d\u033c"+
		"\7r\2\2\u032e\u033c\7z\2\2\u032f\u033c\7|\2\2\u0330\u033c\7\u0083\2\2"+
		"\u0331\u033c\7\u008f\2\2\u0332\u033c\7\u0090\2\2\u0333\u033c\7\u0093\2"+
		"\2\u0334\u033c\7\u009c\2\2\u0335\u033c\7\u00a2\2\2\u0336\u033c\7\u00a4"+
		"\2\2\u0337\u033c\7\u00a7\2\2\u0338\u033c\7\u00a8\2\2\u0339\u033c\7\u00af"+
		"\2\2\u033a\u033c\7\u00b1\2\2\u033b\u031b\3\2\2\2\u033b\u031c\3\2\2\2\u033b"+
		"\u031d\3\2\2\2\u033b\u031e\3\2\2\2\u033b\u031f\3\2\2\2\u033b\u0320\3\2"+
		"\2\2\u033b\u0321\3\2\2\2\u033b\u0322\3\2\2\2\u033b\u0324\3\2\2\2\u033b"+
		"\u0325\3\2\2\2\u033b\u0326\3\2\2\2\u033b\u0327\3\2\2\2\u033b\u0328\3\2"+
		"\2\2\u033b\u0329\3\2\2\2\u033b\u032a\3\2\2\2\u033b\u032b\3\2\2\2\u033b"+
		"\u032c\3\2\2\2\u033b\u032d\3\2\2\2\u033b\u032e\3\2\2\2\u033b\u032f\3\2"+
		"\2\2\u033b\u0330\3\2\2\2\u033b\u0331\3\2\2\2\u033b\u0332\3\2\2\2\u033b"+
		"\u0333\3\2\2\2\u033b\u0334\3\2\2\2\u033b\u0335\3\2\2\2\u033b\u0336\3\2"+
		"\2\2\u033b\u0337\3\2\2\2\u033b\u0338\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033a\3\2\2\2\u033c\u0091\3\2\2\2\u033d\u0343\7\u00d9\2\2\u033e\u0343"+
		"\5\u009cO\2\u033f\u0343\5\u0098M\2\u0340\u0343\5\u0096L\2\u0341\u0343"+
		"\5\u0094K\2\u0342\u033d\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u033f\3\2\2"+
		"\2\u0342\u0340\3\2\2\2\u0342\u0341\3\2\2\2\u0343\u0093\3\2\2\2\u0344\u0345"+
		"\t\34\2\2\u0345\u0347\7\t\2\2\u0346\u0344\3\2\2\2\u0347\u0348\3\2\2\2"+
		"\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b"+
		"\7\u00d9\2\2\u034b\u0095\3\2\2\2\u034c\u034d\t\35\2\2\u034d\u0097\3\2"+
		"\2\2\u034e\u0352\7\u00e2\2\2\u034f\u0352\7\u00be\2\2\u0350\u0352\5\u009a"+
		"N\2\u0351\u034e\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352"+
		"\u0099\3\2\2\2\u0353\u0354\t\36\2\2\u0354\u009b\3\2\2\2\u0355\u0356\7"+
		"\f\2\2\u0356\u0365\5\u0092J\2\u0357\u0365\7X\2\2\u0358\u0365\7Y\2\2\u0359"+
		"\u0365\7o\2\2\u035a\u0365\7p\2\2\u035b\u0365\7x\2\2\u035c\u0365\7y\2\2"+
		"\u035d\u0365\7\u008d\2\2\u035e\u0365\7\u008e\2\2\u035f\u0365\7\u00a0\2"+
		"\2\u0360\u0365\7\u00a1\2\2\u0361\u0365\7\u00be\2\2\u0362\u0365\7\u00bf"+
		"\2\2\u0363\u0365\7\u00c0\2\2\u0364\u0355\3\2\2\2\u0364\u0357\3\2\2\2\u0364"+
		"\u0358\3\2\2\2\u0364\u0359\3\2\2\2\u0364\u035a\3\2\2\2\u0364\u035b\3\2"+
		"\2\2\u0364\u035c\3\2\2\2\u0364\u035d\3\2\2\2\u0364\u035e\3\2\2\2\u0364"+
		"\u035f\3\2\2\2\u0364\u0360\3\2\2\2\u0364\u0361\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0364\u0363\3\2\2\2\u0365\u009d\3\2\2\2\u0366\u0368\7\u00e5\2\2\u0367"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u009f\3\2\2\2|\u00a6\u00af\u00b4\u00d4\u00d6\u00ec\u00f9\u00fc"+
		"\u0100\u0103\u0106\u010b\u010e\u0114\u011c\u0121\u0124\u0127\u012a\u012e"+
		"\u0130\u0138\u013e\u0141\u0146\u014a\u014d\u0151\u0155\u0159\u015e\u0161"+
		"\u0165\u016a\u016d\u0171\u017d\u0184\u0188\u018c\u0191\u0195\u0199\u019c"+
		"\u01a0\u01a6\u01aa\u01ad\u01b0\u01b3\u01b6\u01c4\u01ce\u01d2\u01d4\u01d9"+
		"\u01db\u01df\u01e2\u01e8\u01fa\u01ff\u0202\u0206\u020a\u020c\u0210\u0214"+
		"\u0233\u0237\u023b\u0240\u0245\u024c\u024f\u0257\u025b\u0260\u026a\u026d"+
		"\u0272\u0274\u0278\u027e\u0280\u0285\u0289\u028d\u0291\u0296\u029a\u029d"+
		"\u02a0\u02a3\u02a6\u02aa\u02ad\u02b1\u02b6\u02bb\u02c0\u02c7\u02cd\u02d2"+
		"\u02db\u02df\u02e1\u02e7\u02eb\u02ed\u02f3\u02f8\u02fa\u030b\u0315\u0319"+
		"\u033b\u0342\u0348\u0351\u0364\u0369";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}