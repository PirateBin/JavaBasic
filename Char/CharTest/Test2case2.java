package Char.CharTest;

import java.util.Random;

public class Test2case2 {
    public static void main(String[] args) {
        /*
        给定两个字符串，A和B
        A的旋转操作就是将A最左边的字符移动到最右端
        例如，A=‘abcde'，在移动一次后就是’bcdea'
        如果在若干次调整操作后，A能变成B，那么就返回True
        如果不能匹配成功，则返回false
         */

        //额外：生成随机数
        Random rand=new Random();
        int a=rand.nextInt(10,20);
        System.out.println(a);

        //定义两个字符串
        String strA="abcde";
        String strB="cdeab";

        //旋转字符串
        //循环旋转并比较

        //调用方法进行比较
        boolean result =check(strA,strB);
        System.out.println(result);

    }
    //作用：旋转字符串
    public static String rotate(String str){
        //套路
        //如果要修改字符串的内容
        //用subString进行截取，在把左边的字符截取出来拼接到右侧去
        //可以把字符串先变成一个字符数组，然后调整字符数组中的数据，最后把字符数组变成字符串

        //字符串变成字符数组
        char[] arr=str.toCharArray();
        char first=arr[0];
        //把剩余的字符依次往前挪一个位置
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        //把原来0索引放在最后
        arr[arr.length-1]=first;
        String result=new String(arr);
        return result;
    }

    //循环旋转并比较
    public static boolean check(String strA,String strB){
        for(int i=0;i<strA.length();i++) {
            if (strA.equals(strB)) {
                return true;
            }else{
                strA=rotate(strA);
            }
        }
        return false;
    }

}
