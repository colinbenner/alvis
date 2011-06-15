/*
* generated by Xtext
*/
package org.xtext.example.mydsl2.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl2.services.TestLanguageGrammarAccess;

public class TestLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private TestLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl2.ui.contentassist.antlr.internal.InternalTestLanguageParser createParser() {
		org.xtext.example.mydsl2.ui.contentassist.antlr.internal.InternalTestLanguageParser result = new org.xtext.example.mydsl2.ui.contentassist.antlr.internal.InternalTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getDatatypeAccess().getGroup(), "rule__Datatype__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getModelAccess().getTypesAssignment(), "rule__Model__TypesAssignment");
					put(grammarAccess.getDatatypeAccess().getNameAssignment_1(), "rule__Datatype__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_3(), "rule__Entity__FeaturesAssignment_3");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_0(), "rule__Feature__TypeAssignment_0");
					put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl2.ui.contentassist.antlr.internal.InternalTestLanguageParser typedParser = (org.xtext.example.mydsl2.ui.contentassist.antlr.internal.InternalTestLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}