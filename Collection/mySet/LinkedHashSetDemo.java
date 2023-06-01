package Collection.mySet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        //LinkedHashSet 底层基于哈希表，使用双链表记录添加顺序
        //如果要求去重且存取有序，才使用LinkedHashSet

        //创建4个学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lis",22);
        Student s3=new Student("wangwu",24);
        Student s4=new Student("zhangsan",23);

        //创建集合对象
        LinkedHashSet<Student> lhs=new LinkedHashSet<>();

        //添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
        //[Student{name = zhangsan, age = 23}, Student{name = lis, age = 22}, Student{name = wangwu, age = 24}]

    }
}
