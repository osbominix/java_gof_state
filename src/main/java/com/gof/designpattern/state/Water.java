package com.gof.designpattern.state;

import com.gof.designpattern.state.basis.State;

/**
 * Created by yl3 on 16.12.15.
 */
public class Water {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
