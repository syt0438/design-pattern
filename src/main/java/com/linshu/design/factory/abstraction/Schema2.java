package com.linshu.design.factory.abstraction;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 17:40
 */
class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AmdCPU();
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard();
    }
}
