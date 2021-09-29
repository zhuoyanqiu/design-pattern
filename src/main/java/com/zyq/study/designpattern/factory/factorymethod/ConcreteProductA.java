package com.zyq.study.designpattern.factory.factorymethod;


public class ConcreteProductA implements Product {
    @Override
    public String useProduct(String data) {
        return "useProductA succeed !"+",data:"+data;
    }
}
