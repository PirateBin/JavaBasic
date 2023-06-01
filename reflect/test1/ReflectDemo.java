package reflect.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, IOException {

        /*
            对于任意一个对象，都可用把对象所有的字段名和值保持到文件中去
         */

        Student s=new Student("小A",23,'女',168,"睡觉");
        Teacher t=new Teacher("小B",10000);

        saveObject(t);

    }

    //把对象里面所有的成员变量名和值保持到本地中
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz=obj.getClass();

        //2.获取所有的成员变量
        BufferedWriter bw=new BufferedWriter(new FileWriter("reflect.txt",true));

        Field[] fields=clazz.getDeclaredFields();
        for(Field f:fields){
            f.setAccessible(true);
            //获取成员变量的名字
            String name=f.getName();
            //获取成员变量的值
            Object value = f.get(obj);
            //System.out.println(name+" "+value);

            //写出数据
            bw.write(name+"="+value);
            bw.newLine();

        }
        bw.close();



    }

}
