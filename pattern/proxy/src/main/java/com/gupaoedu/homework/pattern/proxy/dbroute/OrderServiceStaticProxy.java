package com.gupaoedu.homework.pattern.proxy.dbroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/5/7 10:49
 */
public class OrderServiceStaticProxy implements IOrderService {

    private DateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }


    @Override
    public void createOrder(Order order) {
        String year = yearFormat.format(order.getCreateTime());
        DynamicDataSourceEntity.set(Integer.valueOf(year));
        this.orderService.createOrder(order);
    }
}
