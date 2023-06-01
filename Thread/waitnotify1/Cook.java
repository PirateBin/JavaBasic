package Thread.waitnotify1;

public class Cook extends Thread{

    @Override
    public void run(){
        /*
            1.循环
            2.同步代码块
            3.判断是否到了末尾，到了末尾
            4.判断是否到了末尾，没到末尾(执行核心逻辑)
         */

        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0)
                    break;
                else{
                    if(Desk.foodFlag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        System.out.println("厨师做了一碗面条");
                        Desk.foodFlag=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }


    }

}
