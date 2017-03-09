/**
 */
package fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm;

import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' expression='../../fr.inria.diverse.expression.model/model/expression.ecore#/' fsm='../../fr.inria.diverse.fsm.model/model/fsm.ecore#/'"
 * @generated
 */
public interface GfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.inria.diverse.tfsm.melange.gfsmlmt/gfsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GfsmPackage eINSTANCE = fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GTransitionImpl <em>GTransition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GTransitionImpl
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGTransition()
	 * @generated
	 */
	int GTRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION__FSM = FsmPackage.TRANSITION__FSM;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION__FROM = FsmPackage.TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION__TO = FsmPackage.TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION__EVENT = FsmPackage.TRANSITION__EVENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION__GUARD = FsmPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GTransition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTRANSITION_FEATURE_COUNT = FsmPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GStateImpl <em>GState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GStateImpl
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGState()
	 * @generated
	 */
	int GSTATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__NAME = FsmPackage.STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__FSM = FsmPackage.STATE__FSM;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__OUTGOINGTRANSITIONS = FsmPackage.STATE__OUTGOINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__INCOMMINGTRANSITIONS = FsmPackage.STATE__INCOMMINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__IN_EXPRESSION = FsmPackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE__OUT_EXPRESSION = FsmPackage.STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTATE_FEATURE_COUNT = FsmPackage.STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GInitialStateImpl <em>GInitial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GInitialStateImpl
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGInitialState()
	 * @generated
	 */
	int GINITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__NAME = GSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__FSM = GSTATE__FSM;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__OUTGOINGTRANSITIONS = GSTATE__OUTGOINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__INCOMMINGTRANSITIONS = GSTATE__INCOMMINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__IN_EXPRESSION = GSTATE__IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE__OUT_EXPRESSION = GSTATE__OUT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>GInitial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINITIAL_STATE_FEATURE_COUNT = GSTATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFinalStateImpl <em>GFinal State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFinalStateImpl
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGFinalState()
	 * @generated
	 */
	int GFINAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__NAME = GSTATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__FSM = GSTATE__FSM;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__OUTGOINGTRANSITIONS = GSTATE__OUTGOINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__INCOMMINGTRANSITIONS = GSTATE__INCOMMINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__IN_EXPRESSION = GSTATE__IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE__OUT_EXPRESSION = GSTATE__OUT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>GFinal State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFINAL_STATE_FEATURE_COUNT = GSTATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFSMImpl <em>GFSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFSMImpl
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGFSM()
	 * @generated
	 */
	int GFSM = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFSM__STATES = FsmPackage.FSM__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFSM__TRANSITIONS = FsmPackage.FSM__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFSM__INITIALSTATE = FsmPackage.FSM__INITIALSTATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFSM__NAME = FsmPackage.FSM__NAME;

	/**
	 * The number of structural features of the '<em>GFSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GFSM_FEATURE_COUNT = FsmPackage.FSM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition <em>GTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTransition</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition
	 * @generated
	 */
	EClass getGTransition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition#getGuard()
	 * @see #getGTransition()
	 * @generated
	 */
	EReference getGTransition_Guard();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState <em>GState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GState</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState
	 * @generated
	 */
	EClass getGState();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getInExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Expression</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getInExpression()
	 * @see #getGState()
	 * @generated
	 */
	EReference getGState_InExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getOutExpression <em>Out Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Expression</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState#getOutExpression()
	 * @see #getGState()
	 * @generated
	 */
	EReference getGState_OutExpression();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GInitialState <em>GInitial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GInitial State</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GInitialState
	 * @generated
	 */
	EClass getGInitialState();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFinalState <em>GFinal State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFinal State</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFinalState
	 * @generated
	 */
	EClass getGFinalState();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFSM <em>GFSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GFSM</em>'.
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFSM
	 * @generated
	 */
	EClass getGFSM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GfsmFactory getGfsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GTransitionImpl <em>GTransition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GTransitionImpl
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGTransition()
		 * @generated
		 */
		EClass GTRANSITION = eINSTANCE.getGTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTRANSITION__GUARD = eINSTANCE.getGTransition_Guard();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GStateImpl <em>GState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GStateImpl
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGState()
		 * @generated
		 */
		EClass GSTATE = eINSTANCE.getGState();

		/**
		 * The meta object literal for the '<em><b>In Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSTATE__IN_EXPRESSION = eINSTANCE.getGState_InExpression();

		/**
		 * The meta object literal for the '<em><b>Out Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSTATE__OUT_EXPRESSION = eINSTANCE.getGState_OutExpression();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GInitialStateImpl <em>GInitial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GInitialStateImpl
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGInitialState()
		 * @generated
		 */
		EClass GINITIAL_STATE = eINSTANCE.getGInitialState();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFinalStateImpl <em>GFinal State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFinalStateImpl
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGFinalState()
		 * @generated
		 */
		EClass GFINAL_STATE = eINSTANCE.getGFinalState();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFSMImpl <em>GFSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GFSMImpl
		 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl.GfsmPackageImpl#getGFSM()
		 * @generated
		 */
		EClass GFSM = eINSTANCE.getGFSM();

	}

} //GfsmPackage
