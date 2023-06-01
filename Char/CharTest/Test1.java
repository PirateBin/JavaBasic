package Char.CharTest;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        /*键盘录入一个字符串
        要求1：长度小于等于9
        要求2：只能是数字
              将内容变成罗马数字
              I-1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
              注意：罗马数字没有0，如果输入的数字包含0，可以变为""(长度为0的字符串）*/

        //键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        String str;
        while(true) {
            System.out.println("请输入一串数字：");
            str = sc.next();

            //校验字符串是否满足
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前字符串不符合规则，请重新输入");
            }
        }

        //将内容变成罗马数字
        //查表法
        StringBuilder sb=new StringBuilder();
        StringJoiner sj=new StringJoiner(" ","[","]");

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int number=c-48;
            sj.add(changeLuoMa(number));
            //sb.append(changeLuoMa(number));

        }
        System.out.println(sj);


    }

    public static String changeLuoMa(int number){
        //定义一个数组，让索引和罗马数字产生对应的关系
        String[] arr={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }

    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c<'0'||c>'9'){
                    return false;
                }
            }
            //只有当字符串中所有的字符串都判断完毕，才能返回true
            return true;
        }
    }
}
