package com.gupaoedu.homework.pattern.singleton.lazy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 12:48
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazy;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstince(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
