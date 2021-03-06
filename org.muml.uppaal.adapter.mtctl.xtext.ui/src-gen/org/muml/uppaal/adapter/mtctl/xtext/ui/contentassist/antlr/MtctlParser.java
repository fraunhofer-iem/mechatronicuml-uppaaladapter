/*
 * generated by Xtext
 */
package org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.muml.uppaal.adapter.mtctl.xtext.services.MtctlGrammarAccess;

import com.google.inject.Inject;

public class MtctlParser extends AbstractContentAssistParser {
	
	@Inject
	private MtctlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr.internal.InternalMtctlParser createParser() {
		org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr.internal.InternalMtctlParser result = new org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr.internal.InternalMtctlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNotExprAccess().getAlternatives(), "rule__NotExpr__Alternatives");
					put(grammarAccess.getQuantifierExprAccess().getAlternatives(), "rule__QuantifierExpr__Alternatives");
					put(grammarAccess.getTemporalQuantifierExprAccess().getAlternatives(), "rule__TemporalQuantifierExpr__Alternatives");
					put(grammarAccess.getEFExprAccess().getAlternatives_0(), "rule__EFExpr__Alternatives_0");
					put(grammarAccess.getAFExprAccess().getAlternatives_0(), "rule__AFExpr__Alternatives_0");
					put(grammarAccess.getEGExprAccess().getAlternatives_0(), "rule__EGExpr__Alternatives_0");
					put(grammarAccess.getAGExprAccess().getAlternatives_0(), "rule__AGExpr__Alternatives_0");
					put(grammarAccess.getAtomExprAccess().getAlternatives(), "rule__AtomExpr__Alternatives");
					put(grammarAccess.getPredicateExprAccess().getAlternatives(), "rule__PredicateExpr__Alternatives");
					put(grammarAccess.getStateExprAccess().getAlternatives(), "rule__StateExpr__Alternatives");
					put(grammarAccess.getMessageExprAccess().getAlternatives(), "rule__MessageExpr__Alternatives");
					put(grammarAccess.getMapExprAccess().getAlternatives(), "rule__MapExpr__Alternatives");
					put(grammarAccess.getIntegerMapExprAccess().getAlternatives(), "rule__IntegerMapExpr__Alternatives");
					put(grammarAccess.getStateMapExprAccess().getAlternatives(), "rule__StateMapExpr__Alternatives");
					put(grammarAccess.getTimeUnitExprAccess().getAlternatives(), "rule__TimeUnitExpr__Alternatives");
					put(grammarAccess.getSetExprAccess().getAlternatives(), "rule__SetExpr__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getAlternatives(), "rule__QualifiedName__Alternatives");
					put(grammarAccess.getComparisonOpAccess().getAlternatives(), "rule__ComparisonOp__Alternatives");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getLeadsToExprAccess().getGroup(), "rule__LeadsToExpr__Group__0");
					put(grammarAccess.getLeadsToExprAccess().getGroup_1(), "rule__LeadsToExpr__Group_1__0");
					put(grammarAccess.getImplyExprAccess().getGroup(), "rule__ImplyExpr__Group__0");
					put(grammarAccess.getImplyExprAccess().getGroup_1(), "rule__ImplyExpr__Group_1__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getNotExprAccess().getGroup_0(), "rule__NotExpr__Group_0__0");
					put(grammarAccess.getUniversalQuantExprAccess().getGroup(), "rule__UniversalQuantExpr__Group__0");
					put(grammarAccess.getExistentialQuantExprAccess().getGroup(), "rule__ExistentialQuantExpr__Group__0");
					put(grammarAccess.getVariableBindingAccess().getGroup(), "rule__VariableBinding__Group__0");
					put(grammarAccess.getEFExprAccess().getGroup(), "rule__EFExpr__Group__0");
					put(grammarAccess.getAFExprAccess().getGroup(), "rule__AFExpr__Group__0");
					put(grammarAccess.getEGExprAccess().getGroup(), "rule__EGExpr__Group__0");
					put(grammarAccess.getAGExprAccess().getGroup(), "rule__AGExpr__Group__0");
					put(grammarAccess.getAtomExprAccess().getGroup_0(), "rule__AtomExpr__Group_0__0");
					put(grammarAccess.getDeadlockExprAccess().getGroup(), "rule__DeadlockExpr__Group__0");
					put(grammarAccess.getConnectorOverflowExprAccess().getGroup(), "rule__ConnectorOverflowExpr__Group__0");
					put(grammarAccess.getTrueExprAccess().getGroup(), "rule__TrueExpr__Group__0");
					put(grammarAccess.getFalseExprAccess().getGroup(), "rule__FalseExpr__Group__0");
					put(grammarAccess.getStateActiveExprAccess().getGroup(), "rule__StateActiveExpr__Group__0");
					put(grammarAccess.getSubstateOfExprAccess().getGroup(), "rule__SubstateOfExpr__Group__0");
					put(grammarAccess.getStateInStatechartExprAccess().getGroup(), "rule__StateInStatechartExpr__Group__0");
					put(grammarAccess.getMessageInTransitExprAccess().getGroup(), "rule__MessageInTransitExpr__Group__0");
					put(grammarAccess.getMessageInBufferExprAccess().getGroup(), "rule__MessageInBufferExpr__Group__0");
					put(grammarAccess.getMessageDiscardedExprAccess().getGroup(), "rule__MessageDiscardedExpr__Group__0");
					put(grammarAccess.getTransitionFiringExprAccess().getGroup(), "rule__TransitionFiringExpr__Group__0");
					put(grammarAccess.getComparisonExprAccess().getGroup(), "rule__ComparisonExpr__Group__0");
					put(grammarAccess.getBufferMessageCountExprAccess().getGroup(), "rule__BufferMessageCountExpr__Group__0");
					put(grammarAccess.getSourceStateExprAccess().getGroup(), "rule__SourceStateExpr__Group__0");
					put(grammarAccess.getTargetStateExprAccess().getGroup(), "rule__TargetStateExpr__Group__0");
					put(grammarAccess.getMumlElemExprAccess().getGroup(), "rule__MumlElemExpr__Group__0");
					put(grammarAccess.getMumlElemExprAccess().getGroup_1(), "rule__MumlElemExpr__Group_1__0");
					put(grammarAccess.getConstExprAccess().getGroup(), "rule__ConstExpr__Group__0");
					put(grammarAccess.getSetExprAccess().getGroup_3(), "rule__SetExpr__Group_3__0");
					put(grammarAccess.getSetExprAccess().getGroup_4(), "rule__SetExpr__Group_4__0");
					put(grammarAccess.getSetExprAccess().getGroup_5(), "rule__SetExpr__Group_5__0");
					put(grammarAccess.getSetExprAccess().getGroup_6(), "rule__SetExpr__Group_6__0");
					put(grammarAccess.getSetExprAccess().getGroup_7(), "rule__SetExpr__Group_7__0");
					put(grammarAccess.getIntervalSetExprAccess().getGroup(), "rule__IntervalSetExpr__Group__0");
					put(grammarAccess.getInstanceSetExprAccess().getGroup(), "rule__InstanceSetExpr__Group__0");
					put(grammarAccess.getSubinstanceSetExprAccess().getGroup(), "rule__SubinstanceSetExpr__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPropertyRepositoryAccess().getPropertiesAssignment(), "rule__PropertyRepository__PropertiesAssignment");
					put(grammarAccess.getPropertyAccess().getExpressionAssignment_0(), "rule__Property__ExpressionAssignment_0");
					put(grammarAccess.getPropertyAccess().getCommentAssignment_2(), "rule__Property__CommentAssignment_2");
					put(grammarAccess.getLeadsToExprAccess().getRightOpdAssignment_1_2(), "rule__LeadsToExpr__RightOpdAssignment_1_2");
					put(grammarAccess.getImplyExprAccess().getRightOpdAssignment_1_2(), "rule__ImplyExpr__RightOpdAssignment_1_2");
					put(grammarAccess.getOrExprAccess().getRightOpdAssignment_1_2(), "rule__OrExpr__RightOpdAssignment_1_2");
					put(grammarAccess.getAndExprAccess().getRightOpdAssignment_1_2(), "rule__AndExpr__RightOpdAssignment_1_2");
					put(grammarAccess.getNotExprAccess().getOpdAssignment_0_2(), "rule__NotExpr__OpdAssignment_0_2");
					put(grammarAccess.getUniversalQuantExprAccess().getVarAssignment_3(), "rule__UniversalQuantExpr__VarAssignment_3");
					put(grammarAccess.getUniversalQuantExprAccess().getFormulaAssignment_5(), "rule__UniversalQuantExpr__FormulaAssignment_5");
					put(grammarAccess.getExistentialQuantExprAccess().getVarAssignment_3(), "rule__ExistentialQuantExpr__VarAssignment_3");
					put(grammarAccess.getExistentialQuantExprAccess().getFormulaAssignment_5(), "rule__ExistentialQuantExpr__FormulaAssignment_5");
					put(grammarAccess.getVariableBindingAccess().getNameAssignment_0(), "rule__VariableBinding__NameAssignment_0");
					put(grammarAccess.getVariableBindingAccess().getSetAssignment_2(), "rule__VariableBinding__SetAssignment_2");
					put(grammarAccess.getEFExprAccess().getExprAssignment_2(), "rule__EFExpr__ExprAssignment_2");
					put(grammarAccess.getAFExprAccess().getExprAssignment_2(), "rule__AFExpr__ExprAssignment_2");
					put(grammarAccess.getEGExprAccess().getExprAssignment_2(), "rule__EGExpr__ExprAssignment_2");
					put(grammarAccess.getAGExprAccess().getExprAssignment_2(), "rule__AGExpr__ExprAssignment_2");
					put(grammarAccess.getStateActiveExprAccess().getStateAssignment_2(), "rule__StateActiveExpr__StateAssignment_2");
					put(grammarAccess.getSubstateOfExprAccess().getStateAssignment_2(), "rule__SubstateOfExpr__StateAssignment_2");
					put(grammarAccess.getSubstateOfExprAccess().getSuperstateAssignment_4(), "rule__SubstateOfExpr__SuperstateAssignment_4");
					put(grammarAccess.getStateInStatechartExprAccess().getStateAssignment_2(), "rule__StateInStatechartExpr__StateAssignment_2");
					put(grammarAccess.getStateInStatechartExprAccess().getStatechartAssignment_4(), "rule__StateInStatechartExpr__StatechartAssignment_4");
					put(grammarAccess.getMessageInTransitExprAccess().getMessageAssignment_2(), "rule__MessageInTransitExpr__MessageAssignment_2");
					put(grammarAccess.getMessageInBufferExprAccess().getMessageAssignment_2(), "rule__MessageInBufferExpr__MessageAssignment_2");
					put(grammarAccess.getMessageInBufferExprAccess().getBufferAssignment_4(), "rule__MessageInBufferExpr__BufferAssignment_4");
					put(grammarAccess.getMessageDiscardedExprAccess().getBufferAssignment_2(), "rule__MessageDiscardedExpr__BufferAssignment_2");
					put(grammarAccess.getTransitionFiringExprAccess().getTransitionAssignment_2(), "rule__TransitionFiringExpr__TransitionAssignment_2");
					put(grammarAccess.getComparisonExprAccess().getLhsAssignment_1(), "rule__ComparisonExpr__LhsAssignment_1");
					put(grammarAccess.getComparisonExprAccess().getOpAssignment_2(), "rule__ComparisonExpr__OpAssignment_2");
					put(grammarAccess.getComparisonExprAccess().getRhsAssignment_3(), "rule__ComparisonExpr__RhsAssignment_3");
					put(grammarAccess.getBufferMessageCountExprAccess().getBufferAssignment_2(), "rule__BufferMessageCountExpr__BufferAssignment_2");
					put(grammarAccess.getSourceStateExprAccess().getTransitionAssignment_2(), "rule__SourceStateExpr__TransitionAssignment_2");
					put(grammarAccess.getTargetStateExprAccess().getTransitionAssignment_2(), "rule__TargetStateExpr__TransitionAssignment_2");
					put(grammarAccess.getMumlElemExprAccess().getElemAssignment_0(), "rule__MumlElemExpr__ElemAssignment_0");
					put(grammarAccess.getMumlElemExprAccess().getInstanceAssignment_1_1(), "rule__MumlElemExpr__InstanceAssignment_1_1");
					put(grammarAccess.getConstExprAccess().getValAssignment_0(), "rule__ConstExpr__ValAssignment_0");
					put(grammarAccess.getConstExprAccess().getTimeUnitAssignment_1(), "rule__ConstExpr__TimeUnitAssignment_1");
					put(grammarAccess.getIntervalSetExprAccess().getLowerValAssignment_2(), "rule__IntervalSetExpr__LowerValAssignment_2");
					put(grammarAccess.getIntervalSetExprAccess().getUpperValAssignment_4(), "rule__IntervalSetExpr__UpperValAssignment_4");
					put(grammarAccess.getInstanceSetExprAccess().getTypeAssignment_3(), "rule__InstanceSetExpr__TypeAssignment_3");
					put(grammarAccess.getSubinstanceSetExprAccess().getTypeAssignment_3(), "rule__SubinstanceSetExpr__TypeAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr.internal.InternalMtctlParser typedParser = (org.muml.uppaal.adapter.mtctl.xtext.ui.contentassist.antlr.internal.InternalMtctlParser) parser;
			typedParser.entryRulePropertyRepository();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MtctlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MtctlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
