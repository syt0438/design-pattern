package com.linshu.design.prototype;

interface OrderApi {
    int getOrderProductNum();

    void setOrderProductNum(int num);

    OrderApi cloneOrder();
}
