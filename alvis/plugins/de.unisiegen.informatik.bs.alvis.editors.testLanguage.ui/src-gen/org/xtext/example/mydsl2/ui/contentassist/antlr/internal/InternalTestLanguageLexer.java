package org.xtext.example.mydsl2.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestLanguageLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int Tokens=15;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public InternalTestLanguageLexer() {;} 
    public InternalTestLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:10:5: ( 'Datatype' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:10:7: 'Datatype'
            {
            match("Datatype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:11:5: ( 'entity' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:11:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:12:5: ( '{' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:12:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:13:5: ( '}' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:13:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:605:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:605:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:605:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:605:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:605:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:607:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:607:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:607:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:607:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("609:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:609:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:611:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:611:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:611:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:611:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:613:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:615:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:615:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:615:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:617:16: ( . )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:617:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:8: ( T11 | T12 | T13 | T14 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=11;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='D') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_13 = input.LA(3);

                if ( (LA12_13=='t') ) {
                    int LA12_23 = input.LA(4);

                    if ( (LA12_23=='a') ) {
                        int LA12_25 = input.LA(5);

                        if ( (LA12_25=='t') ) {
                            int LA12_27 = input.LA(6);

                            if ( (LA12_27=='y') ) {
                                int LA12_29 = input.LA(7);

                                if ( (LA12_29=='p') ) {
                                    int LA12_31 = input.LA(8);

                                    if ( (LA12_31=='e') ) {
                                        int LA12_33 = input.LA(9);

                                        if ( ((LA12_33>='0' && LA12_33<='9')||(LA12_33>='A' && LA12_33<='Z')||LA12_33=='_'||(LA12_33>='a' && LA12_33<='z')) ) {
                                            alt12=5;
                                        }
                                        else {
                                            alt12=1;}
                                    }
                                    else {
                                        alt12=5;}
                                }
                                else {
                                    alt12=5;}
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=5;}
                }
                else {
                    alt12=5;}
            }
            else {
                alt12=5;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='n') ) {
                int LA12_15 = input.LA(3);

                if ( (LA12_15=='t') ) {
                    int LA12_24 = input.LA(4);

                    if ( (LA12_24=='i') ) {
                        int LA12_26 = input.LA(5);

                        if ( (LA12_26=='t') ) {
                            int LA12_28 = input.LA(6);

                            if ( (LA12_28=='y') ) {
                                int LA12_30 = input.LA(7);

                                if ( ((LA12_30>='0' && LA12_30<='9')||(LA12_30>='A' && LA12_30<='Z')||LA12_30=='_'||(LA12_30>='a' && LA12_30<='z')) ) {
                                    alt12=5;
                                }
                                else {
                                    alt12=2;}
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=5;}
                }
                else {
                    alt12=5;}
            }
            else {
                alt12=5;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=3;
        }
        else if ( (LA12_0=='}') ) {
            alt12=4;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_5 = input.LA(2);

            if ( ((LA12_5>='A' && LA12_5<='Z')||LA12_5=='_'||(LA12_5>='a' && LA12_5<='z')) ) {
                alt12=5;
            }
            else {
                alt12=11;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='E' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='z')) ) {
            alt12=5;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=6;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_8 = input.LA(2);

            if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFE')) ) {
                alt12=7;
            }
            else {
                alt12=11;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_9 = input.LA(2);

            if ( ((LA12_9>='\u0000' && LA12_9<='\uFFFE')) ) {
                alt12=7;
            }
            else {
                alt12=11;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=9;
                }
                break;
            case '*':
                {
                alt12=8;
                }
                break;
            default:
                alt12=11;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=10;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=11;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:26: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:34: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:43: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:55: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:71: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:87: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:1:95: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}