package fr.inria.diverse.fsm.algebra;

import fr.inria.diverse.fsm.algebra.abstr.FSMAlgebra;
import fsm.FSM;
import fsm.FinalState;
import fsm.InitialState;
import fsm.State;
import fsm.Transition;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DeferProxy<T extends Object, S extends Object, F extends Object, IS extends S, FS extends S> {
  private FSMAlgebra<T, S, F, IS, FS> concreteAlgebra;
  
  private Class<F> fsmClass;
  
  private Class<T> transitionClass;
  
  private Class<S> stateClass;
  
  private Class<IS> initialStateClass;
  
  private Class<FS> finalStateClass;
  
  public DeferProxy(final FSMAlgebra<T, S, F, IS, FS> concreteAlgebra, final Class<F> fsmClass, final Class<T> transitionClass, final Class<S> stateClass, final Class<IS> initialStateClass, final Class<FS> finalStateClass) {
    this.concreteAlgebra = concreteAlgebra;
    this.fsmClass = fsmClass;
    this.transitionClass = transitionClass;
    this.stateClass = stateClass;
    this.initialStateClass = initialStateClass;
    this.finalStateClass = finalStateClass;
  }
  
  protected F _fsm(final FSM fsm) {
    ClassLoader _classLoader = this.fsmClass.getClassLoader();
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, new Class[] { this.fsmClass }, 
      new InvocationHandler() {
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
          EList<State> _states = fsm.getStates();
          final Function1<State, S> _function = (State it) -> {
            return DeferProxy.this.state(it);
          };
          List<S> _map = ListExtensions.<State, S>map(_states, _function);
          EList<Transition> _transitions = fsm.getTransitions();
          final Function1<Transition, T> _function_1 = (Transition it) -> {
            return DeferProxy.this.transition(it);
          };
          List<T> _map_1 = ListExtensions.<Transition, T>map(_transitions, _function_1);
          InitialState _initialstate = fsm.getInitialstate();
          S _state = DeferProxy.this.state(_initialstate);
          String _name = fsm.getName();
          F _fsm = DeferProxy.this.concreteAlgebra.fsm(_map, _map_1, _state, _name);
          return method.invoke(_fsm, args);
        }
      });
    return ((F) _newProxyInstance);
  }
  
  protected T _transition(final Transition transition) {
    ClassLoader _classLoader = this.transitionClass.getClassLoader();
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, new Class[] { this.transitionClass }, 
      new InvocationHandler() {
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
          State _from = transition.getFrom();
          S _state = DeferProxy.this.state(_from);
          State _to = transition.getTo();
          S _state_1 = DeferProxy.this.state(_to);
          FSM _fsm = transition.getFsm();
          F _fsm_1 = DeferProxy.this.fsm(_fsm);
          String _event = transition.getEvent();
          T _transition = DeferProxy.this.concreteAlgebra.transition(_state, _state_1, _fsm_1, _event);
          return method.invoke(_transition, args);
        }
      });
    return ((T) _newProxyInstance);
  }
  
  protected S _state(final State state) {
    ClassLoader _classLoader = this.stateClass.getClassLoader();
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, new Class[] { this.stateClass }, new InvocationHandler() {
      @Override
      public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        String _name = state.getName();
        FSM _fsm = state.getFsm();
        F _fsm_1 = DeferProxy.this.fsm(_fsm);
        EList<Transition> _outgoingtransitions = state.getOutgoingtransitions();
        final Function1<Transition, T> _function = (Transition it) -> {
          return DeferProxy.this.transition(it);
        };
        List<T> _map = ListExtensions.<Transition, T>map(_outgoingtransitions, _function);
        EList<Transition> _incommingtransitions = state.getIncommingtransitions();
        final Function1<Transition, T> _function_1 = (Transition it) -> {
          return DeferProxy.this.transition(it);
        };
        List<T> _map_1 = ListExtensions.<Transition, T>map(_incommingtransitions, _function_1);
        S _state = DeferProxy.this.concreteAlgebra.state(_name, _fsm_1, _map, _map_1);
        return method.invoke(_state, args);
      }
    });
    return ((S) _newProxyInstance);
  }
  
  protected IS _state(final InitialState initialState) {
    ClassLoader _classLoader = this.initialStateClass.getClassLoader();
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, new Class[] { this.initialStateClass }, 
      new InvocationHandler() {
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
          String _name = initialState.getName();
          FSM _fsm = initialState.getFsm();
          F _fsm_1 = DeferProxy.this.fsm(_fsm);
          EList<Transition> _outgoingtransitions = initialState.getOutgoingtransitions();
          final Function1<Transition, T> _function = (Transition it) -> {
            return DeferProxy.this.transition(it);
          };
          List<T> _map = ListExtensions.<Transition, T>map(_outgoingtransitions, _function);
          EList<Transition> _incommingtransitions = initialState.getIncommingtransitions();
          final Function1<Transition, T> _function_1 = (Transition it) -> {
            return DeferProxy.this.transition(it);
          };
          List<T> _map_1 = ListExtensions.<Transition, T>map(_incommingtransitions, _function_1);
          IS _initialState = DeferProxy.this.concreteAlgebra.initialState(_name, _fsm_1, _map, _map_1);
          return method.invoke(_initialState, args);
        }
      });
    return ((IS) _newProxyInstance);
  }
  
  protected FS _state(final FinalState finalState) {
    ClassLoader _classLoader = this.finalStateClass.getClassLoader();
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, new Class[] { this.finalStateClass }, 
      new InvocationHandler() {
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
          String _name = finalState.getName();
          FSM _fsm = finalState.getFsm();
          F _fsm_1 = DeferProxy.this.fsm(_fsm);
          EList<Transition> _outgoingtransitions = finalState.getOutgoingtransitions();
          final Function1<Transition, T> _function = (Transition it) -> {
            return DeferProxy.this.transition(it);
          };
          List<T> _map = ListExtensions.<Transition, T>map(_outgoingtransitions, _function);
          EList<Transition> _incommingtransitions = finalState.getIncommingtransitions();
          final Function1<Transition, T> _function_1 = (Transition it) -> {
            return DeferProxy.this.transition(it);
          };
          List<T> _map_1 = ListExtensions.<Transition, T>map(_incommingtransitions, _function_1);
          FS _finalState = DeferProxy.this.concreteAlgebra.finalState(_name, _fsm_1, _map, _map_1);
          return method.invoke(_finalState, args);
        }
      });
    return ((FS) _newProxyInstance);
  }
  
  public F fsm(final FSM fsm) {
    return _fsm(fsm);
  }
  
  public T transition(final Transition transition) {
    return _transition(transition);
  }
  
  public S state(final State finalState) {
    if (finalState instanceof FinalState) {
      return _state((FinalState)finalState);
    } else if (finalState instanceof InitialState) {
      return _state((InitialState)finalState);
    } else if (finalState != null) {
      return _state(finalState);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(finalState).toString());
    }
  }
}
