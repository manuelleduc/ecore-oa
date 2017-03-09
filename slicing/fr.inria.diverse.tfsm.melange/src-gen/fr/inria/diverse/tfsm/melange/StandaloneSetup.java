package fr.inria.diverse.tfsm.melange;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.tfsm.melange.fsml.fsm.FsmPackage.eNS_URI,
    	fr.inria.diverse.tfsm.melange.fsml.fsm.FsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.tfsm.melange.expressionl.expression.ExpressionPackage.eNS_URI,
    	fr.inria.diverse.tfsm.melange.expressionl.expression.ExpressionPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.tfsm.melange.gfsml.gfsm.GfsmPackage.eNS_URI,
    	fr.inria.diverse.tfsm.melange.gfsml.gfsm.GfsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.tfsm.melange.gfsml.fsm.FsmPackage.eNS_URI,
    	fr.inria.diverse.tfsm.melange.gfsml.fsm.FsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.tfsm.melange.gfsml.expression.ExpressionPackage.eNS_URI,
    	fr.inria.diverse.tfsm.melange.gfsml.expression.ExpressionPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor fSMl = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.FSMl", "", "http://fr.inria.diverse.tfsm.melange.fsml/fsm/", "fr.inria.diverse.tfsm.melange.FSMlMT"
    );
    fSMl.addAdapter("fr.inria.diverse.tfsm.melange.FSMlMT", fr.inria.diverse.tfsm.melange.fsml.adapters.fsmlmt.FSMlAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.tfsm.melange.FSMl",
    	fSMl
    );
    MelangeRegistry.LanguageDescriptor expressionL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.ExpressionL", "", "http://fr.inria.diverse.tfsm.melange.expressionl/expression/", "fr.inria.diverse.tfsm.melange.ExpressionLMT"
    );
    expressionL.addAdapter("fr.inria.diverse.tfsm.melange.ExpressionLMT", fr.inria.diverse.tfsm.melange.expressionl.adapters.expressionlmt.ExpressionLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.tfsm.melange.ExpressionL",
    	expressionL
    );
    MelangeRegistry.LanguageDescriptor gFSML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.GFSML", "", "http://fr.inria.diverse.tfsm.melange.gfsml/gfsm/", "fr.inria.diverse.tfsm.melange.GFSMLMT"
    );
    gFSML.addAdapter("fr.inria.diverse.tfsm.melange.FSMlMT", fr.inria.diverse.tfsm.melange.gfsml.adapters.fsmlmt.GFSMLAdapter.class);
    gFSML.addAdapter("fr.inria.diverse.tfsm.melange.ExpressionLMT", fr.inria.diverse.tfsm.melange.gfsml.adapters.expressionlmt.GFSMLAdapter.class);
    gFSML.addAdapter("fr.inria.diverse.tfsm.melange.GFSMLMT", fr.inria.diverse.tfsm.melange.gfsml.adapters.gfsmlmt.GFSMLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.tfsm.melange.GFSML",
    	gFSML
    );
    MelangeRegistry.ModelTypeDescriptor fSMlMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.FSMlMT", "", "http://fr.inria.diverse.tfsm.melange.fsmlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.tfsm.melange.FSMlMT",
    	fSMlMT
    );
    MelangeRegistry.ModelTypeDescriptor expressionLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.ExpressionLMT", "", "http://fr.inria.diverse.tfsm.melange.expressionlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.tfsm.melange.ExpressionLMT",
    	expressionLMT
    );
    MelangeRegistry.ModelTypeDescriptor gFSMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.tfsm.melange.GFSMLMT", "", "http://fr.inria.diverse.tfsm.melange.gfsmlmt/"
    );
    gFSMLMT.addSuperType("fr.inria.diverse.tfsm.melange.FSMlMT");
    gFSMLMT.addSuperType("fr.inria.diverse.tfsm.melange.ExpressionLMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.tfsm.melange.GFSMLMT",
    	gFSMLMT
    );
  }
}
