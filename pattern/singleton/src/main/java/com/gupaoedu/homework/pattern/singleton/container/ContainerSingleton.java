package com.gupaoedu.homework.pattern.singleton.container;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/5 17:59
 */
public class ContainerSingleton {
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton(){}

    public Object getBean(String className){
        if(!ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return obj;
        }
        return ioc.get(className);
    }

}
