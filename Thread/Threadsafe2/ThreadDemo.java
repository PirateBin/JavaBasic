package Thread.Threadsafe2;

public class ThreadDemo {
    public static void main(String[] args) {

        //创建线程对象
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        Thread t3=new MyThread();

        //起名字
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t2.setPriority(10);
        //t1.setPriority(1);

        //开启线程
        t1.start();
        t2.start();
        t3.start();

    }
}
