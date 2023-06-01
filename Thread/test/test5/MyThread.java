package Thread.test.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    //共享数据
    //{10,5,20,50,100,200,500,800,2,80,300,700}

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //static ArrayList<Integer> list1 = new ArrayList<>();
    //static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        ArrayList<Integer> boxList=new ArrayList<>();

        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    //抽奖结束
                    System.out.println(getName() + boxList + " 总计为" + getSum(boxList) + " 最大值为" + getMax(boxList));
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
                }
            }


            //理解：
            //当喜羊羊解锁睡觉了，沸羊羊才有机会
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }


    public int getMax(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
}
