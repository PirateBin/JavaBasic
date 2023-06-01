package proOOP.InnerClass;

public class Test {
    public static void main(String[] args) {
        Car c=new Car("宾利",10,"red");
        c.getEngine().show();


        Car.Engine e=new Car().new Engine();
        e.show();


    }

}
