package com.zyq.study.designpattern.factory.simplefactory;

public class ConcreteProductA implements Product{
    @Override
    public String useProduct() {
        return "useProductA succeed !";
    }
}
