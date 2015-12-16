package com.gof.designpattern.state.basis;

import com.gof.designpattern.state.Water;

/**
 * Created by yl3 on 16.12.15.
 */
public class LiquidState extends State{

    public void refreshState(Water water) {
        super.refreshState(water);
    }

    @Override
    public void showVolumn() {
        System.out.println("Water in liquid state has smaller volumn.");
    }
}
