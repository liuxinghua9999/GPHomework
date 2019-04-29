package com.gupaoedu.homework.pattern.singleton.lazy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 13:20
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();

    }

}
