package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class GFSMLAdapter extends ResourceAdapter implements fr.inria.diverse.tfsm.melange.ExpressionLMT {
  public GFSMLAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ExpressionFactory getExpressionFactory() {
    return new fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression.ExpressionFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getExpressionFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
