package proOOP.mystatic02;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法

        int[] arr1={1,2,3,4,5};
        String str=ArrayUilt.printArr(arr1);
        System.out.println(str);

        double[] arr2={1.5,1.7,2.5,3.6,1.023,6.90};
        double averge=ArrayUilt.Average(arr2);
        System.out.println(averge);

    }
}
