package com.gupaoedu.homework.pattern.factory.abstruct;

/**
 * @author 刘兴华
 * @Description: 抽象工厂测试类
 * @date 2019/3/23 17:06
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        ICarFactory factory = new BjevFactory();
        System.out.println(factory.createCar().getCarName());
        System.out.println(factory.createNewEnergyCar().getNewEnergyName());
        System.out.println(factory.createSuvCar().getName());

        factory = new BMWFactory();
        System.out.println(factory.createCar().getCarName());
        System.out.println(factory.createNewEnergyCar().getNewEnergyName());
        System.out.println(factory.createSuvCar().getName());

    }
}
