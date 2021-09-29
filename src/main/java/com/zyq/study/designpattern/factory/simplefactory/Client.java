package com.zyq.study.designpattern.factory.simplefactory;

public class Client {

    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("A");
        System.out.println(product.useProduct());
    }

}
