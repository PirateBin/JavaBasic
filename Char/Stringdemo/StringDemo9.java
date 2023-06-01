package Char.Stringdemo;
//金额转换
//查表法

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String [] args) {
        //键盘录入金额,并判断金额是否在0~9999999之间
        Scanner sc = new Scanner(System.in);
        int money ;
        while (true) {
            System.out.println("请输入一个金额");
            money=sc.nextInt();
            if (money >= 0 && money < 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }

        }
        System.out.println(money);

        //定义一个变量用来表示钱的大写
        String moneyStr="";

        //得到money中的每一位数字,再转成中文
        while(true){
            //从右往左获取数据，右侧为个位
            int ge=money%10;
            String capitalNumber=getCapitalNumber(ge);
            moneyStr=capitalNumber+moneyStr;
            money=money/10;
            //如果数字是每一位全部获取到，那么money记录的就是0，此循环结束
            if(money==0){
                break;
            }
        }

        //在前面补0，补齐7位
        int count=7-moneyStr.length();
        for(int i=0;i<count;i++){
            moneyStr="零"+moneyStr;
        }
        System.out.println(moneyStr);

        //插入单位
        //定义一个数组表示单位
        String [] arr={"佰","拾","万","仟","佰","拾","元"};

        //遍历moneyStr，然后把arr单位插进去
        String result="";
        for(int i=0;i<moneyStr.length();i++){
            char c=moneyStr.charAt(i);
            /*System.out.print(c);
            System.out.print(arr[i]); */

            //拼接moneyStr和arr数组
            result=result+c+arr[i];
        }
    }



    //定义一个方法把数字变成大写的中文
    public static String getCapitalNumber(int number){
        //定义数组，让数字跟大写的中文产生一个对应的关系;
        String [] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        //返回结果
        return arr[number];
    }


}
