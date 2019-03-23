package com.gupaoedu.homework.pattern.factory.simple;

import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 简单工厂测试类
 * @date 2019/3/23 16:31
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        ICar car = factory.createCar("BMW");
        System.out.println(car.getCarName());
        car = factory.createCar("BJEV");
        System.out.println(car.getCarName());
    }
}
