package com.linshu.design.prototype;

public interface OrderApi {
    int getOrderProductNum();

    void setOrderProductNum(int num);

    OrderApi cloneOrder();
}
