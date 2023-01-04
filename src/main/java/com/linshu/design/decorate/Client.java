package com.linshu.design.decorate;

class Client {
    public static void main(String[] args) {
        CalPrizeConstraint m = new DefaultCalPrize();
        CalPrizeConstraint m1 = new MonthPrizeDecorator(m);
        CalPrizeConstraint m2 = new SumPrizeDecorator(m1);

        double zs = m2.calcPrize("张三", null, null);
        System.out.println("==========张三应得奖金：" + zs);

        double ls = m2.calcPrize("李四", null, null);
        System.out.println("==========李四应得奖金：" + ls);

        CalPrizeConstraint m3 = new GroupPrizeDecorator(m2);
        double ww = m3.calcPrize("王五", null, null);
        System.out.println("==========王经理应得奖金：" + ww);
    }
}
