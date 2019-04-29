package com.gupaoedu.homework.pattern.singleton.lazy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 12:48
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstince(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
