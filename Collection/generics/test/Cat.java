package Collection.generics.test;

public abstract class Cat extends Animal{
    public Cat(String name, int age) {
        super(name,age);
    }

    public Cat(){}
    //1.继承抽象类，重写里面的所有抽象方法
    //2.本身Cat也是一个抽象的，让Cat的子类再重写方法

    //此时采取第二种处理方案
    //因为此时猫的两种种类方法也不一样


    public abstract void eat();
}
