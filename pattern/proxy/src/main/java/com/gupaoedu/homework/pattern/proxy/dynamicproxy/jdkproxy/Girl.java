package com.gupaoedu.homework.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.homework.pattern.proxy.Person;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/30 13:24
 */
public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("女孩要求");
    }
}
