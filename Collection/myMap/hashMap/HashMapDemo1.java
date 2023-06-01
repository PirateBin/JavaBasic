package Collection.myMap.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        /*
        需求：创建一个HashMap集合，键是学生对象，值是籍贯
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生
         */

        //1.创建HashMap对象
        HashMap<Student,String> hm=new HashMap<>();

        //2.创建三个学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",22);
        Student s3=new Student("wangwu",24);

        Student s4=new Student("wangwu",24);

        //3.添加元素
        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");

        hm.put(s4,"山东");

        //4.遍历集合
        Set<Student> keys=hm.keySet();
        for(Student key:keys){
            String value=hm.get(key);
            System.out.println(key+"="+value);
        }
        //Student{name = wangwu, age = 24}=山东  被覆盖
        //Student{name = lisi, age = 22}=浙江
        //Student{name = zhangsan, age = 23}=江苏

        Set<Map.Entry<Student,String>> entries=hm.entrySet();
        for(Map.Entry<Student,String> e:entries){
            Student key=e.getKey();
            String value=e.getValue();
            System.out.println(key+"="+value);
        }

        hm.forEach((student,str)->System.out.println(student+"="+str));


    }
}
