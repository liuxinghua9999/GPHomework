package com.gupaoedu.homework.pattern.proxy.dbroute;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/5/7 9:14
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao = new OrderDao();
    @Override
    public void createOrder(Order order) {
        orderDao.createOrder(order);
    }
}
