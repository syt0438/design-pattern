package com.linshu.design.factory.abstraction;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/20
 * Time: 17:37
 */
class IntelCPU implements CPUApi {
    @Override
    public void calculate() {
        System.out.println("now in Intel CPU, pins=1156");
    }
}
