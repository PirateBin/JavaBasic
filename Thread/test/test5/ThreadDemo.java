package Thread.test.test5;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo {
    public static void main(String[] args) {

         /*
            在一个抽奖池中存放了{10,5,20,50,100,200,500,800,2,80,300,700}的金额;
            创建两个抽奖箱（线程）设置线程名称为”抽奖箱1“，”抽奖箱2“
            随机从抽奖池中获取元素并打印到控制台上，格式如下：
                            每次抽出一个奖项,不打印，抽完时一次性打印（随机）
                            在此抽奖过程中，抽奖箱1共产生了6个奖项
                            分别为：10,20,100,500,2,300 最高奖项为500，总计为932
                            在此抽奖过程中，抽奖箱2共产生了6个奖项
                            分别为：5,50,200,800,80,700 最高奖项为800，总计为1835
         */
        //创建奖池
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread t1=new MyThread(list);
        MyThread t2=new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();


    }
}
