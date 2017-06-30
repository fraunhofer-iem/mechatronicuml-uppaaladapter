/*
 * generated by Xtext
 */
package org.muml.uppaal.adapter.mtctl.xtext.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class MtctlFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		org.muml.uppaal.adapter.mtctl.xtext.services.MtctlGrammarAccess f = (org.muml.uppaal.adapter.mtctl.xtext.services.MtctlGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(500);
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("[", "]")) { //get rid of excess spaces
			c.setNoSpace().before(pair.getSecond());
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getFirst());			
		}
		
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("<", ">")) { //get rid of excess spaces
			c.setNoSpace().before(pair.getSecond());
			c.setNoSpace().before(pair.getFirst());
			c.setNoSpace().after(pair.getFirst());
		}
		
		for (Keyword comma : f.findKeywords(",")) //excess spaces
			c.setNoSpace().before(comma);
		
		for (Pair<Keyword, Keyword> parentheses : f.findKeywordPairs("(",")")) { //excess spaces in parentheses (want: " (a, b) ")
			c.setNoSpace().after(parentheses.getFirst());
			c.setNoSpace().before(parentheses.getSecond());
		}
		
		for (Keyword keyword : f.findKeywords("bufferMessageCount", "transitionFiring", "messageDiscarded", "messageInBuffer", "messageInTransit", "stateInStatechart", "substateOf", "stateActive", "stateEntering", "stateExiting", "forall", "exists")) //remove excess space between keywords and their expected parenthesis
			c.setNoSpace().after(keyword);
		
		for(Keyword semicolon: f.findKeywords(";")) { //do newlines after ';'
			c.setNoLinewrap().before(semicolon);
			c.setNoSpace().before(semicolon);
			c.setLinewrap().after(semicolon);
		}
		
		//for (pair : findKeywordPairs(';', '//'))
		//	c.setNoLinewrap().after(pair.first);
		for (RuleCall comment : f.findRuleCalls(f.getSL_COMMENTRule())) {
			c.setNoLinewrap().before(comment);
			c.setLinewrap().after(comment);
		}
		
		/*c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)*/
	}
}
