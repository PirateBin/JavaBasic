package API.arrays;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        /*
            public static String toString(数组)                           把数组拼接成一个字符串
            public static int binarySearch(数组,查找的元素)                 二分法查找元素
            public static int[] copyOf(原数组,新数组长度)                   拷贝数组
            public static int[] copyOfRange(原数组,起始索引,结束索引)        拷贝数组(指定范围)
            public static void fill(数组,原数)                             填充数组
            public static void sort(数组)                                 按照默认方式进行数组排序
            public static void sort(数组,排列规则)                          按照指定的规则排序

         */


        //toString
        System.out.println("---toString---");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        //binarySearch
        //细节：数组中的元素必须是有序且升序的
        //如果找到的元素是存在的，那么返回的是真实的索引
        //但是，如果查找的元素是不存在的，返回的是 -插入点 -1
        System.out.println("---binarySearch---");
        System.out.println(Arrays.binarySearch(arr,2));  //1
        System.out.println(Arrays.binarySearch(arr,20));  //20大于10，故插入点在索引10    结果为-11
        System.out.println(Arrays.binarySearch(arr,4));  //3

        //copyOf
        //参数一：老数组
        //参数二：新数组的长度
        //方法底层会根据第二个参数来创建新的数组
        //如果新数组长度小于老数组长度，会部分拷贝
        //如果新数组长度大于老数组长度，会补上默认初始值
        System.out.println("---copyOf---");
        int[] newArr=Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr));

        //copyOfRange
        //细节：
        //包头不包尾
        System.out.println("---copyRange---");
        int[] newArr2=Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newArr2));  //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        //fill
        System.out.println("---fill---");
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));   //[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        //sort
        //底层使用的是快速排序
        System.out.println("---sort---");
        int[] arr2={10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
