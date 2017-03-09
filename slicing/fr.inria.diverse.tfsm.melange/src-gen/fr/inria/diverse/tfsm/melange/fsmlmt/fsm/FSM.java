/**
 */
package fr.inria.diverse.tfsm.melange.fsmlmt.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getStates <em>States</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage#getFSM_States()
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.Transition#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage#getFSM_Transitions()
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.Transition#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(InitialState)
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage#getFSM_Initialstate()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage#getFSM_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FSM
