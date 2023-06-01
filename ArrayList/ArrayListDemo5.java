package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list=new ArrayList<>();

        Student s1=new Student("张三",19);
        Student s2=new Student("李四",20);
        Student s3=new Student("王五",23);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
