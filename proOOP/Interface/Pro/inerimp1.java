package proOOP.Interface.Pro;

public class inerimp1 implements Inter{


    @Override
    public void method() {
        System.out.println("抽象方法重写");
    }

    @Override
    public void show() {
        System.out.println("默认方法重写");
    }

    public static void show2(){
        System.out.println("类中的静态方法");
    }
}
