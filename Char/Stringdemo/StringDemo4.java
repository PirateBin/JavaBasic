package Char.Stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String [] args){
        //定义两个变量，记录正确的用户名和密码
        String rightUsername="pirate";
        String rightPassword="123456";
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            //键盘录入用户名和密码
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登入成功");
                break;
            } else {
                if(i==2){
                    //最后一次机会也输入错误，此时提示账号被锁定
                    System.out.println("账号"+username+"被锁定,请联系客服：xxxxxxx");
                }else{
                    System.out.println("用户登录失败，用户名或密码有误,您还剩下"+(2-i)+"次机会");
                }

            }
        }
    }
}
