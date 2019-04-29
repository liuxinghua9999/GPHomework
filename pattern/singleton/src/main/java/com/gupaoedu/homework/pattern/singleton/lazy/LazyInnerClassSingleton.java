package com.gupaoedu.homework.pattern.singleton.lazy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 14:01
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyInnerClassSingletonHolder.LAZY != null){
            throw new RuntimeException("不允许多次实例化");
        }
    }
    private Object readResolve(){
        return LazyInnerClassSingletonHolder.LAZY;
    }
    public LazyInnerClassSingleton getInstance(){
        return LazyInnerClassSingletonHolder.LAZY;
    }
    private static class LazyInnerClassSingletonHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
