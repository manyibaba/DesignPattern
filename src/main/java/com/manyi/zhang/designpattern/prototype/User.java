package com.manyi.zhang.designpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    protected String name = "张老师";
    protected Date date = new Date();
    protected int age = 18;
    protected AtomicInteger height = new AtomicInteger(175);

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", age=" + age +
                ", height=" + height +
                "}; hashcode="+hashCode();
    }
}
