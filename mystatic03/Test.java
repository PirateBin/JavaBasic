package proOOP.mystatic03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合用来存储学生对象
        ArrayList<Student> list=new ArrayList<>();

        //创建三个学生对象
        Student s1=new Student("张三",20,"male");
        Student s2=new Student("杰克",19,"male");
        Student s3=new Student("露西",18,"female");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //调用工具类中的方法
        int maxagestudent=StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxagestudent);
    }
}
