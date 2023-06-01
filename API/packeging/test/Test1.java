package API.packeging.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*

            键盘录入1-100之间的整数，并添加到集合中
            直到集合种所有数据和能超过200为止

         */

        //1.创建一个集合用来添加整数
        ArrayList<Integer> list=new ArrayList<>();
        //2.键盘录入数据添加到集合中
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数：");
            String numStr=sc.nextLine();
            int num=Integer.parseInt(numStr);
            //先把异常数据先进行过滤
            if(num<1||num>100){
                System.out.println("当前数字不在1~100当中，请重新输入");
                continue;
            }
            //添加到集合中
            //num:基本数据类型
            //集合里面的数据类型是Integer
            //添加数据的时候触发了自动装箱
            //list.add(Integer.valueOf(num));
            list.add(num);

            //统计集合中的数据和
            int sum=getSum(list);
            //对sum进行判断
            if(sum>200){
                System.out.println("集合中的所有数据已经满足了要求");
                break;
            }

            //验证结论
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i)+" ");
            }

        }


    }

    private static int getSum(ArrayList<Integer> list) {
        int sum=0;
        for(int i=0;i<list.size();i++){
            //自动拆箱
            //int num=list.get(i.intValue());
            int num=list.get(i);
            sum+=num;

        }
        return sum;

    }
}
