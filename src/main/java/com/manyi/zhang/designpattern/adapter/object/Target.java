package com.manyi.zhang.designpattern.adapter.object;

/**
 * 目标类，可以理解为“新需求”
 */
public interface Target {

    /**
     * 需要typeC接口，但是“老代码”只能返回USB接口
     * @return
     */
    String typeC();

}
