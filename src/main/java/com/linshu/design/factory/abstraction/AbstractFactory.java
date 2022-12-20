package com.linshu.design.factory.abstraction;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 17:35
 */
public interface AbstractFactory {

    CPUApi createCPUApi();

    MainboardApi createMainboardApi();

}
