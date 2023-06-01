package proOOP.Interface.project;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void studey() {
        System.out.println("篮球运动员学打篮球");
    }
}
