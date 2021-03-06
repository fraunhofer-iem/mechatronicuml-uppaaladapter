package org.muml.uppaal.adapter.mtctl.xtext.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.muml.uppaal.adapter.mtctl.xtext.services.MtctlGrammarAccess;

@SuppressWarnings("all")
public class InternalMtctlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_QNAME", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'leadsTo'", "'implies'", "'or'", "'and'", "'not'", "'forall'", "'('", "')'", "'exists'", "':'", "'EF'", "'E<>'", "'AF'", "'A<>'", "'EG'", "'E[]'", "'AG'", "'A[]'", "'deadlock'", "'connectorOverflow'", "'true'", "'false'", "'stateActive'", "'substateOf'", "','", "'stateInStatechart'", "'messageInTransit'", "'messageInBuffer'", "'messageDiscarded'", "'transitionFiring'", "'bufferMessageCount'", "'sourceState'", "'targetState'", "'['", "']'", "'days'", "'hrs'", "'mins'", "'secs'", "'msecs'", "'\\u00C2\\u00B5secs'", "'nsecs'", "'States'", "'Transitions'", "'MessageTypes'", "'Clocks'", "'Buffers'", "'Instances'", "'<'", "'>'", "'Subinstances'", "'-'", "'=='", "'>='", "'<='", "'!='"
    };
    public static final int T__50=50;
    public static final int RULE_QNAME=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMtctlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMtctlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMtctlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMtctl.g"; }



     	private MtctlGrammarAccess grammarAccess;
     	
        public InternalMtctlParser(TokenStream input, MtctlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PropertyRepository";	
       	}
       	
       	@Override
       	protected MtctlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePropertyRepository"
    // InternalMtctl.g:68:1: entryRulePropertyRepository returns [EObject current=null] : iv_rulePropertyRepository= rulePropertyRepository EOF ;
    public final EObject entryRulePropertyRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRepository = null;


        try {
            // InternalMtctl.g:69:2: (iv_rulePropertyRepository= rulePropertyRepository EOF )
            // InternalMtctl.g:70:2: iv_rulePropertyRepository= rulePropertyRepository EOF
            {
             newCompositeNode(grammarAccess.getPropertyRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyRepository=rulePropertyRepository();

            state._fsp--;

             current =iv_rulePropertyRepository; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePropertyRepository"


    // $ANTLR start "rulePropertyRepository"
    // InternalMtctl.g:77:1: rulePropertyRepository returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) )* ;
    public final EObject rulePropertyRepository() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:80:28: ( ( (lv_properties_0_0= ruleProperty ) )* )
            // InternalMtctl.g:81:1: ( (lv_properties_0_0= ruleProperty ) )*
            {
            // InternalMtctl.g:81:1: ( (lv_properties_0_0= ruleProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_QNAME)||(LA1_0>=17 && LA1_0<=19)||LA1_0==21||(LA1_0>=23 && LA1_0<=36)||(LA1_0>=38 && LA1_0<=45)||LA1_0==64) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMtctl.g:82:1: (lv_properties_0_0= ruleProperty )
            	    {
            	    // InternalMtctl.g:82:1: (lv_properties_0_0= ruleProperty )
            	    // InternalMtctl.g:83:3: lv_properties_0_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyRepositoryAccess().getPropertiesPropertyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_properties_0_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_0_0, 
            	            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRepository"


    // $ANTLR start "entryRuleProperty"
    // InternalMtctl.g:107:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        	
        try {
            // InternalMtctl.g:111:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalMtctl.g:112:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMtctl.g:122:1: ruleProperty returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // InternalMtctl.g:126:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) )
            // InternalMtctl.g:127:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            {
            // InternalMtctl.g:127:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            // InternalMtctl.g:127:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            {
            // InternalMtctl.g:127:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMtctl.g:128:1: (lv_expression_0_0= ruleExpression )
            {
            // InternalMtctl.g:128:1: (lv_expression_0_0= ruleExpression )
            // InternalMtctl.g:129:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getSemicolonKeyword_1());
                
            // InternalMtctl.g:149:1: ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMtctl.g:150:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    {
                    // InternalMtctl.g:150:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    // InternalMtctl.g:151:3: lv_comment_2_0= RULE_SL_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getPropertyAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"org.eclipse.xtext.common.Terminals.SL_COMMENT");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleExpression"
    // InternalMtctl.g:178:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMtctl.g:179:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalMtctl.g:180:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMtctl.g:187:1: ruleExpression returns [EObject current=null] : this_LeadsToExpr_0= ruleLeadsToExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LeadsToExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:190:28: (this_LeadsToExpr_0= ruleLeadsToExpr )
            // InternalMtctl.g:192:5: this_LeadsToExpr_0= ruleLeadsToExpr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLeadsToExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_LeadsToExpr_0=ruleLeadsToExpr();

            state._fsp--;

             
                    current = this_LeadsToExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLeadsToExpr"
    // InternalMtctl.g:208:1: entryRuleLeadsToExpr returns [EObject current=null] : iv_ruleLeadsToExpr= ruleLeadsToExpr EOF ;
    public final EObject entryRuleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadsToExpr = null;


        try {
            // InternalMtctl.g:209:2: (iv_ruleLeadsToExpr= ruleLeadsToExpr EOF )
            // InternalMtctl.g:210:2: iv_ruleLeadsToExpr= ruleLeadsToExpr EOF
            {
             newCompositeNode(grammarAccess.getLeadsToExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLeadsToExpr=ruleLeadsToExpr();

            state._fsp--;

             current =iv_ruleLeadsToExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleLeadsToExpr"


    // $ANTLR start "ruleLeadsToExpr"
    // InternalMtctl.g:217:1: ruleLeadsToExpr returns [EObject current=null] : (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* ) ;
    public final EObject ruleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplyExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:220:28: ( (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* ) )
            // InternalMtctl.g:221:1: (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* )
            {
            // InternalMtctl.g:221:1: (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* )
            // InternalMtctl.g:222:5: this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLeadsToExprAccess().getImplyExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_6);
            this_ImplyExpr_0=ruleImplyExpr();

            state._fsp--;

             
                    current = this_ImplyExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalMtctl.g:230:1: ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMtctl.g:230:2: () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) )
            	    {
            	    // InternalMtctl.g:230:2: ()
            	    // InternalMtctl.g:231:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLeadsToExprAccess().getLeadsToExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeadsToExprAccess().getLeadsToKeyword_1_1());
            	        
            	    // InternalMtctl.g:240:1: ( (lv_rightOpd_3_0= ruleImplyExpr ) )
            	    // InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleImplyExpr )
            	    {
            	    // InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleImplyExpr )
            	    // InternalMtctl.g:242:3: lv_rightOpd_3_0= ruleImplyExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeadsToExprAccess().getRightOpdImplyExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_rightOpd_3_0=ruleImplyExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeadsToExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.ImplyExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeadsToExpr"


    // $ANTLR start "entryRuleImplyExpr"
    // InternalMtctl.g:266:1: entryRuleImplyExpr returns [EObject current=null] : iv_ruleImplyExpr= ruleImplyExpr EOF ;
    public final EObject entryRuleImplyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpr = null;


        try {
            // InternalMtctl.g:267:2: (iv_ruleImplyExpr= ruleImplyExpr EOF )
            // InternalMtctl.g:268:2: iv_ruleImplyExpr= ruleImplyExpr EOF
            {
             newCompositeNode(grammarAccess.getImplyExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImplyExpr=ruleImplyExpr();

            state._fsp--;

             current =iv_ruleImplyExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleImplyExpr"


    // $ANTLR start "ruleImplyExpr"
    // InternalMtctl.g:275:1: ruleImplyExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleImplyExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:278:28: ( (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) )
            // InternalMtctl.g:279:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            {
            // InternalMtctl.g:279:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            // InternalMtctl.g:280:5: this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getImplyExprAccess().getOrExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_8);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;

             
                    current = this_OrExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalMtctl.g:288:1: ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMtctl.g:288:2: () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    {
            	    // InternalMtctl.g:288:2: ()
            	    // InternalMtctl.g:289:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getImplyExprAccess().getImplyExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplyExprAccess().getImpliesKeyword_1_1());
            	        
            	    // InternalMtctl.g:298:1: ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    // InternalMtctl.g:299:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    {
            	    // InternalMtctl.g:299:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    // InternalMtctl.g:300:3: lv_rightOpd_3_0= ruleOrExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplyExprAccess().getRightOpdOrExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_rightOpd_3_0=ruleOrExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplyExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.OrExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplyExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalMtctl.g:324:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalMtctl.g:325:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalMtctl.g:326:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalMtctl.g:333:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:336:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) )
            // InternalMtctl.g:337:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            {
            // InternalMtctl.g:337:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            // InternalMtctl.g:338:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_10);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalMtctl.g:346:1: ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMtctl.g:346:2: () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    {
            	    // InternalMtctl.g:346:2: ()
            	    // InternalMtctl.g:347:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_11); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // InternalMtctl.g:356:1: ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    // InternalMtctl.g:357:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    {
            	    // InternalMtctl.g:357:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    // InternalMtctl.g:358:3: lv_rightOpd_3_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightOpdAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_rightOpd_3_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalMtctl.g:382:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalMtctl.g:383:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalMtctl.g:384:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalMtctl.g:391:1: ruleAndExpr returns [EObject current=null] : (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:394:28: ( (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) )
            // InternalMtctl.g:395:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            {
            // InternalMtctl.g:395:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            // InternalMtctl.g:396:5: this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getNotExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_12);
            this_NotExpr_0=ruleNotExpr();

            state._fsp--;

             
                    current = this_NotExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalMtctl.g:404:1: ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMtctl.g:404:2: () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    {
            	    // InternalMtctl.g:404:2: ()
            	    // InternalMtctl.g:405:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_13); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // InternalMtctl.g:414:1: ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    // InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    {
            	    // InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    // InternalMtctl.g:416:3: lv_rightOpd_3_0= ruleNotExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightOpdNotExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_rightOpd_3_0=ruleNotExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleNotExpr"
    // InternalMtctl.g:440:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // InternalMtctl.g:441:2: (iv_ruleNotExpr= ruleNotExpr EOF )
            // InternalMtctl.g:442:2: iv_ruleNotExpr= ruleNotExpr EOF
            {
             newCompositeNode(grammarAccess.getNotExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpr=ruleNotExpr();

            state._fsp--;

             current =iv_ruleNotExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotExpr"


    // $ANTLR start "ruleNotExpr"
    // InternalMtctl.g:449:1: ruleNotExpr returns [EObject current=null] : ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_opd_2_0 = null;

        EObject this_QuantifierExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:452:28: ( ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) )
            // InternalMtctl.g:453:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            {
            // InternalMtctl.g:453:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_QNAME)||(LA7_0>=18 && LA7_0<=19)||LA7_0==21||(LA7_0>=23 && LA7_0<=36)||(LA7_0>=38 && LA7_0<=45)||LA7_0==64) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMtctl.g:453:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    {
                    // InternalMtctl.g:453:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    // InternalMtctl.g:453:4: otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) )
                    {
                    otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getNotKeyword_0_0());
                        
                    // InternalMtctl.g:457:1: ()
                    // InternalMtctl.g:458:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNotExprAccess().getNotExprAction_0_1(),
                                current);
                        

                    }

                    // InternalMtctl.g:463:2: ( (lv_opd_2_0= ruleNotExpr ) )
                    // InternalMtctl.g:464:1: (lv_opd_2_0= ruleNotExpr )
                    {
                    // InternalMtctl.g:464:1: (lv_opd_2_0= ruleNotExpr )
                    // InternalMtctl.g:465:3: lv_opd_2_0= ruleNotExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotExprAccess().getOpdNotExprParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_opd_2_0=ruleNotExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotExprRule());
                    	        }
                           		set(
                           			current, 
                           			"opd",
                            		lv_opd_2_0, 
                            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMtctl.g:483:5: this_QuantifierExpr_3= ruleQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getNotExprAccess().getQuantifierExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuantifierExpr_3=ruleQuantifierExpr();

                    state._fsp--;

                     
                            current = this_QuantifierExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpr"


    // $ANTLR start "entryRuleQuantifierExpr"
    // InternalMtctl.g:499:1: entryRuleQuantifierExpr returns [EObject current=null] : iv_ruleQuantifierExpr= ruleQuantifierExpr EOF ;
    public final EObject entryRuleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpr = null;


        try {
            // InternalMtctl.g:500:2: (iv_ruleQuantifierExpr= ruleQuantifierExpr EOF )
            // InternalMtctl.g:501:2: iv_ruleQuantifierExpr= ruleQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuantifierExpr=ruleQuantifierExpr();

            state._fsp--;

             current =iv_ruleQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuantifierExpr"


    // $ANTLR start "ruleQuantifierExpr"
    // InternalMtctl.g:508:1: ruleQuantifierExpr returns [EObject current=null] : (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) ;
    public final EObject ruleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UniversalQuantExpr_0 = null;

        EObject this_ExistentialQuantExpr_1 = null;

        EObject this_TemporalQuantifierExpr_2 = null;

        EObject this_AtomExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:511:28: ( (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) )
            // InternalMtctl.g:512:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            {
            // InternalMtctl.g:512:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_QNAME:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 64:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMtctl.g:513:5: this_UniversalQuantExpr_0= ruleUniversalQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getUniversalQuantExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UniversalQuantExpr_0=ruleUniversalQuantExpr();

                    state._fsp--;

                     
                            current = this_UniversalQuantExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:523:5: this_ExistentialQuantExpr_1= ruleExistentialQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getExistentialQuantExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExistentialQuantExpr_1=ruleExistentialQuantExpr();

                    state._fsp--;

                     
                            current = this_ExistentialQuantExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:533:5: this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getTemporalQuantifierExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TemporalQuantifierExpr_2=ruleTemporalQuantifierExpr();

                    state._fsp--;

                     
                            current = this_TemporalQuantifierExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:543:5: this_AtomExpr_3= ruleAtomExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getAtomExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomExpr_3=ruleAtomExpr();

                    state._fsp--;

                     
                            current = this_AtomExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifierExpr"


    // $ANTLR start "entryRuleUniversalQuantExpr"
    // InternalMtctl.g:559:1: entryRuleUniversalQuantExpr returns [EObject current=null] : iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF ;
    public final EObject entryRuleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalQuantExpr = null;


        try {
            // InternalMtctl.g:560:2: (iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF )
            // InternalMtctl.g:561:2: iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getUniversalQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUniversalQuantExpr=ruleUniversalQuantExpr();

            state._fsp--;

             current =iv_ruleUniversalQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUniversalQuantExpr"


    // $ANTLR start "ruleUniversalQuantExpr"
    // InternalMtctl.g:568:1: ruleUniversalQuantExpr returns [EObject current=null] : (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:571:28: ( (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:572:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:572:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // InternalMtctl.g:572:3: otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getUniversalQuantExprAccess().getForallKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getUniversalQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:580:1: ()
            // InternalMtctl.g:581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniversalQuantExprAccess().getUniversalQuantExprAction_2(),
                        current);
                

            }

            // InternalMtctl.g:586:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // InternalMtctl.g:587:1: (lv_var_3_0= ruleVariableBinding )
            {
            // InternalMtctl.g:587:1: (lv_var_3_0= ruleVariableBinding )
            // InternalMtctl.g:588:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_var_3_0=ruleVariableBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniversalQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.VariableBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_4, grammarAccess.getUniversalQuantExprAccess().getRightParenthesisKeyword_4());
                
            // InternalMtctl.g:608:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // InternalMtctl.g:609:1: (lv_formula_5_0= ruleNotExpr )
            {
            // InternalMtctl.g:609:1: (lv_formula_5_0= ruleNotExpr )
            // InternalMtctl.g:610:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_formula_5_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniversalQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"formula",
                    		lv_formula_5_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniversalQuantExpr"


    // $ANTLR start "entryRuleExistentialQuantExpr"
    // InternalMtctl.g:634:1: entryRuleExistentialQuantExpr returns [EObject current=null] : iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF ;
    public final EObject entryRuleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistentialQuantExpr = null;


        try {
            // InternalMtctl.g:635:2: (iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF )
            // InternalMtctl.g:636:2: iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getExistentialQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExistentialQuantExpr=ruleExistentialQuantExpr();

            state._fsp--;

             current =iv_ruleExistentialQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExistentialQuantExpr"


    // $ANTLR start "ruleExistentialQuantExpr"
    // InternalMtctl.g:643:1: ruleExistentialQuantExpr returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:646:28: ( (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:647:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:647:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // InternalMtctl.g:647:3: otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getExistentialQuantExprAccess().getExistsKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getExistentialQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:655:1: ()
            // InternalMtctl.g:656:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExistentialQuantExprAccess().getExistenceQuantExprAction_2(),
                        current);
                

            }

            // InternalMtctl.g:661:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // InternalMtctl.g:662:1: (lv_var_3_0= ruleVariableBinding )
            {
            // InternalMtctl.g:662:1: (lv_var_3_0= ruleVariableBinding )
            // InternalMtctl.g:663:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_var_3_0=ruleVariableBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistentialQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.VariableBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_4, grammarAccess.getExistentialQuantExprAccess().getRightParenthesisKeyword_4());
                
            // InternalMtctl.g:683:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // InternalMtctl.g:684:1: (lv_formula_5_0= ruleNotExpr )
            {
            // InternalMtctl.g:684:1: (lv_formula_5_0= ruleNotExpr )
            // InternalMtctl.g:685:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_formula_5_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistentialQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"formula",
                    		lv_formula_5_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistentialQuantExpr"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMtctl.g:709:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMtctl.g:710:2: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMtctl.g:711:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMtctl.g:718:1: ruleVariableBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_set_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:721:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) )
            // InternalMtctl.g:722:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            {
            // InternalMtctl.g:722:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            // InternalMtctl.g:722:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) )
            {
            // InternalMtctl.g:722:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMtctl.g:723:1: (lv_name_0_0= RULE_ID )
            {
            // InternalMtctl.g:723:1: (lv_name_0_0= RULE_ID )
            // InternalMtctl.g:724:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableBindingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getColonKeyword_1());
                
            // InternalMtctl.g:744:1: ( (lv_set_2_0= ruleSetExpr ) )
            // InternalMtctl.g:745:1: (lv_set_2_0= ruleSetExpr )
            {
            // InternalMtctl.g:745:1: (lv_set_2_0= ruleSetExpr )
            // InternalMtctl.g:746:3: lv_set_2_0= ruleSetExpr
            {
             
            	        newCompositeNode(grammarAccess.getVariableBindingAccess().getSetSetExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_set_2_0=ruleSetExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.SetExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleTemporalQuantifierExpr"
    // InternalMtctl.g:770:1: entryRuleTemporalQuantifierExpr returns [EObject current=null] : iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF ;
    public final EObject entryRuleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalQuantifierExpr = null;


        try {
            // InternalMtctl.g:771:2: (iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF )
            // InternalMtctl.g:772:2: iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemporalQuantifierExpr=ruleTemporalQuantifierExpr();

            state._fsp--;

             current =iv_ruleTemporalQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemporalQuantifierExpr"


    // $ANTLR start "ruleTemporalQuantifierExpr"
    // InternalMtctl.g:779:1: ruleTemporalQuantifierExpr returns [EObject current=null] : (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) ;
    public final EObject ruleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EFExpr_0 = null;

        EObject this_AFExpr_1 = null;

        EObject this_EGExpr_2 = null;

        EObject this_AGExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:782:28: ( (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) )
            // InternalMtctl.g:783:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            {
            // InternalMtctl.g:783:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
            case 30:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMtctl.g:784:5: this_EFExpr_0= ruleEFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEFExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EFExpr_0=ruleEFExpr();

                    state._fsp--;

                     
                            current = this_EFExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:794:5: this_AFExpr_1= ruleAFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAFExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AFExpr_1=ruleAFExpr();

                    state._fsp--;

                     
                            current = this_AFExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:804:5: this_EGExpr_2= ruleEGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEGExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EGExpr_2=ruleEGExpr();

                    state._fsp--;

                     
                            current = this_EGExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:814:5: this_AGExpr_3= ruleAGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAGExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AGExpr_3=ruleAGExpr();

                    state._fsp--;

                     
                            current = this_AGExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalQuantifierExpr"


    // $ANTLR start "entryRuleEFExpr"
    // InternalMtctl.g:830:1: entryRuleEFExpr returns [EObject current=null] : iv_ruleEFExpr= ruleEFExpr EOF ;
    public final EObject entryRuleEFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpr = null;


        try {
            // InternalMtctl.g:831:2: (iv_ruleEFExpr= ruleEFExpr EOF )
            // InternalMtctl.g:832:2: iv_ruleEFExpr= ruleEFExpr EOF
            {
             newCompositeNode(grammarAccess.getEFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEFExpr=ruleEFExpr();

            state._fsp--;

             current =iv_ruleEFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFExpr"


    // $ANTLR start "ruleEFExpr"
    // InternalMtctl.g:839:1: ruleEFExpr returns [EObject current=null] : ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:842:28: ( ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:843:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:843:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // InternalMtctl.g:843:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // InternalMtctl.g:843:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMtctl.g:843:4: otherlv_0= 'EF'
                    {
                    otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_0, grammarAccess.getEFExprAccess().getEFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:848:7: otherlv_1= 'E<>'
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_1, grammarAccess.getEFExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalMtctl.g:852:2: ()
            // InternalMtctl.g:853:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEFExprAccess().getEFExprAction_1(),
                        current);
                

            }

            // InternalMtctl.g:858:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // InternalMtctl.g:859:1: (lv_expr_3_0= ruleNotExpr )
            {
            // InternalMtctl.g:859:1: (lv_expr_3_0= ruleNotExpr )
            // InternalMtctl.g:860:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEFExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFExpr"


    // $ANTLR start "entryRuleAFExpr"
    // InternalMtctl.g:884:1: entryRuleAFExpr returns [EObject current=null] : iv_ruleAFExpr= ruleAFExpr EOF ;
    public final EObject entryRuleAFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFExpr = null;


        try {
            // InternalMtctl.g:885:2: (iv_ruleAFExpr= ruleAFExpr EOF )
            // InternalMtctl.g:886:2: iv_ruleAFExpr= ruleAFExpr EOF
            {
             newCompositeNode(grammarAccess.getAFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAFExpr=ruleAFExpr();

            state._fsp--;

             current =iv_ruleAFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAFExpr"


    // $ANTLR start "ruleAFExpr"
    // InternalMtctl.g:893:1: ruleAFExpr returns [EObject current=null] : ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:896:28: ( ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:897:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:897:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // InternalMtctl.g:897:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // InternalMtctl.g:897:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMtctl.g:897:4: otherlv_0= 'AF'
                    {
                    otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_0, grammarAccess.getAFExprAccess().getAFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:902:7: otherlv_1= 'A<>'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_1, grammarAccess.getAFExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalMtctl.g:906:2: ()
            // InternalMtctl.g:907:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAFExprAccess().getAFExprAction_1(),
                        current);
                

            }

            // InternalMtctl.g:912:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // InternalMtctl.g:913:1: (lv_expr_3_0= ruleNotExpr )
            {
            // InternalMtctl.g:913:1: (lv_expr_3_0= ruleNotExpr )
            // InternalMtctl.g:914:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAFExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAFExpr"


    // $ANTLR start "entryRuleEGExpr"
    // InternalMtctl.g:938:1: entryRuleEGExpr returns [EObject current=null] : iv_ruleEGExpr= ruleEGExpr EOF ;
    public final EObject entryRuleEGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGExpr = null;


        try {
            // InternalMtctl.g:939:2: (iv_ruleEGExpr= ruleEGExpr EOF )
            // InternalMtctl.g:940:2: iv_ruleEGExpr= ruleEGExpr EOF
            {
             newCompositeNode(grammarAccess.getEGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEGExpr=ruleEGExpr();

            state._fsp--;

             current =iv_ruleEGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEGExpr"


    // $ANTLR start "ruleEGExpr"
    // InternalMtctl.g:947:1: ruleEGExpr returns [EObject current=null] : ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:950:28: ( ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:951:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:951:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // InternalMtctl.g:951:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // InternalMtctl.g:951:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMtctl.g:951:4: otherlv_0= 'EG'
                    {
                    otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_0, grammarAccess.getEGExprAccess().getEGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:956:7: otherlv_1= 'E[]'
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_1, grammarAccess.getEGExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalMtctl.g:960:2: ()
            // InternalMtctl.g:961:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGExprAccess().getEGExprAction_1(),
                        current);
                

            }

            // InternalMtctl.g:966:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // InternalMtctl.g:967:1: (lv_expr_3_0= ruleNotExpr )
            {
            // InternalMtctl.g:967:1: (lv_expr_3_0= ruleNotExpr )
            // InternalMtctl.g:968:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEGExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEGExpr"


    // $ANTLR start "entryRuleAGExpr"
    // InternalMtctl.g:992:1: entryRuleAGExpr returns [EObject current=null] : iv_ruleAGExpr= ruleAGExpr EOF ;
    public final EObject entryRuleAGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGExpr = null;


        try {
            // InternalMtctl.g:993:2: (iv_ruleAGExpr= ruleAGExpr EOF )
            // InternalMtctl.g:994:2: iv_ruleAGExpr= ruleAGExpr EOF
            {
             newCompositeNode(grammarAccess.getAGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAGExpr=ruleAGExpr();

            state._fsp--;

             current =iv_ruleAGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAGExpr"


    // $ANTLR start "ruleAGExpr"
    // InternalMtctl.g:1001:1: ruleAGExpr returns [EObject current=null] : ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1004:28: ( ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // InternalMtctl.g:1005:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // InternalMtctl.g:1005:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // InternalMtctl.g:1005:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // InternalMtctl.g:1005:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMtctl.g:1005:4: otherlv_0= 'AG'
                    {
                    otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_0, grammarAccess.getAGExprAccess().getAGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1010:7: otherlv_1= 'A[]'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_1, grammarAccess.getAGExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalMtctl.g:1014:2: ()
            // InternalMtctl.g:1015:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAGExprAccess().getAGExprAction_1(),
                        current);
                

            }

            // InternalMtctl.g:1020:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // InternalMtctl.g:1021:1: (lv_expr_3_0= ruleNotExpr )
            {
            // InternalMtctl.g:1021:1: (lv_expr_3_0= ruleNotExpr )
            // InternalMtctl.g:1022:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAGExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.NotExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAGExpr"


    // $ANTLR start "entryRuleAtomExpr"
    // InternalMtctl.g:1046:1: entryRuleAtomExpr returns [EObject current=null] : iv_ruleAtomExpr= ruleAtomExpr EOF ;
    public final EObject entryRuleAtomExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpr = null;


        try {
            // InternalMtctl.g:1047:2: (iv_ruleAtomExpr= ruleAtomExpr EOF )
            // InternalMtctl.g:1048:2: iv_ruleAtomExpr= ruleAtomExpr EOF
            {
             newCompositeNode(grammarAccess.getAtomExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomExpr=ruleAtomExpr();

            state._fsp--;

             current =iv_ruleAtomExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomExpr"


    // $ANTLR start "ruleAtomExpr"
    // InternalMtctl.g:1055:1: ruleAtomExpr returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) ;
    public final EObject ruleAtomExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_PredicateExpr_3 = null;

        EObject this_ComparisonExpr_4 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1058:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) )
            // InternalMtctl.g:1059:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            {
            // InternalMtctl.g:1059:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_QNAME:
            case 43:
            case 44:
            case 45:
            case 64:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMtctl.g:1059:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMtctl.g:1059:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMtctl.g:1059:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtomExprAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_17);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtomExprAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1078:5: this_PredicateExpr_3= rulePredicateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getPredicateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PredicateExpr_3=rulePredicateExpr();

                    state._fsp--;

                     
                            current = this_PredicateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:1088:5: this_ComparisonExpr_4= ruleComparisonExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getComparisonExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComparisonExpr_4=ruleComparisonExpr();

                    state._fsp--;

                     
                            current = this_ComparisonExpr_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomExpr"


    // $ANTLR start "entryRulePredicateExpr"
    // InternalMtctl.g:1104:1: entryRulePredicateExpr returns [EObject current=null] : iv_rulePredicateExpr= rulePredicateExpr EOF ;
    public final EObject entryRulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpr = null;


        try {
            // InternalMtctl.g:1105:2: (iv_rulePredicateExpr= rulePredicateExpr EOF )
            // InternalMtctl.g:1106:2: iv_rulePredicateExpr= rulePredicateExpr EOF
            {
             newCompositeNode(grammarAccess.getPredicateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePredicateExpr=rulePredicateExpr();

            state._fsp--;

             current =iv_rulePredicateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicateExpr"


    // $ANTLR start "rulePredicateExpr"
    // InternalMtctl.g:1113:1: rulePredicateExpr returns [EObject current=null] : (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_ConnectorOverflowExpr_3= ruleConnectorOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) ;
    public final EObject rulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TrueExpr_0 = null;

        EObject this_FalseExpr_1 = null;

        EObject this_DeadlockExpr_2 = null;

        EObject this_ConnectorOverflowExpr_3 = null;

        EObject this_StateExpr_4 = null;

        EObject this_MessageExpr_5 = null;

        EObject this_TransitionExpr_6 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1116:28: ( (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_ConnectorOverflowExpr_3= ruleConnectorOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) )
            // InternalMtctl.g:1117:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_ConnectorOverflowExpr_3= ruleConnectorOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            {
            // InternalMtctl.g:1117:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_ConnectorOverflowExpr_3= ruleConnectorOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case 35:
            case 36:
            case 38:
                {
                alt15=5;
                }
                break;
            case 39:
            case 40:
            case 41:
                {
                alt15=6;
                }
                break;
            case 42:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMtctl.g:1118:5: this_TrueExpr_0= ruleTrueExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTrueExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TrueExpr_0=ruleTrueExpr();

                    state._fsp--;

                     
                            current = this_TrueExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1128:5: this_FalseExpr_1= ruleFalseExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getFalseExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FalseExpr_1=ruleFalseExpr();

                    state._fsp--;

                     
                            current = this_FalseExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:1138:5: this_DeadlockExpr_2= ruleDeadlockExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getDeadlockExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DeadlockExpr_2=ruleDeadlockExpr();

                    state._fsp--;

                     
                            current = this_DeadlockExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:1148:5: this_ConnectorOverflowExpr_3= ruleConnectorOverflowExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getConnectorOverflowExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConnectorOverflowExpr_3=ruleConnectorOverflowExpr();

                    state._fsp--;

                     
                            current = this_ConnectorOverflowExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalMtctl.g:1158:5: this_StateExpr_4= ruleStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StateExpr_4=ruleStateExpr();

                    state._fsp--;

                     
                            current = this_StateExpr_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalMtctl.g:1168:5: this_MessageExpr_5= ruleMessageExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getMessageExprParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MessageExpr_5=ruleMessageExpr();

                    state._fsp--;

                     
                            current = this_MessageExpr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalMtctl.g:1178:5: this_TransitionExpr_6= ruleTransitionExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTransitionExprParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TransitionExpr_6=ruleTransitionExpr();

                    state._fsp--;

                     
                            current = this_TransitionExpr_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateExpr"


    // $ANTLR start "entryRuleDeadlockExpr"
    // InternalMtctl.g:1194:1: entryRuleDeadlockExpr returns [EObject current=null] : iv_ruleDeadlockExpr= ruleDeadlockExpr EOF ;
    public final EObject entryRuleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadlockExpr = null;


        try {
            // InternalMtctl.g:1195:2: (iv_ruleDeadlockExpr= ruleDeadlockExpr EOF )
            // InternalMtctl.g:1196:2: iv_ruleDeadlockExpr= ruleDeadlockExpr EOF
            {
             newCompositeNode(grammarAccess.getDeadlockExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeadlockExpr=ruleDeadlockExpr();

            state._fsp--;

             current =iv_ruleDeadlockExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeadlockExpr"


    // $ANTLR start "ruleDeadlockExpr"
    // InternalMtctl.g:1203:1: ruleDeadlockExpr returns [EObject current=null] : ( () otherlv_1= 'deadlock' ) ;
    public final EObject ruleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:1206:28: ( ( () otherlv_1= 'deadlock' ) )
            // InternalMtctl.g:1207:1: ( () otherlv_1= 'deadlock' )
            {
            // InternalMtctl.g:1207:1: ( () otherlv_1= 'deadlock' )
            // InternalMtctl.g:1207:2: () otherlv_1= 'deadlock'
            {
            // InternalMtctl.g:1207:2: ()
            // InternalMtctl.g:1208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeadlockExprAccess().getDeadlockExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getDeadlockExprAccess().getDeadlockKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeadlockExpr"


    // $ANTLR start "entryRuleConnectorOverflowExpr"
    // InternalMtctl.g:1225:1: entryRuleConnectorOverflowExpr returns [EObject current=null] : iv_ruleConnectorOverflowExpr= ruleConnectorOverflowExpr EOF ;
    public final EObject entryRuleConnectorOverflowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorOverflowExpr = null;


        try {
            // InternalMtctl.g:1226:2: (iv_ruleConnectorOverflowExpr= ruleConnectorOverflowExpr EOF )
            // InternalMtctl.g:1227:2: iv_ruleConnectorOverflowExpr= ruleConnectorOverflowExpr EOF
            {
             newCompositeNode(grammarAccess.getConnectorOverflowExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConnectorOverflowExpr=ruleConnectorOverflowExpr();

            state._fsp--;

             current =iv_ruleConnectorOverflowExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectorOverflowExpr"


    // $ANTLR start "ruleConnectorOverflowExpr"
    // InternalMtctl.g:1234:1: ruleConnectorOverflowExpr returns [EObject current=null] : ( () otherlv_1= 'connectorOverflow' ) ;
    public final EObject ruleConnectorOverflowExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:1237:28: ( ( () otherlv_1= 'connectorOverflow' ) )
            // InternalMtctl.g:1238:1: ( () otherlv_1= 'connectorOverflow' )
            {
            // InternalMtctl.g:1238:1: ( () otherlv_1= 'connectorOverflow' )
            // InternalMtctl.g:1238:2: () otherlv_1= 'connectorOverflow'
            {
            // InternalMtctl.g:1238:2: ()
            // InternalMtctl.g:1239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectorOverflowExprAccess().getConnectorOverflowExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectorOverflowExprAccess().getConnectorOverflowKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorOverflowExpr"


    // $ANTLR start "entryRuleTrueExpr"
    // InternalMtctl.g:1256:1: entryRuleTrueExpr returns [EObject current=null] : iv_ruleTrueExpr= ruleTrueExpr EOF ;
    public final EObject entryRuleTrueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpr = null;


        try {
            // InternalMtctl.g:1257:2: (iv_ruleTrueExpr= ruleTrueExpr EOF )
            // InternalMtctl.g:1258:2: iv_ruleTrueExpr= ruleTrueExpr EOF
            {
             newCompositeNode(grammarAccess.getTrueExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrueExpr=ruleTrueExpr();

            state._fsp--;

             current =iv_ruleTrueExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrueExpr"


    // $ANTLR start "ruleTrueExpr"
    // InternalMtctl.g:1265:1: ruleTrueExpr returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:1268:28: ( ( () otherlv_1= 'true' ) )
            // InternalMtctl.g:1269:1: ( () otherlv_1= 'true' )
            {
            // InternalMtctl.g:1269:1: ( () otherlv_1= 'true' )
            // InternalMtctl.g:1269:2: () otherlv_1= 'true'
            {
            // InternalMtctl.g:1269:2: ()
            // InternalMtctl.g:1270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTrueExprAccess().getTrueExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getTrueExprAccess().getTrueKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueExpr"


    // $ANTLR start "entryRuleFalseExpr"
    // InternalMtctl.g:1287:1: entryRuleFalseExpr returns [EObject current=null] : iv_ruleFalseExpr= ruleFalseExpr EOF ;
    public final EObject entryRuleFalseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpr = null;


        try {
            // InternalMtctl.g:1288:2: (iv_ruleFalseExpr= ruleFalseExpr EOF )
            // InternalMtctl.g:1289:2: iv_ruleFalseExpr= ruleFalseExpr EOF
            {
             newCompositeNode(grammarAccess.getFalseExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFalseExpr=ruleFalseExpr();

            state._fsp--;

             current =iv_ruleFalseExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleFalseExpr"


    // $ANTLR start "ruleFalseExpr"
    // InternalMtctl.g:1296:1: ruleFalseExpr returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:1299:28: ( ( () otherlv_1= 'false' ) )
            // InternalMtctl.g:1300:1: ( () otherlv_1= 'false' )
            {
            // InternalMtctl.g:1300:1: ( () otherlv_1= 'false' )
            // InternalMtctl.g:1300:2: () otherlv_1= 'false'
            {
            // InternalMtctl.g:1300:2: ()
            // InternalMtctl.g:1301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFalseExprAccess().getFalseExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getFalseExprAccess().getFalseKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalseExpr"


    // $ANTLR start "entryRuleStateExpr"
    // InternalMtctl.g:1318:1: entryRuleStateExpr returns [EObject current=null] : iv_ruleStateExpr= ruleStateExpr EOF ;
    public final EObject entryRuleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpr = null;


        try {
            // InternalMtctl.g:1319:2: (iv_ruleStateExpr= ruleStateExpr EOF )
            // InternalMtctl.g:1320:2: iv_ruleStateExpr= ruleStateExpr EOF
            {
             newCompositeNode(grammarAccess.getStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateExpr=ruleStateExpr();

            state._fsp--;

             current =iv_ruleStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateExpr"


    // $ANTLR start "ruleStateExpr"
    // InternalMtctl.g:1327:1: ruleStateExpr returns [EObject current=null] : (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) ;
    public final EObject ruleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_StateActiveExpr_0 = null;

        EObject this_SubstateOfExpr_1 = null;

        EObject this_StateInStatechartExpr_2 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1330:28: ( (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) )
            // InternalMtctl.g:1331:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            {
            // InternalMtctl.g:1331:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMtctl.g:1332:5: this_StateActiveExpr_0= ruleStateActiveExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateActiveExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StateActiveExpr_0=ruleStateActiveExpr();

                    state._fsp--;

                     
                            current = this_StateActiveExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1342:5: this_SubstateOfExpr_1= ruleSubstateOfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getSubstateOfExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SubstateOfExpr_1=ruleSubstateOfExpr();

                    state._fsp--;

                     
                            current = this_SubstateOfExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:1352:5: this_StateInStatechartExpr_2= ruleStateInStatechartExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateInStatechartExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StateInStatechartExpr_2=ruleStateInStatechartExpr();

                    state._fsp--;

                     
                            current = this_StateInStatechartExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateExpr"


    // $ANTLR start "entryRuleStateActiveExpr"
    // InternalMtctl.g:1368:1: entryRuleStateActiveExpr returns [EObject current=null] : iv_ruleStateActiveExpr= ruleStateActiveExpr EOF ;
    public final EObject entryRuleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateActiveExpr = null;


        try {
            // InternalMtctl.g:1369:2: (iv_ruleStateActiveExpr= ruleStateActiveExpr EOF )
            // InternalMtctl.g:1370:2: iv_ruleStateActiveExpr= ruleStateActiveExpr EOF
            {
             newCompositeNode(grammarAccess.getStateActiveExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateActiveExpr=ruleStateActiveExpr();

            state._fsp--;

             current =iv_ruleStateActiveExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateActiveExpr"


    // $ANTLR start "ruleStateActiveExpr"
    // InternalMtctl.g:1377:1: ruleStateActiveExpr returns [EObject current=null] : (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_state_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1380:28: ( (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:1381:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:1381:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:1381:3: otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getStateActiveExprAccess().getStateActiveKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getStateActiveExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1389:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // InternalMtctl.g:1390:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // InternalMtctl.g:1390:1: (lv_state_2_0= ruleStateMapExpr )
            // InternalMtctl.g:1391:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateActiveExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateActiveExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getStateActiveExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateActiveExpr"


    // $ANTLR start "entryRuleSubstateOfExpr"
    // InternalMtctl.g:1419:1: entryRuleSubstateOfExpr returns [EObject current=null] : iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF ;
    public final EObject entryRuleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstateOfExpr = null;


        try {
            // InternalMtctl.g:1420:2: (iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF )
            // InternalMtctl.g:1421:2: iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF
            {
             newCompositeNode(grammarAccess.getSubstateOfExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubstateOfExpr=ruleSubstateOfExpr();

            state._fsp--;

             current =iv_ruleSubstateOfExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubstateOfExpr"


    // $ANTLR start "ruleSubstateOfExpr"
    // InternalMtctl.g:1428:1: ruleSubstateOfExpr returns [EObject current=null] : (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_superstate_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1431:28: ( (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) )
            // InternalMtctl.g:1432:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            {
            // InternalMtctl.g:1432:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            // InternalMtctl.g:1432:3: otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getSubstateOfExprAccess().getSubstateOfKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getSubstateOfExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1440:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // InternalMtctl.g:1441:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // InternalMtctl.g:1441:1: (lv_state_2_0= ruleStateMapExpr )
            // InternalMtctl.g:1442:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubstateOfExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_3, grammarAccess.getSubstateOfExprAccess().getCommaKeyword_3());
                
            // InternalMtctl.g:1462:1: ( (lv_superstate_4_0= ruleStateMapExpr ) )
            // InternalMtctl.g:1463:1: (lv_superstate_4_0= ruleStateMapExpr )
            {
            // InternalMtctl.g:1463:1: (lv_superstate_4_0= ruleStateMapExpr )
            // InternalMtctl.g:1464:3: lv_superstate_4_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getSuperstateStateMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_superstate_4_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubstateOfExprRule());
            	        }
                   		set(
                   			current, 
                   			"superstate",
                    		lv_superstate_4_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getSubstateOfExprAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubstateOfExpr"


    // $ANTLR start "entryRuleStateInStatechartExpr"
    // InternalMtctl.g:1492:1: entryRuleStateInStatechartExpr returns [EObject current=null] : iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF ;
    public final EObject entryRuleStateInStatechartExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInStatechartExpr = null;


        try {
            // InternalMtctl.g:1493:2: (iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF )
            // InternalMtctl.g:1494:2: iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF
            {
             newCompositeNode(grammarAccess.getStateInStatechartExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateInStatechartExpr=ruleStateInStatechartExpr();

            state._fsp--;

             current =iv_ruleStateInStatechartExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateInStatechartExpr"


    // $ANTLR start "ruleStateInStatechartExpr"
    // InternalMtctl.g:1501:1: ruleStateInStatechartExpr returns [EObject current=null] : (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleStateInStatechartExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_statechart_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1504:28: ( (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) )
            // InternalMtctl.g:1505:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            {
            // InternalMtctl.g:1505:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            // InternalMtctl.g:1505:3: otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getStateInStatechartExprAccess().getStateInStatechartKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInStatechartExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1513:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // InternalMtctl.g:1514:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // InternalMtctl.g:1514:1: (lv_state_2_0= ruleStateMapExpr )
            // InternalMtctl.g:1515:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInStatechartExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_3, grammarAccess.getStateInStatechartExprAccess().getCommaKeyword_3());
                
            // InternalMtctl.g:1535:1: ( (lv_statechart_4_0= ruleStatechartMapExpr ) )
            // InternalMtctl.g:1536:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            {
            // InternalMtctl.g:1536:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            // InternalMtctl.g:1537:3: lv_statechart_4_0= ruleStatechartMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStatechartStatechartMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_statechart_4_0=ruleStatechartMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInStatechartExprRule());
            	        }
                   		set(
                   			current, 
                   			"statechart",
                    		lv_statechart_4_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.StatechartMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getStateInStatechartExprAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateInStatechartExpr"


    // $ANTLR start "entryRuleMessageExpr"
    // InternalMtctl.g:1565:1: entryRuleMessageExpr returns [EObject current=null] : iv_ruleMessageExpr= ruleMessageExpr EOF ;
    public final EObject entryRuleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageExpr = null;


        try {
            // InternalMtctl.g:1566:2: (iv_ruleMessageExpr= ruleMessageExpr EOF )
            // InternalMtctl.g:1567:2: iv_ruleMessageExpr= ruleMessageExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageExpr=ruleMessageExpr();

            state._fsp--;

             current =iv_ruleMessageExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageExpr"


    // $ANTLR start "ruleMessageExpr"
    // InternalMtctl.g:1574:1: ruleMessageExpr returns [EObject current=null] : (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_MessageDiscardedExpr_2= ruleMessageDiscardedExpr ) ;
    public final EObject ruleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MessageInBufferExpr_0 = null;

        EObject this_MessageInTransitExpr_1 = null;

        EObject this_MessageDiscardedExpr_2 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1577:28: ( (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_MessageDiscardedExpr_2= ruleMessageDiscardedExpr ) )
            // InternalMtctl.g:1578:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_MessageDiscardedExpr_2= ruleMessageDiscardedExpr )
            {
            // InternalMtctl.g:1578:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_MessageDiscardedExpr_2= ruleMessageDiscardedExpr )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMtctl.g:1579:5: this_MessageInBufferExpr_0= ruleMessageInBufferExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInBufferExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MessageInBufferExpr_0=ruleMessageInBufferExpr();

                    state._fsp--;

                     
                            current = this_MessageInBufferExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1589:5: this_MessageInTransitExpr_1= ruleMessageInTransitExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInTransitExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MessageInTransitExpr_1=ruleMessageInTransitExpr();

                    state._fsp--;

                     
                            current = this_MessageInTransitExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:1599:5: this_MessageDiscardedExpr_2= ruleMessageDiscardedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageDiscardedExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MessageDiscardedExpr_2=ruleMessageDiscardedExpr();

                    state._fsp--;

                     
                            current = this_MessageDiscardedExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageExpr"


    // $ANTLR start "entryRuleMessageInTransitExpr"
    // InternalMtctl.g:1615:1: entryRuleMessageInTransitExpr returns [EObject current=null] : iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF ;
    public final EObject entryRuleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInTransitExpr = null;


        try {
            // InternalMtctl.g:1616:2: (iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF )
            // InternalMtctl.g:1617:2: iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInTransitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageInTransitExpr=ruleMessageInTransitExpr();

            state._fsp--;

             current =iv_ruleMessageInTransitExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageInTransitExpr"


    // $ANTLR start "ruleMessageInTransitExpr"
    // InternalMtctl.g:1624:1: ruleMessageInTransitExpr returns [EObject current=null] : (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_message_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1627:28: ( (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:1628:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:1628:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:1628:3: otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInTransitExprAccess().getMessageInTransitKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInTransitExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1636:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // InternalMtctl.g:1637:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // InternalMtctl.g:1637:1: (lv_message_2_0= ruleMessageMapExpr )
            // InternalMtctl.g:1638:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInTransitExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_message_2_0=ruleMessageMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInTransitExprRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MessageMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageInTransitExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageInTransitExpr"


    // $ANTLR start "entryRuleMessageInBufferExpr"
    // InternalMtctl.g:1666:1: entryRuleMessageInBufferExpr returns [EObject current=null] : iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF ;
    public final EObject entryRuleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInBufferExpr = null;


        try {
            // InternalMtctl.g:1667:2: (iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF )
            // InternalMtctl.g:1668:2: iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInBufferExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageInBufferExpr=ruleMessageInBufferExpr();

            state._fsp--;

             current =iv_ruleMessageInBufferExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageInBufferExpr"


    // $ANTLR start "ruleMessageInBufferExpr"
    // InternalMtctl.g:1675:1: ruleMessageInBufferExpr returns [EObject current=null] : (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_message_2_0 = null;

        EObject lv_buffer_4_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1678:28: ( (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) )
            // InternalMtctl.g:1679:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            {
            // InternalMtctl.g:1679:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            // InternalMtctl.g:1679:3: otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInBufferExprAccess().getMessageInBufferKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInBufferExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1687:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // InternalMtctl.g:1688:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // InternalMtctl.g:1688:1: (lv_message_2_0= ruleMessageMapExpr )
            // InternalMtctl.g:1689:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            lv_message_2_0=ruleMessageMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInBufferExprRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MessageMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageInBufferExprAccess().getCommaKeyword_3());
                
            // InternalMtctl.g:1709:1: ( (lv_buffer_4_0= ruleBufferMapExpr ) )
            // InternalMtctl.g:1710:1: (lv_buffer_4_0= ruleBufferMapExpr )
            {
            // InternalMtctl.g:1710:1: (lv_buffer_4_0= ruleBufferMapExpr )
            // InternalMtctl.g:1711:3: lv_buffer_4_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getBufferBufferMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_buffer_4_0=ruleBufferMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInBufferExprRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_4_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.BufferMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getMessageInBufferExprAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageInBufferExpr"


    // $ANTLR start "entryRuleMessageDiscardedExpr"
    // InternalMtctl.g:1739:1: entryRuleMessageDiscardedExpr returns [EObject current=null] : iv_ruleMessageDiscardedExpr= ruleMessageDiscardedExpr EOF ;
    public final EObject entryRuleMessageDiscardedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDiscardedExpr = null;


        try {
            // InternalMtctl.g:1740:2: (iv_ruleMessageDiscardedExpr= ruleMessageDiscardedExpr EOF )
            // InternalMtctl.g:1741:2: iv_ruleMessageDiscardedExpr= ruleMessageDiscardedExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageDiscardedExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageDiscardedExpr=ruleMessageDiscardedExpr();

            state._fsp--;

             current =iv_ruleMessageDiscardedExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageDiscardedExpr"


    // $ANTLR start "ruleMessageDiscardedExpr"
    // InternalMtctl.g:1748:1: ruleMessageDiscardedExpr returns [EObject current=null] : (otherlv_0= 'messageDiscarded' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageDiscardedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_buffer_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1751:28: ( (otherlv_0= 'messageDiscarded' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:1752:1: (otherlv_0= 'messageDiscarded' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:1752:1: (otherlv_0= 'messageDiscarded' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:1752:3: otherlv_0= 'messageDiscarded' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageDiscardedExprAccess().getMessageDiscardedKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageDiscardedExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1760:1: ( (lv_buffer_2_0= ruleBufferMapExpr ) )
            // InternalMtctl.g:1761:1: (lv_buffer_2_0= ruleBufferMapExpr )
            {
            // InternalMtctl.g:1761:1: (lv_buffer_2_0= ruleBufferMapExpr )
            // InternalMtctl.g:1762:3: lv_buffer_2_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageDiscardedExprAccess().getBufferBufferMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_buffer_2_0=ruleBufferMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageDiscardedExprRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.BufferMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageDiscardedExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageDiscardedExpr"


    // $ANTLR start "entryRuleTransitionExpr"
    // InternalMtctl.g:1790:1: entryRuleTransitionExpr returns [EObject current=null] : iv_ruleTransitionExpr= ruleTransitionExpr EOF ;
    public final EObject entryRuleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionExpr = null;


        try {
            // InternalMtctl.g:1791:2: (iv_ruleTransitionExpr= ruleTransitionExpr EOF )
            // InternalMtctl.g:1792:2: iv_ruleTransitionExpr= ruleTransitionExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransitionExpr=ruleTransitionExpr();

            state._fsp--;

             current =iv_ruleTransitionExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransitionExpr"


    // $ANTLR start "ruleTransitionExpr"
    // InternalMtctl.g:1799:1: ruleTransitionExpr returns [EObject current=null] : this_TransitionFiringExpr_0= ruleTransitionFiringExpr ;
    public final EObject ruleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionFiringExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1802:28: (this_TransitionFiringExpr_0= ruleTransitionFiringExpr )
            // InternalMtctl.g:1804:5: this_TransitionFiringExpr_0= ruleTransitionFiringExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionExprAccess().getTransitionFiringExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_TransitionFiringExpr_0=ruleTransitionFiringExpr();

            state._fsp--;

             
                    current = this_TransitionFiringExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionExpr"


    // $ANTLR start "entryRuleTransitionFiringExpr"
    // InternalMtctl.g:1820:1: entryRuleTransitionFiringExpr returns [EObject current=null] : iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF ;
    public final EObject entryRuleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFiringExpr = null;


        try {
            // InternalMtctl.g:1821:2: (iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF )
            // InternalMtctl.g:1822:2: iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionFiringExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransitionFiringExpr=ruleTransitionFiringExpr();

            state._fsp--;

             current =iv_ruleTransitionFiringExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransitionFiringExpr"


    // $ANTLR start "ruleTransitionFiringExpr"
    // InternalMtctl.g:1829:1: ruleTransitionFiringExpr returns [EObject current=null] : (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1832:28: ( (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:1833:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:1833:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:1833:3: otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionFiringExprAccess().getTransitionFiringKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionFiringExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:1841:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // InternalMtctl.g:1842:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // InternalMtctl.g:1842:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // InternalMtctl.g:1843:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTransitionFiringExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionFiringExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionFiringExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionFiringExpr"


    // $ANTLR start "entryRuleComparisonExpr"
    // InternalMtctl.g:1871:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // InternalMtctl.g:1872:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // InternalMtctl.g:1873:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonExpr"


    // $ANTLR start "ruleComparisonExpr"
    // InternalMtctl.g:1880:1: ruleComparisonExpr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1883:28: ( ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) )
            // InternalMtctl.g:1884:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            {
            // InternalMtctl.g:1884:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            // InternalMtctl.g:1884:2: () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) )
            {
            // InternalMtctl.g:1884:2: ()
            // InternalMtctl.g:1885:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComparisonExprAccess().getComparisonExprAction_0(),
                        current);
                

            }

            // InternalMtctl.g:1890:2: ( (lv_lhs_1_0= ruleMapExpr ) )
            // InternalMtctl.g:1891:1: (lv_lhs_1_0= ruleMapExpr )
            {
            // InternalMtctl.g:1891:1: (lv_lhs_1_0= ruleMapExpr )
            // InternalMtctl.g:1892:3: lv_lhs_1_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsMapExprParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_lhs_1_0=ruleMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMtctl.g:1908:2: ( (lv_op_2_0= ruleComparisonOp ) )
            // InternalMtctl.g:1909:1: (lv_op_2_0= ruleComparisonOp )
            {
            // InternalMtctl.g:1909:1: (lv_op_2_0= ruleComparisonOp )
            // InternalMtctl.g:1910:3: lv_op_2_0= ruleComparisonOp
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOpComparisonOpEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
            lv_op_2_0=ruleComparisonOp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.ComparisonOp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMtctl.g:1926:2: ( (lv_rhs_3_0= ruleMapExpr ) )
            // InternalMtctl.g:1927:1: (lv_rhs_3_0= ruleMapExpr )
            {
            // InternalMtctl.g:1927:1: (lv_rhs_3_0= ruleMapExpr )
            // InternalMtctl.g:1928:3: lv_rhs_3_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsMapExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_rhs_3_0=ruleMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpr"


    // $ANTLR start "entryRuleMapExpr"
    // InternalMtctl.g:1952:1: entryRuleMapExpr returns [EObject current=null] : iv_ruleMapExpr= ruleMapExpr EOF ;
    public final EObject entryRuleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpr = null;


        try {
            // InternalMtctl.g:1953:2: (iv_ruleMapExpr= ruleMapExpr EOF )
            // InternalMtctl.g:1954:2: iv_ruleMapExpr= ruleMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapExpr=ruleMapExpr();

            state._fsp--;

             current =iv_ruleMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapExpr"


    // $ANTLR start "ruleMapExpr"
    // InternalMtctl.g:1961:1: ruleMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) ;
    public final EObject ruleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_BufferMessageCountExpr_1 = null;

        EObject this_ConstExpr_2 = null;

        EObject this_SourceStateExpr_3 = null;

        EObject this_TargetStateExpr_4 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:1964:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) )
            // InternalMtctl.g:1965:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            {
            // InternalMtctl.g:1965:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_QNAME:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case 64:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMtctl.g:1966:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:1976:5: this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getBufferMessageCountExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BufferMessageCountExpr_1=ruleBufferMessageCountExpr();

                    state._fsp--;

                     
                            current = this_BufferMessageCountExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:1986:5: this_ConstExpr_2= ruleConstExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getConstExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ConstExpr_2=ruleConstExpr();

                    state._fsp--;

                     
                            current = this_ConstExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:1996:5: this_SourceStateExpr_3= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getSourceStateExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SourceStateExpr_3=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalMtctl.g:2006:5: this_TargetStateExpr_4= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getTargetStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TargetStateExpr_4=ruleTargetStateExpr();

                    state._fsp--;

                     
                            current = this_TargetStateExpr_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapExpr"


    // $ANTLR start "entryRuleTransitionMapExpr"
    // InternalMtctl.g:2024:1: entryRuleTransitionMapExpr returns [EObject current=null] : iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF ;
    public final EObject entryRuleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMapExpr = null;


        try {
            // InternalMtctl.g:2025:2: (iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF )
            // InternalMtctl.g:2026:2: iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransitionMapExpr=ruleTransitionMapExpr();

            state._fsp--;

             current =iv_ruleTransitionMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransitionMapExpr"


    // $ANTLR start "ruleTransitionMapExpr"
    // InternalMtctl.g:2033:1: ruleTransitionMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2036:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // InternalMtctl.g:2038:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionMapExpr"


    // $ANTLR start "entryRuleStateMapExpr"
    // InternalMtctl.g:2054:1: entryRuleStateMapExpr returns [EObject current=null] : iv_ruleStateMapExpr= ruleStateMapExpr EOF ;
    public final EObject entryRuleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMapExpr = null;


        try {
            // InternalMtctl.g:2055:2: (iv_ruleStateMapExpr= ruleStateMapExpr EOF )
            // InternalMtctl.g:2056:2: iv_ruleStateMapExpr= ruleStateMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStateMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStateMapExpr=ruleStateMapExpr();

            state._fsp--;

             current =iv_ruleStateMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateMapExpr"


    // $ANTLR start "ruleStateMapExpr"
    // InternalMtctl.g:2063:1: ruleStateMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) ;
    public final EObject ruleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_SourceStateExpr_1 = null;

        EObject this_TargetStateExpr_2 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2066:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) )
            // InternalMtctl.g:2067:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            {
            // InternalMtctl.g:2067:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_QNAME:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMtctl.g:2068:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:2078:5: this_SourceStateExpr_1= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getSourceStateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SourceStateExpr_1=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:2088:5: this_TargetStateExpr_2= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getTargetStateExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TargetStateExpr_2=ruleTargetStateExpr();

                    state._fsp--;

                     
                            current = this_TargetStateExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMapExpr"


    // $ANTLR start "entryRuleStatechartMapExpr"
    // InternalMtctl.g:2104:1: entryRuleStatechartMapExpr returns [EObject current=null] : iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF ;
    public final EObject entryRuleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartMapExpr = null;


        try {
            // InternalMtctl.g:2105:2: (iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF )
            // InternalMtctl.g:2106:2: iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStatechartMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStatechartMapExpr=ruleStatechartMapExpr();

            state._fsp--;

             current =iv_ruleStatechartMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatechartMapExpr"


    // $ANTLR start "ruleStatechartMapExpr"
    // InternalMtctl.g:2113:1: ruleStatechartMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2116:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // InternalMtctl.g:2118:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getStatechartMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatechartMapExpr"


    // $ANTLR start "entryRuleBufferMapExpr"
    // InternalMtctl.g:2134:1: entryRuleBufferMapExpr returns [EObject current=null] : iv_ruleBufferMapExpr= ruleBufferMapExpr EOF ;
    public final EObject entryRuleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMapExpr = null;


        try {
            // InternalMtctl.g:2135:2: (iv_ruleBufferMapExpr= ruleBufferMapExpr EOF )
            // InternalMtctl.g:2136:2: iv_ruleBufferMapExpr= ruleBufferMapExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBufferMapExpr=ruleBufferMapExpr();

            state._fsp--;

             current =iv_ruleBufferMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBufferMapExpr"


    // $ANTLR start "ruleBufferMapExpr"
    // InternalMtctl.g:2143:1: ruleBufferMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2146:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // InternalMtctl.g:2148:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getBufferMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBufferMapExpr"


    // $ANTLR start "entryRuleMessageMapExpr"
    // InternalMtctl.g:2164:1: entryRuleMessageMapExpr returns [EObject current=null] : iv_ruleMessageMapExpr= ruleMessageMapExpr EOF ;
    public final EObject entryRuleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageMapExpr = null;


        try {
            // InternalMtctl.g:2165:2: (iv_ruleMessageMapExpr= ruleMessageMapExpr EOF )
            // InternalMtctl.g:2166:2: iv_ruleMessageMapExpr= ruleMessageMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMessageMapExpr=ruleMessageMapExpr();

            state._fsp--;

             current =iv_ruleMessageMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageMapExpr"


    // $ANTLR start "ruleMessageMapExpr"
    // InternalMtctl.g:2173:1: ruleMessageMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2176:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // InternalMtctl.g:2178:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getMessageMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageMapExpr"


    // $ANTLR start "entryRuleBufferMessageCountExpr"
    // InternalMtctl.g:2194:1: entryRuleBufferMessageCountExpr returns [EObject current=null] : iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF ;
    public final EObject entryRuleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMessageCountExpr = null;


        try {
            // InternalMtctl.g:2195:2: (iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF )
            // InternalMtctl.g:2196:2: iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMessageCountExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBufferMessageCountExpr=ruleBufferMessageCountExpr();

            state._fsp--;

             current =iv_ruleBufferMessageCountExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBufferMessageCountExpr"


    // $ANTLR start "ruleBufferMessageCountExpr"
    // InternalMtctl.g:2203:1: ruleBufferMessageCountExpr returns [EObject current=null] : (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_buffer_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2206:28: ( (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:2207:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:2207:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:2207:3: otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getBufferMessageCountExprAccess().getBufferMessageCountKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getBufferMessageCountExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:2215:1: ( (lv_buffer_2_0= ruleBufferMapExpr ) )
            // InternalMtctl.g:2216:1: (lv_buffer_2_0= ruleBufferMapExpr )
            {
            // InternalMtctl.g:2216:1: (lv_buffer_2_0= ruleBufferMapExpr )
            // InternalMtctl.g:2217:3: lv_buffer_2_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getBufferMessageCountExprAccess().getBufferBufferMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_buffer_2_0=ruleBufferMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBufferMessageCountExprRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.BufferMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getBufferMessageCountExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBufferMessageCountExpr"


    // $ANTLR start "entryRuleSourceStateExpr"
    // InternalMtctl.g:2245:1: entryRuleSourceStateExpr returns [EObject current=null] : iv_ruleSourceStateExpr= ruleSourceStateExpr EOF ;
    public final EObject entryRuleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStateExpr = null;


        try {
            // InternalMtctl.g:2246:2: (iv_ruleSourceStateExpr= ruleSourceStateExpr EOF )
            // InternalMtctl.g:2247:2: iv_ruleSourceStateExpr= ruleSourceStateExpr EOF
            {
             newCompositeNode(grammarAccess.getSourceStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSourceStateExpr=ruleSourceStateExpr();

            state._fsp--;

             current =iv_ruleSourceStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSourceStateExpr"


    // $ANTLR start "ruleSourceStateExpr"
    // InternalMtctl.g:2254:1: ruleSourceStateExpr returns [EObject current=null] : (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2257:28: ( (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:2258:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:2258:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:2258:3: otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getSourceStateExprAccess().getSourceStateKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getSourceStateExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:2266:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // InternalMtctl.g:2267:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // InternalMtctl.g:2267:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // InternalMtctl.g:2268:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSourceStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceStateExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getSourceStateExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceStateExpr"


    // $ANTLR start "entryRuleTargetStateExpr"
    // InternalMtctl.g:2296:1: entryRuleTargetStateExpr returns [EObject current=null] : iv_ruleTargetStateExpr= ruleTargetStateExpr EOF ;
    public final EObject entryRuleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetStateExpr = null;


        try {
            // InternalMtctl.g:2297:2: (iv_ruleTargetStateExpr= ruleTargetStateExpr EOF )
            // InternalMtctl.g:2298:2: iv_ruleTargetStateExpr= ruleTargetStateExpr EOF
            {
             newCompositeNode(grammarAccess.getTargetStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTargetStateExpr=ruleTargetStateExpr();

            state._fsp--;

             current =iv_ruleTargetStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTargetStateExpr"


    // $ANTLR start "ruleTargetStateExpr"
    // InternalMtctl.g:2305:1: ruleTargetStateExpr returns [EObject current=null] : (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2308:28: ( (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // InternalMtctl.g:2309:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // InternalMtctl.g:2309:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // InternalMtctl.g:2309:3: otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_0, grammarAccess.getTargetStateExprAccess().getTargetStateKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_1, grammarAccess.getTargetStateExprAccess().getLeftParenthesisKeyword_1());
                
            // InternalMtctl.g:2317:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // InternalMtctl.g:2318:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // InternalMtctl.g:2318:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // InternalMtctl.g:2319:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTargetStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetStateExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getTargetStateExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetStateExpr"


    // $ANTLR start "entryRuleMumlElemExpr"
    // InternalMtctl.g:2347:1: entryRuleMumlElemExpr returns [EObject current=null] : iv_ruleMumlElemExpr= ruleMumlElemExpr EOF ;
    public final EObject entryRuleMumlElemExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMumlElemExpr = null;


        try {
            // InternalMtctl.g:2348:2: (iv_ruleMumlElemExpr= ruleMumlElemExpr EOF )
            // InternalMtctl.g:2349:2: iv_ruleMumlElemExpr= ruleMumlElemExpr EOF
            {
             newCompositeNode(grammarAccess.getMumlElemExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMumlElemExpr=ruleMumlElemExpr();

            state._fsp--;

             current =iv_ruleMumlElemExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMumlElemExpr"


    // $ANTLR start "ruleMumlElemExpr"
    // InternalMtctl.g:2356:1: ruleMumlElemExpr returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleMumlElemExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:2359:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? ) )
            // InternalMtctl.g:2360:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? )
            {
            // InternalMtctl.g:2360:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? )
            // InternalMtctl.g:2360:2: ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )?
            {
            // InternalMtctl.g:2360:2: ( ( ruleQualifiedName ) )
            // InternalMtctl.g:2361:1: ( ruleQualifiedName )
            {
            // InternalMtctl.g:2361:1: ( ruleQualifiedName )
            // InternalMtctl.g:2362:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMumlElemExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMumlElemExprAccess().getElemEObjectCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMtctl.g:2375:2: (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMtctl.g:2375:4: otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_1, grammarAccess.getMumlElemExprAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // InternalMtctl.g:2379:1: ( ( ruleQualifiedName ) )
                    // InternalMtctl.g:2380:1: ( ruleQualifiedName )
                    {
                    // InternalMtctl.g:2380:1: ( ruleQualifiedName )
                    // InternalMtctl.g:2381:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMumlElemExprRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMumlElemExprAccess().getInstanceEObjectCrossReference_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_25);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_3, grammarAccess.getMumlElemExprAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMumlElemExpr"


    // $ANTLR start "entryRuleConstExpr"
    // InternalMtctl.g:2406:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // InternalMtctl.g:2407:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // InternalMtctl.g:2408:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
             newCompositeNode(grammarAccess.getConstExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstExpr=ruleConstExpr();

            state._fsp--;

             current =iv_ruleConstExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstExpr"


    // $ANTLR start "ruleConstExpr"
    // InternalMtctl.g:2415:1: ruleConstExpr returns [EObject current=null] : ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2418:28: ( ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) )
            // InternalMtctl.g:2419:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            {
            // InternalMtctl.g:2419:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            // InternalMtctl.g:2419:2: ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            {
            // InternalMtctl.g:2419:2: ( (lv_val_0_0= ruleEInt ) )
            // InternalMtctl.g:2420:1: (lv_val_0_0= ruleEInt )
            {
            // InternalMtctl.g:2420:1: (lv_val_0_0= ruleEInt )
            // InternalMtctl.g:2421:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConstExprAccess().getValEIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_26);
            lv_val_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstExprRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_0_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalMtctl.g:2437:2: ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=48 && LA21_0<=54)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMtctl.g:2438:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    {
                    // InternalMtctl.g:2438:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    // InternalMtctl.g:2439:3: lv_timeUnit_1_0= ruleTimeUnitExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstExprAccess().getTimeUnitTimeUnitExprParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_timeUnit_1_0=ruleTimeUnitExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstExprRule());
                    	        }
                           		set(
                           			current, 
                           			"timeUnit",
                            		lv_timeUnit_1_0, 
                            		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.TimeUnitExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstExpr"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // InternalMtctl.g:2463:1: entryRuleTimeUnitExpr returns [String current=null] : iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF ;
    public final String entryRuleTimeUnitExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnitExpr = null;


        try {
            // InternalMtctl.g:2464:2: (iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF )
            // InternalMtctl.g:2465:2: iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTimeUnitExpr=ruleTimeUnitExpr();

            state._fsp--;

             current =iv_ruleTimeUnitExpr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeUnitExpr"


    // $ANTLR start "ruleTimeUnitExpr"
    // InternalMtctl.g:2472:1: ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00C2\\u00B5secs' | kw= 'nsecs' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnitExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:2475:28: ( (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00C2\\u00B5secs' | kw= 'nsecs' ) )
            // InternalMtctl.g:2476:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00C2\\u00B5secs' | kw= 'nsecs' )
            {
            // InternalMtctl.g:2476:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00C2\\u00B5secs' | kw= 'nsecs' )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 50:
                {
                alt22=3;
                }
                break;
            case 51:
                {
                alt22=4;
                }
                break;
            case 52:
                {
                alt22=5;
                }
                break;
            case 53:
                {
                alt22=6;
                }
                break;
            case 54:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMtctl.g:2477:2: kw= 'days'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDaysKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:2484:2: kw= 'hrs'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHrsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:2491:2: kw= 'mins'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMinsKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:2498:2: kw= 'secs'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalMtctl.g:2505:2: kw= 'msecs'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMsecsKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalMtctl.g:2512:2: kw= '\\u00C2\\u00B5secs'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // InternalMtctl.g:2519:2: kw= 'nsecs'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getNsecsKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnitExpr"


    // $ANTLR start "entryRuleSetExpr"
    // InternalMtctl.g:2532:1: entryRuleSetExpr returns [EObject current=null] : iv_ruleSetExpr= ruleSetExpr EOF ;
    public final EObject entryRuleSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpr = null;


        try {
            // InternalMtctl.g:2533:2: (iv_ruleSetExpr= ruleSetExpr EOF )
            // InternalMtctl.g:2534:2: iv_ruleSetExpr= ruleSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSetExpr=ruleSetExpr();

            state._fsp--;

             current =iv_ruleSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetExpr"


    // $ANTLR start "ruleSetExpr"
    // InternalMtctl.g:2541:1: ruleSetExpr returns [EObject current=null] : (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) ) ;
    public final EObject ruleSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_InstanceSetExpr_0 = null;

        EObject this_SubinstanceSetExpr_1 = null;

        EObject this_IntervalSetExpr_2 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2544:28: ( (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) ) )
            // InternalMtctl.g:2545:1: (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) )
            {
            // InternalMtctl.g:2545:1: (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt23=1;
                }
                break;
            case 63:
                {
                alt23=2;
                }
                break;
            case 46:
                {
                alt23=3;
                }
                break;
            case 55:
                {
                alt23=4;
                }
                break;
            case 56:
                {
                alt23=5;
                }
                break;
            case 57:
                {
                alt23=6;
                }
                break;
            case 58:
                {
                alt23=7;
                }
                break;
            case 59:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMtctl.g:2546:5: this_InstanceSetExpr_0= ruleInstanceSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getInstanceSetExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InstanceSetExpr_0=ruleInstanceSetExpr();

                    state._fsp--;

                     
                            current = this_InstanceSetExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:2556:5: this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getSubinstanceSetExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SubinstanceSetExpr_1=ruleSubinstanceSetExpr();

                    state._fsp--;

                     
                            current = this_SubinstanceSetExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalMtctl.g:2566:5: this_IntervalSetExpr_2= ruleIntervalSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getIntervalSetExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntervalSetExpr_2=ruleIntervalSetExpr();

                    state._fsp--;

                     
                            current = this_IntervalSetExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalMtctl.g:2575:6: ( () otherlv_4= 'States' )
                    {
                    // InternalMtctl.g:2575:6: ( () otherlv_4= 'States' )
                    // InternalMtctl.g:2575:7: () otherlv_4= 'States'
                    {
                    // InternalMtctl.g:2575:7: ()
                    // InternalMtctl.g:2576:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getStateSetExprAction_3_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetExprAccess().getStatesKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalMtctl.g:2586:6: ( () otherlv_6= 'Transitions' )
                    {
                    // InternalMtctl.g:2586:6: ( () otherlv_6= 'Transitions' )
                    // InternalMtctl.g:2586:7: () otherlv_6= 'Transitions'
                    {
                    // InternalMtctl.g:2586:7: ()
                    // InternalMtctl.g:2587:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getTransitionSetExprAction_4_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getSetExprAccess().getTransitionsKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalMtctl.g:2597:6: ( () otherlv_8= 'MessageTypes' )
                    {
                    // InternalMtctl.g:2597:6: ( () otherlv_8= 'MessageTypes' )
                    // InternalMtctl.g:2597:7: () otherlv_8= 'MessageTypes'
                    {
                    // InternalMtctl.g:2597:7: ()
                    // InternalMtctl.g:2598:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getMessageSetExprAction_5_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,57,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getSetExprAccess().getMessageTypesKeyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalMtctl.g:2608:6: ( () otherlv_10= 'Clocks' )
                    {
                    // InternalMtctl.g:2608:6: ( () otherlv_10= 'Clocks' )
                    // InternalMtctl.g:2608:7: () otherlv_10= 'Clocks'
                    {
                    // InternalMtctl.g:2608:7: ()
                    // InternalMtctl.g:2609:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getClockSetExprAction_6_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetExprAccess().getClocksKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalMtctl.g:2619:6: ( () otherlv_12= 'Buffers' )
                    {
                    // InternalMtctl.g:2619:6: ( () otherlv_12= 'Buffers' )
                    // InternalMtctl.g:2619:7: () otherlv_12= 'Buffers'
                    {
                    // InternalMtctl.g:2619:7: ()
                    // InternalMtctl.g:2620:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getBufferSetExprAction_7_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,59,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getSetExprAccess().getBuffersKeyword_7_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetExpr"


    // $ANTLR start "entryRuleIntervalSetExpr"
    // InternalMtctl.g:2637:1: entryRuleIntervalSetExpr returns [EObject current=null] : iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF ;
    public final EObject entryRuleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervalSetExpr = null;


        try {
            // InternalMtctl.g:2638:2: (iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF )
            // InternalMtctl.g:2639:2: iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF
            {
             newCompositeNode(grammarAccess.getIntervalSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntervalSetExpr=ruleIntervalSetExpr();

            state._fsp--;

             current =iv_ruleIntervalSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntervalSetExpr"


    // $ANTLR start "ruleIntervalSetExpr"
    // InternalMtctl.g:2646:1: ruleIntervalSetExpr returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lowerVal_2_0=null;
        Token otherlv_3=null;
        Token lv_upperVal_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:2649:28: ( ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // InternalMtctl.g:2650:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // InternalMtctl.g:2650:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            // InternalMtctl.g:2650:2: () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // InternalMtctl.g:2650:2: ()
            // InternalMtctl.g:2651:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntervalSetExprAccess().getIntervalSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_27); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalSetExprAccess().getLeftSquareBracketKeyword_1());
                
            // InternalMtctl.g:2660:1: ( (lv_lowerVal_2_0= RULE_INT ) )
            // InternalMtctl.g:2661:1: (lv_lowerVal_2_0= RULE_INT )
            {
            // InternalMtctl.g:2661:1: (lv_lowerVal_2_0= RULE_INT )
            // InternalMtctl.g:2662:3: lv_lowerVal_2_0= RULE_INT
            {
            lv_lowerVal_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_21); 

            			newLeafNode(lv_lowerVal_2_0, grammarAccess.getIntervalSetExprAccess().getLowerValINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntervalSetExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerVal",
                    		lv_lowerVal_2_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_27); 

                	newLeafNode(otherlv_3, grammarAccess.getIntervalSetExprAccess().getCommaKeyword_3());
                
            // InternalMtctl.g:2682:1: ( (lv_upperVal_4_0= RULE_INT ) )
            // InternalMtctl.g:2683:1: (lv_upperVal_4_0= RULE_INT )
            {
            // InternalMtctl.g:2683:1: (lv_upperVal_4_0= RULE_INT )
            // InternalMtctl.g:2684:3: lv_upperVal_4_0= RULE_INT
            {
            lv_upperVal_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); 

            			newLeafNode(lv_upperVal_4_0, grammarAccess.getIntervalSetExprAccess().getUpperValINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntervalSetExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upperVal",
                    		lv_upperVal_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getIntervalSetExprAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntervalSetExpr"


    // $ANTLR start "entryRuleInstanceSetExpr"
    // InternalMtctl.g:2712:1: entryRuleInstanceSetExpr returns [EObject current=null] : iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF ;
    public final EObject entryRuleInstanceSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSetExpr = null;


        try {
            // InternalMtctl.g:2713:2: (iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF )
            // InternalMtctl.g:2714:2: iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF
            {
             newCompositeNode(grammarAccess.getInstanceSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInstanceSetExpr=ruleInstanceSetExpr();

            state._fsp--;

             current =iv_ruleInstanceSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstanceSetExpr"


    // $ANTLR start "ruleInstanceSetExpr"
    // InternalMtctl.g:2721:1: ruleInstanceSetExpr returns [EObject current=null] : ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) ;
    public final EObject ruleInstanceSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2724:28: ( ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) )
            // InternalMtctl.g:2725:1: ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            {
            // InternalMtctl.g:2725:1: ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            // InternalMtctl.g:2725:2: () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>'
            {
            // InternalMtctl.g:2725:2: ()
            // InternalMtctl.g:2726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInstanceSetExprAccess().getInstanceSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_28); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceSetExprAccess().getInstancesKeyword_1());
                
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getInstanceSetExprAccess().getLessThanSignKeyword_2());
                
            // InternalMtctl.g:2739:1: ( (lv_type_3_0= ruleMumlElemExpr ) )
            // InternalMtctl.g:2740:1: (lv_type_3_0= ruleMumlElemExpr )
            {
            // InternalMtctl.g:2740:1: (lv_type_3_0= ruleMumlElemExpr )
            // InternalMtctl.g:2741:3: lv_type_3_0= ruleMumlElemExpr
            {
             
            	        newCompositeNode(grammarAccess.getInstanceSetExprAccess().getTypeMumlElemExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_29);
            lv_type_3_0=ruleMumlElemExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceSetExprRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MumlElemExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getInstanceSetExprAccess().getGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceSetExpr"


    // $ANTLR start "entryRuleSubinstanceSetExpr"
    // InternalMtctl.g:2769:1: entryRuleSubinstanceSetExpr returns [EObject current=null] : iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF ;
    public final EObject entryRuleSubinstanceSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubinstanceSetExpr = null;


        try {
            // InternalMtctl.g:2770:2: (iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF )
            // InternalMtctl.g:2771:2: iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSubinstanceSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubinstanceSetExpr=ruleSubinstanceSetExpr();

            state._fsp--;

             current =iv_ruleSubinstanceSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubinstanceSetExpr"


    // $ANTLR start "ruleSubinstanceSetExpr"
    // InternalMtctl.g:2778:1: ruleSubinstanceSetExpr returns [EObject current=null] : ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) ;
    public final EObject ruleSubinstanceSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // InternalMtctl.g:2781:28: ( ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) )
            // InternalMtctl.g:2782:1: ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            {
            // InternalMtctl.g:2782:1: ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            // InternalMtctl.g:2782:2: () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>'
            {
            // InternalMtctl.g:2782:2: ()
            // InternalMtctl.g:2783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubinstanceSetExprAccess().getSubinstanceSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_28); 

                	newLeafNode(otherlv_1, grammarAccess.getSubinstanceSetExprAccess().getSubinstancesKeyword_1());
                
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_2, grammarAccess.getSubinstanceSetExprAccess().getLessThanSignKeyword_2());
                
            // InternalMtctl.g:2796:1: ( (lv_type_3_0= ruleMumlElemExpr ) )
            // InternalMtctl.g:2797:1: (lv_type_3_0= ruleMumlElemExpr )
            {
            // InternalMtctl.g:2797:1: (lv_type_3_0= ruleMumlElemExpr )
            // InternalMtctl.g:2798:3: lv_type_3_0= ruleMumlElemExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubinstanceSetExprAccess().getTypeMumlElemExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_29);
            lv_type_3_0=ruleMumlElemExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubinstanceSetExprRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"org.muml.uppaal.adapter.mtctl.xtext.Mtctl.MumlElemExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getSubinstanceSetExprAccess().getGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubinstanceSetExpr"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMtctl.g:2826:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMtctl.g:2827:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMtctl.g:2828:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMtctl.g:2835:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QNAME_0= RULE_QNAME | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QNAME_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:2838:28: ( (this_QNAME_0= RULE_QNAME | this_ID_1= RULE_ID ) )
            // InternalMtctl.g:2839:1: (this_QNAME_0= RULE_QNAME | this_ID_1= RULE_ID )
            {
            // InternalMtctl.g:2839:1: (this_QNAME_0= RULE_QNAME | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_QNAME) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMtctl.g:2839:6: this_QNAME_0= RULE_QNAME
                    {
                    this_QNAME_0=(Token)match(input,RULE_QNAME,FollowSets000.FOLLOW_2); 

                    		current.merge(this_QNAME_0);
                        
                     
                        newLeafNode(this_QNAME_0, grammarAccess.getQualifiedNameAccess().getQNAMETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalMtctl.g:2847:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEInt"
    // InternalMtctl.g:2862:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMtctl.g:2863:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalMtctl.g:2864:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMtctl.g:2871:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalMtctl.g:2874:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMtctl.g:2875:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMtctl.g:2875:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMtctl.g:2875:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMtctl.g:2875:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMtctl.g:2876:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_27); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleComparisonOp"
    // InternalMtctl.g:2896:1: ruleComparisonOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparisonOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // InternalMtctl.g:2898:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalMtctl.g:2899:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalMtctl.g:2899:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt26=1;
                }
                break;
            case 62:
                {
                alt26=2;
                }
                break;
            case 66:
                {
                alt26=3;
                }
                break;
            case 61:
                {
                alt26=4;
                }
                break;
            case 67:
                {
                alt26=5;
                }
                break;
            case 68:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMtctl.g:2899:2: (enumLiteral_0= '==' )
                    {
                    // InternalMtctl.g:2899:2: (enumLiteral_0= '==' )
                    // InternalMtctl.g:2899:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalMtctl.g:2905:6: (enumLiteral_1= '>' )
                    {
                    // InternalMtctl.g:2905:6: (enumLiteral_1= '>' )
                    // InternalMtctl.g:2905:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalMtctl.g:2911:6: (enumLiteral_2= '>=' )
                    {
                    // InternalMtctl.g:2911:6: (enumLiteral_2= '>=' )
                    // InternalMtctl.g:2911:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalMtctl.g:2917:6: (enumLiteral_3= '<' )
                    {
                    // InternalMtctl.g:2917:6: (enumLiteral_3= '<' )
                    // InternalMtctl.g:2917:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalMtctl.g:2923:6: (enumLiteral_4= '<=' )
                    {
                    // InternalMtctl.g:2923:6: (enumLiteral_4= '<=' )
                    // InternalMtctl.g:2923:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,67,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalMtctl.g:2929:6: (enumLiteral_5= '!=' )
                    {
                    // InternalMtctl.g:2929:6: (enumLiteral_5= '!=' )
                    // InternalMtctl.g:2929:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,68,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getComparisonOpAccess().getNOT_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparisonOpAccess().getNOT_EQUALEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOp"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003FDFFFAE00E2L,0x0000000000000001L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00003FDFFFAE20E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00003FDFFFAE40E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00003FDFFFAE80E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003FDFFFAF00E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00003FDFFFAE00E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x9F80400000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003FDFFFBE00E0L,0x0000000000000001L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x6000000000000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x007F000000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x4000000000000000L});
    }


}