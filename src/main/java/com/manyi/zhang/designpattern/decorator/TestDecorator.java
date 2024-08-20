package com.manyi.zhang.designpattern.decorator;

public class TestDecorator {

    public static void main(String[] args) {
//        Sword sword = new LongSword();
//        sword.attack();

//        Sword sword = new FireSword(new LongSword());
//        sword.attack();

        Sword sword = new IceSword(new FireSword(new LongSword()));
        sword.attack();
    }

}
