package com.manyi.zhang.designpattern.strategy.move;

public class FastMove implements Moveable {
    @Override
    public void move() {
        System.out.println("快速移动");
    }
}
