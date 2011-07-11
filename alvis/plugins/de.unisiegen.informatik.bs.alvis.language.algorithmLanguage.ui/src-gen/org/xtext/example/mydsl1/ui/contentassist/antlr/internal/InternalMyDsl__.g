lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'begin' ;
T13 : '{' ;
T14 : 'end' ;
T15 : '}' ;
T16 : 'String' ;
T17 : 'Integer' ;
T18 : 'Boolean' ;
T19 : 'Graph' ;
T20 : 'Vertex' ;
T21 : 'Edge' ;
T22 : 'Queue' ;
T23 : 'Stack' ;
T24 : '==' ;
T25 : '!=' ;
T26 : '<' ;
T27 : '>' ;
T28 : '<=' ;
T29 : '>=' ;
T30 : '*' ;
T31 : '/' ;
T32 : '%' ;
T33 : ',' ;
T34 : ';' ;
T35 : '(' ;
T36 : ')' ;
T37 : ':' ;
T38 : 'return' ;
T39 : 'if' ;
T40 : 'else' ;
T41 : 'for' ;
T42 : 'in' ;
T43 : 'while' ;
T44 : '[]' ;
T45 : '=' ;
T46 : '||' ;
T47 : '&&' ;
T48 : '!' ;
T49 : '.' ;
T50 : '[' ;
T51 : ']' ;
T52 : 'true' ;
T53 : 'false' ;
T54 : 'main' ;
T55 : 'null' ;
T56 : 'infty' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5627
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5629
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5631
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5633
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5635
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5637
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5639
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g" 5641
RULE_ANY_OTHER : .;


