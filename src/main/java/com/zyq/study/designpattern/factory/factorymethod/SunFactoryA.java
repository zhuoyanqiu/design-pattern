package com.zyq.study.designpattern.factory.factorymethod;

public class SunFactoryA extends FatherFactory{
    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}
