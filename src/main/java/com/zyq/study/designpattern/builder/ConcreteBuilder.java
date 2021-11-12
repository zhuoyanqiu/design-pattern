package com.zyq.study.designpattern.builder;

/**
 * 具体的建造者（ConcreteBuilder） ：装机人员
 */

public class ConcreteBuilder implements Builder{

    /**
     * 创建产品实例
     */
    Computer computer = new Computer();


    /**
     * 组装产品
     */
    @Override
    public void buildCPU() {
        computer.add("CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.add("主板");
    }

    @Override
    public void buildHD() {
        computer.add("硬盘");
    }

    /**
     * 返回组装完成的电脑
     * @return
     */
    @Override
    public Computer getComputer() {
        return computer;
    }
}
