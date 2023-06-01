package proOOP.Extend3;

public class Person {
     protected String name;
     public int age;
     protected String address;

    public Person(){
        System.out.println("父类的无参构造方法");
    }

    public Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;

    }

}
