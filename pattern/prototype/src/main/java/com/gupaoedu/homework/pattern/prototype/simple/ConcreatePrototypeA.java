package com.gupaoedu.homework.pattern.prototype.simple;

import java.util.List;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/29 16:41
 */
public class ConcreatePrototypeA implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    @Override
    public Prototype clone() {
        ConcreatePrototypeA temp = new ConcreatePrototypeA();
        temp.setAge(this.age);
        temp.setHobbies(this.hobbies);
        temp.setName(this.name);
        return temp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
