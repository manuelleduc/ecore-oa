package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class ExpressionL implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static fr.inria.diverse.tfsm.melange.ExpressionL load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    ExpressionL mm = new ExpressionL();
    mm.setResource(res);
    return mm ;
  }
  
  public fr.inria.diverse.tfsm.melange.ExpressionLMT toExpressionLMT() {
    fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLAdapter adaptee = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
