package Thread.test.test4;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    ArrayList<Integer> list;

    //共享数据
    //{10,5,20,50,100,200,500,800,2,80,300,700}

    public MyThread(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run(){
        while(true){
            synchronized(MyThread.class){
                if(list.size()==0)
                    break;
                else{
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    System.out.println(getName()+"又产生了一个"+prize+"元大奖");
                }
            }


            //理解：
            //当喜羊羊解锁睡觉了，沸羊羊才有机会
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }

}
