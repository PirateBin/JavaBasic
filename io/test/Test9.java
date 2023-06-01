package io.test;

import java.io.*;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //1.创建反序列化流的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));

        //2.读取数据
        ArrayList<Student> list=(ArrayList<Student>) ois.readObject();

        for(Student s:list){
            System.out.println(s);
        }

        //3.释放资源
        ois.close();

    }
}
