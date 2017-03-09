package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanExpression;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class GTransitionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.gfsm.GTransition> */ implements GTransition {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public GTransitionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
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
    	adaptee.setFsm(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FSMAdapter) o).getAdaptee());
    else adaptee.setFsm(null);
  }
  
  @Override
  public State getFrom() {
    return (State) adaptersFactory.createAdapter(adaptee.getFrom(), eResource);
  }
  
  @Override
  public void setFrom(final State o) {
    if (o != null)
    	adaptee.setFrom(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setFrom(null);
  }
  
  @Override
  public State getTo() {
    return (State) adaptersFactory.createAdapter(adaptee.getTo(), eResource);
  }
  
  @Override
  public void setTo(final State o) {
    if (o != null)
    	adaptee.setTo(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTo(null);
  }
  
  @Override
  public BooleanExpression getGuard() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final BooleanExpression o) {
    if (o != null)
    	adaptee.setGuard(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  protected final static String EVENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.eINSTANCE.getGTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FSM:
    		return getFsm();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FROM:
    		return getFrom();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__TO:
    		return getTo();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__EVENT:
    		return getEvent();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__GUARD:
    		return getGuard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FROM:
    		return getFrom() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__TO:
    		return getTo() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__GUARD:
    		return getGuard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FSM:
    		setFsm(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__FROM:
    		setFrom(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__TO:
    		setTo(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.GTRANSITION__GUARD:
    		setGuard(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
