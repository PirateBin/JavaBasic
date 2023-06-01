package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list=new ArrayList<>();
        //刚开始长度为0

        Scanner sc=new Scanner(System.in);
        //键盘录入学生对象的信息并添加到集合中
        for(int i=0;i<3;i++){
            Student stu=new Student();
            System.out.println("请输入学生的姓名");
            String name=sc.next();
            System.out.println("请输入学生的年龄");
            int age=sc.nextInt();

            //把name和age赋值给学生对象
            stu.setName(name);
            stu.setAge(age);

            //把学生对象添加到集合中
            list.add(stu);
        }

        System.out.println(list);
        //遍历
        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println("学生的姓名为"+stu.getName()+",学生的年龄为"+stu.getAge());
        }

    }
}
