package StudentSystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }

    public static String getCode(){
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        System.out.println(list);

        //随机抽取4个字符
        Random rand=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++) {
            //获取随机索引
            int index = rand.nextInt(list.size());
            //利用随机索引获取字符
            //拼接
            char c=list.get(index);
            //把随机字符添加到sb中
            sb.append(c);
        }

        //把一个随机数字添加到末尾
        int number=rand.nextInt(10);
        sb.append(number);

        //如果我们要修改字符串中的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr=sb.toString().toCharArray();
        //拿最后一个索引，跟随机索引进行交换
        int randomIndex=rand.nextInt(arr.length);
        //最大索引指向的元素，和随机索引指向的元素交换
        char temp=arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;



    return new String(arr);
    }

}
