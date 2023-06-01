package Thread.test.test4;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /*
            在一个抽奖池中存放了{10,5,20,50,100,200,500,800,2,80,300,700}的金额;
            创建两个抽奖箱（线程）设置线程名称为”抽奖箱1“，”抽奖箱2“
            随机从抽奖池中获取元素并打印到控制台上，格式如下：
                            每次抽出一个奖项就打印一个（随机）
                            抽奖箱1 有产生了一个 10 元大奖
                            抽奖箱1 有产生了一个 200 元大奖
                            抽奖箱2 有产生了一个 700 元大奖
         */
        //创建奖池
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread t1=new MyThread(list);
        MyThread t2=new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");



        t2.start();
        //t2.join();
        t1.start();


    }
}
