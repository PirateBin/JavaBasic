package proOOP.Abstarct.Demo1;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗啃骨头");
    }

}
