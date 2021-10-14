package com.zyq.study.designpattern.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        // 外界通过调用具体工厂类的方法，从而创建不同具体产品类的实例
        FatherFactory factory = new SunFactoryA();
        String eport = factory.eport("哇哇哇哇哇");
        System.out.println(eport);
    }

}
