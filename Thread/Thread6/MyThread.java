package Thread.Thread6;

public class MyThread extends Thread{

    //表示这个类所有的对象，都共享ticket数据
    static int ticket=0;

    //锁对象，一定要是唯一的
    static Object obj=new Object();

    @Override
    public void run(){
        while(true){
            //设置一个同步代码块保护线程安全
            synchronized(MyThread.class){
                if(ticket<100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票!!!");
                }else{
                    break;
                }
            }

        }
    }
}
