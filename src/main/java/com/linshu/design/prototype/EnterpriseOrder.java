package com.linshu.design.prototype;

class EnterpriseOrder implements OrderApi {
    /**
     * 企业名称
     */
    private String enterpriseName;
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

    String getEnterpriseName() {
        return enterpriseName;
    }

    void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    String getProductId() {
        return productId;
    }

    void setProductId(String productId) {
        this.productId = productId;
    }

    

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);
        return order;
    }

    public String toString() {
        return "本企业订单的订购企业是=" + this.enterpriseName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;
    }
}
