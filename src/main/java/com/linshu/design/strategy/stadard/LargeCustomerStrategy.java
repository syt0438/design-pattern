package com.linshu.design.strategy.stadard;

class LargeCustomerStrategy implements Strategy {
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");

        return goodsPrice * (1 - 0.1);
    }
}
