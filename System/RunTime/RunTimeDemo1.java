package System.RunTime;

import java.io.IOException;

public class RunTimeDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime的对象
        /*

        Runtime r1=Runtime.getRuntime();  //Runtime不能直接实例化
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);

         */

        //exit 停止虚拟机
        //  Runtime.getRuntime().exit(0);

        //获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors()); //16

        //总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024/1024); //3GB

        //已经获取的总内存大小，单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024); //254

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024); //250

        //运行cmd命令
        //  Runtime.getRuntime().exec("notepad"); //打开记事本
        //shutdown :关机
        //加上参数才能执行
        //-s :默认在一分钟之后关机
        //-s -t 指定时间：指定时间关机 (单位/s)
        //-a :取消关机操作
        //-r :关机并重启

        Runtime.getRuntime().exec("shutdown -a");


    }
}
