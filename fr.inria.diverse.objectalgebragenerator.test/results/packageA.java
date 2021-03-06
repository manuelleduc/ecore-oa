package a.algebra;

import a.AClass;

public interface AAlgebra<A> {

	A aClass(final AClass aClass);

	public default A $(final AClass aClass) {
		final A ret;
		if (aClass instanceof AClass) {
			ret = this.aClass((AClass) aClass);
		} else {
			throw new RuntimeException("Unknow AClass " + aClass);
		}
		return ret;
	}
}