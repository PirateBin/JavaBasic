package API.packeging.integer;

import java.util.Scanner;

public class IntegerDemo5 {

    public static void main(String[] args) {
        /*键盘录入

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i=sc.nextInt();
        System.out.println(i);

         */


        //弊端：
        //当我们用next，nextInt，nextDouble在接受数据类型的时候，遇到空格，回车，制表符的时候就停止了
        //键盘录入的是123 123 那么只能接受到空格前面的数据
        //我想要的是接收一整行数据
        //约定：
        //以后我们如果想要键盘录入，不管遇到什么类型，统一使用nextLine
        //特点：遇到回车才停止
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        //String str=sc.next();
        //System.out.println(str);

        String line=sc.nextLine();
        System.out.println(line);

        int i=Integer.parseInt(line);  //在把字符串转换成int类型
        System.out.println(i);



    }

}
