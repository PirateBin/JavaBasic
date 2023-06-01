package API.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo4 {
    public static void main(String[] args) {
        /*
            定义数组并存储一些字符串，利用Arrays中 的sort方法进行排序
            要求：
                按照字符串的长度进行排序，短的在前面，长的在后面

         */

        String[] arr={"a","aaaa","aaa","aa"};

        //如果以后我们要把数组中的数据按照指定的方式进行排列，就要用到sort方法，而且要指定排序的规则
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                //字符串中的长度进行排序
                return o1.length()-o2.length();
            }
        });


        //Lambda
        Arrays.sort(arr,(String o1,String o2)->
                {return o1.length()-o2.length();}
        );

        //Lambda 简写
        Arrays.sort(arr,(o1,o2)->(o1.length()-o2.length()));


        //打印数组
        System.out.println(Arrays.toString(arr));


    }
}
