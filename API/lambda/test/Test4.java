package API.lambda.test;

public class Test4 {
    public static void main(String[] args) {

        /*
            小明特别喜欢爬楼梯，他有时候一次爬一个台阶，有时候一次爬两个台阶
            如果这个楼梯有20个台阶，小明一共有多少种爬法

            1层台阶 1种爬法
            2层台阶 2种爬法
            3层台阶 =1层台阶加上2层台阶的爬法
            每相邻3层台阶的爬法都是固定的，只有最大层台阶=次大层台阶+最小层台阶

            第100层台阶设为F(100)
            F(100)=F(99)+F(98)

         */

        System.out.println(getCount(20)); //10946


    }

    public static int getCount(int i){
        if(i==1){
            return 1;
        }
        if(i==2){
            return 2;
        }
        return getCount(i-1)+getCount(i-2);

    }
}
