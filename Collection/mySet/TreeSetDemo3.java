package Collection.mySet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {

        /*
            需求：请自选比较器排序和自然排序两种方式：
            要求：存入四个字符串，"c","ab","df","qwer"
            初始长度排序，如果一样的则按首字母排序

            采取第二种排序方式：比较器排序
         */

        //1.创建集合
        TreeSet<String> ts=new TreeSet<>((o1,o2)->{
                //按照长度排序
                int i=o1.length()-o2.length();
                //如果长度一样按照默认首字母排序
                i=i==0 ? o1.compareTo(o2) :i;

                return i;

        });

        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //3.打印
        System.out.println(ts);

    }
}
