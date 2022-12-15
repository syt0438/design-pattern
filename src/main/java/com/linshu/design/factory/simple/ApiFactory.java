package com.linshu.design.factory.simple;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:06
 */
public class ApiFactory {

    public static Api create() {
        boolean b = new Random().nextInt() % 2 == 0;

        return b ? new ApiImplA() : new ApiImplB();
    }

}
