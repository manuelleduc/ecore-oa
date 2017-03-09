package fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntNeg;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntNegAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.expressionl.expression.IntNeg> */ implements IntNeg {
  private fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public IntNegAdapter() {
    super(fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntExpression getExpression() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getExpression(), eResource);
  }
  
  @Override
  public void setExpression(final IntExpression o) {
    if (o != null)
    	adaptee.setExpression(((fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getIntNeg();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_NEG__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_NEG__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_NEG__EXPRESSION:
    		setExpression(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
