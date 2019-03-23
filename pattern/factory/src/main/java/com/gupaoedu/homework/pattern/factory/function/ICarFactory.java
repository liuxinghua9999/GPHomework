package com.gupaoedu.homework.pattern.factory.function;

import com.gupaoedu.homework.pattern.factory.entity.ICar;

/**
 * @author 刘兴华
 * @Description: 汽车工厂接口
 * @date 2019/3/23 16:37
 */
public interface ICarFactory {
    ICar createCar();
}
