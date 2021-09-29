package com.zyq.study.designpattern.factory.simplefactory;

public class SimpleFactory {

    public static Product createProduct(String type){
        Product product;
        switch (type){
            case "A": product =  new ConcreteProductA();break;
            case "B": product =  new ConcreteProductB();break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return product;
    }

}
