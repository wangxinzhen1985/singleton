package com.wxz.designpattern.singleton;

/**
 * 饿汉式单例
 * 优点：可以完全保证对象的单例
 * 缺点：类加载的时候对象即实例化，占用系统内存，耗费资源
 */
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
