package fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.fsml.fsm.Transition;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.tfsm.melange.fsmlmt.fsm.Transition {
  private fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getEvent() {
    return adaptee.getEvent();
  }
  
  @Override
  public void setEvent(final String o) {
    adaptee.setEvent(o);
  }
  
  @Override
  public FSM getFsm() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getFsm(), eResource);
  }
  
  @Override
  public void setFsm(final FSM o) {
    if (o != null)
    	adaptee.setFsm(((fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FSMAdapter) o).getAdaptee());
    else adaptee.setFsm(null);
  }
  
  @Override
  public State getFrom() {
    return (State) adaptersFactory.createAdapter(adaptee.getFrom(), eResource);
  }
  
  @Override
  public void setFrom(final State o) {
    if (o != null)
    	adaptee.setFrom(((fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setFrom(null);
  }
  
  @Override
  public State getTo() {
    return (State) adaptersFactory.createAdapter(adaptee.getTo(), eResource);
  }
  
  @Override
  public void setTo(final State o) {
    if (o != null)
    	adaptee.setTo(((fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTo(null);
  }
  
  protected final static String EVENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FSM:
    		return getFsm();
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FROM:
    		return getFrom();
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__TO:
    		return getTo();
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__EVENT:
    		return getEvent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FROM:
    		return getFrom() != null;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__TO:
    		return getTo() != null;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FSM:
    		setFsm(
    		(fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__FROM:
    		setFrom(
    		(fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__TO:
    		setTo(
    		(fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
