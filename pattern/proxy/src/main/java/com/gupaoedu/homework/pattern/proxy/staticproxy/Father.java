package com.gupaoedu.homework.pattern.proxy.staticproxy;

import com.gupaoedu.homework.pattern.proxy.Person;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/30 10:48
 */
public class Father implements Person {

    private Person son;

    public Father(Person son){
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("开始帮助儿子找对象…………");
        this.son.findLove();
        System.out.println("双方父母同意，确立关系，坠入爱河………………");
    }

}
