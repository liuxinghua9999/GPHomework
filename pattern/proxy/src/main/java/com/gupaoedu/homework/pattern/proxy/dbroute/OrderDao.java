package com.gupaoedu.homework.pattern.proxy.dbroute;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/5/7 9:13
 */
public class OrderDao {
    public int createOrder(Order order) {
        System.out.println("保存订单信息成功！");
        return 1;
    }
}
