package com.manyi.zhang.designpattern.decorator;

/**
 * 普通长剑
 */
public class LongSword implements Sword {
    @Override
    public void attack() {
        System.out.println("攻击");
    }
}
