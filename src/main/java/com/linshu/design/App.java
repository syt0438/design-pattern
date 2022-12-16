package com.linshu.design;

import com.linshu.design.factory.simple.Api;
import com.linshu.design.factory.simple.ApiFactory;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:01
 */
public class App {

    public static void main(String[] args) {
        Api api1 = ApiFactory.create();
        Api api2 = ApiFactory.create();
        Api api3 = ApiFactory.create();

        api1.operation("1");
        api2.operation("2");
        api3.operation("3");

        System.out.println(api1);
        System.out.println(api2);
        System.out.println(api3);
    }

}
