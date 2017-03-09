package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntOperation;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntOperationAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntOperation> */ implements IntOperation {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public IntOperationAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getIntOperation();
  }
}
