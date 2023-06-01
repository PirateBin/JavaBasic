package Algorithm.search;

import java.util.ArrayList;

public class BasicSearchDemo1 {
    public static void main(String[] args) {


        //基本查找
        //核心：
        //从0索引开始挨个往后查找

        int[] arr={131,127,147,81,103,23,7,79,81};
        int number=81;
        System.out.println(basicSearch1(arr,number));
        System.out.println(basicSearch2(arr,number));
        System.out.println(basicSearch3(arr,81));  //[3,8]


    }

    //查找值
    public static boolean basicSearch1(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    //查找索引
    public static int basicSearch2(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    //查找索引（考虑数组中有重复元素）
    public static ArrayList<Integer> basicSearch3(int[] arr, int num){
        //创建集合来存储索引
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                //判断如果有num和数组中的相同添加进集合
                list.add(i);
            }
        }
        //最后返回集合list
        return list;
    }

}
