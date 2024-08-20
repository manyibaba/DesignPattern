package com.manyi.zhang.designpattern.strategy.move;

public class NormalMove implements Moveable {
    @Override
    public void move() {
        System.out.println("正常移动");
    }
}
