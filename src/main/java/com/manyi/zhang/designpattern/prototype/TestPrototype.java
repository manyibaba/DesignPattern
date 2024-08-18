package com.manyi.zhang.designpattern.prototype;



public class TestPrototype {

    public static void main(String[] args) {
//        testCloneable();
//
//        testGsonClone();
//
//        testSerializableClone();
//
        testJacksonClone();

    }

    private static void testJacksonClone() {
        System.out.println("========testJacksonClone========");
        JacksonCloneUser user = new JacksonCloneUser();
        JacksonCloneUser cloneUser = user.clone();
        user.getDate().setTime(12314342);
        user.getHeight().addAndGet(10);

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println();
    }

    private static void testSerializableClone() {
        System.out.println("========testSerializableClone========");
        SerializableUser user = new SerializableUser();
        SerializableUser cloneUser = user.clone();
        user.getDate().setTime(12314342);
        user.getHeight().addAndGet(10);

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println();
    }

    private static void testGsonClone() {
        System.out.println("========testGsonClone========");
        GsonCloneUser user = new GsonCloneUser();
        GsonCloneUser cloneUser = user.clone();

        //通过Gson序列化与反序列化进行的克隆，属性也被克隆了，因此修改user不会影响cloneUser
        user.getDate().setTime(12314342);
        user.getHeight().addAndGet(10);

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println();
    }

    private static void testCloneable() {
        System.out.println("========testCloneable========");
        CloneableUser user = new CloneableUser();
        CloneableUser cloneUser = user.clone();

        // date属性在clone方法里也进行了克隆，因此修改user.date不会影响到cloneUser.date
        user.getDate().setTime(12314342);
        // height没有克隆，因此修改height会同时影响user和cloneUser
        user.getHeight().set(180);

        System.out.println(user);
        System.out.println(cloneUser);
        System.out.println();
    }
}
