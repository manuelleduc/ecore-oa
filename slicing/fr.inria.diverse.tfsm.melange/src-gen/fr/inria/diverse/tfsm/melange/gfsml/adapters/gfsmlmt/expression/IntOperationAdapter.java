package fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.expression;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.tfsm.melange.gfsmlmt.expression.IntOperation;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntOperationAdapter extends /* EObjectAdapter<fr.inria.diverse.tfsm.melange.gfsml.expression.IntOperation> */ implements IntOperation {
  private fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory adaptersFactory;
  
  public IntOperationAdapter() {
    super(fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.tfsm.melange.gfsmlmt.expression.ExpressionPackage.eINSTANCE.getIntOperation();
  }
}
