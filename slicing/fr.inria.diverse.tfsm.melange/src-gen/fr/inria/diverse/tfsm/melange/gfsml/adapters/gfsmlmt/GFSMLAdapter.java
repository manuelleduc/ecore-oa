package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GFSMLAdapter extends ResourceAdapter implements fr.inria.diverse.tfsm.melange.GFSMLMT {
  public GFSMLAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public GfsmFactory getGfsmFactory() {
    return new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GfsmFactoryAdapter();
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public ExpressionFactory getExpressionFactory() {
    return new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.ExpressionFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getGfsmFactory());
    res.add(getFsmFactory());
    res.add(getExpressionFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
