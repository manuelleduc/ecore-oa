package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanAnd;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanEqual;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanGreaterThan;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.BooleanOr;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ConstExpr;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionFactory;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntAdd;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntBlock;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntMult;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntNeg;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntVarAssign;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntVarRef;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ExpressionFactoryAdapter extends EFactoryImpl implements ExpressionFactory {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.tfsm.melange.gfsml.expression.ExpressionFactory expressionAdaptee = fr.inria.diverse.tfsm.melange.gfsml.expression.ExpressionFactory.eINSTANCE;
  
  @Override
  public IntAdd createIntAdd() {
    return adaptersFactory.createIntAddAdapter(expressionAdaptee.createIntAdd(), null);
  }
  
  @Override
  public IntMult createIntMult() {
    return adaptersFactory.createIntMultAdapter(expressionAdaptee.createIntMult(), null);
  }
  
  @Override
  public IntNeg createIntNeg() {
    return adaptersFactory.createIntNegAdapter(expressionAdaptee.createIntNeg(), null);
  }
  
  @Override
  public IntVarRef createIntVarRef() {
    return adaptersFactory.createIntVarRefAdapter(expressionAdaptee.createIntVarRef(), null);
  }
  
  @Override
  public ConstExpr createConstExpr() {
    return adaptersFactory.createConstExprAdapter(expressionAdaptee.createConstExpr(), null);
  }
  
  @Override
  public IntVarAssign createIntVarAssign() {
    return adaptersFactory.createIntVarAssignAdapter(expressionAdaptee.createIntVarAssign(), null);
  }
  
  @Override
  public IntBlock createIntBlock() {
    return adaptersFactory.createIntBlockAdapter(expressionAdaptee.createIntBlock(), null);
  }
  
  @Override
  public BooleanEqual createBooleanEqual() {
    return adaptersFactory.createBooleanEqualAdapter(expressionAdaptee.createBooleanEqual(), null);
  }
  
  @Override
  public BooleanOr createBooleanOr() {
    return adaptersFactory.createBooleanOrAdapter(expressionAdaptee.createBooleanOr(), null);
  }
  
  @Override
  public BooleanAnd createBooleanAnd() {
    return adaptersFactory.createBooleanAndAdapter(expressionAdaptee.createBooleanAnd(), null);
  }
  
  @Override
  public BooleanGreaterThan createBooleanGreaterThan() {
    return adaptersFactory.createBooleanGreaterThanAdapter(expressionAdaptee.createBooleanGreaterThan(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExpressionPackage();
  }
  
  public ExpressionPackage getExpressionPackage() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE;
  }
}
