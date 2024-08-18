package com.manyi.zhang.designpattern.prototype;

import org.springframework.util.SerializationUtils;

import java.io.Serializable;

/**
 * 利用SerializationUtils克隆
 * 本质上就是通过序列号与反序列化进行
 */
public class SerializableUser extends User implements Serializable {

    public SerializableUser clone() {
        //使用此clone方法要求被克隆的类必须实现Serializable接口
        return SerializationUtils.clone(this);
    }
}
