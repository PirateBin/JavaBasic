package io.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) throws IOException {

        /*
            将多个自定义对象序列化到文件中，但是对象个数不确定，该如何操作？
         */

        //1.序列化多个对象
        Student s1=new Student("zhangsan",23,"广州");
        Student s2=new Student("lisi",21,"上海");
        Student s3=new Student("wangwu",20,"北京");
        Student s4=new Student("xiaoyan",25,"厦门");


        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);

        oos.close();

    }
}
