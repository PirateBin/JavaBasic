package Math;

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println("please input a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


