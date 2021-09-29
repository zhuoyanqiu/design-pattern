package com.zyq.study.designpattern.factory.factorymethod;

public abstract class FatherFactory {

    abstract Product factoryMethod();

    public String eport(String data){
        Product product = factoryMethod();
        return product.useProduct(data);
    }

}
