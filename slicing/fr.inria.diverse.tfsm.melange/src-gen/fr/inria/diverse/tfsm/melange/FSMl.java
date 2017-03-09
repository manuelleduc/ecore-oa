package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class FSMl implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static fr.inria.diverse.tfsm.melange.FSMl load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    FSMl mm = new FSMl();
    mm.setResource(res);
    return mm ;
  }
  
  public fr.inria.diverse.tfsm.melange.FSMlMT toFSMlMT() {
    fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlAdapter adaptee = new fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
