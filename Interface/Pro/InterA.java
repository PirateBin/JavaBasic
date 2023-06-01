package proOOP.Interface.Pro;
/*
    JDK8之后接口可以又静态和默认的方法
    JDK9之后接口中静态和默认的私有方法private static/ private

 */

public interface InterA {

    public default void show1(){
        System.out.println("show1方法开始执行");
        show3();
    }

    public default void show2(){
        System.out.println("show2方法开始执行");
        show3();
    }

    public static void show4(){
        System.out.println("show4方法开始执行");
        show5();
    }

    //普通私有方法，给默认方法服务
    private  void show3(){
        System.out.println("记录程序在运行过程中的各种细节，这里又100行代码");
    }

    private static void show5(){
        System.out.println("200行代码");
    }
}
