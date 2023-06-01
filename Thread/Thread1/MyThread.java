package Thread.Thread1;

public class MyThread extends Thread{

    public MyThread(){}


    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"@"+i);
        }
    }
}
