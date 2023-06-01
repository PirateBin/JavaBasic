package Thread.Thread5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException{

        /*
            public final void join()    插入线程/插队线程
         */

        MyThread t=new MyThread();
        t.setName("土豆");
        t.start();

        //表示把t线程插入当前线程之前
        //t：土豆
        //当前线程：main线程
        t.join();

        //执行在main线程中
        for(int i=0;i<10;i++){
            System.out.println("main线程"+i);
        }

    }
}
