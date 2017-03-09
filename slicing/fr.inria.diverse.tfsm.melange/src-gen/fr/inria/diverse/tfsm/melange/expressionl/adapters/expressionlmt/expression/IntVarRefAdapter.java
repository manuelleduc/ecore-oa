package fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.expressionlmt.expression.IntVarRef;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntVarRefAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarRef> */ implements IntVarRef {
  private fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory adaptersFactory;
  
  public IntVarRefAdapter() {
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
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.eINSTANCE.getIntVarRef();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_REF__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_REF__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.expressionlmt.expression.ExpressionPackage.INT_VAR_REF__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
