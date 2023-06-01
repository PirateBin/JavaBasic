package API.regex;

public class RegexDemo1 {
    public static void main(String[] args) {

        String qq="1234567890";
        boolean result=checkQQ(qq);
        //System.out.println(result);   //true

        //正则表达式
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq){
        //长度在6~20位以内
        int len=qq.length();
        if(len<6||len>20)
            return false;
        //0不能在开头
        //char c=qq.charAt(0);
        if(qq.startsWith("0"))
            return false;

        //必须全部是数字
        for(int i=0;i<qq.length();i++){
            char c=qq.charAt(i);
            if(c<'0'||c>'9')
                return false;
        }
        return true;
    }
}
