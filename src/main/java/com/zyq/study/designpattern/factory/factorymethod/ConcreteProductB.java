package com.zyq.study.designpattern.factory.factorymethod;



public class ConcreteProductB implements Product {
    @Override
    public String useProduct(String data) {
        return "useProductB succeed !"+",data:"+data;
    }
}
