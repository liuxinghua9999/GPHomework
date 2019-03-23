package com.gupaoedu.homework.pattern.factory.abstruct;

import com.gupaoedu.homework.pattern.factory.entity.ICar;
import com.gupaoedu.homework.pattern.factory.entity.INewEnergyCar;
import com.gupaoedu.homework.pattern.factory.entity.ISUVCar;

/**
 * @author 刘兴华
 * @Description: 抽象工厂接口
 * @date 2019/3/23 16:48
 */
public interface ICarFactory {

    ICar createCar();
    ISUVCar createSuvCar();
    INewEnergyCar createNewEnergyCar();

}
