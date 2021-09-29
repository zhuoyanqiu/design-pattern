package com.zyq.study.designpattern.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        FatherFactory factory = new SunFactoryA();
        String eport = factory.eport("哇哇哇哇哇");
        System.out.println(eport);
    }

}
