package com.linshu.design.factory.simple;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author LinShu
 * Just contact me if you have any questions.
 * My e-mail is bruce.song@backgardon.com.
 * Date: 2022/12/15
 * Time: 18:06
 */
class ApiFactory {

    private static final ConcurrentMap<Class<?>, Object> CACHE = new ConcurrentHashMap<>();

    static Api create() {
        boolean b = new Random().nextInt() % 2 == 0;

        Class<?> clazz = b ? ApiImplA.class : ApiImplB.class;

        return (Api) CACHE.computeIfAbsent(clazz, c -> {
            try {
                return c.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                return null;
            }
        });
    }

}
