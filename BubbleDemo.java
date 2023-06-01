package Algorithm.sort;

public class BubbleDemo {
    public static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1.相邻的元素两两比较，大的放右边，小的放左边
            2.第一轮比较完毕之后，最大值已经确定，第二轮可以少循环一次，后面以此类推
            3.如果数组中有n个数据，总共要执行n-1次代码就可以

         */

        //定义数组
        int[] arr={2,4,5,3,1,6,23};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static int[] bubbleSort(int[] arr){
        //i表示循环次数 arr.length-1次
        for(int i=0;i<arr.length-1;i++){

            //j表示把最大值冒泡到最后一位
            //j<arr.length-1-i
            //-1 表示防止越界
            //-i 表示提高效率，后面i位已经排序不需要再比较
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //如果前一个值大于后面一个值，则交换相邻两位
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        return arr;
    }

}
