package proOOP.Extend3.Polymorphism.polymorphismDemo1;

//多态：编译看左边，运行看右边
//调用成员变量：编译看左边，运行也看左边
//调用成员方法：编译看左边，运行看右边
//instanceof 判断对象是什么类 是返回true 不是返回false

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用registe方法

        Student s=new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("老师");
        t.setAge(40);

        Administrator m=new Administrator();
        m.setName("管理员");
        m.setAge(28);


        register(s);
        register(t);
        register(m);

    }

    public static void register(Person p){
        p.show();

    }
}
