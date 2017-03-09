package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanBinaryExpression;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanCompareExpression;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanBinaryExpression> */ implements BooleanBinaryExpression {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public BooleanBinaryExpressionAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanExpression getBoolExpression1() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getBoolExpression1(), eResource);
  }
  
  @Override
  public void setBoolExpression1(final BooleanExpression o) {
    if (o != null)
    	adaptee.setBoolExpression1(((fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setBoolExpression1(null);
  }
  
  @Override
  public BooleanCompareExpression getBoolExpression2() {
    return (BooleanCompareExpression) adaptersFactory.createAdapter(adaptee.getBoolExpression2(), eResource);
  }
  
  @Override
  public void setBoolExpression2(final BooleanCompareExpression o) {
    if (o != null)
    	adaptee.setBoolExpression2(((fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression.BooleanCompareExpressionAdapter) o).getAdaptee());
    else adaptee.setBoolExpression2(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getBooleanBinaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
    		return getBoolExpression1();
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
    		return getBoolExpression2();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
    		return getBoolExpression1() != null;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
    		return getBoolExpression2() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
    		setBoolExpression1(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
    		setBoolExpression2(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.BooleanCompareExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
