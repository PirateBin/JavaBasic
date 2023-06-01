package Algorithm.search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {

        /*
            二分查找
            核心：
            每次排除一半的查找范围

            需求：定义一个方法利用二分查找，查询某个元素再数组中的索引
            {7，23，79，81，103，127，131，147}
         */
        int[] arr={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr,10));  //-1
        System.out.println(binarySearch(arr,131));  //6

    }

    public static int binarySearch(int[] arr,int number){
        //1.定义两个变量记录查找的范围
        int min=0;
        int max=arr.length-1;

        //2.利用循环不断的去找要查找的数据
        while(true){
            //判断number是否在数组当中
            if(min>max){
                return -1;
            }

            //3.定义一个中间值mid
            int mid=(min+max)/2;

            //4.判断number和arr[mid]的值
            if(number>arr[mid]){
                //如果number大于中间值，那么min变成mid+1,number在新的min和max区间内
                min=mid+1;
            }else if(number<arr[mid]){
                //如果number小于中间值，那么max变成mid-1，number在新的min和max区间内
                max=mid-1;
            }else if(number==arr[mid]){
                return mid;
            }
        }

    }

}
