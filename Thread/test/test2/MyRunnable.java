package Thread.test.test2;

public class MyRunnable implements Runnable{

    Object obj=new Object();

    //定义同步变量
    int number=1;

    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if(number>100)
                    break;
                else{
                    if(number%2!=0) {
                        System.out.println(Thread.currentThread().getName()+"获取到"+number);
                    }
                    number++;
                }
            }
        }
    }
}
