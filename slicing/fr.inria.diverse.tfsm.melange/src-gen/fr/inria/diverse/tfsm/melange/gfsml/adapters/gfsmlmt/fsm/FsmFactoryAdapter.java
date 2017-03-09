package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm;

import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FSM;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FinalState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.InitialState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.State;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.tfsm.melange.gfsml.fsm.FsmFactory fsmAdaptee = fr.inria.diverse.tfsm.melange.gfsml.fsm.FsmFactory.eINSTANCE;
  
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
    return fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmPackage.eINSTANCE;
  }
}
