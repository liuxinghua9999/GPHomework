package com.gupaoedu.homework.pattern.factory.entity;

/**
 * @author 刘兴华
 * @Description: 北汽新能源汽车
 * @date 2019/3/23 16:46
 */
public class BjevNewEnergyCar implements INewEnergyCar {
    @Override
    public String getName() {
        return "北汽新能源汽车";
    }

    @Override
    public String getNewEnergyName() {
        return "电动汽车";
    }
}
