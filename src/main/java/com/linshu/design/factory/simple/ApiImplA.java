package com.linshu.design.factory.simple;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:03
 */
class ApiImplA implements Api {
    @Override
    public void operation(String msg) {
        System.out.println("A: " + msg);
    }
}
