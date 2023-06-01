package proOOP.Extend2;

public class Sharpei extends Dog{
    //沙皮狗吃的是狗粮和骨头
    //父类中狗粮不能满足需求，需要重写

    @Override
    public void eat(){
        super.eat();//吃狗粮
        System.out.println("狗啃骨头");
    }

}
