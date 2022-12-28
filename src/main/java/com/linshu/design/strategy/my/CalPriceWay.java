package com.linshu.design.strategy.my;

import java.util.function.Function;

public enum CalPriceWay implements CalPrice {
    NORMAL(price -> {
        System.out.println("对于新客户或者是普通客户，没有折扣");

        return price;
    }),
    LARGE(price -> {
        System.out.println("对于大客户，统一折扣10%");

        return price * (1 - 0.1);
    }),
    OLD(price -> {
        System.out.println("对于老客户，统一折扣5%");

        return price * (1 - 0.05);
    });

    private Function<Double, Double> fn;

    private CalPriceWay(Function<Double, Double> fn) {
        this.fn = fn;
    }

    @Override
    public double calculatePrice(double goodsPrice) {
        return fn.apply(goodsPrice);
    }

}
