package com.wxz.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2019/3/18.
 */
public class ReflectSingleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz=LazySingleton.class;
        Constructor c=clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object o1=c.newInstance();
        Object o2=c.newInstance();
        System.out.println(o1==o2);
    }
}
