package com.zyq.study.designpattern.builder;

/**
 * 定义组装的过程（Builder）：组装电脑的过程
 */

public interface Builder {

    /**
     * 第一步：装CPU
     */
    void buildCPU();

    /**
     * 第二步：装主板
     */
    void buildMainBoard();

    /**
     * 第三步：装硬盘
     */
    void buildHD();

    /**
     *
     * @return
     */
    Computer getComputer();


}
