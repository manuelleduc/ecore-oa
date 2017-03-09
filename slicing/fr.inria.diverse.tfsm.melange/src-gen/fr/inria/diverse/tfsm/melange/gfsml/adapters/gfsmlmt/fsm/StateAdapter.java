package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StateAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.fsm.State> */ implements State {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  private EList<Transition> outgoingtransitions_;
  
  @Override
  public EList<Transition> getOutgoingtransitions() {
    if (outgoingtransitions_ == null)
    	outgoingtransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingtransitions(), adaptersFactory, eResource);
    return outgoingtransitions_;
  }
  
  private EList<Transition> incommingtransitions_;
  
  @Override
  public EList<Transition> getIncommingtransitions() {
    if (incommingtransitions_ == null)
    	incommingtransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncommingtransitions(), adaptersFactory, eResource);
    return incommingtransitions_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__NAME:
    		return getName();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__FSM:
    		return getFsm();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__OUTGOINGTRANSITIONS:
    		return getOutgoingtransitions();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__INCOMMINGTRANSITIONS:
    		return getIncommingtransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__OUTGOINGTRANSITIONS:
    		return getOutgoingtransitions() != null && !getOutgoingtransitions().isEmpty();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__INCOMMINGTRANSITIONS:
    		return getIncommingtransitions() != null && !getIncommingtransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__FSM:
    		setFsm(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__OUTGOINGTRANSITIONS:
    		getOutgoingtransitions().clear();
    		getOutgoingtransitions().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.STATE__INCOMMINGTRANSITIONS:
    		getIncommingtransitions().clear();
    		getIncommingtransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
