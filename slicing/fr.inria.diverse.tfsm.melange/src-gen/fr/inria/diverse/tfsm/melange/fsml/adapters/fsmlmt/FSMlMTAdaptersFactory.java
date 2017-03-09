package fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.fsml.fsm.FSM;
import fr.inria.diverse.tfsm.melange.fsml.fsm.FinalState;
import fr.inria.diverse.tfsm.melange.fsml.fsm.InitialState;
import fr.inria.diverse.tfsm.melange.fsml.fsm.State;
import fr.inria.diverse.tfsm.melange.fsml.fsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class FSMlMTAdaptersFactory implements AdaptersFactory {
  private static fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory instance;
  
  public static fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMlMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.tfsm.melange.fsml.fsm.FSM){
    	return createFSMAdapter((fr.inria.diverse.tfsm.melange.fsml.fsm.FSM) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.fsml.fsm.InitialState){
    	return createInitialStateAdapter((fr.inria.diverse.tfsm.melange.fsml.fsm.InitialState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.fsml.fsm.FinalState){
    	return createFinalStateAdapter((fr.inria.diverse.tfsm.melange.fsml.fsm.FinalState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.fsml.fsm.State){
    	return createStateAdapter((fr.inria.diverse.tfsm.melange.fsml.fsm.State) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.fsml.fsm.Transition){
    	return createTransitionAdapter((fr.inria.diverse.tfsm.melange.fsml.fsm.Transition) o, res);
    }
    
    return null;
  }
  
  public fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FSMAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FSMAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.InitialStateAdapter createInitialStateAdapter(final InitialState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.InitialStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.InitialStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.InitialStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.StateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FinalStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.FinalStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm.TransitionAdapter) adapter;
    }
  }
}
