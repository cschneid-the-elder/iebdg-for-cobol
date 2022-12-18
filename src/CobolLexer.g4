/*
 Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 All rights reserved.

 Portions copyright (C) 2022, Craig Schneiderwent.  All rights reserved.

 This software may be modified and distributed under the terms
 of the MIT license. See the LICENSE file for details.
*/

/*
 COBOL Lexer for ANTLR4

 This is a partial COBOL Lexer, which started life as part of the COBOL parser at
 https://github.com/uwol/proleap-cobol-parser.
*/

lexer grammar CobolLexer;

@lexer::members {
	/*
	This Boolean is set to true to make the ANTLR testrig work.  The
	file being parsed is rewritten without columns 73 - 80 if it is
	being processed via an application.  Under those circumstances,
	the lexing code must set this variable to false.
	*/
	public static Boolean testRig = true;
}

channels { COMPILER_DIRECTIVES }

// lexer rules --------------------------------------------------------------------------------

CLASSIC_COMMENT_INDICATOR : (ASTERISKCHAR | SLASHCHAR) {getCharPositionInLine() == 7}? ;
CLASSIC_COMMENTLINE : (BOL? TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA CLASSIC_COMMENT_INDICATOR TEXTA*)+ {getCharPositionInLine() < 73}? -> skip;

CLASSIC_LINE_NUMBER : TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA {getCharPositionInLine() == 6}? -> skip;
CLASSIC_DEBUG_INDICATOR : D {getCharPositionInLine() == 7}? ;
CLASSIC_DEBUG_LINE : BOL? TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA CLASSIC_DEBUG_INDICATOR TEXTA* {getCharPositionInLine() < 73}? -> skip;


CLASSIC_EOL_COMMENT : TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA {testRig && getCharPositionInLine()==80}? -> skip;

CLASSIC_CONTINUATION : BOL TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA MINUSCHAR;


// keywords
ACTIVE_CLASS : A C T I V E MINUSCHAR C L A S S;
ALIGNED : A L I G N E D;
ALL : A L L;
ANY : A N Y;
ARE : A R E;
AREA : A R E A;
AS : A S;
ASCENDING : A S C E N D I N G;
BASED : B A S E D;
BINARY : B I N A R Y;
BINARY_CHAR : B I N A R Y MINUSCHAR C H A R;
BINARY_DOUBLE : B I N A R Y MINUSCHAR D O U B L E;
BINARY_ENCODING : B I N A R Y MINUSCHAR E N C O D I N G;
BINARY_LONG : B I N A R Y MINUSCHAR L O N G;
BINARY_SHORT : B I N A R Y MINUSCHAR S H O R T;
BIT : B I T;
BLANK : B L A N K;
BLOB : B L O B;
BLOB_LOCATOR : B L O B '-' L O C A T O R;
BOUNDS : B O U N D S;
BY : B Y;
BYTE_LENGTH : B Y T E '-' L E N G T H; //already defined as a intrinsic function
CHARACTER : C H A R A C T E R;
CLOB : C L O B;
CLOB_LOCATOR : C L O B '-' L O C A T O R;
COBOL : C O B O L;
COMMA : C O M M A;
COMMON : C O M M O N;
COMP : C O M P;
COMP_1 : C O M P MINUSCHAR '1';
COMP_2 : C O M P MINUSCHAR '2';
COMP_3 : C O M P MINUSCHAR '3';
COMP_4 : C O M P MINUSCHAR '4';
COMP_5 : C O M P MINUSCHAR '5';
COMPUTATIONAL : C O M P U T A T I O N A L;
COMPUTATIONAL_1 : C O M P U T A T I O N A L MINUSCHAR '1';
COMPUTATIONAL_2 : C O M P U T A T I O N A L MINUSCHAR '2';
COMPUTATIONAL_3 : C O M P U T A T I O N A L MINUSCHAR '3';
COMPUTATIONAL_4 : C O M P U T A T I O N A L MINUSCHAR '4';
COMPUTATIONAL_5 : C O M P U T A T I O N A L MINUSCHAR '5';
CONSTANT : C O N S T A N T;
CONTENT : C O N T E N T;
CONTROL_POINT : C O N T R O L MINUSCHAR P O I N T;
CONVENTION : C O N V E N T I O N;
DATE : D A T E;
DBCLOB : D B C L O B;
DBCLOB_LOCATOR : D B C L O B '-' L O C A T O R;
DECIMAL_ENCODING : D E C I M A L MINUSCHAR E N C O D I N G;
DEPENDING : D E P E N D I N G;
DESCENDING : D E S C E N D I N G;
DISPLAY : D I S P L A Y;
DISPLAY_1 : D I S P L A Y MINUSCHAR '1';
DOUBLE : D O U B L E;
DYNAMIC : D Y N A M I C;
EVENT : E V E N T;
EXTENDED : E X T E N D E D;
EXTERNAL : E X T E R N A L;
FACTORY : F A C T O R Y;
FALSE : F A L S E;
FILLER : F I L L E R;
FINAL : F I N A L;
FLOAT_BINARY : F L O A T MINUSCHAR B I N A R Y;
FLOAT_BINARY_32 : FLOAT_BINARY MINUSCHAR '3' '2';
FLOAT_BINARY_64 : FLOAT_BINARY MINUSCHAR '6' '4';
FLOAT_BINARY_128 : FLOAT_BINARY MINUSCHAR '1' '2' '8';
FLOAT_DECIMAL : F L O A T MINUSCHAR D E C I M A L;
FLOAT_DECIMAL_16 : FLOAT_DECIMAL MINUSCHAR '1' '6';
FLOAT_DECIMAL_34 : FLOAT_DECIMAL MINUSCHAR '3' '4';
FLOAT_EXTENDED : F L O A T MINUSCHAR E X T E N D E D;
FLOAT_LONG : F L O A T MINUSCHAR L O N G;
FLOAT_SHORT : F L O A T MINUSCHAR S H O R T;
FOR : F O R;
FUNCTION_POINTER : F U N C T I O N MINUSCHAR P O I N T E R;
GET : G E T;
GLOBAL : G L O B A L;
GROUP_USAGE: G R O U P '-' U S A G E;
HIGH_ORDER_LEFT : H I G H MINUSCHAR O R D E R MINUSCHAR L E F T;
HIGH_ORDER_RIGHT : H I G H MINUSCHAR O R D E R MINUSCHAR R I G H T;
HIGH_VALUE : H I G H MINUSCHAR V A L U E;
HIGH_VALUES : H I G H MINUSCHAR V A L U E S;
IN : I N;
INDEX : I N D E X;
INDEXED : I N D E X E D;
INTEGER : I N T E G E R;
IS : I S;
JUST : J U S T;
JUSTIFIED : J U S T I F I E D;
KANJI : K A N J I;
KEY : K E Y;
LANGUAGE : L A N G U A G E;
LEADING : L E A D I N G;
LEFT : L E F T;
LENGTH : L E N G T H;
LIMIT : L I M I T;
LINAGE_COUNTER : L I N A G E MINUSCHAR C O U N T E R;
LOCAL : L O C A L;
LOCALE : L O C A L E;
LOCK : L O C K;
LONG_DATE : L O N G MINUSCHAR D A T E;
LONG_TIME : L O N G MINUSCHAR T I M E;
LOWER : L O W E R;
LOW_VALUE : L O W MINUSCHAR V A L U E;
LOW_VALUES : L O W MINUSCHAR V A L U E S;
MESSAGE_TAG : M E S S A G E MINUSCHAR T A G;
NATIONAL : N A T I O N A L;
NATIONAL_EDITED : N A T I O N A L MINUSCHAR E D I T E D;
NATIVE : N A T I V E;
NEGATIVE : N E G A T I V E;
NO : N O;
NONNUMERIC : N O N N U M E R I C;
NULL : N U L L;
NULLS : N U L L S;
NUMERIC_DATE : N U M E R I C MINUSCHAR D A T E;
NUMERIC_EDITED : N U M E R I C MINUSCHAR E D I T E D;
NUMERIC_TIME : N U M E R I C MINUSCHAR T I M E;
OBJECT_REFERENCE : O B J E C T WS R E F E R E N C E;
OCCURS : O C C U R S;
OF : O F;
ON : O N;
ONLY : O N L Y;
OTHER : O T H E R;
OWN : O W N;
PACKED_DECIMAL : P A C K E D MINUSCHAR D E C I M A L;
PIC : P I C ->pushMode(PIC_MODE);
PICTURE : P I C T U R E ->pushMode(PIC_MODE);
POINTER : P O I N T E R;
POINTER_32 : P O I N T E R MINUSCHAR '3' '2';
POSITIVE : P O S I T I V E;
PROCEDURE_POINTER : P R O C E D U R E MINUSCHAR P O I N T E R;
PROGRAM_POINTER : P R O G R A M MINUSCHAR P O I N T E R;
PROPERTY : P R O P E R T Y;
QUOTE : Q U O T E;
QUOTES : Q U O T E S;
REAL : R E A L;
RECEIVED : R E C E I V E D;
RECORD : R E C O R D;
REDEFINES : R E D E F I N E S;
REF : R E F;
REFERENCE : R E F E R E N C E;
RENAMES : R E N A M E S;
RIGHT : R I G H T;
ROWID : R O W I D;
SAME : S A M E;
SELECT : S E L E C T;
SEPARATE : S E P A R A T E;
SET : S E T;
SHORT_DATE : S H O R T MINUSCHAR D A T E;
SIGN : S I G N;
SIGNED : S I G N E D;
SIZE : S I Z E;
SPACE : S P A C E;
SPACES : S P A C E S;
SQL : S Q L;
STRING : S T R I N G;
STRONG : S T R O N G;
SYNC : S Y N C;
SYNCHRONIZED : S Y N C H R O N I Z E D;
TASK : T A S K;
THREAD_LOCAL : T H R E A D MINUSCHAR L O C A L;
THROUGH : T H R O U G H;
THRU : T H R U;
TIMES : T I M E S;
TO : T O;
TRAILING : T R A I L I N G;
TRUE : T R U E;
TRUNCATED : T R U N C A T E D;
TYPE : T Y P E;
TYPEDEF : T Y P E D E F;
UNSIGNED : U N S I G N E D;
USAGE : U S A G E;
USING : U S I N G;
UTF_8 : U T F MINUSCHAR '8';
UTF_16 : U T F MINUSCHAR '1' '6';
VALUE : V A L U E;
VALUES : V A L U E S;
VARBINARY : V A R B I N A R Y;
VOLATILE : V O L A T I L E;
WHEN : W H E N;
WITH : W I T H;
XML : X M L;
ZERO : Z E R O;
ZEROS : Z E R O S;
ZEROES : Z E R O E S;

// symbols
AMPCHAR : '&';
ASTERISKCHAR : '*';
DOUBLEASTERISKCHAR : '**';
COLONCHAR : ':';
COMMACHAR : ',';
COMMENTENTRYTAG : '*>CE';
COMMENTTAG : '*>';
COMPILER_DIRECTIVE : '>>' TEXTA+ -> channel(COMPILER_DIRECTIVES);
DOLLARCHAR : '$';
DOUBLEQUOTE : '"';
// period full stop
DOT_FS 
   : '.' ('\r' | '\n' | '\f' | '\t') | '.' EOF
   ;
DOT 
   : '.'
   ;

EQUALCHAR : '=';
LESSTHANCHAR : '<';
LESSTHANOREQUAL : '<=';
LPARENCHAR : '(';
MINUSCHAR : '-';
MORETHANCHAR : '>';
MORETHANOREQUAL : '>=';
NOTEQUALCHAR : '<>';
PLUSCHAR : '+';
SINGLEQUOTE : '\'';
RPARENCHAR : ')';
SLASHCHAR : '/';

// literals

NONNUMERICLITERAL 
   : STRINGLITERAL 
   | DBCSLITERAL 
   | HEXNUMBER  
   | NULLTERMINATED
   | BINNUMBER 
   | HEXBINNUMBER 
   | HEXNATIONALNUMBER
   | UTF8STRINGLITERAL
   | UTF8HEXSTRINGLITERAL
   ;

fragment HEXNUMBER :
	X '"' [0-9A-Fa-f]+ '"'
	| X '\'' [0-9A-Fa-f]+ '\''
;

CONTINUED_HEXNUMBER :
	(X '"' [0-9A-Fa-f]+
	| X '\'' [0-9A-Fa-f]+)
	 {getCharPositionInLine() < 73}?
;

fragment NULLTERMINATED :
	Z '"' (~["\n\r] | '""' | '\'')* '"'
	| Z '\'' (~['\n\r] | '\'\'' | '"')* '\''
;

CONTINUED_NULLTERMINATED :
	(Z '"' (~["\n\r] | '""' | '\'')*
	| Z '\'' (~['\n\r] | '\'\'' | '"')*)
	 {getCharPositionInLine() < 73}?
;

fragment STRINGLITERAL :
	'"' (~["\n\r] | '""' | '\'')* '"'
	| '\'' (~['\n\r] | '\'\'' | '"')* '\''
;

CONTINUED_STRINGLITERAL :
	('"' (~["\n\r] | '""' | '\'')* 
	| '\'' (~['\n\r] | '\'\'' | '"')*)
	 {getCharPositionInLine() < 73}?
;

fragment DBCSLITERAL :
	[GN] '"' (~["\n\r] | '""' | '\'')* '"'
	| [GN] '\'' (~['\n\r] | '\'\'' | '"')* '\''
;

CONTINUED_DBCSLITERAL :
	([GN] '"' (~["\n\r] | '""' | '\'')*
	| [GN] '\'' (~['\n\r] | '\'\'' | '"')* )
	 {getCharPositionInLine() < 73}?
;

fragment HEXNATIONALNUMBER :
	N X '"' [0-9A-Fa-f]+ '"'
	| N X '\'' [0-9A-Fa-f]+ '\''
;

fragment UTF8STRINGLITERAL :
	U '"' (~["\n\r] | '""' | '\'')* '"'
	| U '\'' (~['\n\r] | '\'\'' | '"')* '\''
;

fragment UTF8HEXSTRINGLITERAL :
	U X '"' [0-9A-Fa-f]+ '"'
	| U X '\'' [0-9A-Fa-f]+ '\''
;

fragment BINNUMBER :
	B '"' [01]+ '"'
	| B '\'' [01]+ '\''
;

fragment HEXBINNUMBER :
	B X '"' [01]+ '"'
	| B X '\'' [01]+ '\''
;

fragment BOL : [\r\n\f]+ ;

LEVEL_NUMBER_66 : '66';
LEVEL_NUMBER_77 : '77';
LEVEL_NUMBER_88 : '88';

INTEGERLITERAL
   : (PLUSCHAR | MINUSCHAR)? [0-9]+
   {
    (getCharPositionInLine() > 7 && !testRig)
    ||
    (testRig && getCharPositionInLine() > 7 && getCharPositionInLine() < 73)
   }? 
   ;

NUMERICLITERAL
   : (PLUSCHAR | MINUSCHAR)? [0-9]* (DOT | COMMACHAR) [0-9]+ (('e' | 'E') (PLUSCHAR | MINUSCHAR)? [0-9]+)?
   {
    (getCharPositionInLine() > 7 && !testRig)
    ||
    (testRig && getCharPositionInLine() > 7 && getCharPositionInLine() < 73)
   }? 
   ;


IDENTIFIER
//   : [a-zA-Z0-9]+ ([-_]+ [a-zA-Z0-9]+)*
   : [a-zA-Z0-9]+ [-_a-zA-Z0-9]*
   {
    (getCharPositionInLine() > 7 && !testRig)
    ||
    (testRig && getCharPositionInLine() > 7 && getCharPositionInLine() < 73)
   }? 
   ;

// whitespace, line breaks, comments, ...
NEWLINE : '\r'? '\n' -> channel(HIDDEN);
COMMENTENTRYLINE : COMMENTENTRYTAG WS ~('\n' | '\r')*;
COMMENTLINE : COMMENTTAG WS ~('\n' | '\r')* -> channel(HIDDEN);
WS : [ \t\f;]+ -> channel(HIDDEN);
SEPARATOR : ', ' -> channel(HIDDEN);
TEXTA : ~('\n' | '\r');

// case insensitive chars
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

mode PIC_MODE;

/*
This mode exists to differentiate between X as an identifier and
X in a PICTURE clause.  Consider...

77  X  PIC X VALUE 'X'.

...where the first X is an identifier, the second its PICTURE and
the third its initial value.
*/
ANY_PIC : ANY ->type(ANY),popMode;
BINARY_PIC : BINARY ->type(BINARY),popMode;
BINARY_CHAR_PIC : BINARY_CHAR ->type(BINARY_CHAR),popMode;
BINARY_DOUBLE_PIC : BINARY_DOUBLE ->type(BINARY_DOUBLE),popMode;
BINARY_LONG_PIC : BINARY_LONG ->type(BINARY_LONG),popMode;
BINARY_SHORT_PIC : BINARY_SHORT ->type(BINARY_SHORT),popMode;
BLANK_PIC : B L A N K ->type(BLANK),popMode;
BYTE_LENGTH_PIC : BYTE_LENGTH ->type(BYTE_LENGTH),popMode;
COMP_PIC : COMP ->type(COMP),popMode;
COMP_1_PIC : COMP_1 ->type(COMP_1),popMode;
COMP_2_PIC : COMP_2 ->type(COMP_2),popMode;
COMP_3_PIC : COMP_3 ->type(COMP_3),popMode;
COMP_4_PIC : COMP_4 ->type(COMP_4),popMode;
COMP_5_PIC : COMP_5 ->type(COMP_5),popMode;
COMPUTATIONAL_PIC : COMPUTATIONAL ->type(COMPUTATIONAL),popMode;
COMPUTATIONAL_1_PIC : COMPUTATIONAL_1 ->type(COMPUTATIONAL_1),popMode;
COMPUTATIONAL_2_PIC : COMPUTATIONAL_2 ->type(COMPUTATIONAL_2),popMode;
COMPUTATIONAL_3_PIC : COMPUTATIONAL_3 ->type(COMPUTATIONAL_3),popMode;
COMPUTATIONAL_4_PIC : COMPUTATIONAL_4 ->type(COMPUTATIONAL_4),popMode;
COMPUTATIONAL_5_PIC : COMPUTATIONAL_5 ->type(COMPUTATIONAL_5),popMode;
DISPLAY_PIC : DISPLAY ->type(DISPLAY),popMode;
DISPLAY_1_PIC : DISPLAY_1 ->type(DISPLAY_1),popMode;
DYNAMIC_PIC : DYNAMIC ->type(DYNAMIC),popMode;
FLOAT_BINARY_32_PIC : FLOAT_BINARY_32 ->type(FLOAT_BINARY_32),popMode;
FLOAT_BINARY_64_PIC : FLOAT_BINARY_64 ->type(FLOAT_BINARY_64),popMode;
FLOAT_BINARY_128_PIC : FLOAT_BINARY_128 ->type(FLOAT_BINARY_128),popMode;
FLOAT_DECIMAL_PIC : FLOAT_DECIMAL ->type(FLOAT_DECIMAL),popMode;
FLOAT_DECIMAL_16_PIC : FLOAT_DECIMAL_16 ->type(FLOAT_DECIMAL_16),popMode;
FLOAT_DECIMAL_34_PIC : FLOAT_DECIMAL_34 ->type(FLOAT_DECIMAL_34),popMode;
FLOAT_EXTENDED_PIC : FLOAT_EXTENDED ->type(FLOAT_EXTENDED),popMode;
FLOAT_LONG_PIC : FLOAT_LONG ->type(FLOAT_LONG),popMode;
FLOAT_SHORT_PIC : FLOAT_SHORT ->type(FLOAT_SHORT),popMode;
FUNCTION_POINTER_PIC : FUNCTION_POINTER ->type(FUNCTION_POINTER),popMode;
GROUP_USAGE_PIC : GROUP_USAGE ->type(GROUP_USAGE),popMode;
INDEX_PIC : INDEX ->type(INDEX),popMode;
JUST_PIC : JUST ->type(JUST),popMode;
JUSTIFIED_PIC : JUSTIFIED ->type(JUSTIFIED),popMode;
MESSAGE_TAG_PIC : MESSAGE_TAG ->type(MESSAGE_TAG),popMode;
NATIONAL_PIC : NATIONAL ->type(NATIONAL),popMode;
OBJECT_REFERENCE_PIC : OBJECT_REFERENCE ->type(OBJECT_REFERENCE),popMode;
OCCURS_PIC : O C C U R S ->type(OCCURS),popMode;
PACKED_DECIMAL_PIC : PACKED_DECIMAL ->type(PACKED_DECIMAL),popMode;
POINTER_PIC : POINTER ->type(POINTER),popMode;
POINTER_32_PIC : POINTER_32 ->type(POINTER_32),popMode;
PROCEDURE_POINTER_PIC : PROCEDURE_POINTER ->type(PROCEDURE_POINTER),popMode;
PROGRAM_POINTER_PIC : PROGRAM_POINTER ->type(PROGRAM_POINTER),popMode;
SIGN_PIC : SIGN ->type(SIGN),popMode;
SYNC_PIC : SYNC ->type(SYNC),popMode;
SYNCHRONIZED_PIC : SYNCHRONIZED ->type(SYNCHRONIZED),popMode;
USAGE_PIC : USAGE ->type(USAGE),popMode;
UTF_8_PIC : UTF_8 ->type(UTF_8),popMode;
VOLATILE_PIC : VOLATILE ->type(VOLATILE),popMode;

VALUE_PIC : VALUE ->type(VALUE),popMode;
DOT_FS_PIC : DOT_FS ->type(DOT_FS),popMode;
DOT_WS : '. ' ->popMode;

IS_PIC : IS ->type(IS);
EDITING : E D I T I N G ->pushMode(EDITING_PIC_MODE1);
LOCALE_PIC : LOCALE ->type(LOCALE),pushMode(LOCALE_PIC_MODE);
FOR_PIC : FOR ->type(FOR);
NEGATIVE_PIC : NEGATIVE ->type(NEGATIVE);
POSITIVE_PIC : POSITIVE ->type(POSITIVE);
NONNUMERICLITERAL_PIC : NONNUMERICLITERAL ->type(NONNUMERICLITERAL);

/*
These are the actual symbols allowed in a PICTURE clause, but, owing to the
CURRENCY SIGN phrase in the SPECIAL-NAMES paragraph, we must allow pretty 
much _any_ character in a PICTURE clause.
PICTURE_SYMBOLS : (A | B | E | G | N | P | S | V | X | Z | '9' | '0' | CR | DB | DOLLARCHAR | SLASHCHAR | COMMACHAR | DOT | ASTERISKCHAR | PLUSCHAR | MINUSCHAR)+?;
*/
PICTURE_SYMBOLS : [a-zA-Z0-9\\/$,.*+\-<>?!@#%^&()_=:;'"]+?;
PICTURE_CARDINALITY : LPARENCHAR INTEGERLITERAL RPARENCHAR;
WS_PIC : [ \t\f;]+ -> channel(HIDDEN);
NEWLINE_PIC : '\r'? '\n' -> channel(HIDDEN);

CLASSIC_COMMENTLINE_PIC : (BOL TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA (ASTERISKCHAR | SLASHCHAR) TEXTA*)+ {getCharPositionInLine() < 73}? -> skip;
CLASSIC_LINE_NUMBER_PIC : TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA {getCharPositionInLine() == 6}? -> skip;
CLASSIC_DEBUG_LINE_PIC : BOL TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA D TEXTA* {getCharPositionInLine() < 73}? -> skip;
CLASSIC_EOL_COMMENT_PIC : TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA TEXTA {testRig && getCharPositionInLine()==80}? -> skip;

mode EDITING_PIC_MODE1;

WS_E1 : [ \t\f\n\r]+ -> channel(HIDDEN),pushMode(EDITING_PIC_MODE2);

mode EDITING_PIC_MODE2;

EDITING_CHARACTER : ~[ \t\f\n\r]+?;

WS_E2 : [ \t\f\n\r]+ -> channel(HIDDEN),popMode,popMode;

mode LOCALE_PIC_MODE;

IS_LOCALE : IS ->type(IS);
WS_LOCALE : [ \t\f\n\r]+ ->channel(HIDDEN);
SIZE_LOCALE : SIZE ->type(SIZE);
INTEGERLITERAL_LOCALE : INTEGERLITERAL ->type(INTEGERLITERAL),popMode;
IDENTIFIER_LOCALE : IDENTIFIER ->type(IDENTIFIER);


