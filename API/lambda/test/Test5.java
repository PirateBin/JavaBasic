package API.lambda.test;

public class Test5 {
    public static void main(String[] args) {
                /*
            小明特别喜欢爬楼梯，他有时候一次爬一个台阶，有时候一次爬两个台阶,有时候一次爬三个台阶
            如果这个楼梯有20个台阶，小明一共有多少种爬法

            1层台阶 1种爬法
            2层台阶 2种爬法
            3层台阶 4种爬法
            4层台阶 =3层台阶爬法+2层台阶爬法+1层台阶爬法


         */

        System.out.println(getCount(20));  //121415

    }
    public static int getCount(int i){
        if(i==1){
            return 1;
        }
        if(i==2){
            return 2;
        }
        if(i==3){
            return 4;
        }
        return getCount(i-1)+getCount(i-2)+getCount(i-3);
    }
}
