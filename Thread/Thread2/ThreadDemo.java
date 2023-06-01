package Thread.Thread2;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
            setPriority(int newPriority)    设置线程的优先级
            final int getPriority()         获取线程的优先级
         */

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"飞机");
        Thread t2=new Thread(mr,"坦克");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getPriority());

    }
}
