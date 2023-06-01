package io.integrateTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoginTest9 {
    public static void main(String[] args) throws IOException {

        /*
         写一个登陆小案例
            步骤：
                将正确的用户名合密码手动保存在本地文件中
                保存格式为：username=zhangsan&password=123&count=0
                让用户键盘录入用户名和密码
                    比较是否一致
                如果一致打印登陆成功
                    如果不一致打印登陆失败
            在Test8的基础上加上连续输错三次被锁定
         */

        //1.获取本地文件
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\StudyTest\\src\\io\\integrateTest\\userinfo.txt"));
        String line;
        line = br.readLine();
        br.close();


        //2.存储文件数据
        ArrayList<Student> list = new ArrayList<>();
        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");

        String rightusername = arr1[1];
        String rightpassword = arr2[1];
        int count = Integer.parseInt(arr3[1]);


        //3.判断键盘录入账号密码和文件账号密码是否一致
        //键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        if (rightusername.equals(username) && rightpassword.equals(password) && count < 3) {
            System.out.println("登陆成功");
            writeInfo("username=" + rightusername + "&password=" + rightpassword + "&count=" + count);
        } else {
            count++;
            if (count < 3) {
                System.out.println("用户名或密码错误,还剩下 : " + (3 - count) + " 次机会");
            } else {
                System.out.println("连续3次输出错误，用户被锁定");
            }

            writeInfo("username=" + rightusername + "&password=" + rightpassword + "&count=" + count);

        }
    }

    public static void writeInfo(String count) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\StudyTest\\src\\io\\integrateTest\\userinfo.txt"));
        bw.write(count);
        bw.close();

    }

}
