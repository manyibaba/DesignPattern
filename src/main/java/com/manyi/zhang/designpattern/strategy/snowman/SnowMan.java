package com.manyi.zhang.designpattern.strategy.snowman;

import com.manyi.zhang.designpattern.strategy.attack.Attackable;
import com.manyi.zhang.designpattern.strategy.attack.SimpleAttack;
import com.manyi.zhang.designpattern.strategy.move.Moveable;
import com.manyi.zhang.designpattern.strategy.move.NormalMove;

public class SnowMan extends AbstractSnowMan {

    public SnowMan() {
        super(new NormalMove(), new SimpleAttack());
    }

    public SnowMan(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void showUp() {
        System.out.println("雪人，登场！");
    }

    @Override
    public void move() {
        moveable.move();
    }

    @Override
    public void attack() {
        attackable.attack();
    }
}
