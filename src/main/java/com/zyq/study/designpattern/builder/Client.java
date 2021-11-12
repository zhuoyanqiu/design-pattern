package com.zyq.study.designpattern.builder;

/**
 * 客户端调用：客户到电脑城找老板买电脑
 */

public class Client {

    public static void main(String[] args) {
        // 客户发现电脑店，找到老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        // 沟通需求后，老板叫装机人员去组装电脑
        director.construct(builder);

        // 装完后，装机人员搬来组装好的电脑
        Computer computer = builder.getComputer();

        // 装机人员展示电脑给客户看
        computer.show();
    }

}
