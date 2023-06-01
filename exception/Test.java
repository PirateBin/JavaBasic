package exception;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /*
            键盘录入自己心仪的女朋友姓名和年龄
            姓名长度在2~4之间，
            年龄范围在18~24之间
            超出这个范围是异常数据不能赋值，需要重新录入，一直到录入正确为止

         */


        Scanner sc=new Scanner(System.in);

        GirlFriend gf=new GirlFriend();

        while(true) {
            //接收女朋友的姓名
            try {
                System.out.println("请输入女朋友姓名:");
                String name = sc.nextLine();
                gf.setName(name);

                //接收女朋友年龄
                System.out.println("请输入女朋友年龄:");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);

                //如果所有的数据都是正确的，跳出循环
                break;

            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
                continue;
            } catch (NameFormatException e) {
                System.out.println("姓名的长度有误");
                continue;
            } catch (AgeOutBoundsException e){
                //e.printStackTrace();        //AgeOutBoundsException
                System.out.println("年龄范围有误");
                continue;
            }

        }

        //打印
        System.out.println(gf);



    }
}
