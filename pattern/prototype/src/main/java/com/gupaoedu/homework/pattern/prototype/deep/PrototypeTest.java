package com.gupaoedu.homework.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/29 16:46
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcreatePrototypeA a = new ConcreatePrototypeA();
        a.setName("Liu xinghua");
        a.setAge(32);
        List hobbies = new ArrayList<>();
        a.setHobbies(hobbies);

        ConcreatePrototypeA b = (ConcreatePrototypeA) a.clone();

        ConcreatePrototypeA c = (ConcreatePrototypeA) new Client().deepCloneStart(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("克隆对象的引用地址：");
        System.out.println(a.getHobbies());
        System.out.println(b.getHobbies());
        System.out.println(c.getHobbies());

        System.out.println("克隆对象的引用地址比较：" + (a.getHobbies() == b.getHobbies()));
        System.out.println("克隆对象的引用地址比较：" + (a.getHobbies() == c.getHobbies()));
    }
}
