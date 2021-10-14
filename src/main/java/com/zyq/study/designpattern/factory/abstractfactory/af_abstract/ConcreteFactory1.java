package com.zyq.study.designpattern.factory.abstractfactory.af_abstract;

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
