package API.lambda.test;

public class Test2 {
    public static void main(String[] args) {
        /*
            有一个很有名的数学逻辑题交不死神兔问题，有一对兔子，从出生后的第三个月起，每个月都生一对兔子，
            小兔子长到第三个月后每个月又生一对兔子，假设兔子都不死，问第十二个月兔子对数有多少
            1月：1
            2月：1
            3月：2
            4月：3
            5月：5
            六月：8
            ...

         特点：从第三个数开始是前面两个数的和（斐波那契数列）

         */

        //求解1：
        //1.创建一个长度为12的数组
        int[] arr=new int[12];

        //2.手动给0索引和1索引数据赋值
        arr[0]=1;
        arr[1]=1;

        //3.利用循环给剩余的数据赋值
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        //4.输出最后一个值的数
        System.out.println(arr[11]);


        //求解2：
        //用递归的方式去完成
        //考虑递归的出口
        //找到递归的规律
        //F(12)=F(11)+F(10)
        //F(11)=F(10)+F(9)
        //F(10)=F(9)+F(8)
        //...
        //F(3)=F(2)+F(1)
        //F(2)=F(1)=1

        System.out.println(getSum(12));



    }

    public static int getSum(int month){
        if(month==1 ||month==2){
            return 1;
        }
        return getSum(month-1)+getSum(month-2);
    }
}
