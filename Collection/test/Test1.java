package Collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
            班级里有n个学生，学生属性：姓名，年龄，性别
            实现随机点名器

         */

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"范闲","范建","范统","杜子腾","宋合泛","萧炎","林动","唐三","霍雨皓","蓝轩宇");

        //随机点名
        Random r=new Random();
        int index=r.nextInt(list.size());
        String name=list.get(index);
        System.out.println(name);

        //另一种随机思想
        //先打乱集合，然后取出第一个元素
        Collections.shuffle(list);

        String name0=list.get(0);
        System.out.println(name0);

    }
}
