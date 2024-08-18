package com.manyi.zhang.designpattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TreeNode {

    private int x;
    private int y;
    private Tree tree;
}
