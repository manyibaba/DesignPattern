package com.manyi.zhang.designpattern.decorator;

/**
 * 剑的装饰者-抽象类
 */
public abstract class AbstractSwordDecorator implements Sword {

    protected Sword sword;

    public AbstractSwordDecorator(Sword sword) {
        this.sword = sword;
    }

}
