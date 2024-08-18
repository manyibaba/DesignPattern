package com.manyi.zhang.designpattern.prototype;


import java.util.Date;


public class CloneableUser extends User implements Cloneable {

    @Override
    public CloneableUser clone() {
        try {
            CloneableUser clone = (CloneableUser) super.clone();
            // 将date属性也进行克隆，原型和克隆体的该属性就可以互不影响
            clone.setDate((Date) this.getDate().clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return super.toString();
    }
}
