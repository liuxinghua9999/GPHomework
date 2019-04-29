package com.gupaoedu.homework.pattern.singleton.hungry;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 10:51
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton instince;

    static{
        instince = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public HungryStaticSingleton getInstince(){
        return instince;
    }

}
