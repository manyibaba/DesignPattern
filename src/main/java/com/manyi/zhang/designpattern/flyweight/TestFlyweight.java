package com.manyi.zhang.designpattern.flyweight;

public class TestFlyweight {

    /**
     * 享元模式：对于需要重复多次使用的对象，只会创建一个，后续获取的都是同一个
     * 节省内存、cpu资源
     */
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, 1, TreeFactory.getTree("茂凯", "扭曲树精"));
        TreeNode treeNode2 = new TreeNode(2, 4, TreeFactory.getTree("茂凯", "扭曲树精"));
        TreeNode treeNode3 = new TreeNode(3, 5, TreeFactory.getTree("茂凯", "扭曲树精"));
        TreeNode treeNode4 = new TreeNode(4, 2, TreeFactory.getTree("茂凯", "扭曲树精"));
    }
}
