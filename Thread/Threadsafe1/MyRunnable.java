package Thread.Threadsafe1;

public class MyRunnable implements Runnable{

    int ticket=0;

    @Override
    public void run(){
        //1.循环
        //2.同步代码块
        //3.判断共享数据是否到了末尾，如果到了末尾
        //4.判断共享数据是否到了末尾，如果没到末尾

        while(true){

                if (method()) break;

        }

    }

    private synchronized boolean method() {
        if(ticket==100){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"在卖第"+ticket+"张票!!!");
        }
        return false;
    }
}
