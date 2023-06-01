package API.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {

        /*
            public static void sort(数组,排序规则)    按照指定的规则排序

            细节：
                只能给也能用数据类型的数组进行排序
                如果数组是基本数据类型的，需要变成其对应的包装类

         */

        Integer[] arr={2,3,1,5,6,7,8,4,9};

        //第二个参数是一个接口，我们在调用这个方法的时候，需要传递这个接口的实现对象，作为排序的规则
        //但是这个实现类，我只要使用一次，所以没必要再单独去写一个类，之间采取匿名内部类的方法就可以了



        //底层原理：
        //利用插入排序+二分查找的方式进行排序的
        //默认把0索引的数据当成是有序的序列，1索引到最后的认为是无序的序列
        //遍历无序的序列得到里面每一个元素，假设当前遍历得到的元素是A元素
        //把A往有序序列中插入，插入的时候，是利用二分查找确定A的插入点
        //拿着A元素，跟插入点的元素进行比较，比较的规则就说compare方法的方法体
        //如果方法返回的是负数，则A继续跟前面的数据进行比较
        //如果方法返回的是正数，则A继续跟后面的数据进行比较
        //如果方法返回的是0，则A也继续跟后面的数据进行比较
        //直到能确定A的最终位置位置


        //compare的参数
        //o1: 表示无序序列中，遍历得到的每一个元素  (o1是插入排序后面的)
        //o2: 有序序列中的元素                   (o2是插入排序前面的)

        //返回值：
        //负数：表示当前要插入的元素是小的，放在前面
        //0和正数：表示当前要插入的元素是大的，放在后面

        //o1-o2 :升序
        //o2-o1 :降序

        Arrays.sort(arr,new Comparator<Integer>(){
           @Override
           public int compare(Integer o1,Integer o2){
               //System.out.println("o1 "+o1);
               //System.out.println("o2 "+o2);
               return o1-o2;
            }
        });


        System.out.println(Arrays.toString(arr));



    }
}
