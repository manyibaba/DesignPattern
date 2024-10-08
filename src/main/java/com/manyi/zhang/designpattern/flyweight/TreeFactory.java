package com.manyi.zhang.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeFactory {

    private static final Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree getTree(String name, String data) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name, tree);
        return tree;
    }
}
