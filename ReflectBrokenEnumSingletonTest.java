package com.wxz.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2019/3/19.
 */
public class ReflectBrokenEnumSingletonTest {
    public static void main(String[] args) throws Exception{
        Class<?> clazz=EnumSingleton.class;
        Constructor c=clazz.getDeclaredConstructor(String.class,int.class);
        EnumSingleton o1=(EnumSingleton)c.newInstance("wxz",123);
        EnumSingleton o2=(EnumSingleton)c.newInstance("sr",18);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }
}
