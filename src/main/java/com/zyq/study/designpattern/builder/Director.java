package com.zyq.study.designpattern.builder;

/**
 * 电脑城老板委派任务给装机人员（Director）
 */

public class Director {

    /**
     * 指挥装机人员组装电脑
     * @param builder
     */
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainBoard();
        builder.buildHD();
    }

}
