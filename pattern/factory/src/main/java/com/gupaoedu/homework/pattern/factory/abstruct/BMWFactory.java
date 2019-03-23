package com.gupaoedu.homework.pattern.factory.abstruct;

import com.gupaoedu.homework.pattern.factory.entity.*;

/**
 * @author 刘兴华
 * @Description: 宝马汽车工厂
 * @date 2019/3/23 17:05
 */
public class BMWFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BMWCar();
    }

    @Override
    public ISUVCar createSuvCar() {
        return new BMWSuvCar();
    }

    @Override
    public INewEnergyCar createNewEnergyCar() {
        return new BMWNewEnergyCar();
    }
}
