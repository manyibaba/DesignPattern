package com.manyi.zhang.designpattern.strategy.snowman;

import com.manyi.zhang.designpattern.strategy.attack.Attackable;
import com.manyi.zhang.designpattern.strategy.move.Moveable;

/**
 * 抽象类-雪人
 * 雪人通过相应的策略进行移动、攻击等，当需要对雪人的行为进行改变时，只需要设置不同的策略即可
 * 同时，可以通过继承的方式创建不同的雪人类，通过其自身的构造函数初始化不同的能力
 */
public abstract class AbstractSnowMan {

    //雪人的移动策略
    protected Moveable moveable;
    //雪人的攻击策略
    protected Attackable attackable;

    public AbstractSnowMan(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    //出场台词
    public abstract void showUp();

    //雪人可以移动
    public abstract void move();
    //雪人可以攻击
    public abstract void attack();

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}
