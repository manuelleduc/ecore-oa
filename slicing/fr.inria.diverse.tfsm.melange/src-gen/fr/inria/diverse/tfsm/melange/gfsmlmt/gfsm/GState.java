/**
 */
package fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm;

import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntOperation;

import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getInExpression <em>In Expression</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getOutExpression <em>Out Expression</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage#getGState()
 * @model
 * @generated
 */
public interface GState extends State {
	/**
	 * Returns the value of the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Expression</em>' containment reference.
	 * @see #setInExpression(IntOperation)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage#getGState_InExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntOperation getInExpression();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getInExpression <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Expression</em>' containment reference.
	 * @see #getInExpression()
	 * @generated
	 */
	void setInExpression(IntOperation value);

	/**
	 * Returns the value of the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Expression</em>' containment reference.
	 * @see #setOutExpression(IntOperation)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage#getGState_OutExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntOperation getOutExpression();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getOutExpression <em>Out Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Expression</em>' containment reference.
	 * @see #getOutExpression()
	 * @generated
	 */
	void setOutExpression(IntOperation value);

} // GState
