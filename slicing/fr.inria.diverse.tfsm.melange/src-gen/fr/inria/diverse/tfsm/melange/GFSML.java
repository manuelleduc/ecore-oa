package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class GFSML implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static fr.inria.diverse.tfsm.melange.GFSML load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    GFSML mm = new GFSML();
    mm.setResource(res);
    return mm ;
  }
  
  public fr.inria.diverse.tfsm.melange.FSMlMT toFSMlMT() {
    fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt.GFSMLAdapter adaptee = new fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt.GFSMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public fr.inria.diverse.tfsm.melange.ExpressionLMT toExpressionLMT() {
    fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.GFSMLAdapter adaptee = new fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.GFSMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public fr.inria.diverse.tfsm.melange.GFSMLMT toGFSMLMT() {
    fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLAdapter adaptee = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
