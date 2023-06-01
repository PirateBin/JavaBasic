package proOOP.InnerClass.Anonymous;


//匿名内部类
//匿名内部类其实就是一个对象
//匿名内部类的类名是JVM赋予的

public class AnimalTest {

    public static void main(String[] args) {
        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了eat()方法");
            }
        }.eat();


        method(

                new Animal(){
                    @Override
                    public void eat(){
                        System.out.println("狗啃骨头");
                    }
                }
        );

    }

    public static void method(Animal a){
        a.eat();
    }



}
