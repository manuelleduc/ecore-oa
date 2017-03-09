package fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntVarAssign;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntVarAssignAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarAssign> */ implements IntVarAssign {
  private fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public IntVarAssignAdapter() {
    super(fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
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
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getIntVarAssign();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__NAME:
    		return getName();
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_ASSIGN__EXPRESSION:
    		setExpression(
    		(fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
