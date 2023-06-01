package proOOP.Block;

public class Student {
    private String name;
    private int age;

    /*构造代码块：
    写在成员位置的代码块
    作用：把多个构造方法中重复的代码抽取出来
    执行时机：我们在创建本类对象的时候会先执行构造代码再执行构造方法
    逐渐淘汰
    {
        System.out.println("开始创建对象了" );
    }

     */

    //静态代码块 static{} 只执行一次
    //作用：数据初始化

    static{
        System.out.println("静态代码块执行了");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
