package Char.Stringdemo;

//String substring(int beginIndex,int endIndex) 截取 (包头不包尾）

public class StringDemo10 {
    public static void main(String [] args){
        //获取一个手机号码
        String phoneNumber="13112349468";

        //截取手机号码前三位
        String start=phoneNumber.substring(0,3);
        System.out.println(start);

        //截取手机号码后四位
        String end=phoneNumber.substring(7);
        System.out.println(end);

        //拼接
        String result=start+"****"+end;
        System.out.println(result);
    }
}
