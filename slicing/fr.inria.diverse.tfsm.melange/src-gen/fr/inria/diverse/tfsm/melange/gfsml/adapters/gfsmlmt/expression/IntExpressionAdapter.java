package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntExpressionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntExpression> */ implements IntExpression {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public IntExpressionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE.getIntExpression();
  }
}
