package Collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
                /*
            班级里有N个学生
            要求：
            被点到的学生不会再被点到
            但是如果班级中所有的学生都点完了，需要重新开启第二轮点名

         */

        //1.定义集合
        ArrayList<String> list=new ArrayList<>();

        //2.添加数据
        addList(list);

        //创建一个集合用来存储已经被点到学生的名字
        ArrayList<String> list1=new ArrayList<>();

        //3.获取集合长度
        int count=list.size();

        //4.随机点名
        Random r=new Random();

        int i=1;
        //外循环表示轮数
        while(i<=10) {

            System.out.println("第"+i+"轮点名开始了");
            //内循环表示每一轮中随机抽取的过程
            for (int j = 0; j < count; j++) {

                int index = r.nextInt(list.size());
                String name = list.remove(index);
                System.out.println(name);
            }

            if(list.isEmpty()){
                addList(list);
            }

            i++;
        }

    }

    //添加元素
    public static void addList(ArrayList list){
        Collections.addAll(list,"范闲","范建","范统","杜子腾","宋合泛","萧炎","林动","唐三","霍雨皓","蓝轩宇");
    }
}
