package proOOP.Interface;

public class Test {
    public static void main(String[] args) {
        Dog d=new Dog("狗",1);
        d.eat();
        d.swim();

        Frog f=new Frog("青蛙",2);
        f.eat();
        f.swim();
        f.getName();
        f.getAge();

    }
}
