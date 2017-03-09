package fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GFSMLAdapter extends ResourceAdapter implements fr.inria.diverse.tfsm.melange.FSMlMT {
  public GFSMLAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt.FSMlMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
