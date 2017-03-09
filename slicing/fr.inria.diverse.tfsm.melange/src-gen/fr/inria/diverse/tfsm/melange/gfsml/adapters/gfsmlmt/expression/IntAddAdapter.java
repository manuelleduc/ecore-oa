package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntAdd;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntAddAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntAdd> */ implements IntAdd {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public IntAddAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntExpression getExpression1() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getExpression1(), eResource);
  }
  
  @Override
  public void setExpression1(final IntExpression o) {
    if (o != null)
    	adaptee.setExpression1(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression1(null);
  }
  
  @Override
  public IntExpression getExpression2() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getExpression2(), eResource);
  }
  
  @Override
  public void setExpression2(final IntExpression o) {
    if (o != null)
    	adaptee.setExpression2(((fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setExpression2(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE.getIntAdd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION1:
    		return getExpression1();
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION2:
    		return getExpression2();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION1:
    		return getExpression1() != null;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION2:
    		return getExpression2() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION1:
    		setExpression1(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_ADD__EXPRESSION2:
    		setExpression2(
    		(fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
