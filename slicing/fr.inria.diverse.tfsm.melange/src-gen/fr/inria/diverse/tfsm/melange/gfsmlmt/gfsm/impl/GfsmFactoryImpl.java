/**
 */
package fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.impl;

import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.*;

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
public class GfsmFactoryImpl extends EFactoryImpl implements GfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GfsmFactory init() {
		try {
			GfsmFactory theGfsmFactory = (GfsmFactory)EPackage.Registry.INSTANCE.getEFactory(GfsmPackage.eNS_URI);
			if (theGfsmFactory != null) {
				return theGfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmFactoryImpl() {
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
			case GfsmPackage.GTRANSITION: return createGTransition();
			case GfsmPackage.GSTATE: return createGState();
			case GfsmPackage.GINITIAL_STATE: return createGInitialState();
			case GfsmPackage.GFINAL_STATE: return createGFinalState();
			case GfsmPackage.GFSM: return createGFSM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTransition createGTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GState createGState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GInitialState createGInitialState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFinalState createGFinalState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFSM createGFSM() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmPackage getGfsmPackage() {
		return (GfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GfsmPackage getPackage() {
		return GfsmPackage.eINSTANCE;
	}

} //GfsmFactoryImpl
