package com.gupaoedu.homework.pattern.factory.simple;

import com.gupaoedu.homework.pattern.factory.entity.BMWCar;
import com.gupaoedu.homework.pattern.factory.entity.BjevCar;
import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 简单工厂模式
 * @date 2019/3/23 14:55
 */
public class CarFactory {
    public ICar createCar(String carType){
        if("BJEV".equals(carType)){
            return new BjevCar();
        }
        if("BMW".equals(carType)){
            return new BMWCar();
        }
        return null;
    }

}
