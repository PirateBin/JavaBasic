package proOOP.InnerClass;

public class OuterTest {
    public static void main(String[] args) {
        //创建静态内部类对象
        //只要是静态的都可以用类名点直接获取
        OuterStaticInner.Inner oi=new OuterStaticInner.Inner();
        oi.show1();

        //静态方法
        OuterStaticInner.Inner.show2();

    }
}
