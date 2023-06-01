package Algorithm;

import java.util.Arrays;
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 4, 1, 6, 8, 2};
        int temp = 0;
        for (int gap = arr.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j=i;
                    temp = arr[j];
                        if (arr[j] < arr[j-gap]) {
                            while(j-gap>=0&&arr[j-gap]>temp){
                            arr[j] = arr[j-gap];
                            j=j-gap;
                        }
                    arr[j]=temp;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }
