package com.manyi.zhang.designpattern.adapter.clazz;

/**
 * 适配器类，用来适配“老接口 ${Adaptee}”和“新需求 ${Target}”
 *
 * 类适配：通过继承的方式来适配旧接口
 * 缺点：java只能单继承，不利于扩展；继承了不需要的父类的方法，存在错误调用的风险
 * 优先使用对象适配
 *
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public String typeC() {
        String usb = this.usb();
        System.out.println(String.format("拿到%s，将其转换为typeC接口", usb));
        return "typeC接口";
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        String s = adapter.typeC();
        System.out.println(String.format("成功拿到%s", s));
    }
}
