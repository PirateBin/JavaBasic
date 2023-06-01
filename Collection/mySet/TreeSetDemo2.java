package Collection.mySet;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {


        //底层：红黑树


        /*
            排序：
            方式一：
                默认的排序规则/自然排序
                Student实现Comparable接口，重写里面的抽象方法，再指定比较规则

         */

        //1.创建三个学生对象
        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lisi",22);
        Student s3=new Student("wangwu",23);

        //2.创建TreeSet集合
        TreeSet<Student> ts=new TreeSet<>();

        //3.集合添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        //4.打印
        System.out.println(ts);

    }
}
