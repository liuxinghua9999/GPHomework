package com.gupaoedu.homework.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.homework.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/30 13:27
 */
public class Meipo implements InvocationHandler {

    private Person person;

    public Object getInstance(Person person) {
        this.person = person;
        Class clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，开始为您找对象");
        return method.invoke(this.person,args);
    }
}
