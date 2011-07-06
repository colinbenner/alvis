lexer grammar InternalMyDsl;
@header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '(' ;
T13 : ')' ;
T14 : ':' ;
T15 : 'main' ;
T16 : ',' ;
T17 : 'begin' ;
T18 : 'end' ;
T19 : 'String' ;
T20 : 'Integer' ;
T21 : 'Boolean' ;
T22 : 'Graph' ;
T23 : 'Vertex' ;
T24 : 'Edge' ;
T25 : 'Queue' ;
T26 : 'return' ;
T27 : 'if' ;
T28 : 'else' ;
T29 : 'for' ;
T30 : 'in' ;
T31 : 'while' ;
T32 : '[]' ;
T33 : '=' ;
T34 : '||' ;
T35 : '&&' ;
T36 : '==' ;
T37 : '!=' ;
T38 : '<' ;
T39 : '>' ;
T40 : '<=' ;
T41 : '>=' ;
T42 : '*' ;
T43 : '/' ;
T44 : '%' ;
T45 : '!' ;
T46 : '.' ;
T47 : '[' ;
T48 : ']' ;
T49 : 'true' ;
T50 : 'false' ;
T51 : 'null' ;
T52 : 'infty' ;
T53 : ';' ;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2337
RULE_SIGN : ('+'|'-');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2339
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2341
RULE_INT : ('0'..'9')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2343
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2345
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2347
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2349
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g" 2351
RULE_ANY_OTHER : .;


