package fr.inria.diverse.expression.algebra.abstr;

import expression.BooleanAnd;
import expression.BooleanEqual;
import expression.BooleanExpression;
import expression.BooleanGreaterThan;
import expression.BooleanOr;
import expression.ConstExpr;
import expression.IntAdd;
import expression.IntBlock;
import expression.IntExpression;
import expression.IntMult;
import expression.IntNeg;
import expression.IntOperation;
import expression.IntVarAssign;
import expression.IntVarRef;

public interface ExpressionAlgebraDispatcherDefault<IE, BE, IO> extends ExpressionAlgebra<IE, BE, IO> {

	@Override
	public default BE $(final BooleanExpression booleanExpression) {
		final BE ret;
		if (booleanExpression instanceof BooleanEqual) {
			ret = this.booleanEqual((BooleanEqual) booleanExpression);
		} else if (booleanExpression instanceof BooleanAnd) {
			ret = this.booleanAnd((BooleanAnd) booleanExpression);
		} else if (booleanExpression instanceof BooleanOr) {
			ret = this.booleanOr((BooleanOr) booleanExpression);
		} else if (booleanExpression instanceof BooleanGreaterThan) {
			ret = this.booleanGreaterThan((BooleanGreaterThan) booleanExpression);

		} else {
			throw new RuntimeException("Unknow BooleanExpression " + booleanExpression);
		}
		return ret;
	}

	@Override
	public default IO $(final IntOperation intOperation) {
		final IO ret;
		if (intOperation instanceof IntVarAssign) {
			ret = this.intVarAssign((IntVarAssign) intOperation);
		} else if (intOperation instanceof IntBlock) {
			ret = this.intBlock((IntBlock) intOperation);
		} else {
			throw new RuntimeException("Unknow IntOperation " + intOperation);
		}
		return ret;
	}

	@Override
	public default IE $(final IntExpression intExpression) {
		final IE ret;
		if (intExpression instanceof IntMult) {
			ret = this.intMult((IntMult) intExpression);
		} else if (intExpression instanceof IntAdd) {
			ret = this.intAdd((IntAdd) intExpression);
		} else if (intExpression instanceof IntNeg) {
			ret = this.intNeg((IntNeg) intExpression);
		} else if (intExpression instanceof ConstExpr) {
			ret = this.constExpr((ConstExpr) intExpression);
		} else if (intExpression instanceof IntVarRef) {
			ret = this.intVarRef((IntVarRef) intExpression);
		} else {
			throw new RuntimeException("Unknow IntExpression " + intExpression);
		}

		return ret;
	}
}