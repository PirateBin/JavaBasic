package Thread.test.test3;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
            微信抢红包
            假设：100块，分成了3个红包，现在有5个人去抢
            其中，红包是共享数据
            5个人是5个线程
         */

        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        MyThread t5=new MyThread();

        //给线程设置名字
        t1.setName("小A");
        t2.setName("小B");
        t3.setName("小C");
        t4.setName("小D");
        t5.setName("小E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
