package com.linshu.design.factory.abstraction;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 17:42
 */
class ComputerEngineer {
    /**
     * 定义组装电脑需要的CPU
     */
    private CPUApi cpu = null;
    /**
     * 定义组装电脑需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 装机过程
     *
     * @param schema 客户选择的装机方案
     */
    void makeComputer(AbstractFactory schema) {
        //1：首先准备好装机所需要的配件
        prepareHardwares(schema);
        //2：组装电脑
        //3：测试电脑
        //4：交付客户
    }

    /**
     * 准备装机所需要的配件
     *
     * @param schema 客户选择的装机方案
     */
    private void prepareHardwares(AbstractFactory schema) {
        //这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //使用抽象工厂来获取相应的接口对象
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainboardApi();

        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}