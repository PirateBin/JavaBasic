package Thread.test.test1;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
            100份礼物，两人同时发送，当剩下的礼物少于10份时不再发出
         */

        MyRunnable mr=new MyRunnable();

        Thread t1=new Thread(mr,"小明");
        Thread t2=new Thread(mr,"小红");

        t1.start();
        t2.start();

    }
}
