package com.linshu.design.decorate;

import java.util.Date;

class MonthPrizeDecorator extends CalPrizeDecorate {

    public MonthPrizeDecorator(CalPrizeConstraint handler) {
        super(handler);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        // 2：然后计算当月业务奖金,按人员和时间去获取当月业务额，然后再乘以3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;

        System.out.println(user + "当月业务奖金" + prize);
        
        return money + prize;
    }

}
