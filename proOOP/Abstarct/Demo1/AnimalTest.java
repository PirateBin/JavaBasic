package proOOP.Abstarct.Demo1;

public class AnimalTest {
    public static void main(String[] args) {
        Frog f=new Frog("青蛙",1);
        f.eat();
        f.drink();
        f.show();

        Dog d=new Dog("英短银渐层",2);
        d.eat();
        d.drink();
        d.show();

    }
}
