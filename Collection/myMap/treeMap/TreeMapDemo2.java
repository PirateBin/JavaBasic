package Collection.myMap.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        /*
            TreeMap集合：基本应用
                需求2：
                    键：学生对象
                    值：籍贯
                    要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排序，同名同年龄认为是同一个人

         */

        //1.创建集合
        /*
        TreeMap<Student,String> map=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student s, Student o) {
                return (s.getAge()-o.getAge())==0? s.getName().compareTo(o.getName()) :(s.getAge()-o.getAge());
            }
        });

         */

        TreeMap<Student,String> map=new TreeMap<>((s,o)->
                (s.getAge()-o.getAge())==0? s.getName().compareTo(o.getName()) :(s.getAge()-o.getAge())

        );



        //2.创建学生对象
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",18);


        //3.添加元素
        map.put(s1,"上海");
        map.put(s2,"广东");
        map.put(s3,"江苏");

        //4.打印
        System.out.println(map);


    }
}
