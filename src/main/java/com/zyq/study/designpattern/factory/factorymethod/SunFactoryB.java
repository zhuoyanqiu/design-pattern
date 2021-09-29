package com.zyq.study.designpattern.factory.factorymethod;

public class SunFactoryB extends FatherFactory{
    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}
