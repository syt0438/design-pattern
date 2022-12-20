package com.linshu.design.factory.abstraction;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 17:39
 */
public class MSIMainboard implements MainboardApi {
    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard, cpuHoles=1164");
    }
}
