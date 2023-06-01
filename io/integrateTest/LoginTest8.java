package io.integrateTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginTest8 {
    public static void main(String[] args) throws IOException {

        /*
            写一个登陆小案例
            步骤：
                将正确的用户名合密码手动保存在本地文件中
                保存格式为：username=zhangsan&password=123
                让用户键盘录入用户名和密码
                    比较是否一致
                如果一致打印登陆成功
                    如果不一致打印登陆失败
         */

        //1.读取正确的用户名和密码
        BufferedReader br=new BufferedReader(new FileReader("D:\\java\\StudyTest\\src\\io\\integrateTest\\userinfo.txt"));
        String line=br.readLine();
        br.close();
        //System.out.println(line);

        //2.获取正确的用户名和密码
        String[] userInfo=line.split("&");
        //获取用户名信息
        String[] arr1=userInfo[0].split("=");
        //获取密码信息
        String[] arr2=userInfo[1].split("=");

        String rightUsername=arr1[1];
        String rightPassword=arr2[1];
        //System.out.println(rightUsername+" "+rightPassword);

        //2.用户键盘录入用户名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();

        //3.比较
        if(rightUsername.equals(username) && rightPassword.equals(password)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登入失败");
        }

    }
}
