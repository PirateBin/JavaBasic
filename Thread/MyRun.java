package Thread;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //获取当前线程的对象
            //Thread t = Thread.currentThread();

            System.out.println(Thread.currentThread().getName() + " hello");
        }
    }
}
