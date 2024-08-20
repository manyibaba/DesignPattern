package com.manyi.zhang.designpattern.decorator;

/**
 * 火剑，装饰过后的类。可以给原有的剑扩展新的功能
 */
public class FireSword extends AbstractSwordDecorator {

    public FireSword(Sword sword) {
        super(sword);
    }

    @Override
    public void attack() {
        //保留原有功能
        sword.attack();
        //扩展新功能
        System.out.println("点燃目标");
    }

}
