package com.linshu.design.prototype;

class OrderBusiness {
    /**
     * 创建订单的方法
     * 
     * @param order 订单的接口对象
     */
    void saveOrder(OrderApi order) {
        // 根据业务要求，当订单预定产品数量超过1000时，就要把订单拆成两份订单

        // 1：判断当前的预定产品数量是否大于1000
        while (order.getOrderProductNum() > 1000) {
            // 2：如果大于，还需要继续拆分
            // 2.1再新建一份订单，跟传入的订单除了数量不一样外，其他都相同
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);

            // 2.2原来的订单保留，把数量设置成减少1000
            order.setOrderProductNum(order.getOrderProductNum() - 1000);

            // 然后是业务功能处理，省略了，打印输出，看一下
            System.out.println("拆分生成订单==" + newOrder);
        }

        // 3：不超过1000，那就直接业务功能处理，省略了，打印输出，看一下
        System.out.println("订单==" + order);
    }
}