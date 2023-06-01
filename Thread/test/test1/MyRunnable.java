package Thread.test.test1;

import Thread.Threadsafe2.MyThread;

public class MyRunnable implements Runnable{

    public int count=1000;

    Object obj=new Object();

    @Override
    public void run(){
        while(true){
            synchronized(obj){
                if(count<10){
                    System.out.println("礼物还剩下"+count+" 不再赠送");
                    break;
                }else{
                    count--;
                    System.out.println(Thread.currentThread().getName()+"正在送出礼物，还剩下"+count+"礼物");
                }
            }
        }
    }
}
