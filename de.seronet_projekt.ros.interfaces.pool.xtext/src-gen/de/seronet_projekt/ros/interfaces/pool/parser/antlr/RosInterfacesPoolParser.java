/*
 * generated by Xtext 2.16.0
 */
package de.seronet_projekt.ros.interfaces.pool.parser.antlr;

import com.google.inject.Inject;
import de.seronet_projekt.ros.interfaces.pool.parser.antlr.internal.InternalRosInterfacesPoolParser;
import de.seronet_projekt.ros.interfaces.pool.services.RosInterfacesPoolGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RosInterfacesPoolParser extends AbstractAntlrParser {

	@Inject
	private RosInterfacesPoolGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRosInterfacesPoolParser createParser(XtextTokenStream stream) {
		return new InternalRosInterfacesPoolParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RosInterfacesPool";
	}

	public RosInterfacesPoolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosInterfacesPoolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
