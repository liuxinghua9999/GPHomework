package com.gupaoedu.homework.pattern.factory.function;

import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 工厂方法测试类
 * @date 2019/3/23 16:40
 */
public class FunctionFactoryTest {
    public static void main(String[] args) {
        ICarFactory factory = new BjevCarFactory();
        ICar car = factory.createCar();
        System.out.println(car.getCarName());
        factory = new BMWCarFactory();
        car = factory.createCar();
        System.out.println(car.getCarName());
    }
}
