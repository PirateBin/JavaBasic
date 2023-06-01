package Collection.args;

import java.util.Random;

public class ArgsDemo1 {
    public static void main(String[] args) {

        /*
            计算n个数的和
         */
        int[] arr=new int[10];
        Random r=new Random();
        for(int i=0;i<10;i++){
            arr[i]=r.nextInt(10);
            System.out.println(arr[i]);
        }

        System.out.println(getSum(arr));




    }

    public static int getSum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

}
