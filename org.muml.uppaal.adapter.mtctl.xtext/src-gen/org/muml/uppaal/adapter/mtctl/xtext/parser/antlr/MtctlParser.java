/*
 * generated by Xtext
 */
package org.muml.uppaal.adapter.mtctl.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.muml.uppaal.adapter.mtctl.xtext.services.MtctlGrammarAccess;

public class MtctlParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MtctlGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.muml.uppaal.adapter.mtctl.xtext.parser.antlr.internal.InternalMtctlParser createParser(XtextTokenStream stream) {
		return new org.muml.uppaal.adapter.mtctl.xtext.parser.antlr.internal.InternalMtctlParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PropertyRepository";
	}
	
	public MtctlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MtctlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
