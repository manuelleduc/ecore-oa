package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.fsm.FsmFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.gfsm.GfsmFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface GFSMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract GfsmFactory getGfsmFactory();
  
  public abstract FsmFactory getFsmFactory();
  
  public abstract ExpressionFactory getExpressionFactory();
  
  public abstract void save(final String uri) throws IOException;
}
