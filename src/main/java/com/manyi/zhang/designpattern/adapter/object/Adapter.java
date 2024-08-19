package com.manyi.zhang.designpattern.adapter.object;

/**
 * 适配器类，用来适配“老接口 ${Adaptee}”和“新需求 ${Target}”
 */
public class Adapter implements Target {

    //对象适配：通过组合的方式来适配旧接口
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String typeC() {
        String usb = adaptee.usb();
        System.out.println(String.format("拿到%s，将其转换为typeC接口", usb));
        return "typeC接口";
    }

    public static void main(String[] args) {
        Adaptee adaptee1 = new Adaptee();
        Adapter adapter = new Adapter(adaptee1);
        String s = adapter.typeC();
        System.out.println(String.format("成功拿到%s", s));
    }
}
