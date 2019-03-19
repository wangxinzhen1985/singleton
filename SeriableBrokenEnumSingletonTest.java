package com.wxz.designpattern.singleton;

import java.io.*;

/**
 * Created by Administrator on 2019/3/19.
 */
public class SeriableBrokenEnumSingletonTest {
    public static void main(String[] args) throws Exception{
        EnumSingleton s1=null;
        EnumSingleton s2=EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos=new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s2);
        oos.flush();
        oos.close();

        FileInputStream fis=new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        s1=(EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
