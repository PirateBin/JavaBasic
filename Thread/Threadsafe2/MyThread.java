package Thread.Threadsafe2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    //创建锁对象
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //设置一个同步代码块保护线程安全
            //synchronized(MyThread.class){

            lock.lock();

            try {
                if (ticket < 1000) {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }


            //}

        }
    }
}
