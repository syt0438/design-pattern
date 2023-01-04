package com.linshu.design.decorate;

import java.util.Date;

interface CalPrizeConstraint {
    double calcPrize(String user, Date begin, Date end);
}
