package com.gupaoedu.homework.pattern.singleton.lazy;

import com.gupaoedu.homework.pattern.singleton.threadlocal.ThreadLocalSingleton;
import sun.management.LazyCompositeData;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 13:17
 */
public class ExectorThread implements Runnable {

    @Override
    public void run() {
//        LazySimpleSingleton lazy = LazySimpleSingleton.getInstince();
//        System.out.println(Thread.currentThread().getName() + lazy.toString());

        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
    }
}
