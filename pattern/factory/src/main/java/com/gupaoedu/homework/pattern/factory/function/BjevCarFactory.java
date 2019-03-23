package com.gupaoedu.homework.pattern.factory.function;

import com.gupaoedu.homework.pattern.factory.entity.BjevCar;
import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 北汽汽车工厂类
 * @date 2019/3/23 16:38
 */
public class BjevCarFactory implements ICarFactory {

    @Override
    public ICar createCar() {
        return new BjevCar();
    }

}
