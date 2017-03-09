package fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.fsm;

import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FSM;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FinalState;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmFactory;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.InitialState;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.State;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory adaptersFactory = fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.tfsm.melange.fsml.fsm.FsmFactory fsmAdaptee = fr.inria.diverse.tfsm.melange.fsml.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(fsmAdaptee.createFSM(), null);
  }
  
  @Override
  public InitialState createInitialState() {
    return adaptersFactory.createInitialStateAdapter(fsmAdaptee.createInitialState(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(fsmAdaptee.createFinalState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmPackage.eINSTANCE;
  }
}
