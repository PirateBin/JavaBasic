package Thread.Thread4;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(getName()+" @ "+i);

            //表示出让当前的CPU执行权,第二次还是会抢占
            Thread.yield();

        }
    }
}
