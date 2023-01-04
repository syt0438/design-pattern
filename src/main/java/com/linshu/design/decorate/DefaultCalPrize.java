package com.linshu.design.decorate;

import java.util.Date;

class DefaultCalPrize implements CalPrizeConstraint {

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }

}
