package com.gof.designpattern.state.basis;

import com.gof.designpattern.state.Water;

/**
 * Created by yl3 on 16.12.15.
 */
public abstract class State {

    public void refreshState(Water water) {
        water.setState(this);
    };

    public abstract void showVolumn();

}
