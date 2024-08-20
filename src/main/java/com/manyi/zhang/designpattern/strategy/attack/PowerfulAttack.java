package com.manyi.zhang.designpattern.strategy.attack;

public class PowerfulAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("强力一击");
    }
}
