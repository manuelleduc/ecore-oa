/**
 */
package fr.inria.diverse.tfsm.melange.gfsmlmt.fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getFsm <em>Fsm</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' container reference.
	 * @see #setFsm(FSM)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage#getTransition_Fsm()
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getFsm <em>Fsm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' container reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State#getOutgoingtransitions <em>Outgoingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage#getTransition_From()
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State#getOutgoingtransitions
	 * @model opposite="outgoingtransitions" required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State#getIncommingtransitions <em>Incommingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage#getTransition_To()
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State#getIncommingtransitions
	 * @model opposite="incommingtransitions" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // Transition
