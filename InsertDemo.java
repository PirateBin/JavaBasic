package Algorithm.sort;

import java.util.StringJoiner;

public class InsertDemo {
    public static void main(String[] args) {
        /*
            插入排序：
            将0索引的元素到n索引的元素看成是有序的，把N+1个索引的元素到最后一个元素当成是无序的，
            遍历无序的数据，将遍历到的元素插入到有序序列中适当的位置，如果遇到相同数据，插在后面
            N的范围：0~最大索引

         */

        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        insertSort(arr);
        System.out.println(printArr(arr));


    }

    public static int[] insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            //定义j=i，让j与前面已经排序好的数作比较
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }

    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1) {
                sb.append(",");
            }
        }
        sb.append("]");


        return sb.toString();
    }
}
