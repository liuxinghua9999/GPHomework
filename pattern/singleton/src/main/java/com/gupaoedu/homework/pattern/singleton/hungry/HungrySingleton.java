package com.gupaoedu.homework.pattern.singleton.hungry;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 10:51
 */
public class HungrySingleton {

    private static final HungrySingleton instince = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstince(){
        return instince;
    }

}
