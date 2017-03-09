package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.tfsm.melange.fsmlmt.fsm.FsmFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FSMlMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}
