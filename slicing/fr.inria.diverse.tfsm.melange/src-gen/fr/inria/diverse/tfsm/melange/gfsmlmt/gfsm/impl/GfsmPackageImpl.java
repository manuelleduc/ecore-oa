/**
 */
package fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl;

import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage;

import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.impl.ExpressionPackageImpl;

import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage;

import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.impl.FsmPackageImpl;

import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFinalState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GInitialState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GfsmPackageImpl extends EPackageImpl implements GfsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gInitialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gFinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gfsmEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GfsmPackageImpl() {
		super(eNS_URI, GfsmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GfsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GfsmPackage init() {
		if (isInited) return (GfsmPackage)EPackage.Registry.INSTANCE.getEPackage(GfsmPackage.eNS_URI);

		// Obtain or create and register package
		GfsmPackageImpl theGfsmPackage = (GfsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GfsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GfsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmPackageImpl theFsmPackage = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI) : FsmPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theGfsmPackage.createPackageContents();
		theFsmPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theGfsmPackage.initializePackageContents();
		theFsmPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGfsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GfsmPackage.eNS_URI, theGfsmPackage);
		return theGfsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTransition() {
		return gTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTransition_Guard() {
		return (EReference)gTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGState() {
		return gStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGState_InExpression() {
		return (EReference)gStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGState_OutExpression() {
		return (EReference)gStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGInitialState() {
		return gInitialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGFinalState() {
		return gFinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGFSM() {
		return gfsmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmFactory getGfsmFactory() {
		return (GfsmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gTransitionEClass = createEClass(GTRANSITION);
		createEReference(gTransitionEClass, GTRANSITION__GUARD);

		gStateEClass = createEClass(GSTATE);
		createEReference(gStateEClass, GSTATE__IN_EXPRESSION);
		createEReference(gStateEClass, GSTATE__OUT_EXPRESSION);

		gInitialStateEClass = createEClass(GINITIAL_STATE);

		gFinalStateEClass = createEClass(GFINAL_STATE);

		gfsmEClass = createEClass(GFSM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FsmPackage theFsmPackage = (FsmPackage)EPackage.Registry.INSTANCE.getEPackage(FsmPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gTransitionEClass.getESuperTypes().add(theFsmPackage.getTransition());
		gStateEClass.getESuperTypes().add(theFsmPackage.getState());
		gInitialStateEClass.getESuperTypes().add(this.getGState());
		gInitialStateEClass.getESuperTypes().add(theFsmPackage.getInitialState());
		gFinalStateEClass.getESuperTypes().add(this.getGState());
		gFinalStateEClass.getESuperTypes().add(theFsmPackage.getFinalState());
		gfsmEClass.getESuperTypes().add(theFsmPackage.getFSM());

		// Initialize classes and features; add operations and parameters
		initEClass(gTransitionEClass, GTransition.class, "GTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGTransition_Guard(), theExpressionPackage.getBooleanExpression(), null, "guard", null, 1, 1, GTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gStateEClass, GState.class, "GState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGState_InExpression(), theExpressionPackage.getIntOperation(), null, "inExpression", null, 1, 1, GState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGState_OutExpression(), theExpressionPackage.getIntOperation(), null, "outExpression", null, 1, 1, GState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gInitialStateEClass, GInitialState.class, "GInitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gFinalStateEClass, GFinalState.class, "GFinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gfsmEClass, fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFSM.class, "GFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "expression", "../../fr.inria.diverse.expression.model/model/expression.ecore#/",
			 "fsm", "../../fr.inria.diverse.fsm.model/model/fsm.ecore#/"
		   });
	}

} //GfsmPackageImpl
