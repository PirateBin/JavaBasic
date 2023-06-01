package Thread.Thread1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        /*
            String getName()                返回线程的名称
            void setName(String name)       设置线程的名字（构造方法也可以设置名字）
                细节：
                    1.如果我们没有给线程设置名字，线程也是有默认的名字的
                        格式：Thread-X (X为序号，从0开始)
                    2.如果我们要给线程设置名字，我们可以用set设置，也可以用构造方法设置

            static Thread currentThread()   获取当前线程的对象
                细节：
                    当JVM虚拟机启动之后，会自动启动多条线程
                    其中有一条叫做main线程
                    他的作用就是去调用main方法，并执行里面的代码

            static void sleep(long time)    让线程休眠指定的时间，单位为毫秒
                细节：
                    1.哪条线程执行到这个方法，那么这条线程就会在这里停留对应的时间
                    2.方法的参数表示睡眠的时间
                    3.当时间到了之后，线程会自动醒来，继续执行下面的代码
         */

        //1.创建线程对象
        MyThread t1=new MyThread();
        MyThread t2=new MyThread("线程二");

        t1.setName("线程一");

        //2.开启线程
        t1.start();

        t2.start();


    }
}
