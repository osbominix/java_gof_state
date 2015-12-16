package com.gof.designpattern;

import com.gof.designpattern.state.Water;
import com.gof.designpattern.state.basis.LiquidState;
import com.gof.designpattern.state.basis.SolidState;

/**
 * Created by yl3 on 16.12.15.
 */
public class CommandCenter {

    public static void main(String[] args) {
        Water water = new Water();

        LiquidState liquidState = new LiquidState();
        liquidState.refreshState(water);
        water.getState().showVolumn();

        SolidState solidState = new SolidState();
        solidState.refreshState(water);
        water.getState().showVolumn();

    }
}
