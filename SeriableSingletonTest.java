package com.wxz.designpattern.singleton;

import java.io.*;

/**
 * Created by Administrator on 2019/3/18.
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2=SeriableSingleton.getInstance();
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        FileInputStream fis=null;
        ObjectInputStream ois=null;

        try {
            fos=new FileOutputStream("SeriableSingleton.obj");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            fis=new FileInputStream("SeriableSingleton.obj");
            ois=new ObjectInputStream(fis);
            s1=(SeriableSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
