package Thread.Threadsafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            需求：
                某电影院目前正在上映国产大片，共有100张票，有3个窗口卖票，请设计一个程序模拟电影院卖票
                利用同步方法完成
                技巧：同步代码块抽取成同步方法


                StringBuilder 和 StringBuffer区别
                StringBuilder是线程不安全的，单线程用
                StringBuffer中每个方法都有synchronized修饰，是线程安全的，多线程用
         */

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"窗口一");
        Thread t2=new Thread(mr,"窗口二");
        Thread t3=new Thread(mr,"窗口三");

        t1.start();
        t2.start();
        t3.start();



    }
}
