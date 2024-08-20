package com.manyi.zhang.designpattern.decorator;

public class IceSword extends AbstractSwordDecorator {
    public IceSword(Sword sword) {
        super(sword);
    }

    @Override
    public void attack() {
        //保留原有功能
        sword.attack();
        //扩展新功能
        System.out.println("冻结目标");
    }
}
