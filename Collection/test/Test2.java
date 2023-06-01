package Collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        /*
            班里有n个学生
            要求：
                70%概率随机到男生
                30%概率随机到女生

                "范闲","范建","范统","杜子腾","宋合泛","萧炎","林动","唐三","霍雨皓","蓝轩宇"
         */

        //1.创建集合
        //1111111000

        ArrayList<Integer> list=new ArrayList<>();
        //2.添加元素
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //3.打乱集合中的数据
        Collections.shuffle(list);

        //4.从list集合中随机抽取0或者1
        Random r=new Random();
        int index=r.nextInt(list.size());
        int number=list.get(index);
        System.out.println(number);

        //5.创建两个集合分别存储男生和女生的名字
        ArrayList<String> boylist=new ArrayList<>();
        ArrayList<String> girllist=new ArrayList<>();

        Collections.addAll(boylist,"范闲","范建","范统","杜子腾","宋合泛","萧炎","林动");
        Collections.addAll(girllist,"唐三","霍雨皓","蓝轩宇");

        //6.判断此时是从boylist里面抽取还是从girllist里面抽取
        if(number==1){
            int boyIndex=r.nextInt(boylist.size());
            System.out.println(boylist.get(boyIndex));
        }else{
            int girlIndex=r.nextInt(girllist.size());
            System.out.println(girllist.get(girlIndex));
        }

    }
}
