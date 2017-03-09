package fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.ConstExpr;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConstExprAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.ConstExpr> */ implements ConstExpr {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public ConstExprAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.ExpressionLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getConstExpr();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.CONST_EXPR__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.CONST_EXPR__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.CONST_EXPR__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
