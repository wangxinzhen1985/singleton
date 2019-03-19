package com.wxz.designpattern.singleton;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/3/18.
 */
public class SeriableSingleton implements Serializable{
    private static final SeriableSingleton instance=new SeriableSingleton();
    private SeriableSingleton(){}
    public static SeriableSingleton getInstance(){
        return instance;
    }
    public Object readResolve(){
        return instance;
    }
}
