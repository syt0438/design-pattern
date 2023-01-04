package com.linshu.design.decorate;

import java.util.Date;

abstract class CalPrizeDecorate implements CalPrizeConstraint {

    protected CalPrizeConstraint handler;

    public CalPrizeDecorate(CalPrizeConstraint handler) {
        this.handler = handler;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return handler.calcPrize(user, begin, end);
    }

}
