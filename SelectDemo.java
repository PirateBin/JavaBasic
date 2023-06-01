package Algorithm.sort;

import static proOOP.mystatic02.ArrayUilt.printArr;

public class SelectDemo {
    public static void main(String[] args) {
        /*
            选择排序：
                    1.从0索引开始，跟后面的元素一一比较
                    2.小的放前面，大的放后面
                    3.第一次循环后，最小的数已经确定
                    4.第二次循环从1索引开始以此类推

         */

        int[] arr={2,4,5,1,7,5,9};
        selectSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        //工具类中输出数组
        String s = printArr(arr);
        System.out.println(s);


    }

    public static int[] selectSort(int[] arr){
        //i表示这一轮中，我拿着哪个索引尚的数据跟后面的数据进行比较并交换
        for(int i=0;i<arr.length;i++){

            //内循环：每轮我要干什么事
            //拿着i和i后面的数据进行比较交换
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        return arr;
    }

}
