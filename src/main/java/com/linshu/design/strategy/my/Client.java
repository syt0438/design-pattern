package com.linshu.design.strategy.my;

class Client {
    public static void main(String[] args) {
        CalPrice way = CalPriceWay.OLD;

        double quote = way.calculatePrice(1000);

        System.out.println("向客户报价：" + quote);
    }
}
