package com.gupaoedu.homework.pattern.factory.entity;

/**
 * @author 刘兴华
 * @Description: 宝马新能源汽车
 * @date 2019/3/23 16:46
 */
public class BMWNewEnergyCar implements INewEnergyCar {
    @Override
    public String getName() {
        return "宝马新能源汽车";
    }

    @Override
    public String getNewEnergyName() {
        return "混合动力汽车";
    }
}
