/*
 Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 All rights reserved.

 Portions copyright (C) 2019 - 2022, Craig Schneiderwent.  All rights reserved.

 This software may be modified and distributed under the terms
 of the MIT license. See the LICENSE file for details.
*/

/*
 subset of COBOL Grammar for ANTLR4

 This is a partial COBOL grammar, which is part of the COBOL parser at
 https://github.com/uwol/proleap-cobol-parser.
*/

parser grammar CobolParser;

options {tokenVocab=CobolLexer;}

@parser::members {

}

startRule : dataStructure EOF;

dataStructure
   : dataDescriptionEntry+
   ;

encodingPhrase
   : (BINARY_ENCODING | DECIMAL_ENCODING)
   ;

endiannessPhrase
   : (HIGH_ORDER_LEFT | HIGH_ORDER_RIGHT)
   ;


// data description entry ----------------------------------

dataDescriptionEntry
   : dataDescriptionEntryFormat1 | dataDescriptionEntryFormat2 | dataDescriptionEntryFormat3
   ;

dataDescriptionEntryFormat1
   : (INTEGERLITERAL | LEVEL_NUMBER_77) (FILLER | dataName)? (dataRedefinesClause | dataIntegerStringClause | dataExternalClause | dataGlobalClause | dataGroupUsageClause | dataTypeDefClause | dataThreadLocalClause | dataPictureClause | dataCommonOwnLocalClause | dataTypeClause | dataUsingClause | dataUsageClause | dataValueClause | dataReceivedByClause | dataOccursClause | dataSignClause | dataSynchronizedClause | dataJustifiedClause | dataBlankWhenZeroClause | dataWithLowerBoundsClause | dataAlignedClause | dataRecordAreaClause | dataDynamicLengthClause | dataConstantRecordClause | dataPropertyClause | dataSameAsClause | dataSelectWhenClause | dataBasedClause | dataAnyLengthClause | dataVolatileClause)* (DOT_WS | DOT_FS | DOT)
   ;

dataDescriptionEntryFormat2
   : LEVEL_NUMBER_66 dataName dataRenamesClause (DOT_FS | DOT)
   ;

dataDescriptionEntryFormat3
   : LEVEL_NUMBER_88 conditionName dataValueClause (DOT_FS | DOT)
   ;

dataAlignedClause
   : ALIGNED
   ;

dataAnyLengthClause
   : (ANY LENGTH)
   ;

dataBlankWhenZeroClause
   : BLANK WHEN? (ZERO | ZEROS | ZEROES)
   ;

dataBasedClause
   : BASED
   ;

dataCommonOwnLocalClause
   : COMMON | OWN | LOCAL
   ;

dataConstantRecordClause
   : CONSTANT RECORD
   ;

dataDynamicLengthClause
   : DYNAMIC LENGTH? dataName? (LIMIT IS? INTEGERLITERAL)?
   ;

dataExternalClause
   : IS? EXTERNAL ((BY | AS) literal)?
   ;

dataGlobalClause
   : IS? GLOBAL
   ;

dataGroupUsageClause
   : GROUP_USAGE IS? (NATIONAL | UTF_8 | BIT)
   ;

dataIntegerStringClause
   : INTEGER | STRING
   ;

dataJustifiedClause
   : (JUSTIFIED | JUST) RIGHT?
   ;

dataOccursClause
   : OCCURS (identifier | integerLiteral) dataOccursTo? TIMES? dataOccursDepending? (dataOccursSort | dataOccursIndexed)*
   ;

dataOccursTo
   : TO integerLiteral
   ;

dataOccursDepending
   : DEPENDING ON? qualifiedDataName
   ;

dataOccursSort
   : (ASCENDING | DESCENDING) KEY? IS? qualifiedDataName+
   ;

dataOccursIndexed
   : INDEXED BY? LOCAL? (indexName COMMACHAR?)+
   ;

dataPictureClause
   : (PICTURE | PIC) IS? pictureString (BYTE_LENGTH IS? INTEGERLITERAL)? (pictureEditingPhrase | pictureLocalePhrase)?
   ;

pictureString
   : (pictureChars+ pictureCardinality?)+
   ;

pictureChars
   : DOLLARCHAR | PICTURE_SYMBOLS | SLASHCHAR | COMMACHAR | DOT | ASTERISKCHAR | DOUBLEASTERISKCHAR | PLUSCHAR | MINUSCHAR | integerLiteral
   ;

pictureCardinality
   : PICTURE_CARDINALITY
   ;

pictureEditingPhrase
   : EDITING EDITING_CHARACTER ((IS? literal) | (FOR? NEGATIVE IS? literal POSITIVE IS? literal))?
   ;

pictureLocalePhrase
   : LOCALE (IS? localeName)? SIZE IS? INTEGERLITERAL
   ;

dataPropertyClause
   : (PROPERTY (WITH? NO (GET | SET))? (IS? FINAL)?)
   ;

dataReceivedByClause
   : RECEIVED? BY? (CONTENT | REFERENCE | REF)
   ;

dataRecordAreaClause
   : RECORD AREA
   ;

dataRedefinesClause
   : REDEFINES dataName
   ;

dataRenamesClause
   : RENAMES qualifiedDataName ((THROUGH | THRU) qualifiedDataName)?
   ;

dataSameAsClause
   : (SAME AS dataName)
   ;

dataSelectWhenClause
   : (SELECT WHEN (OTHER | conditionName))
   ;

dataSignClause
   : (SIGN IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
   ;

dataSynchronizedClause
   : (SYNCHRONIZED | SYNC) (LEFT | RIGHT)?
   ;

dataThreadLocalClause
   : IS? THREAD_LOCAL
   ;

dataTypeClause
   : TYPE IS? 
   (SHORT_DATE
   | LONG_DATE
   | NUMERIC_DATE
   | NUMERIC_TIME
   | LONG_TIME
   | CLOB_LOCATOR
   | BLOB_LOCATOR
   | DBCLOB_LOCATOR
   | ROWID
   | (CLOB | BLOB | DBCLOB | VARBINARY (XML AS CLOB)) LPARENCHAR (IDENTIFIER | INTEGERLITERAL) RPARENCHAR)
   ;

dataTypeDefClause
   : IS? TYPEDEF STRONG?
   ;

dataUsageClause
   : (USAGE IS?)? dataUsageType NATIVE?
   ;
   
dataUsageType 
   : (BINARY (TRUNCATED | EXTENDED)? 
   | (BINARY_CHAR dataUsageTypeSignPhrase)
   | (BINARY_DOUBLE dataUsageTypeSignPhrase)
   | (BINARY_LONG dataUsageTypeSignPhrase)
   | (BINARY_SHORT dataUsageTypeSignPhrase)
   | BIT 
   | COMP 
   | COMP_1 
   | COMP_2 
   | COMP_3 
   | COMP_4 
   | COMP_5 
   | COMPUTATIONAL 
   | COMPUTATIONAL_1 
   | COMPUTATIONAL_2 
   | COMPUTATIONAL_3 
   | COMPUTATIONAL_4 
   | COMPUTATIONAL_5 
   | CONTROL_POINT 
   | DATE 
   | DISPLAY 
   | DISPLAY_1 
   | DOUBLE 
   | EVENT 
   | (FLOAT_BINARY_32 endiannessPhrase?)
   | (FLOAT_BINARY_64 endiannessPhrase?)
   | (FLOAT_BINARY_128 endiannessPhrase?)
   | (FLOAT_DECIMAL_16 (encodingPhrase | endiannessPhrase)?)
   | (FLOAT_DECIMAL_34 (encodingPhrase | endiannessPhrase)?)
   | FLOAT_EXTENDED
   | FLOAT_LONG
   | FLOAT_SHORT
   | (FUNCTION_POINTER (TO? cobolWord)?)
   | INDEX 
   | KANJI 
   | LOCK 
   | NATIONAL 
   | (PACKED_DECIMAL (WITH? NO SIGN)?)
   | (POINTER (TO dataName)?)
   | POINTER_32 
   | PROCEDURE_POINTER 
   | REAL 
   | SQL 
   | TASK 
   | UTF_8 
   | (PROGRAM_POINTER (TO? cobolWord)?)
   | MESSAGE_TAG
   | OBJECT_REFERENCE dataUsageObjectReferenceFactoryPhrase?) 
   ;

dataUsageTypeSignPhrase
   : (SIGNED | UNSIGNED)
   ;
   
dataUsageObjectReferenceFactoryPhrase
   : ((FACTORY OF?) (interfaceName | ACTIVE_CLASS | (className ONLY?)))
   ;

dataUsingClause
   : USING (LANGUAGE | CONVENTION) OF? (cobolWord | dataName)
   ;

dataValueClause
   : (VALUE | VALUES) 
   (IS | ARE)? 
   dataValueInterval 
   (COMMACHAR? dataValueInterval)* 
   (IN? alphabetName)?
   (WHEN? SET? TO? FALSE IS? literal)?
   ;

dataValueInterval
   : dataValueIntervalFrom dataValueIntervalTo?
   ;

dataValueIntervalFrom
   : literal | cobolWord | continuedLiteral
   ;

dataValueIntervalTo
   : (THROUGH | THRU) literal | continuedLiteral
   ;

dataVolatileClause
   : VOLATILE
   ;

dataWithLowerBoundsClause
   : WITH? LOWER BOUNDS
   ;

// identifier ----------------------------------

identifier
   : tableCall | qualifiedDataName 
   ;

tableCall
   : qualifiedDataName (LPARENCHAR subscript (COMMACHAR? subscript)* RPARENCHAR)
   ;

subscript
   : ALL | integerLiteral | qualifiedDataName integerLiteral? | indexName integerLiteral?
   ;

argument
   : literal | identifier | qualifiedDataName integerLiteral? | indexName integerLiteral?
   ;

// qualified data name ----------------------------------

qualifiedDataName
   : qualifiedDataNameFormat1
   ;

qualifiedDataNameFormat1
   : (dataName | conditionName) (qualifiedInData+)?
   ;

/*
This rule originally read...

   : inData | inFile

...and parsing NC246A from the NIST test suite took ~2 minutes.

Changing the rule to its current form makes parsing NC246
take ~10 seconds.
*/
qualifiedInData
   : (IN | OF) dataName
   ;

// names ----------------------------------

alphabetName
   : cobolWord
   ;

className
   : cobolWord
   ;

conditionName
   : cobolWord
   ;

constantName
   : cobolWord
   ;

dataName
   : cobolWord
   ;

dataDescName
   : FILLER | dataName
   ;

indexName
   : cobolWord
   ;

interfaceName
   : cobolWord
   ;
   
localeName
   : cobolWord
   ;

paragraphName
   : cobolWord | integerLiteral
   ;

programName
   : NONNUMERICLITERAL | cobolWord
   ;

// literal ----------------------------------

cobolWord
   : IDENTIFIER 
   | BINARY | BIT | BOUNDS
   | CLOB | CONTROL_POINT | CONVENTION
   | DBCLOB DOUBLE
   | EVENT | EXTENDED
   | FUNCTION_POINTER
   | INTEGER
   | LANGUAGE | LOCAL | LONG_DATE | LONG_TIME | LOWER
   | NATIONAL | NUMERIC_DATE | NUMERIC_TIME
   | OWN
   | REAL | RECEIVED | REF
   | SHORT_DATE | SQL | STRONG
   | TASK | THREAD_LOCAL | TRUNCATED | TYPEDEF
   ;

literal
   : NONNUMERICLITERAL | figurativeConstant | numericLiteral | booleanLiteral | continuedLiteral
   ;

continuedLiteral
   : ((CONTINUED_STRINGLITERAL | CONTINUED_DBCSLITERAL | CONTINUED_HEXNUMBER  | CONTINUED_NULLTERMINATED) CLASSIC_CONTINUATION)+ NONNUMERICLITERAL
   ;

booleanLiteral
   : TRUE | FALSE
   ;

numericLiteral
   : NUMERICLITERAL | ZERO | integerLiteral
   ;

integerLiteral
   : INTEGERLITERAL | LEVEL_NUMBER_66 | LEVEL_NUMBER_77 | LEVEL_NUMBER_88
   ;

// keywords ----------------------------------

figurativeConstant
   : ALL literal | HIGH_VALUE | HIGH_VALUES | LOW_VALUE | LOW_VALUES | NULL | NULLS | QUOTE | QUOTES | SPACE | SPACES | ZERO | ZEROS | ZEROES
   ;

// comment entry

commentEntry
   : COMMENTENTRYLINE+
   ;


