package com.linshu.design.singleton;

import java.util.Date;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/19
 * Time: 18:47
 */
public class Singleton {
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton instance;

        static {
            System.out.println("init before: " + new Date());

            instance = new Singleton();

            System.out.println("init after: " + new Date());
        }
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}