package com.manyi.zhang.designpattern.strategy;

import com.manyi.zhang.designpattern.strategy.attack.PowerfulAttack;
import com.manyi.zhang.designpattern.strategy.move.FastMove;
import com.manyi.zhang.designpattern.strategy.snowman.AbstractSnowMan;
import com.manyi.zhang.designpattern.strategy.snowman.SnowMan;

/**
 * 雪人通过相应的策略进行移动、攻击等，当需要对雪人的行为进行改变时，只需要设置不同的策略即可
 */
public class TestStrategy {

    public static void main(String[] args) {
        AbstractSnowMan snowMan = new SnowMan();
        snowMan.showUp();
        snowMan.move();
        snowMan.attack();

        //获取移速药水，移速加快
        snowMan.setMoveable(new FastMove());
        //获取力量药水，攻击力变强
        snowMan.setAttackable(new PowerfulAttack());
        snowMan.move();
        snowMan.attack();
    }

}
