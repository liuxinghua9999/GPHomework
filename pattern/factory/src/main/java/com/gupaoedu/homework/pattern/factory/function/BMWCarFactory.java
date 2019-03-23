package com.gupaoedu.homework.pattern.factory.function;

import com.gupaoedu.homework.pattern.factory.entity.BMWCar;
import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 宝马汽车工厂类
 * @date 2019/3/23 16:39
 */
public class BMWCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BMWCar();
    }

}
