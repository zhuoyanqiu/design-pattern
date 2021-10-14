package com.zyq.study.designpattern.factory.factorymethod;

public abstract class FatherFactory {

    /**
     * 抽象工厂方法
     * @return 抽象产品
     */
    abstract Product factoryMethod();

    public String eport(String data){
        Product product = factoryMethod();
        return product.useProduct(data);
    }

}
