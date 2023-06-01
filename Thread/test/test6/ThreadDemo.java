package Thread.test.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
              在一个抽奖池中存放了{10,5,20,50,100,200,500,800,2,80,300,700}的金额;
              创建两个抽奖箱（线程）设置线程名称为”抽奖箱1“，”抽奖箱2“
              随机从抽奖池中获取元素并打印到控制台上，格式如下：
                每次抽出一个奖项,不打印，抽完时一次性打印（随机）
                在此抽奖过程中，抽奖箱1共产生了6个奖项
                分别为：10,20,100,500,2,300 最高奖项为500，总计为932
                在此抽奖过程中，抽奖箱2共产生了6个奖项
                分别为：5,50,200,800,80,700 最高奖项为800，总计为1835

                在此抽奖过程中，抽奖箱2产生了最大奖项，该奖项金额为800元
                核心逻辑：获取线程抽奖的最大值（看成是线程运行的结果）
         */
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建多线程要运行的参数对象
        MyCallable mc=new MyCallable(list);

        //创建多线程运行结果的管理者对象
        FutureTask<Integer> ft1=new FutureTask<>(mc);
        FutureTask<Integer> ft2=new FutureTask<>(mc);

        //创建线程对象
        Thread t1=new Thread(ft1);
        Thread t2=new Thread(ft2);

        //设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1=ft1.get();
        Integer max2=ft2.get();
        //System.out.println(max1);
        //System.out.println(max2);
        //int max=max1>max2?max1:max2;

        if(max1>max2){
            System.out.println(t1.getName()+"抽到了最大奖项，奖金为"+max1);
        }else{
            System.out.println(t2.getName()+"抽到了最大奖项，奖金为"+max2);
        }
        System.out.println();

    }
}
