package com.wxz.designpattern.singleton;

/**
 * 懒汉式单例
 * 优点：系统需要该对象的时候才创建对象，避免了资源浪费和内存占用
 * 缺点：
 */
public class LazySingleton {
    private static LazySingleton instance=null;
    private LazySingleton(){
        if(LazyHolder.lazy!=null){
            System.out.println("单例模式被破环");
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    public static LazySingleton getInstance(){
        return LazyHolder.lazy;
    }
    private static class LazyHolder{
        private static final LazySingleton lazy=new LazySingleton();
    }
}
