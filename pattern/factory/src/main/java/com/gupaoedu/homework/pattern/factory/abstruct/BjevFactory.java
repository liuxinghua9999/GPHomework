package com.gupaoedu.homework.pattern.factory.abstruct;

import com.gupaoedu.homework.pattern.factory.entity.*;

/**
 * @author 刘兴华
 * @Description: 北汽汽车工厂
 * @date 2019/3/23 17:00
 */
public class BjevFactory implements ICarFactory {

    @Override
    public ICar createCar() {
        return new BjevCar();
    }

    @Override
    public ISUVCar createSuvCar() {
        return new BjevSuvCar();
    }

    @Override
    public INewEnergyCar createNewEnergyCar() {
        return new BjevNewEnergyCar();
    }
}
