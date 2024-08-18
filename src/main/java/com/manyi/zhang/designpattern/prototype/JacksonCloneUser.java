package com.manyi.zhang.designpattern.prototype;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 通过Jackson序列化与反序列化进行克隆，属性也会被克隆
 * 使用Jackson序列化要求被拷贝的类实现无参构造函数
 */
public class JacksonCloneUser extends User {

    public JacksonCloneUser clone() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(objectMapper.writeValueAsString(this), this.getClass());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return super.toString();
    }


}
