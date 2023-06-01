package Algorithm.sort;

import static proOOP.mystatic02.ArrayUilt.printArr;

public class QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数再数组中正确的位置，
            比基准数小的全在左边，比基准数大的全在右边
            后面以此类推

         */
        int[] arr={6,1,2,7,9,3,4,5,10,8};

            quickSort(arr, 0, arr.length - 1);


        System.out.println(printArr(arr));




    }

    public static void quickSort(int[] arr,int i,int j){
        //定义start和end两个 游标
        int start=i;
        int end=j;

        //定义一个基准数
        int baseNumber=i;

        //退出递归的条件
        if(start>end){
            return ;
        }

        //循环
        while(start!=end){

            //从end端找出比基准数小的数
            while(true){
                if(end<=start ||arr[end]<arr[baseNumber]){
                    break;
                }
                end--;
            }

            //从start端开始找出比基准数大的数
            while(true){
                if(end<=start ||arr[start]>arr[baseNumber]){
                    break;
                }
                start++;
            }

            //当end找到一个比baseNumber大的数且start找到一个比baseNumber小的数时
            //交换start和end
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

        }

        //当start和end指向同一个元素的时候，那么上面的循环就会结束
        //基准数归位
        //此时基准数变成start的值
        int temp=arr[start];
        arr[start]=arr[i];
        arr[i]=temp;

        //确定基数左边的范围
        quickSort(arr,i,start-1);

        //确定基数右边的范围
        quickSort(arr,start+1,j);


    }
}
