package proOOP.InnerClass;

public class Car {

    public Car() {
    }

    public Car(String carName, int carAge, String carColor) {
        this.carName = carName;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    //内部类可以直接访问外部类的成员
    //外部类想要访问内部类的成员，必须创建对象
    String carName;

    int carAge;
    String carColor;

    class Engine{
        String engineName="奥迪";
        int engineAge;

        public void show(){

            System.out.println(engineName);
            System.out.println(carName);
        }
    }

    public Engine getEngine(){
        return new Engine();
    }



}
