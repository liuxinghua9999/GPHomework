package com.gupaoedu.homework.pattern.proxy.dbroute;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/5/7 9:14
 */
public class DynamicDataSourceEntity {

    private static final String DEFAULT_SOURCE = null;

    private static final ThreadLocal<String> local = new ThreadLocal();

    private DynamicDataSourceEntity() {

    }

    public static String get() {
        return local.get();
    }

    public static void set(String sourceName) {
        local.set(sourceName);
    }

    public static void set(int year) {
        System.out.println("切换数据源：DB_" + year);
        local.set("DB_" + year);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

}
