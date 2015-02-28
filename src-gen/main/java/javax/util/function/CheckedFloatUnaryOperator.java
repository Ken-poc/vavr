/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction1;

@FunctionalInterface
public interface CheckedFloatUnaryOperator extends CheckedFunction1<Float, Float> {

    static final long serialVersionUID = 1L;

    float applyAsFloat(float value) throws Throwable;

    @Override
    default Float apply(Float value) throws Throwable {
      return applyAsFloat(value);
    }

    static FloatUnaryOperator identity() {
        return v -> v;
    }
}