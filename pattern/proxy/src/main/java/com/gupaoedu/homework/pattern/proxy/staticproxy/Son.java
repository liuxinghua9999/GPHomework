package com.gupaoedu.homework.pattern.proxy.staticproxy;

import com.gupaoedu.homework.pattern.proxy.Person;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/30 10:48
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿…………");
    }
}
