// Generated from src/CobolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CobolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CobolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CobolParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(CobolParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructure(CobolParser.DataStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#encodingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodingPhrase(CobolParser.EncodingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#endiannessPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndiannessPhrase(CobolParser.EndiannessPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDescriptionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntry(CobolParser.DataDescriptionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat1(CobolParser.DataDescriptionEntryFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat2(CobolParser.DataDescriptionEntryFormat2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDescriptionEntryFormat3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescriptionEntryFormat3(CobolParser.DataDescriptionEntryFormat3Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataAlignedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAlignedClause(CobolParser.DataAlignedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataAnyLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataAnyLengthClause(CobolParser.DataAnyLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataBlankWhenZeroClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBlankWhenZeroClause(CobolParser.DataBlankWhenZeroClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataBasedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataBasedClause(CobolParser.DataBasedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataCommonOwnLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataCommonOwnLocalClause(CobolParser.DataCommonOwnLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataConstantRecordClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataConstantRecordClause(CobolParser.DataConstantRecordClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDynamicLengthClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDynamicLengthClause(CobolParser.DataDynamicLengthClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataExternalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExternalClause(CobolParser.DataExternalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataGlobalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataGlobalClause(CobolParser.DataGlobalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataGroupUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataGroupUsageClause(CobolParser.DataGroupUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataIntegerStringClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataIntegerStringClause(CobolParser.DataIntegerStringClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataJustifiedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataJustifiedClause(CobolParser.DataJustifiedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataOccursClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursClause(CobolParser.DataOccursClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataOccursTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursTo(CobolParser.DataOccursToContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataOccursDepending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursDepending(CobolParser.DataOccursDependingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataOccursSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursSort(CobolParser.DataOccursSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataOccursIndexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataOccursIndexed(CobolParser.DataOccursIndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataPictureClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPictureClause(CobolParser.DataPictureClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#pictureString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureString(CobolParser.PictureStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#pictureChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureChars(CobolParser.PictureCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#pictureCardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureCardinality(CobolParser.PictureCardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#pictureEditingPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureEditingPhrase(CobolParser.PictureEditingPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#pictureLocalePhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPictureLocalePhrase(CobolParser.PictureLocalePhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataPropertyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataPropertyClause(CobolParser.DataPropertyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataReceivedByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataReceivedByClause(CobolParser.DataReceivedByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataRecordAreaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRecordAreaClause(CobolParser.DataRecordAreaClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataRedefinesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRedefinesClause(CobolParser.DataRedefinesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataRenamesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRenamesClause(CobolParser.DataRenamesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataSameAsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSameAsClause(CobolParser.DataSameAsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataSelectWhenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSelectWhenClause(CobolParser.DataSelectWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataSignClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSignClause(CobolParser.DataSignClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataSynchronizedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSynchronizedClause(CobolParser.DataSynchronizedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataThreadLocalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataThreadLocalClause(CobolParser.DataThreadLocalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeClause(CobolParser.DataTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataTypeDefClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDefClause(CobolParser.DataTypeDefClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataUsageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageClause(CobolParser.DataUsageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataUsageType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageType(CobolParser.DataUsageTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataUsageObjectReferenceFactoryPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsageObjectReferenceFactoryPhrase(CobolParser.DataUsageObjectReferenceFactoryPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataUsingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataUsingClause(CobolParser.DataUsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataValueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueClause(CobolParser.DataValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataValueInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueInterval(CobolParser.DataValueIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataValueIntervalFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalFrom(CobolParser.DataValueIntervalFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataValueIntervalTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueIntervalTo(CobolParser.DataValueIntervalToContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataVolatileClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataVolatileClause(CobolParser.DataVolatileClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataWithLowerBoundsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataWithLowerBoundsClause(CobolParser.DataWithLowerBoundsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CobolParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#tableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCall(CobolParser.TableCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(CobolParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CobolParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#qualifiedDataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataName(CobolParser.QualifiedDataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#qualifiedDataNameFormat1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedDataNameFormat1(CobolParser.QualifiedDataNameFormat1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#qualifiedInData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedInData(CobolParser.QualifiedInDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#alphabetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabetName(CobolParser.AlphabetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CobolParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(CobolParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#constantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantName(CobolParser.ConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataName(CobolParser.DataNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#dataDescName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDescName(CobolParser.DataDescNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(CobolParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#interfaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceName(CobolParser.InterfaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#localeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaleName(CobolParser.LocaleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#paragraphName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphName(CobolParser.ParagraphNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#programName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramName(CobolParser.ProgramNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#cobolWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobolWord(CobolParser.CobolWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CobolParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#continuedLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuedLiteral(CobolParser.ContinuedLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CobolParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(CobolParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CobolParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#figurativeConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigurativeConstant(CobolParser.FigurativeConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CobolParser#commentEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentEntry(CobolParser.CommentEntryContext ctx);
}