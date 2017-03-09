package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm;

import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFSM;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GFinalState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GInitialState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GState;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GTransition;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class GfsmFactoryAdapter extends EFactoryImpl implements GfsmFactory {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.tfsm.melange.gfsml.gfsm.GfsmFactory gfsmAdaptee = fr.inria.diverse.tfsm.melange.gfsml.gfsm.GfsmFactory.eINSTANCE;
  
  @Override
  public GTransition createGTransition() {
    return adaptersFactory.createGTransitionAdapter(gfsmAdaptee.createGTransition(), null);
  }
  
  @Override
  public GState createGState() {
    return adaptersFactory.createGStateAdapter(gfsmAdaptee.createGState(), null);
  }
  
  @Override
  public GInitialState createGInitialState() {
    return adaptersFactory.createGInitialStateAdapter(gfsmAdaptee.createGInitialState(), null);
  }
  
  @Override
  public GFinalState createGFinalState() {
    return adaptersFactory.createGFinalStateAdapter(gfsmAdaptee.createGFinalState(), null);
  }
  
  @Override
  public GFSM createGFSM() {
    return adaptersFactory.createGFSMAdapter(gfsmAdaptee.createGFSM(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getGfsmPackage();
  }
  
  public GfsmPackage getGfsmPackage() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmPackage.eINSTANCE;
  }
}
