/**
 */
package fr.inria.diverse.tfsm.melange.expressionlmt.expression.impl;

import fr.inria.diverse.tfsm.melange.expressionlmt.expression.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try {
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
			if (theExpressionFactory != null) {
				return theExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionPackage.INT_ADD: return createIntAdd();
			case ExpressionPackage.INT_MULT: return createIntMult();
			case ExpressionPackage.INT_NEG: return createIntNeg();
			case ExpressionPackage.INT_VAR_REF: return createIntVarRef();
			case ExpressionPackage.CONST_EXPR: return createConstExpr();
			case ExpressionPackage.INT_VAR_ASSIGN: return createIntVarAssign();
			case ExpressionPackage.INT_BLOCK: return createIntBlock();
			case ExpressionPackage.BOOLEAN_EQUAL: return createBooleanEqual();
			case ExpressionPackage.BOOLEAN_OR: return createBooleanOr();
			case ExpressionPackage.BOOLEAN_AND: return createBooleanAnd();
			case ExpressionPackage.BOOLEAN_GREATER_THAN: return createBooleanGreaterThan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAdd createIntAdd() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntMult createIntMult() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntNeg createIntNeg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarRef createIntVarRef() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpr createConstExpr() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarAssign createIntVarAssign() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBlock createIntBlock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanEqual createBooleanEqual() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOr createBooleanOr() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnd createBooleanAnd() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGreaterThan createBooleanGreaterThan() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
