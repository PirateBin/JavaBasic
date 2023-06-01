package proOOP.InnerClass.Anonymous;

public class Test {
    public static void main(String[] args) {

        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }
        };


    }

}
