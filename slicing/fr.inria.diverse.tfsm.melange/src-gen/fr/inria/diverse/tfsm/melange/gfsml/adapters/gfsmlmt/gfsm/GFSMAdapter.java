package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.InitialState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFSM;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GFSMAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFSM> */ implements GFSM {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public GFSMAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<State> states_;
  
  @Override
  public EList<State> getStates() {
    if (states_ == null)
    	states_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStates(), adaptersFactory, eResource);
    return states_;
  }
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public InitialState getInitialstate() {
    return (InitialState) adaptersFactory.createAdapter(adaptee.getInitialstate(), eResource);
  }
  
  @Override
  public void setInitialstate(final InitialState o) {
    if (o != null)
    	adaptee.setInitialstate(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.InitialStateAdapter) o).getAdaptee());
    else adaptee.setInitialstate(null);
  }
  
  protected final static String NAME_EDEFAULT = "";
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.eINSTANCE.getGFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__STATES:
    		return getStates();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__TRANSITIONS:
    		return getTransitions();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__INITIALSTATE:
    		return getInitialstate();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__INITIALSTATE:
    		return getInitialstate() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__INITIALSTATE:
    		setInitialstate(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.InitialState)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GFSM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
