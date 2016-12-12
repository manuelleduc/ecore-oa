package fr.inria.diverse.gfsm.abstr;

import fr.inria.diverse.expression.algebra.abstr.ExpressionAlgebra;
import fr.inria.diverse.fsm.algebra.abstr.FSMAlgebra;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import gfsm.GFSM;
import gfsm.GFinalState;
import gfsm.GInitialState;
import gfsm.GState;
import gfsm.GTransition;

public interface GFSMAlgebra<T, S, F, IE, BE, IO> extends FSMAlgebra<T, S, F>, ExpressionAlgebra<IE, BE, IO> {
	T gTransition(GTransition gTransition);

	S gState(GState gState);

	S gInitialState(GInitialState gInitialState);

	S gFinalState(GFinalState gFinalState);

	F gFSM(GFSM gfsm);

	@Override
	default T $T(Transition transition) {
		final T ret;
		if (transition instanceof GTransition) {
			ret = gTransition((GTransition) transition);
		} else {
			ret = FSMAlgebra.super.$T(transition);
		}
		return ret;
	}

	@Override
	default S $S(State state) {
		final S ret;
		if (state instanceof GFinalState) {
			ret = gFinalState((GFinalState) state);
		} else if (state instanceof GInitialState) {
			ret = gInitialState((GInitialState) state);
		} else if (state instanceof GState) {
			ret = gState((GState) state);
		} else {
			ret = FSMAlgebra.super.$S(state);
		}
		return ret;
	}

	@Override
	default F $F(FSM fsm) {
		final F ret;
		if (fsm instanceof GFSM) {
			ret = gFSM((GFSM) fsm);
		} else {
			ret = FSMAlgebra.super.$F(fsm);
		}
		return ret;
	}

}