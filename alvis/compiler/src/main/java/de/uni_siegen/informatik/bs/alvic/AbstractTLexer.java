/*
 * Copyright (c) 2011 Colin Benner
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.uni_siegen.informatik.bs.alvic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.RecognitionException;

/**
 * This is the super class for the lexer. It is extended by the lexer class
 * generated from TLexer.g.
 */
public abstract class AbstractTLexer extends Lexer {
	/**
	 * This is a Set of all type names that the compiler knows.
	 */
	protected static Set<String> types = new HashSet<String>();

	/**
	 * This is a list of all tokens the lexer encountered.
	 */
	protected List<Token> tokens = new ArrayList<Token>();

	/**
	 * List of the content of all tokens. For each token there is exactly one
	 * String with that token's content.
	 */
	protected List<String> tokenText;

	/**
	 * These are all the exceptions the lexer threw. They are accumulated so the
	 * GUI can present a list of all error to the user. We do this, so the user
	 * does not have to recompile after fixing a single error just to find out
	 * there is another error in their code.
	 */
	private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();

	/**
	 * Default constructor for the lexer, when you do not yet know what the
	 * character stream to be provided is.
	 */
	public AbstractTLexer() {
	}

	/**
	 * Create a new instance of the lexer using the given character stream as
	 * the input to lex into tokens.
	 * 
	 * @param input
	 *            A valid character stream that contains the ruleSrc code you
	 *            wish to compile (or lex at least)
	 */
	public AbstractTLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	/**
	 * Internal constructor for ANTLR - do not use.
	 * 
	 * @param input
	 *            The character stream we are going to lex
	 * @param state
	 *            The shared state object, shared between all lexer components
	 */
	public AbstractTLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	/**
	 * Tell the lexer which identifiers are type names.
	 * 
	 * @param typeNames
	 *            All the type names the lexer is supposed to add
	 */
	public static void addTypes(Collection<String> typeNames) {
		for (String s : typeNames)
			addType(s);
	}

	public static Collection<String> getTypes() {
		return types;
	}

	/**
	 * Add a type name to the list of types the compiler recognizes. When the
	 * name starts with a digit or contains any character not allowed in an
	 * identifier, it is ignored.
	 * 
	 * @param typeName
	 *            The name of the type that is added.
	 */
	private static void addType(String typeName) {
		if (!typeName.matches("^[0-9]") && !typeName.matches("[^A-Za-z0-9_]"))
			types.add(typeName);
	}

	/**
	 * Checks whether a given string is a type name.
	 * 
	 * @param name
	 *            An identifier
	 * @return true if 'name' is a type name, false otherwise
	 */
	public static boolean isTypeName(String name) {
		return types.contains(name);
	}

	/**
	 * Add all predefined types and keywords to a list. This is used for auto
	 * completion.
	 */
	abstract protected void allTokens();

	/**
	 * This method checks whether a token with the same text as the one given
	 * has already been encountered.
	 * 
	 * @param toCheck
	 *            The token to search for
	 * @return true iff a token with toCheck's text was encountered earlier.
	 */
	protected boolean isKnownToken(Token toCheck) {
		for (String s : tokenText)
			if (s.equals(toCheck.getText()))
				return true;

		return false;
	}

	/**
	 * Reads the input stream and adds all tokens that were recognized in the
	 * process to 'tokens'. This should only be used for testing as it consumes
	 * the input stream.
	 */
	public void scan() {
		while (this.nextToken() != Token.EOF_TOKEN)
			;
	}

	/**
	 * Add a copy of every token found in the input stream to the tokens list.
	 * 
	 * @return The next token
	 */
	@Override
	public Token nextToken() {
		Token tmp = super.nextToken();
		tokens.add(tmp);
		return tmp;
	}

	/**
	 * @return all exceptions that occurred.
	 */
	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	/**
	 * @return List of Tokens that are forbidden because they are Java keywords.
	 */
	public abstract List<Token> getForbidden();

	/**
	 * @return List of all identifiers used in the code
	 */
	public abstract List<Token> getIdentifiers();

	/**
	 * @return List of all keywords the compiler recognizes (e.g. 'if', 'else',
	 *         ...)
	 */
	public abstract List<Token> getKeywords();

	/**
	 * Provides a list of all the keywords the pseudo code language uses.
	 * 
	 * @return list of all keywords
	 */
	public static List<String> allKeywords() {
		String[] keywords = { "if", "else", "begin", "end", "for", "while",
				"in", "{", "}", ":" };
		return Arrays.asList(keywords);
	}

	/**
	 * Provides a list of all Java keywords we do not use. These can not be used
	 * as identifiers because that would cause syntax errors in the generated
	 * Java code.
	 * 
	 * @return a list of all forbidden words
	 */
	public static List<String> allForbidden() {
		String[] forbidden = { "abstract", "assert", "boolean", "byte",
				"catch", "class", "const", "default", "double", "enum",
				"extends", "final", "finally", "float", "goto", "implements",
				"import", "int", "instanceof", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return",
				"short", "static", "strictfp", "super", "synchronized", "this",
				"throw", "transient", "try", "void", "volatile" };
		return Arrays.asList(forbidden);
	}

	/**
	 * Get a token given its position. This is used for testing the lexer.
	 * 
	 * @param line
	 *            Starting at 1
	 * @param position
	 *            Starting at 0
	 * @return The Token at this position
	 */
	public Token getTokenByNumbers(int line, int position) {
		List<Token> t = new ArrayList<Token>(tokens);
		if (t.size()<=1)
			return null;
		t.remove(t.size()-1); // remove the EOF-token
		Collections.reverse(t);

		for (Token act : t) {
			if (act.getLine() < line || act.getLine() == line
					&& act.getCharPositionInLine() <= position) {
				return act;
			}
		}
		return t.get(0);
	}

	/**
	 * This is an internal method of ANTLR that is called whenever an exception
	 * occurs. It adds the exception to the list of exceptions.
	 * 
	 * @param e
	 *            The exception that occurred
	 */
	@Override
	public void reportError(RecognitionException e) {
		exceptions.add(e);
		super.reportError(e);
	}
}
