package com.gupaoedu.homework.pattern.proxy.dbroute;

import java.util.Date;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/5/9 10:52
 */
public class StaticDbRouteProxTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);

    }

}
