package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class GFSMLMTAdaptersFactory implements AdaptersFactory {
  private static fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory instance;
  
  public static fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public GFSMLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntAdd){
    	return createIntAddAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntAdd) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntMult){
    	return createIntMultAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntMult) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntNeg){
    	return createIntNegAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntNeg) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarRef){
    	return createIntVarRefAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarRef) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.ConstExpr){
    	return createConstExprAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.ConstExpr) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarAssign){
    	return createIntVarAssignAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarAssign) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.IntBlock){
    	return createIntBlockAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.IntBlock) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanEqual){
    	return createBooleanEqualAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanEqual) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanOr){
    	return createBooleanOrAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanOr) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanAnd){
    	return createBooleanAndAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanAnd) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanGreaterThan){
    	return createBooleanGreaterThanAdapter((fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanGreaterThan) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.fsm.FSM){
    	return createFSMAdapter((fr.inria.diverse.tfsm.melange.gfsml.fsm.FSM) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.gfsm.GInitialState){
    	return createGInitialStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.gfsm.GInitialState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.fsm.InitialState){
    	return createInitialStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.fsm.InitialState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFinalState){
    	return createGFinalStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFinalState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.fsm.FinalState){
    	return createFinalStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.fsm.FinalState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.fsm.State){
    	return createStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.fsm.State) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.gfsm.GTransition){
    	return createGTransitionAdapter((fr.inria.diverse.tfsm.melange.gfsml.gfsm.GTransition) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.fsm.Transition){
    	return createTransitionAdapter((fr.inria.diverse.tfsm.melange.gfsml.fsm.Transition) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.gfsm.GState){
    	return createGStateAdapter((fr.inria.diverse.tfsm.melange.gfsml.gfsm.GState) o, res);
    }
    if (o instanceof fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFSM){
    	return createGFSMAdapter((fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFSM) o, res);
    }
    
    return null;
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBinaryExpressionAdapter createIntBinaryExpressionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBinaryExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBinaryExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntAddAdapter createIntAddAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntAdd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntAddAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntAddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntAddAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntMultAdapter createIntMultAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntMult adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntMultAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntMultAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntMultAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntNegAdapter createIntNegAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntNeg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntNegAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntNegAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntNegAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarRefAdapter createIntVarRefAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarRefAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarRefAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.ConstExprAdapter createConstExprAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.ConstExpr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.ConstExprAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.ConstExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.ConstExprAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanExpressionAdapter createBooleanExpressionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntOperationAdapter createIntOperationAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntOperationAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntOperationAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarAssignAdapter createIntVarAssignAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntVarAssign adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarAssignAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarAssignAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntVarAssignAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBlockAdapter createIntBlockAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBlockAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntBlockAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanEqualAdapter createBooleanEqualAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanEqual adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanEqualAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanEqualAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanEqualAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanOrAdapter createBooleanOrAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanOr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanOrAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanOrAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanOrAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanAndAdapter createBooleanAndAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanAnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanAndAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanAndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanAndAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanGreaterThanAdapter createBooleanGreaterThanAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanGreaterThan adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanGreaterThanAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanGreaterThanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanGreaterThanAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanBinaryExpressionAdapter createBooleanBinaryExpressionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanBinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanBinaryExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanBinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanBinaryExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanCompareExpressionAdapter createBooleanCompareExpressionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.BooleanCompareExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanCompareExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanCompareExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.BooleanCompareExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter createIntExpressionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.expression.IntExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression.IntExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FSMAdapter createFSMAdapter(final fr.inria.diverse.tfsm.melange.gfsml.fsm.FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FSMAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FSMAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.InitialStateAdapter createInitialStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.fsm.InitialState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.InitialStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.InitialStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.InitialStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter createStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.fsm.State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.StateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FinalStateAdapter createFinalStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.fsm.FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FinalStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.FinalStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.TransitionAdapter createTransitionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.fsm.Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.fsm.TransitionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GTransitionAdapter createGTransitionAdapter(final fr.inria.diverse.tfsm.melange.gfsml.gfsm.GTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GTransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GTransitionAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GStateAdapter createGStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.gfsm.GState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GInitialStateAdapter createGInitialStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.gfsm.GInitialState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GInitialStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GInitialStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GInitialStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFinalStateAdapter createGFinalStateAdapter(final fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFinalStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFinalStateAdapter) adapter;
    }
  }
  
  public fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFSMAdapter createGFSMAdapter(final fr.inria.diverse.tfsm.melange.gfsml.gfsm.GFSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFSMAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.gfsm.GFSMAdapter) adapter;
    }
  }
}
