package com.linshu.design.prototype;

class PersonalOrder implements OrderApi {
    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    String getCustomerName() {
        return customerName;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    String getProductId() {
        return productId;
    }

    void setProductId(String productId) {
        this.productId = productId;
    }

    

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);

        return order;
    }

    public String toString() {
        return "本个人订单的订购人是=" + this.customerName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;
    }
}
