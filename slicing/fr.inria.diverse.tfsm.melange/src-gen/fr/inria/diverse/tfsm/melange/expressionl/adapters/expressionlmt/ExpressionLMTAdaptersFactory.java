package fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class ExpressionLMTAdaptersFactory implements AdaptersFactory {
  private static fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory instance;
  
  public static fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public ExpressionLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntAdd){
    	return createIntAddAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntAdd) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntMult){
    	return createIntMultAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntMult) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntNeg){
    	return createIntNegAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntNeg) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarRef){
    	return createIntVarRefAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarRef) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.ConstExpr){
    	return createConstExprAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.ConstExpr) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarAssign){
    	return createIntVarAssignAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarAssign) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.IntBlock){
    	return createIntBlockAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.IntBlock) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanEqual){
    	return createBooleanEqualAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanOr){
    	return createBooleanOrAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanOr) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanAnd){
    	return createBooleanAndAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanAnd) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanGreaterThan){
    	return createBooleanGreaterThanAdapter((fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanGreaterThan) o, res);
    }
    
    return null;
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBinaryExpressionAdapter createIntBinaryExpressionAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBinaryExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBinaryExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntAddAdapter createIntAddAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntAddAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntAddAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntMultAdapter createIntMultAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntMult adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntMultAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntMultAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntMultAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntNegAdapter createIntNegAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntNeg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntNegAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntNegAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntNegAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarRefAdapter createIntVarRefAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarRefAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.ConstExprAdapter createConstExprAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.ConstExpr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.ConstExprAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.ConstExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.ConstExprAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanExpressionAdapter createBooleanExpressionAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntOperationAdapter createIntOperationAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntOperationAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarAssignAdapter createIntVarAssignAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntVarAssign adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarAssignAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarAssignAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntVarAssignAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBlockAdapter createIntBlockAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBlockAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntBlockAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanEqualAdapter createBooleanEqualAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanEqualAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanOrAdapter createBooleanOrAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanOr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanOrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanOrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanOrAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanAndAdapter createBooleanAndAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanAnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanAndAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanAndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanAndAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanGreaterThanAdapter createBooleanGreaterThanAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanGreaterThan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanGreaterThanAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanGreaterThanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanGreaterThanAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanBinaryExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanCompareExpressionAdapter createBooleanCompareExpressionAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.BooleanCompareExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanCompareExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanCompareExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.BooleanCompareExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter createIntExpressionAdapter(final fr.inria.diverse.tfsm.melange.expressionl.expression.IntExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.expression.IntExpressionAdapter) adapter;
    }
  }
}
