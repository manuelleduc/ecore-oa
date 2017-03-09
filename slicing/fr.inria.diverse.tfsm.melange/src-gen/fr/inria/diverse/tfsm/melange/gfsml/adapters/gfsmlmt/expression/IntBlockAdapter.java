package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntBlock;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntVarAssign;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntBlockAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntBlock> */ implements IntBlock {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public IntBlockAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  private EList<IntVarAssign> operations_;
  
  @Override
  public EList<IntVarAssign> getOperations() {
    if (operations_ == null)
    	operations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOperations(), adaptersFactory, eResource);
    return operations_;
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE.getIntBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_BLOCK__OPERATIONS:
    		return getOperations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_BLOCK__OPERATIONS:
    		return getOperations() != null && !getOperations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.INT_BLOCK__OPERATIONS:
    		getOperations().clear();
    		getOperations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
