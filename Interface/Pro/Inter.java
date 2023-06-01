package proOOP.Interface.Pro;

//接口也有多态
//例： public void 搬家(运输的接口 c){ 实现接口类的对象 }


public interface Inter {

    public abstract void method();

    //接口中默认方法
    public default void show(){
        System.out.println("默认方法");
    }

    //接口中静态方法
    //接口中静态方法不能被重写
    public static void show2(){
        System.out.println("接口中的静态方法");
    }
}
