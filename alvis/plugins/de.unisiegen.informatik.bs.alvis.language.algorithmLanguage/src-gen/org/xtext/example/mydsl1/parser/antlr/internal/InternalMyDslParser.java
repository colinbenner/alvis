package org.xtext.example.mydsl1.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'main'", "','", "'begin'", "'{'", "'end'", "'}'", "'String'", "'Integer'", "'Boolean'", "'Graph'", "'Vertex'", "'Edge'", "'Queue'", "'Stack'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'!'", "'.'", "'['", "']'", "'true'", "'false'", "'null'", "'infty'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_SIGN=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMyDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[100+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, IAstFactory factory, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:83:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:84:2: (iv_ruleModel= ruleModel EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:85:2: iv_ruleModel= ruleModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:92:1: ruleModel returns [EObject current=null] : ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_main_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:97:6: ( ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_functions_0_0= rulefunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_functions_0_0= rulefunctionDefinition )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_functions_0_0= rulefunctionDefinition )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:3: lv_functions_0_0= rulefunctionDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefunctionDefinition_in_ruleModel137);
            	    lv_functions_0_0=rulefunctionDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"functions",
            	      	        		lv_functions_0_0, 
            	      	        		"functionDefinition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:122:3: ( (lv_main_1_0= rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_main_1_0= rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_main_1_0= rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:124:3: lv_main_1_0= rulemainFunction
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulemainFunction_in_ruleModel159);
            lv_main_1_0=rulemainFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"main",
              	        		lv_main_1_0, 
              	        		"mainFunction", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:154:1: entryRulefunctionDefinition returns [EObject current=null] : iv_rulefunctionDefinition= rulefunctionDefinition EOF ;
    public final EObject entryRulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDefinition = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:2: (iv_rulefunctionDefinition= rulefunctionDefinition EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:156:2: iv_rulefunctionDefinition= rulefunctionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition195);
            iv_rulefunctionDefinition=rulefunctionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefunctionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionDefinition205); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulefunctionDefinition


    // $ANTLR start rulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:163:1: rulefunctionDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_returnType_5_0 = null;

        EObject lv_blocks_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:168:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:170:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:170:1: (lv_name_0_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:171:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionDefinition247); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_rulefunctionDefinition262); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:197:1: ( (lv_formalParams_2_0= ruleformalParams ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=21 && LA2_0<=28)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_formalParams_2_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_formalParams_2_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:199:3: lv_formalParams_2_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulefunctionDefinition283);
                    lv_formalParams_2_0=ruleformalParams();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"formalParams",
                      	        		lv_formalParams_2_0, 
                      	        		"formalParams", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulefunctionDefinition294); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:1: ( ':' ( (lv_returnType_5_0= ruletype ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:3: ':' ( (lv_returnType_5_0= ruletype ) )
                    {
                    match(input,14,FOLLOW_14_in_rulefunctionDefinition305); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:229:1: ( (lv_returnType_5_0= ruletype ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_returnType_5_0= ruletype )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_returnType_5_0= ruletype )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:231:3: lv_returnType_5_0= ruletype
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulefunctionDefinition326);
                    lv_returnType_5_0=ruletype();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"returnType",
                      	        		lv_returnType_5_0, 
                      	        		"type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:253:4: ( (lv_blocks_6_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_blocks_6_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_blocks_6_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:255:3: lv_blocks_6_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulefunctionDefinition349);
            lv_blocks_6_0=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"blocks",
              	        		lv_blocks_6_0, 
              	        		"block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulefunctionDefinition


    // $ANTLR start entryRulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:285:1: entryRulemainFunction returns [EObject current=null] : iv_rulemainFunction= rulemainFunction EOF ;
    public final EObject entryRulemainFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemainFunction = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:286:2: (iv_rulemainFunction= rulemainFunction EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:287:2: iv_rulemainFunction= rulemainFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMainFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_entryRulemainFunction385);
            iv_rulemainFunction=rulemainFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemainFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemainFunction395); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulemainFunction


    // $ANTLR start rulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:294:1: rulemainFunction returns [EObject current=null] : ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) ) ;
    public final EObject rulemainFunction() throws RecognitionException {
        EObject current = null;

        Token lv_main_0_0=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_blocks_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:299:6: ( ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:2: ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:2: ( (lv_main_0_0= 'main' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:1: (lv_main_0_0= 'main' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:1: (lv_main_0_0= 'main' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:3: lv_main_0_0= 'main'
            {
            lv_main_0_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_rulemainFunction438); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0(), "main"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "main", lv_main_0_0, "main", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_rulemainFunction461); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:325:1: ( (lv_formalParams_2_0= ruleformalParams ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=21 && LA4_0<=28)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:326:1: (lv_formalParams_2_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:326:1: (lv_formalParams_2_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:327:3: lv_formalParams_2_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulemainFunction482);
                    lv_formalParams_2_0=ruleformalParams();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"formalParams",
                      	        		lv_formalParams_2_0, 
                      	        		"formalParams", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulemainFunction493); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:353:1: ( (lv_blocks_4_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_blocks_4_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_blocks_4_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:355:3: lv_blocks_4_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulemainFunction514);
            lv_blocks_4_0=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"blocks",
              	        		lv_blocks_4_0, 
              	        		"block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulemainFunction


    // $ANTLR start entryRuleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:385:1: entryRuleformalParams returns [EObject current=null] : iv_ruleformalParams= ruleformalParams EOF ;
    public final EObject entryRuleformalParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParams = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:386:2: (iv_ruleformalParams= ruleformalParams EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:387:2: iv_ruleformalParams= ruleformalParams EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalParamsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_entryRuleformalParams550);
            iv_ruleformalParams=ruleformalParams();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleformalParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformalParams560); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleformalParams


    // $ANTLR start ruleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:1: ruleformalParams returns [EObject current=null] : ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) ;
    public final EObject ruleformalParams() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:6: ( ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:2: ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:2: ( (lv_params_0_0= ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:401:1: (lv_params_0_0= ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:401:1: (lv_params_0_0= ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:402:3: lv_params_0_0= ruleparam
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleparam_in_ruleformalParams606);
            lv_params_0_0=ruleparam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalParamsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_0_0, 
              	        		"param", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:2: ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:4: ',' ( (lv_params_2_0= ruleparam ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleformalParams617); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:428:1: ( (lv_params_2_0= ruleparam ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:429:1: (lv_params_2_0= ruleparam )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:429:1: (lv_params_2_0= ruleparam )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:430:3: lv_params_2_0= ruleparam
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparam_in_ruleformalParams638);
            	    lv_params_2_0=ruleparam();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFormalParamsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"params",
            	      	        		lv_params_2_0, 
            	      	        		"param", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleformalParams


    // $ANTLR start entryRuleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:460:1: entryRuleparam returns [EObject current=null] : iv_ruleparam= ruleparam EOF ;
    public final EObject entryRuleparam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:461:2: (iv_ruleparam= ruleparam EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:462:2: iv_ruleparam= ruleparam EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleparam_in_entryRuleparam676);
            iv_ruleparam=ruleparam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleparam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparam686); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleparam


    // $ANTLR start ruleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:469:1: ruleparam returns [EObject current=null] : (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:474:6: ( (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:476:2: this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParamAccess().getTypeParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruletype_in_ruleparam736);
            this_type_0=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_type_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparam752); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParamRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleparam


    // $ANTLR start entryRuleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:519:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:2: (iv_ruleblock= ruleblock EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:2: iv_ruleblock= ruleblock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock793);
            iv_ruleblock=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock803); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleblock


    // $ANTLR start ruleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:528:1: ruleblock returns [EObject current=null] : ( () ( 'begin' | '{' ) ( (lv_statements_3_0= rulestatement ) )* ( 'end' | '}' ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:533:6: ( ( () ( 'begin' | '{' ) ( (lv_statements_3_0= rulestatement ) )* ( 'end' | '}' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:1: ( () ( 'begin' | '{' ) ( (lv_statements_3_0= rulestatement ) )* ( 'end' | '}' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:1: ( () ( 'begin' | '{' ) ( (lv_statements_3_0= rulestatement ) )* ( 'end' | '}' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:2: () ( 'begin' | '{' ) ( (lv_statements_3_0= rulestatement ) )* ( 'end' | '}' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:535:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBlockAccess().getBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBlockAccess().getBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:548:2: ( 'begin' | '{' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("548:2: ( 'begin' | '{' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:548:4: 'begin'
                    {
                    match(input,17,FOLLOW_17_in_ruleblock851); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockAccess().getBeginKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:553:7: '{'
                    {
                    match(input,18,FOLLOW_18_in_ruleblock867); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:557:2: ( (lv_statements_3_0= rulestatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=17 && LA7_0<=18)||(LA7_0>=21 && LA7_0<=30)||LA7_0==32||LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:1: (lv_statements_3_0= rulestatement )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:1: (lv_statements_3_0= rulestatement )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:559:3: lv_statements_3_0= rulestatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleblock889);
            	    lv_statements_3_0=rulestatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"statements",
            	      	        		lv_statements_3_0, 
            	      	        		"statement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:581:3: ( 'end' | '}' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("581:3: ( 'end' | '}' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:581:5: 'end'
                    {
                    match(input,19,FOLLOW_19_in_ruleblock901); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockAccess().getEndKeyword_3_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:586:7: '}'
                    {
                    match(input,20,FOLLOW_20_in_ruleblock917); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleblock


    // $ANTLR start entryRuletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:598:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:599:2: (iv_ruletype= ruletype EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:600:2: iv_ruletype= ruletype EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype954);
            iv_ruletype=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype964); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuletype


    // $ANTLR start ruletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:607:1: ruletype returns [EObject current=null] : ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token lv_types_0_1=null;
        Token lv_types_0_2=null;
        Token lv_types_0_3=null;
        Token lv_types_0_4=null;
        Token lv_types_0_5=null;
        Token lv_types_0_6=null;
        Token lv_types_0_7=null;
        Token lv_types_0_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:6: ( ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:614:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:614:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:615:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:615:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 28:
                {
                alt9=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("615:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' | lv_types_0_7= 'Queue' | lv_types_0_8= 'Stack' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:616:3: lv_types_0_1= 'String'
                    {
                    lv_types_0_1=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruletype1008); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:634:8: lv_types_0_2= 'Integer'
                    {
                    lv_types_0_2=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruletype1037); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:652:8: lv_types_0_3= 'Boolean'
                    {
                    lv_types_0_3=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruletype1066); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:670:8: lv_types_0_4= 'Graph'
                    {
                    lv_types_0_4=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruletype1095); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:688:8: lv_types_0_5= 'Vertex'
                    {
                    lv_types_0_5=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruletype1124); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:706:8: lv_types_0_6= 'Edge'
                    {
                    lv_types_0_6=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruletype1153); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_6, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:724:8: lv_types_0_7= 'Queue'
                    {
                    lv_types_0_7=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruletype1182); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesQueueKeyword_0_6(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_7, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 8 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:742:8: lv_types_0_8= 'Stack'
                    {
                    lv_types_0_8=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruletype1211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesStackKeyword_0_7(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_8, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruletype


    // $ANTLR start entryRulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:771:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:772:2: (iv_rulestatement= rulestatement EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:2: iv_rulestatement= rulestatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1262);
            iv_rulestatement=rulestatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1272); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulestatement


    // $ANTLR start rulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:780:1: rulestatement returns [EObject current=null] : ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_postFixExpression_1_0 = null;

        EObject this_declaration_3 = null;

        EObject lv_assignments_6_0 = null;

        EObject lv_exprs_10_0 = null;

        EObject this_expr_13 = null;

        EObject lv_statements_15_0 = null;

        EObject lv_statements_17_0 = null;

        EObject this_param_19 = null;

        EObject lv_exprs_21_0 = null;

        EObject lv_statements_23_0 = null;

        EObject this_expr_25 = null;

        EObject lv_statements_27_0 = null;

        EObject this_block_28 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:785:6: ( ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )
            int alt12=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred16()) ) {
                    alt12=1;
                }
                else if ( (synpred18()) ) {
                    alt12=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("786:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 32:
                {
                alt12=6;
                }
                break;
            case 34:
                {
                alt12=7;
                }
                break;
            case 17:
            case 18:
                {
                alt12=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("786:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:2: ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:2: ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:3: () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:3: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:787:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:800:2: ( (lv_postFixExpression_1_0= rulepostfixExpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:1: (lv_postFixExpression_1_0= rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:1: (lv_postFixExpression_1_0= rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:802:3: lv_postFixExpression_1_0= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rulestatement1331);
                    lv_postFixExpression_1_0=rulepostfixExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"postFixExpression",
                      	        		lv_postFixExpression_1_0, 
                      	        		"postfixExpr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1350);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:836:6: (this_declaration_3= ruledeclaration ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:836:6: (this_declaration_3= ruledeclaration ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:837:2: this_declaration_3= ruledeclaration ruleendExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_rulestatement1382);
                    this_declaration_3=ruledeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_declaration_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1400);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:6: ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:6: ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:7: () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:861:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:874:2: ( (lv_assignments_6_0= ruleassignment ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:875:1: (lv_assignments_6_0= ruleassignment )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:875:1: (lv_assignments_6_0= ruleassignment )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:876:3: lv_assignments_6_0= ruleassignment
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_in_rulestatement1440);
                    lv_assignments_6_0=ruleassignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"assignments",
                      	        		lv_assignments_6_0, 
                      	        		"assignment", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1459);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:910:6: ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:910:6: ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:910:7: () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:910:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:911:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,29,FOLLOW_29_in_rulestatement1488); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:928:1: ( (lv_exprs_10_0= ruleexpr ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID||(LA10_0>=RULE_INT && LA10_0<=RULE_STRING)||LA10_0==12||LA10_0==48||(LA10_0>=52 && LA10_0<=55)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:929:1: (lv_exprs_10_0= ruleexpr )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:929:1: (lv_exprs_10_0= ruleexpr )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:930:3: lv_exprs_10_0= ruleexpr
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_3_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpr_in_rulestatement1509);
                            lv_exprs_10_0=ruleexpr();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"exprs",
                              	        		lv_exprs_10_0, 
                              	        		"expr", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1529);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:964:6: ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:964:6: ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:964:8: 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    {
                    match(input,30,FOLLOW_30_in_rulestatement1546); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getIfKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1571);
                    this_expr_13=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_13; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1580); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_4_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:984:1: ( (lv_statements_15_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:1: (lv_statements_15_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:1: (lv_statements_15_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:986:3: lv_statements_15_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1601);
                    lv_statements_15_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_15_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:2: ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==31) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred21()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:4: 'else' ( (lv_statements_17_0= rulestatement ) )
                            {
                            match(input,31,FOLLOW_31_in_rulestatement1612); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStatementAccess().getElseKeyword_4_4_0(), null); 
                                  
                            }
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: ( (lv_statements_17_0= rulestatement ) )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_statements_17_0= rulestatement )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_statements_17_0= rulestatement )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1014:3: lv_statements_17_0= rulestatement
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_rulestatement_in_rulestatement1633);
                            lv_statements_17_0=rulestatement();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"statements",
                              	        		lv_statements_17_0, 
                              	        		"statement", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1037:6: ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1037:6: ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1037:8: 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) )
                    {
                    match(input,32,FOLLOW_32_in_rulestatement1653); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getForKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleparam_in_rulestatement1678);
                    this_param_19=ruleparam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_param_19; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,33,FOLLOW_33_in_rulestatement1687); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getInKeyword_5_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1057:1: ( (lv_exprs_21_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1058:1: (lv_exprs_21_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1058:1: (lv_exprs_21_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1059:3: lv_exprs_21_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_5_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1708);
                    lv_exprs_21_0=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"exprs",
                      	        		lv_exprs_21_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,14,FOLLOW_14_in_rulestatement1718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_5_4(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:1: ( (lv_statements_23_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1086:1: (lv_statements_23_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1086:1: (lv_statements_23_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1087:3: lv_statements_23_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1739);
                    lv_statements_23_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_23_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:6: ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:6: ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:8: 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) )
                    {
                    match(input,34,FOLLOW_34_in_rulestatement1757); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getWhileKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1782);
                    this_expr_25=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_25; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1791); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_6_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1130:1: ( (lv_statements_27_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1131:1: (lv_statements_27_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1131:1: (lv_statements_27_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1132:3: lv_statements_27_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1812);
                    lv_statements_27_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_27_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1156:2: this_block_28= ruleblock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleblock_in_rulestatement1844);
                    this_block_28=ruleblock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_block_28; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulestatement


    // $ANTLR start entryRuledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1175:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1176:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1177:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration1879);
            iv_ruledeclaration=ruledeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration1889); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuledeclaration


    // $ANTLR start ruledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1184:1: ruledeclaration returns [EObject current=null] : ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_variableType_0_0 = null;

        EObject lv_exprs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1189:6: ( ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=21 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:3: ( (lv_variableType_0_0= ruletype ) ) ( '[]' )?
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:3: ( (lv_variableType_0_0= ruletype ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_variableType_0_0= ruletype )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_variableType_0_0= ruletype )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1192:3: lv_variableType_0_0= ruletype
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_in_ruledeclaration1936);
            	    lv_variableType_0_0=ruletype();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variableType",
            	      	        		lv_variableType_0_0, 
            	      	        		"type", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:2: ( '[]' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==35) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:4: '[]'
            	            {
            	            match(input,35,FOLLOW_35_in_ruledeclaration1947); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1218:5: ( (lv_name_2_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1219:1: (lv_name_2_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledeclaration1968); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1242:2: ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1242:4: '=' ( (lv_exprs_4_0= ruleexpr ) )
                    {
                    match(input,36,FOLLOW_36_in_ruledeclaration1984); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1246:1: ( (lv_exprs_4_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1247:1: (lv_exprs_4_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1247:1: (lv_exprs_4_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1248:3: lv_exprs_4_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruledeclaration2005);
                    lv_exprs_4_0=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"exprs",
                      	        		lv_exprs_4_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruledeclaration


    // $ANTLR start entryRuleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1278:1: entryRuleassignment returns [EObject current=null] : iv_ruleassignment= ruleassignment EOF ;
    public final EObject entryRuleassignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1279:2: (iv_ruleassignment= ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1280:2: iv_ruleassignment= ruleassignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment2043);
            iv_ruleassignment=ruleassignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment2053); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleassignment


    // $ANTLR start ruleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1287:1: ruleassignment returns [EObject current=null] : (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) ;
    public final EObject ruleassignment() throws RecognitionException {
        EObject current = null;

        EObject this_postfixExpr_0 = null;

        EObject lv_exprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:6: ( (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1293:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1293:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1294:2: this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_ruleassignment2103);
            this_postfixExpr_0=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_postfixExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            match(input,36,FOLLOW_36_in_ruleassignment2112); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1309:1: ( (lv_exprs_2_0= ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1310:1: (lv_exprs_2_0= ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1310:1: (lv_exprs_2_0= ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:3: lv_exprs_2_0= ruleexpr
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleexpr_in_ruleassignment2133);
            lv_exprs_2_0=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"exprs",
              	        		lv_exprs_2_0, 
              	        		"expr", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleassignment


    // $ANTLR start entryRuleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1341:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:2: (iv_ruleexpr= ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1343:2: iv_ruleexpr= ruleexpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2169);
            iv_ruleexpr=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2179); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleexpr


    // $ANTLR start ruleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1350:1: ruleexpr returns [EObject current=null] : (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject this_andExpr_0 = null;

        EObject lv_andExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1355:6: ( (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1356:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1356:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1357:2: this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2229);
            this_andExpr_0=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_andExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1368:1: ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1368:3: '||' ( (lv_andExprs_2_0= ruleandExpr ) )
            	    {
            	    match(input,37,FOLLOW_37_in_ruleexpr2239); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1372:1: ( (lv_andExprs_2_0= ruleandExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_andExprs_2_0= ruleandExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_andExprs_2_0= ruleandExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1374:3: lv_andExprs_2_0= ruleandExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2260);
            	    lv_andExprs_2_0=ruleandExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"andExprs",
            	      	        		lv_andExprs_2_0, 
            	      	        		"andExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleexpr


    // $ANTLR start entryRuleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1404:1: entryRuleandExpr returns [EObject current=null] : iv_ruleandExpr= ruleandExpr EOF ;
    public final EObject entryRuleandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1405:2: (iv_ruleandExpr= ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1406:2: iv_ruleandExpr= ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr2298);
            iv_ruleandExpr=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleandExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr2308); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleandExpr


    // $ANTLR start ruleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1413:1: ruleandExpr returns [EObject current=null] : (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) ;
    public final EObject ruleandExpr() throws RecognitionException {
        EObject current = null;

        EObject this_eqExpr_0 = null;

        EObject lv_eqExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1418:6: ( (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1419:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1419:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1420:2: this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2358);
            this_eqExpr_0=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_eqExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1431:1: ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1431:3: '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    {
            	    match(input,38,FOLLOW_38_in_ruleandExpr2368); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1435:1: ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1436:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1436:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1437:3: lv_eqExprs_2_0= ruleeqExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2389);
            	    lv_eqExprs_2_0=ruleeqExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"eqExprs",
            	      	        		lv_eqExprs_2_0, 
            	      	        		"eqExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleandExpr


    // $ANTLR start entryRuleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1467:1: entryRuleeqExpr returns [EObject current=null] : iv_ruleeqExpr= ruleeqExpr EOF ;
    public final EObject entryRuleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeqExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1468:2: (iv_ruleeqExpr= ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1469:2: iv_ruleeqExpr= ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEqExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr2427);
            iv_ruleeqExpr=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleeqExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr2437); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleeqExpr


    // $ANTLR start ruleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1476:1: ruleeqExpr returns [EObject current=null] : (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) ;
    public final EObject ruleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject this_relExpr_0 = null;

        EObject lv_relExprs_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1481:6: ( (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1482:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1482:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1483:2: this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2487);
            this_relExpr_0=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_relExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1494:1: ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=39 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1494:2: ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1494:2: ( '==' | '!=' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==39) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==40) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1494:2: ( '==' | '!=' )", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1494:4: '=='
            	            {
            	            match(input,39,FOLLOW_39_in_ruleeqExpr2498); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1499:7: '!='
            	            {
            	            match(input,40,FOLLOW_40_in_ruleeqExpr2514); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1503:2: ( (lv_relExprs_3_0= rulerelExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1504:1: (lv_relExprs_3_0= rulerelExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1504:1: (lv_relExprs_3_0= rulerelExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1505:3: lv_relExprs_3_0= rulerelExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2536);
            	    lv_relExprs_3_0=rulerelExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEqExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"relExprs",
            	      	        		lv_relExprs_3_0, 
            	      	        		"relExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleeqExpr


    // $ANTLR start entryRulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1535:1: entryRulerelExpr returns [EObject current=null] : iv_rulerelExpr= rulerelExpr EOF ;
    public final EObject entryRulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1536:2: (iv_rulerelExpr= rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1537:2: iv_rulerelExpr= rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr2574);
            iv_rulerelExpr=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr2584); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerelExpr


    // $ANTLR start rulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1544:1: rulerelExpr returns [EObject current=null] : (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) ;
    public final EObject rulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject this_addExpr_0 = null;

        EObject lv_addExpr_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1549:6: ( (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1550:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1550:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1551:2: this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2634);
            this_addExpr_0=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_addExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1562:1: ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=41 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1562:2: ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1562:2: ( '<' | '>' | '<=' | '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1562:2: ( '<' | '>' | '<=' | '>=' )", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1562:4: '<'
            	            {
            	            match(input,41,FOLLOW_41_in_rulerelExpr2645); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1567:7: '>'
            	            {
            	            match(input,42,FOLLOW_42_in_rulerelExpr2661); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1572:7: '<='
            	            {
            	            match(input,43,FOLLOW_43_in_rulerelExpr2677); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1577:7: '>='
            	            {
            	            match(input,44,FOLLOW_44_in_rulerelExpr2693); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1581:2: ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1582:1: (lv_addExpr_5_0= ruleaddExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1582:1: (lv_addExpr_5_0= ruleaddExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1583:3: lv_addExpr_5_0= ruleaddExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2715);
            	    lv_addExpr_5_0=ruleaddExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRelExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"addExpr",
            	      	        		lv_addExpr_5_0, 
            	      	        		"addExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerelExpr


    // $ANTLR start entryRuleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1613:1: entryRuleaddExpr returns [EObject current=null] : iv_ruleaddExpr= ruleaddExpr EOF ;
    public final EObject entryRuleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaddExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1614:2: (iv_ruleaddExpr= ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1615:2: iv_ruleaddExpr= ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr2753);
            iv_ruleaddExpr=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleaddExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr2763); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleaddExpr


    // $ANTLR start ruleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1622:1: ruleaddExpr returns [EObject current=null] : (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) ;
    public final EObject ruleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject this_mulExpr_0 = null;

        EObject lv_mulExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1627:6: ( (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1628:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1628:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1629:2: this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2813);
            this_mulExpr_0=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_mulExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1640:1: ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SIGN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1640:2: RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    {
            	    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleaddExpr2822); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1644:1: ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:1: (lv_mulExprs_2_0= rulemulExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:1: (lv_mulExprs_2_0= rulemulExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:3: lv_mulExprs_2_0= rulemulExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2842);
            	    lv_mulExprs_2_0=rulemulExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"mulExprs",
            	      	        		lv_mulExprs_2_0, 
            	      	        		"mulExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleaddExpr


    // $ANTLR start entryRulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1676:1: entryRulemulExpr returns [EObject current=null] : iv_rulemulExpr= rulemulExpr EOF ;
    public final EObject entryRulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemulExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1677:2: (iv_rulemulExpr= rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1678:2: iv_rulemulExpr= rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr2880);
            iv_rulemulExpr=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemulExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr2890); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulemulExpr


    // $ANTLR start rulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1685:1: rulemulExpr returns [EObject current=null] : ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) ;
    public final EObject rulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_atoms_0_0 = null;

        EObject lv_atoms_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1690:6: ( ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1691:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1691:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1691:2: ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1691:2: ( (lv_atoms_0_0= ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_atoms_0_0= ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_atoms_0_0= ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1693:3: lv_atoms_0_0= ruleatom
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleatom_in_rulemulExpr2936);
            lv_atoms_0_0=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMulExprRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"atoms",
              	        		lv_atoms_0_0, 
              	        		"atom", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:2: ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=45 && LA24_0<=47)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:3: ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:3: ( '*' | '/' | '%' )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1715:3: ( '*' | '/' | '%' )", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:5: '*'
            	            {
            	            match(input,45,FOLLOW_45_in_rulemulExpr2948); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1720:7: '/'
            	            {
            	            match(input,46,FOLLOW_46_in_rulemulExpr2964); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1725:7: '%'
            	            {
            	            match(input,47,FOLLOW_47_in_rulemulExpr2980); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1729:2: ( (lv_atoms_4_0= ruleatom ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:1: (lv_atoms_4_0= ruleatom )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:1: (lv_atoms_4_0= ruleatom )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1731:3: lv_atoms_4_0= ruleatom
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleatom_in_rulemulExpr3002);
            	    lv_atoms_4_0=ruleatom();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMulExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"atoms",
            	      	        		lv_atoms_4_0, 
            	      	        		"atom", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulemulExpr


    // $ANTLR start entryRuleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1761:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1762:2: (iv_ruleatom= ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1763:2: iv_ruleatom= ruleatom EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom3040);
            iv_ruleatom=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom3050); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleatom


    // $ANTLR start ruleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1770:1: ruleatom returns [EObject current=null] : ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        EObject this_atom_1 = null;

        EObject this_expr_4 = null;

        EObject this_expr_7 = null;

        EObject this_postfixExpr_9 = null;

        EObject lv_constants_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1775:6: ( ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1776:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1776:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 12:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_SIGN) ) {
                    alt25=2;
                }
                else if ( (LA25_2==RULE_ID||(LA25_2>=RULE_INT && LA25_2<=RULE_STRING)||LA25_2==12||LA25_2==48||(LA25_2>=52 && LA25_2<=55)) ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1776:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt25=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1776:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1776:2: ( '!' this_atom_1= ruleatom )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1776:2: ( '!' this_atom_1= ruleatom )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1776:4: '!' this_atom_1= ruleatom
                    {
                    match(input,48,FOLLOW_48_in_ruleatom3086); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleatom_in_ruleatom3111);
                    this_atom_1=ruleatom();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_atom_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1793:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1793:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1793:8: '(' RULE_SIGN this_expr_4= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3128); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleatom3137); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3161);
                    this_expr_4=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3170); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1818:6: ( '(' this_expr_7= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1818:6: ( '(' this_expr_7= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1818:8: '(' this_expr_7= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3188); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3213);
                    this_expr_7=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_7; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3222); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1840:2: this_postfixExpr_9= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_ruleatom3254);
                    this_postfixExpr_9=rulepostfixExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_postfixExpr_9; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1852:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1852:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1852:7: () ( (lv_constants_11_0= ruleconstant ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1852:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1853:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAtomAccess().getAtomAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAtomAccess().getAtomAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1866:2: ( (lv_constants_11_0= ruleconstant ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:1: (lv_constants_11_0= ruleconstant )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:1: (lv_constants_11_0= ruleconstant )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1868:3: lv_constants_11_0= ruleconstant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_in_ruleatom3293);
                    lv_constants_11_0=ruleconstant();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"constants",
                      	        		lv_constants_11_0, 
                      	        		"constant", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleatom


    // $ANTLR start entryRulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1898:1: entryRulepostfixExpr returns [EObject current=null] : iv_rulepostfixExpr= rulepostfixExpr EOF ;
    public final EObject entryRulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepostfixExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1899:2: (iv_rulepostfixExpr= rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1900:2: iv_rulepostfixExpr= rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostfixExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3330);
            iv_rulepostfixExpr=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulepostfixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr3340); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulepostfixExpr


    // $ANTLR start rulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1907:1: rulepostfixExpr returns [EObject current=null] : ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) ;
    public final EObject rulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_6_0 = null;

        EObject lv_expressions_8_0 = null;

        EObject lv_expressions_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1912:6: ( ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:1: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:1: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt26=1;
                }
                else if ( (synpred45()) ) {
                    alt26=2;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1913:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1913:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:3: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:3: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1914:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1914:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1915:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3388); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_0_0_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:6: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:6: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1932:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1932:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1933:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3416); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_0_1_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1949:6: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1949:6: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1950:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1950:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3444); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionCrossReference_0_2_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1966:3: ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case 49:
                    {
                    alt29=1;
                    }
                    break;
                case 12:
                    {
                    alt29=2;
                    }
                    break;
                case 50:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1966:4: ( '.' RULE_ID )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1966:4: ( '.' RULE_ID )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1966:6: '.' RULE_ID
            	    {
            	    match(input,49,FOLLOW_49_in_rulepostfixExpr3457); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0(), null); 
            	          
            	    }
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3466); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1975:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1975:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1975:8: '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')'
            	    {
            	    match(input,12,FOLLOW_12_in_rulepostfixExpr3483); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1979:1: ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_ID||(LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==12||LA28_0==48||(LA28_0>=52 && LA28_0<=55)) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1979:2: ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1979:2: ( (lv_expressions_6_0= ruleexpr ) )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_expressions_6_0= ruleexpr )
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1980:1: (lv_expressions_6_0= ruleexpr )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1981:3: lv_expressions_6_0= ruleexpr
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3505);
            	            lv_expressions_6_0=ruleexpr();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"expressions",
            	              	        		lv_expressions_6_0, 
            	              	        		"expr", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2003:2: ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==16) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2003:4: ',' ( (lv_expressions_8_0= ruleexpr ) )
            	            	    {
            	            	    match(input,16,FOLLOW_16_in_rulepostfixExpr3516); if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	              createLeafNode(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0(), null); 
            	            	          
            	            	    }
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2007:1: ( (lv_expressions_8_0= ruleexpr ) )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2008:1: (lv_expressions_8_0= ruleexpr )
            	            	    {
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2008:1: (lv_expressions_8_0= ruleexpr )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2009:3: lv_expressions_8_0= ruleexpr
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3537);
            	            	    lv_expressions_8_0=ruleexpr();
            	            	    _fsp--;
            	            	    if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	      	        }
            	            	      	        try {
            	            	      	       		add(
            	            	      	       			current, 
            	            	      	       			"expressions",
            	            	      	        		lv_expressions_8_0, 
            	            	      	        		"expr", 
            	            	      	        		currentNode);
            	            	      	        } catch (ValueConverterException vce) {
            	            	      				handleValueConverterException(vce);
            	            	      	        }
            	            	      	        currentNode = currentNode.getParent();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop27;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    match(input,13,FOLLOW_13_in_rulepostfixExpr3551); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2036:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2036:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2036:8: '[' ( (lv_expressions_11_0= ruleexpr ) ) ']'
            	    {
            	    match(input,50,FOLLOW_50_in_rulepostfixExpr3569); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2040:1: ( (lv_expressions_11_0= ruleexpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_expressions_11_0= ruleexpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2041:1: (lv_expressions_11_0= ruleexpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2042:3: lv_expressions_11_0= ruleexpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3590);
            	    lv_expressions_11_0=ruleexpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_11_0, 
            	      	        		"expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    match(input,51,FOLLOW_51_in_rulepostfixExpr3600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulepostfixExpr


    // $ANTLR start entryRuleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2076:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2077:2: (iv_ruleconstant= ruleconstant EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2078:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant3639);
            iv_ruleconstant=ruleconstant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant3649); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleconstant


    // $ANTLR start ruleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2085:1: ruleconstant returns [EObject current=null] : ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_Integer_5_0=null;
        Token lv_String_6_0=null;
        Token lv_Null_7_0=null;
        Token lv_Infinity_8_0=null;
        EObject lv_Float_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2090:6: ( ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt30=1;
                }
                break;
            case 53:
                {
                alt30=2;
                }
                break;
            case RULE_INT:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==49) ) {
                    alt30=3;
                }
                else if ( (LA30_3==EOF||LA30_3==RULE_SIGN||(LA30_3>=13 && LA30_3<=14)||LA30_3==16||(LA30_3>=37 && LA30_3<=47)||LA30_3==51||LA30_3==56) ) {
                    alt30=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2091:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 54:
                {
                alt30=6;
                }
                break;
            case 55:
                {
                alt30=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2091:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:2: ( () 'true' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:2: ( () 'true' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:3: () 'true'
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2091:3: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2092:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,52,FOLLOW_52_in_ruleconstant3697); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getTrueKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:6: ( () 'false' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:6: ( () 'false' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:7: () 'false'
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2111:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,53,FOLLOW_53_in_ruleconstant3727); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getFalseKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2129:6: ( (lv_Float_4_0= ruleFLOAT ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2129:6: ( (lv_Float_4_0= ruleFLOAT ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2130:1: (lv_Float_4_0= ruleFLOAT )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2130:1: (lv_Float_4_0= ruleFLOAT )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2131:3: lv_Float_4_0= ruleFLOAT
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getFloatFLOATParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleconstant3755);
                    lv_Float_4_0=ruleFLOAT();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"Float",
                      	        		lv_Float_4_0, 
                      	        		"FLOAT", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2154:6: ( (lv_Integer_5_0= RULE_INT ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2154:6: ( (lv_Integer_5_0= RULE_INT ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2155:1: (lv_Integer_5_0= RULE_INT )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2155:1: (lv_Integer_5_0= RULE_INT )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2156:3: lv_Integer_5_0= RULE_INT
                    {
                    lv_Integer_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleconstant3778); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0(), "Integer"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"Integer",
                      	        		lv_Integer_5_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2179:6: ( (lv_String_6_0= RULE_STRING ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2179:6: ( (lv_String_6_0= RULE_STRING ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2180:1: (lv_String_6_0= RULE_STRING )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2180:1: (lv_String_6_0= RULE_STRING )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2181:3: lv_String_6_0= RULE_STRING
                    {
                    lv_String_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant3806); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0(), "String"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"String",
                      	        		lv_String_6_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2204:6: ( (lv_Null_7_0= 'null' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2204:6: ( (lv_Null_7_0= 'null' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2205:1: (lv_Null_7_0= 'null' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2205:1: (lv_Null_7_0= 'null' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2206:3: lv_Null_7_0= 'null'
                    {
                    lv_Null_7_0=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleconstant3835); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getNullNullKeyword_5_0(), "Null"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Null", lv_Null_7_0, "null", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2226:6: ( (lv_Infinity_8_0= 'infty' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2226:6: ( (lv_Infinity_8_0= 'infty' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2227:1: (lv_Infinity_8_0= 'infty' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2227:1: (lv_Infinity_8_0= 'infty' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2228:3: lv_Infinity_8_0= 'infty'
                    {
                    lv_Infinity_8_0=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleconstant3872); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0(), "Infinity"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Infinity", lv_Infinity_8_0, "infty", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleconstant


    // $ANTLR start entryRuleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2255:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2256:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2257:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFLOATRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT3921);
            iv_ruleFLOAT=ruleFLOAT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFLOAT; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT3931); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFLOAT


    // $ANTLR start ruleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2264:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_FLOAT_0_0=null;
        Token lv_FLOAT_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2269:6: ( ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2270:1: ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2270:1: ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2270:2: ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2270:2: ( (lv_FLOAT_0_0= RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2271:1: (lv_FLOAT_0_0= RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2271:1: (lv_FLOAT_0_0= RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2272:3: lv_FLOAT_0_0= RULE_INT
            {
            lv_FLOAT_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT3973); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_0_0(), "FLOAT"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFLOATRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"FLOAT",
              	        		lv_FLOAT_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,49,FOLLOW_49_in_ruleFLOAT3988); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFLOATAccess().getFullStopKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2298:1: ( (lv_FLOAT_2_0= RULE_INT ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_INT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2299:1: (lv_FLOAT_2_0= RULE_INT )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2299:1: (lv_FLOAT_2_0= RULE_INT )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2300:3: lv_FLOAT_2_0= RULE_INT
            	    {
            	    lv_FLOAT_2_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT4005); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_2_0(), "FLOAT"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFLOATRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"FLOAT",
            	      	        		lv_FLOAT_2_0, 
            	      	        		"INT", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFLOAT


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2330:1: entryRuleendExpr returns [String current=null] : iv_ruleendExpr= ruleendExpr EOF ;
    public final String entryRuleendExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2331:2: (iv_ruleendExpr= ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2332:2: iv_ruleendExpr= ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr4048);
            iv_ruleendExpr=ruleendExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleendExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr4059); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleendExpr


    // $ANTLR start ruleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2339:1: ruleendExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleendExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2344:6: ( (kw= ',' | kw= ';' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2345:1: (kw= ',' | kw= ';' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2345:1: (kw= ',' | kw= ';' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            else if ( (LA32_0==56) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2345:1: (kw= ',' | kw= ';' )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2346:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleendExpr4097); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getCommaKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2353:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleendExpr4116); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getSemicolonKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleendExpr

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:2: ( ( () ( ( rulepostfixExpr ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:2: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:2: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:3: () ( ( rulepostfixExpr ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:786:3: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:787:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:800:2: ( ( rulepostfixExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:1: ( rulepostfixExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:1: ( rulepostfixExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:802:3: rulepostfixExpr
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulepostfixExpr_in_synpred161331);
        rulepostfixExpr();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred161350);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:6: ( ( () ( ( ruleassignment ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:7: () ( ( ruleassignment ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:861:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:874:2: ( ( ruleassignment ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:875:1: ( ruleassignment )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:875:1: ( ruleassignment )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:876:3: ruleassignment
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_in_synpred181440);
        ruleassignment();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred181459);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:4: ( 'else' ( ( rulestatement ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:4: 'else' ( ( rulestatement ) )
        {
        match(input,31,FOLLOW_31_in_synpred211612); if (failed) return ;
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: ( ( rulestatement ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:1: ( rulestatement )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:1: ( rulestatement )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1014:3: rulestatement
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred211633);
        rulestatement();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:3: ( ( ( RULE_ID ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:3: ( ( RULE_ID ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1913:3: ( ( RULE_ID ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1914:1: ( RULE_ID )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1914:1: ( RULE_ID )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1915:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred443388); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:6: ( ( ( RULE_ID ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:6: ( ( RULE_ID ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:6: ( ( RULE_ID ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1932:1: ( RULE_ID )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1932:1: ( RULE_ID )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1933:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred453416); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred45

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_ruleModel137 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulemainFunction_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionDefinition247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulefunctionDefinition262 = new BitSet(new long[]{0x000000001FE02000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulefunctionDefinition283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulefunctionDefinition294 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_14_in_rulefunctionDefinition305 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_ruletype_in_rulefunctionDefinition326 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunctionDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_entryRulemainFunction385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemainFunction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulemainFunction438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulemainFunction461 = new BitSet(new long[]{0x000000001FE02000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulemainFunction482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulemainFunction493 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleblock_in_rulemainFunction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_entryRuleformalParams550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformalParams560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams606 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleformalParams617 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams638 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleparam_in_entryRuleparam676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparam686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparam736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparam752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleblock851 = new BitSet(new long[]{0x000000057FFE0010L});
    public static final BitSet FOLLOW_18_in_ruleblock867 = new BitSet(new long[]{0x000000057FFE0010L});
    public static final BitSet FOLLOW_rulestatement_in_ruleblock889 = new BitSet(new long[]{0x000000057FFE0010L});
    public static final BitSet FOLLOW_19_in_ruleblock901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleblock917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruletype1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruletype1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruletype1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruletype1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruletype1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruletype1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruletype1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rulestatement1331 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rulestatement1382 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rulestatement1440 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulestatement1488 = new BitSet(new long[]{0x01F10000000110D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1509 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulestatement1546 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1571 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1580 = new BitSet(new long[]{0x000000057FE60010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1601 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulestatement1612 = new BitSet(new long[]{0x000000057FE60010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulestatement1653 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_ruleparam_in_rulestatement1678 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulestatement1687 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1718 = new BitSet(new long[]{0x000000057FE60010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulestatement1757 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1791 = new BitSet(new long[]{0x000000057FE60010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rulestatement1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration1879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruledeclaration1936 = new BitSet(new long[]{0x000000081FE00010L});
    public static final BitSet FOLLOW_35_in_ruledeclaration1947 = new BitSet(new long[]{0x000000001FE00010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledeclaration1968 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruledeclaration1984 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruledeclaration2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleassignment2103 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleassignment2112 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleassignment2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2229 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleexpr2239 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2260 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr2298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2358 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleandExpr2368 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2389 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2487 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleeqExpr2498 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_40_in_ruleeqExpr2514 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2536 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr2574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2634 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_rulerelExpr2645 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_42_in_rulerelExpr2661 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_43_in_rulerelExpr2677 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_44_in_rulerelExpr2693 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2715 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr2753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2813 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleaddExpr2822 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2842 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2936 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_rulemulExpr2948 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_46_in_rulemulExpr2964 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_47_in_rulemulExpr2980 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr3002 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom3040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleatom3086 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_ruleatom3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleatom3137 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3188 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleatom3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleatom3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3388 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3416 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3444 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_49_in_rulepostfixExpr3457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3466 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_12_in_rulepostfixExpr3483 = new BitSet(new long[]{0x00F10000000030D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3505 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_rulepostfixExpr3516 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3537 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulepostfixExpr3551 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_50_in_rulepostfixExpr3569 = new BitSet(new long[]{0x00F10000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3590 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulepostfixExpr3600 = new BitSet(new long[]{0x0006000000001002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant3639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleconstant3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleconstant3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleconstant3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleconstant3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleconstant3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleconstant3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT3973 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleFLOAT3988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT4005 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleendExpr4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleendExpr4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_synpred161331 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred161350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_synpred181440 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred181459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred211612 = new BitSet(new long[]{0x000000057FE60010L});
    public static final BitSet FOLLOW_rulestatement_in_synpred211633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred443388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred453416 = new BitSet(new long[]{0x0000000000000002L});

}