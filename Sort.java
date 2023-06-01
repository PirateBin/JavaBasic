package Algorithm;

import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {5, 3, 7, 4, 1, 6, 8, 12};
        int temp = 0;
        int count = 1;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {
                    if (arr[j+gap] < arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("第" + count++ + "轮排序结果为" + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}