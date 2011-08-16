package de.uni_siegen.informatik.bs.alvic;

/**
 * This exception is used to indicate that something does not have the type it
 * is supposed to.
 * 
 * @author Colin
 */
public class TypeMismatchException extends TypeException {
	private static final long serialVersionUID = 8394305381771635018L;

	/**
	 * The type that was expected when encountering the expression.
	 */
	protected Type expected;

	/**
	 * The type of the expression.
	 */
	protected Type given;

	/**
	 * The expression that has the wrong type.
	 */
	protected String expr;

	/**
	 * @param expected
	 *            The type that was expected.
	 * @param given
	 *            The type that was actually found.
	 * @param expr
	 *            The expression that has the wrong type.
	 * @param tree
	 *            The tree of the expression.
	 */
	public TypeMismatchException(Type expected, Type given, String expr, TypedTree tree) {
		super(tree);
		this.expected = expected;
		this.given = given;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "Type error " + getPos() + ": Found '" + expr
				+ "' which has type '" + given + "', but expected "
				+ "an expression of type '" + expected + "'.";
	}

	/**
	 * @return the type that was expected.
	 */
	public Type getExpected() {
		return expected;
	}

	/**
	 * @return the type that was actually found.
	 */
	public Type getGiven() {
		return given;
	}

	/**
	 * @return the expression with that type.
	 */
	public String getExpr() {
		return expr;
	}
}
