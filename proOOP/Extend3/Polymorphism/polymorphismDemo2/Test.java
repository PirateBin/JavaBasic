package proOOP.Extend3.Polymorphism.polymorphismDemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        Person p=new Person("老王",30);
        Dog d=new Dog(2,"白");
        p.KeepPet(d,"骨头");

        Person p2=new Person("老李",29);
        Cat c=new Cat(3,"黑");
        p2.KeepPet(c,"鱼");
    }
}

