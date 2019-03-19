package com.wxz.designpattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2019/3/19.
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc=new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj=null;
                try {
                    obj=Class.forName(className);
                    ioc.put(className,obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }
}
