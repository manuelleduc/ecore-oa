package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BooleanExpressionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanExpression> */ implements BooleanExpression {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public BooleanExpressionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getBooleanExpression();
  }
}
