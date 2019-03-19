package com.wxz.designpattern.singleton;

/**
 * Created by Administrator on 2019/3/18.
 */
public class Singleton {
    //此处使用volatile关键字避免过多线程进入synchronized同步方法
    private static volatile Singleton instance= null;
    private Singleton(){

    }
    //该方法使用了双重检查
    public Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
