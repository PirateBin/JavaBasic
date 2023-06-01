package proOOP.Extend3;

public class Student extends Person{
    public Student() {
        //super();  写不写都存在，不写JVM会补上
        System.out.println("子类的无参构造方法");
    }

    public Student(String name,int age,String address){
        //有参构造中super必须要自己写
        super(name,age,address);
    }
}
