package fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanGreaterThan;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BooleanGreaterThanAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanGreaterThan> */ implements BooleanGreaterThan {
  private fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public BooleanGreaterThanAdapter() {
    super(fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntExpression getExpression1() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getExpression1(), eResource);
  }
  
  @Override
  public void setExpression1(final IntExpression o) {
    if (o != null)
    	adaptee.setExpression1(((fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression1(null);
  }
  
  @Override
  public IntExpression getExpression2() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getExpression2(), eResource);
  }
  
  @Override
  public void setExpression2(final IntExpression o) {
    if (o != null)
    	adaptee.setExpression2(((fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression2(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getBooleanGreaterThan();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION1:
    		return getExpression1();
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION2:
    		return getExpression2();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION1:
    		return getExpression1() != null;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION2:
    		return getExpression2() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION1:
    		setExpression1(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_GREATER_THAN__EXPRESSION2:
    		setExpression2(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
