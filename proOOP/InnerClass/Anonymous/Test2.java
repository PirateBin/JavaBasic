package proOOP.InnerClass.Anonymous;

public class Test2 {
    public static void main(String[] args) {

        //利用接口多态实现匿名内部类
        Swim s=new Swim(){

            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };
        s.swim();


    }
}
