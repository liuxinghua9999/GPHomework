package com.gupaoedu.homework.pattern.proxy.staticproxy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/30 10:54
 */
public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }

}
