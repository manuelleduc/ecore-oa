package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BooleanExpressionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanExpression> */ implements BooleanExpression {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public BooleanExpressionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE.getBooleanExpression();
  }
}
