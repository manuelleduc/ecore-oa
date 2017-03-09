package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ExpressionLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ExpressionFactory getExpressionFactory();
  
  public abstract void save(final String uri) throws IOException;
}
