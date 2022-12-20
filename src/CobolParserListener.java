// Generated from src/CobolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CobolParser}.
 */
public interface CobolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CobolParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(CobolParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(CobolParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(CobolParser.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(CobolParser.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#encodingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterEncodingPhrase(CobolParser.EncodingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#encodingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitEncodingPhrase(CobolParser.EncodingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#endiannessPhrase}.
	 * @param ctx the parse tree
	 */
	void enterEndiannessPhrase(CobolParser.EndiannessPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#endiannessPhrase}.
	 * @param ctx the parse tree
	 */
	void exitEndiannessPhrase(CobolParser.EndiannessPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat1(CobolParser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat1(CobolParser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat2(CobolParser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat2(CobolParser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void enterDataDescriptionEntryFormat3(CobolParser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 */
	void exitDataDescriptionEntryFormat3(CobolParser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataAlignedClause(CobolParser.DataAlignedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataAlignedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataAlignedClause(CobolParser.DataAlignedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataAnyLengthClause}.
	 * @param ctx the parse tree
	 */
	void enterDataAnyLengthClause(CobolParser.DataAnyLengthClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataAnyLengthClause}.
	 * @param ctx the parse tree
	 */
	void exitDataAnyLengthClause(CobolParser.DataAnyLengthClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void enterDataBlankWhenZeroClause(CobolParser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 */
	void exitDataBlankWhenZeroClause(CobolParser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataBasedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataBasedClause(CobolParser.DataBasedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataBasedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataBasedClause(CobolParser.DataBasedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataCommonOwnLocalClause(CobolParser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataCommonOwnLocalClause(CobolParser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataConstantRecordClause}.
	 * @param ctx the parse tree
	 */
	void enterDataConstantRecordClause(CobolParser.DataConstantRecordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataConstantRecordClause}.
	 * @param ctx the parse tree
	 */
	void exitDataConstantRecordClause(CobolParser.DataConstantRecordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDynamicLengthClause}.
	 * @param ctx the parse tree
	 */
	void enterDataDynamicLengthClause(CobolParser.DataDynamicLengthClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDynamicLengthClause}.
	 * @param ctx the parse tree
	 */
	void exitDataDynamicLengthClause(CobolParser.DataDynamicLengthClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataExternalClause(CobolParser.DataExternalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataExternalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataExternalClause(CobolParser.DataExternalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataGlobalClause(CobolParser.DataGlobalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataGlobalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataGlobalClause(CobolParser.DataGlobalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	void enterDataGroupUsageClause(CobolParser.DataGroupUsageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataGroupUsageClause}.
	 * @param ctx the parse tree
	 */
	void exitDataGroupUsageClause(CobolParser.DataGroupUsageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	void enterDataIntegerStringClause(CobolParser.DataIntegerStringClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 */
	void exitDataIntegerStringClause(CobolParser.DataIntegerStringClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataJustifiedClause(CobolParser.DataJustifiedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataJustifiedClause(CobolParser.DataJustifiedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursClause(CobolParser.DataOccursClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataOccursClause}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursClause(CobolParser.DataOccursClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursTo(CobolParser.DataOccursToContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataOccursTo}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursTo(CobolParser.DataOccursToContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataOccursDepending}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursDepending(CobolParser.DataOccursDependingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataOccursDepending}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursDepending(CobolParser.DataOccursDependingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursSort(CobolParser.DataOccursSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataOccursSort}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursSort(CobolParser.DataOccursSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataOccursIndexed}.
	 * @param ctx the parse tree
	 */
	void enterDataOccursIndexed(CobolParser.DataOccursIndexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataOccursIndexed}.
	 * @param ctx the parse tree
	 */
	void exitDataOccursIndexed(CobolParser.DataOccursIndexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	void enterDataPictureClause(CobolParser.DataPictureClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataPictureClause}.
	 * @param ctx the parse tree
	 */
	void exitDataPictureClause(CobolParser.DataPictureClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#pictureString}.
	 * @param ctx the parse tree
	 */
	void enterPictureString(CobolParser.PictureStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#pictureString}.
	 * @param ctx the parse tree
	 */
	void exitPictureString(CobolParser.PictureStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#pictureChars}.
	 * @param ctx the parse tree
	 */
	void enterPictureChars(CobolParser.PictureCharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#pictureChars}.
	 * @param ctx the parse tree
	 */
	void exitPictureChars(CobolParser.PictureCharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	void enterPictureCardinality(CobolParser.PictureCardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#pictureCardinality}.
	 * @param ctx the parse tree
	 */
	void exitPictureCardinality(CobolParser.PictureCardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#pictureEditingPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPictureEditingPhrase(CobolParser.PictureEditingPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#pictureEditingPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPictureEditingPhrase(CobolParser.PictureEditingPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#pictureLocalePhrase}.
	 * @param ctx the parse tree
	 */
	void enterPictureLocalePhrase(CobolParser.PictureLocalePhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#pictureLocalePhrase}.
	 * @param ctx the parse tree
	 */
	void exitPictureLocalePhrase(CobolParser.PictureLocalePhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 */
	void enterDataPropertyClause(CobolParser.DataPropertyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 */
	void exitDataPropertyClause(CobolParser.DataPropertyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	void enterDataReceivedByClause(CobolParser.DataReceivedByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 */
	void exitDataReceivedByClause(CobolParser.DataReceivedByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRecordAreaClause(CobolParser.DataRecordAreaClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRecordAreaClause(CobolParser.DataRecordAreaClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRedefinesClause(CobolParser.DataRedefinesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRedefinesClause(CobolParser.DataRedefinesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	void enterDataRenamesClause(CobolParser.DataRenamesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataRenamesClause}.
	 * @param ctx the parse tree
	 */
	void exitDataRenamesClause(CobolParser.DataRenamesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataSameAsClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSameAsClause(CobolParser.DataSameAsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataSameAsClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSameAsClause(CobolParser.DataSameAsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataSelectWhenClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSelectWhenClause(CobolParser.DataSelectWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataSelectWhenClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSelectWhenClause(CobolParser.DataSelectWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSignClause(CobolParser.DataSignClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataSignClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSignClause(CobolParser.DataSignClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	void enterDataSynchronizedClause(CobolParser.DataSynchronizedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 */
	void exitDataSynchronizedClause(CobolParser.DataSynchronizedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	void enterDataThreadLocalClause(CobolParser.DataThreadLocalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 */
	void exitDataThreadLocalClause(CobolParser.DataThreadLocalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeClause(CobolParser.DataTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeClause(CobolParser.DataTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDefClause(CobolParser.DataTypeDefClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDefClause(CobolParser.DataTypeDefClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	void enterDataUsageClause(CobolParser.DataUsageClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataUsageClause}.
	 * @param ctx the parse tree
	 */
	void exitDataUsageClause(CobolParser.DataUsageClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataUsageType}.
	 * @param ctx the parse tree
	 */
	void enterDataUsageType(CobolParser.DataUsageTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataUsageType}.
	 * @param ctx the parse tree
	 */
	void exitDataUsageType(CobolParser.DataUsageTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataUsageTypeSignPhrase}.
	 * @param ctx the parse tree
	 */
	void enterDataUsageTypeSignPhrase(CobolParser.DataUsageTypeSignPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataUsageTypeSignPhrase}.
	 * @param ctx the parse tree
	 */
	void exitDataUsageTypeSignPhrase(CobolParser.DataUsageTypeSignPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataUsageObjectReferenceFactoryPhrase}.
	 * @param ctx the parse tree
	 */
	void enterDataUsageObjectReferenceFactoryPhrase(CobolParser.DataUsageObjectReferenceFactoryPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataUsageObjectReferenceFactoryPhrase}.
	 * @param ctx the parse tree
	 */
	void exitDataUsageObjectReferenceFactoryPhrase(CobolParser.DataUsageObjectReferenceFactoryPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	void enterDataUsingClause(CobolParser.DataUsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataUsingClause}.
	 * @param ctx the parse tree
	 */
	void exitDataUsingClause(CobolParser.DataUsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	void enterDataValueClause(CobolParser.DataValueClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataValueClause}.
	 * @param ctx the parse tree
	 */
	void exitDataValueClause(CobolParser.DataValueClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	void enterDataValueInterval(CobolParser.DataValueIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataValueInterval}.
	 * @param ctx the parse tree
	 */
	void exitDataValueInterval(CobolParser.DataValueIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	void enterDataValueIntervalFrom(CobolParser.DataValueIntervalFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 */
	void exitDataValueIntervalFrom(CobolParser.DataValueIntervalFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	void enterDataValueIntervalTo(CobolParser.DataValueIntervalToContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 */
	void exitDataValueIntervalTo(CobolParser.DataValueIntervalToContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataVolatileClause}.
	 * @param ctx the parse tree
	 */
	void enterDataVolatileClause(CobolParser.DataVolatileClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataVolatileClause}.
	 * @param ctx the parse tree
	 */
	void exitDataVolatileClause(CobolParser.DataVolatileClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	void enterDataWithLowerBoundsClause(CobolParser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 */
	void exitDataWithLowerBoundsClause(CobolParser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CobolParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CobolParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#tableCall}.
	 * @param ctx the parse tree
	 */
	void enterTableCall(CobolParser.TableCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#tableCall}.
	 * @param ctx the parse tree
	 */
	void exitTableCall(CobolParser.TableCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(CobolParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(CobolParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CobolParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CobolParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataName(CobolParser.QualifiedDataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#qualifiedDataName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataName(CobolParser.QualifiedDataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedDataNameFormat1(CobolParser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedDataNameFormat1(CobolParser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedInData(CobolParser.QualifiedInDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#qualifiedInData}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedInData(CobolParser.QualifiedInDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#alphabetName}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetName(CobolParser.AlphabetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#alphabetName}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetName(CobolParser.AlphabetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CobolParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CobolParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(CobolParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(CobolParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#constantName}.
	 * @param ctx the parse tree
	 */
	void enterConstantName(CobolParser.ConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#constantName}.
	 * @param ctx the parse tree
	 */
	void exitConstantName(CobolParser.ConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataName}.
	 * @param ctx the parse tree
	 */
	void enterDataName(CobolParser.DataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataName}.
	 * @param ctx the parse tree
	 */
	void exitDataName(CobolParser.DataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#dataDescName}.
	 * @param ctx the parse tree
	 */
	void enterDataDescName(CobolParser.DataDescNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#dataDescName}.
	 * @param ctx the parse tree
	 */
	void exitDataDescName(CobolParser.DataDescNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(CobolParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(CobolParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(CobolParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(CobolParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#localeName}.
	 * @param ctx the parse tree
	 */
	void enterLocaleName(CobolParser.LocaleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#localeName}.
	 * @param ctx the parse tree
	 */
	void exitLocaleName(CobolParser.LocaleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#paragraphName}.
	 * @param ctx the parse tree
	 */
	void enterParagraphName(CobolParser.ParagraphNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#paragraphName}.
	 * @param ctx the parse tree
	 */
	void exitParagraphName(CobolParser.ParagraphNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#programName}.
	 * @param ctx the parse tree
	 */
	void enterProgramName(CobolParser.ProgramNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#programName}.
	 * @param ctx the parse tree
	 */
	void exitProgramName(CobolParser.ProgramNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#cobolWord}.
	 * @param ctx the parse tree
	 */
	void enterCobolWord(CobolParser.CobolWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#cobolWord}.
	 * @param ctx the parse tree
	 */
	void exitCobolWord(CobolParser.CobolWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CobolParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CobolParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#continuedLiteral}.
	 * @param ctx the parse tree
	 */
	void enterContinuedLiteral(CobolParser.ContinuedLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#continuedLiteral}.
	 * @param ctx the parse tree
	 */
	void exitContinuedLiteral(CobolParser.ContinuedLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(CobolParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(CobolParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(CobolParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(CobolParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CobolParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CobolParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	void enterFigurativeConstant(CobolParser.FigurativeConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#figurativeConstant}.
	 * @param ctx the parse tree
	 */
	void exitFigurativeConstant(CobolParser.FigurativeConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CobolParser#commentEntry}.
	 * @param ctx the parse tree
	 */
	void enterCommentEntry(CobolParser.CommentEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CobolParser#commentEntry}.
	 * @param ctx the parse tree
	 */
	void exitCommentEntry(CobolParser.CommentEntryContext ctx);
}