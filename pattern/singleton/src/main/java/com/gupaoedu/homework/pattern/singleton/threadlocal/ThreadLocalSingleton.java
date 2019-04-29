
package com.gupaoedu.homework.pattern.singleton.threadlocal;

/**
 * @author 刘兴华
 * @Description: 伪线程安全
 * 使用ThreadLocal实现多数据源的切换
 * @date 2019/4/29 14:28
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue(){
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
