package com.manyi.zhang.designpattern.prototype;

import com.google.gson.Gson;


/**
 * 通过Gson序列化与反序列化进行克隆，属性也会被克隆
 */
public class GsonCloneUser extends User {

    public GsonCloneUser clone() {
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(this), this.getClass());
    }

    public String toString() {
        return super.toString();
    }


}
