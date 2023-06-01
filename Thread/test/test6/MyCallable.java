package Thread.test.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    ArrayList<Integer> list;

    Object obj=new Object();

    public MyCallable(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList=new ArrayList<>();
        while(true) {
            synchronized (obj) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList + "最大值为" + getMax(boxList));
                    break;
                } else {
                    Collections.shuffle(list);
                    int number = list.remove(0);
                    boxList.add(number);
                }
            }
            Thread.sleep(10);
        }

        if(boxList.size()==0){
            return null;
        }else {
            return getMax(boxList);
        }
    }


    public int getMax(ArrayList<Integer> list){
        Collections.sort(list);
        return list.get(list.size()-1);
    }


}
