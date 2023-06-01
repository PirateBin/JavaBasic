package Thread.waitnotify1;

public class Foodie extends Thread{


          /*
            1.循环
            2.同步代码块
            3.判断是否到了末尾，到了末尾
            4.判断是否到了末尾，没到末尾
         */

    @Override
    public void run(){
        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //先判断桌子上是否有面条
                    if(Desk.foodFlag==0){
                        //如果没有就等待
                        try {
                            Desk.lock.wait(); //让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else{
                        //把吃的总数-1
                        Desk.count--;
                        //如果有，就开吃
                        System.out.println("吃货正在吃面条，还能再吃"+Desk.count+"碗!!!");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag=0;
                    }


                }
            }
        }
    }
}
