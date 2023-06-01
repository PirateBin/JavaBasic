package Char.Stringdemo;

public class StringDemo11 {
    public static void main(String [] args){
        String ID="450111197205054878";
        String year=ID.substring(6,10);
        String month=ID.substring(10,12);
        String day=ID.substring(12,14);
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        //String gender=ID.substring(17,18);
        char gender=ID.charAt(16);

        //字符转换成数字
        //利用ASCII码表进行转换 0-->48

        int num=gender-48;
        if(num%2==0){
            System.out.println("性别为：女");
        }else{
            System.out.println("性别为：男");
        }


    }
}
