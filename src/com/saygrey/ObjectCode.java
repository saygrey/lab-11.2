package com.saygrey;

public class ObjectCode implements Codable {
    private String objCode;
    public ObjectCode(String base){
        objCode=base;
    }
    @Override
    public String getCode() {
        return null;
    }
    public void setCode(String inCode){
        objCode=inCode;
    }
}
