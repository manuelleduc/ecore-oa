package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntExpressionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntExpression> */ implements IntExpression {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public IntExpressionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getIntExpression();
  }
}
