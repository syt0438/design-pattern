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
        Api api = ApiFactory.create();

        api.operation("1");
    }

}
