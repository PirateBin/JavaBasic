package stream;

import java.util.Arrays;

public class StreamDemo5 {
    public static void main(String[] args) {
        //数组

        int[] arr=new int[]{1,2,3,4,5,6,7};

        Arrays.stream(arr).forEach(s->System.out.println(s));


        //引用数据类型数组
        String[] arr1={"aaa","bbb","ccc"};

        Arrays.stream(arr1).forEach(s->System.out.println(s));

    }
}
