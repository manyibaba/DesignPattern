package com.manyi.zhang.designpattern.strategy.attack;

public class SimpleAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("普通攻击");
    }
}
