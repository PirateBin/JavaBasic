package API.packeging.test;

public class Test2 {
    public static void main(String[] args) {

        /*

            自己实现parseInt方法的效果，将字符串形式的数据转换成整数
            字符串中只能是数字不能有其他字符
            最少1位，最多10位
            0不能开头

         */

        //1.定义一个字符串
        String str="12345678";
        //2.校验字符串
        //习惯：先把异常数据进行过滤
        if(!str.matches("[1-9]\\d{0,9}")){
            //错误的数据
            System.out.println("数据格式有误");
        }else {
            //正确的数据
            System.out.println("数据格式正确");

            //3.定义一个变量来表示最终的结果
            int number=0;
            //4.遍历字符串得到里面的每一个字符
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                //'1'-'0' ---> 1
                int c1=c-'0';
                //把每一位数字放到number中
                //第一次循环1
                //第二次循环1*10+2=12
                //第三次......
                number= 10*number+c1;

            }
            //最终得到结果number
            System.out.println(number+1); //12345679

        }

    }
}
