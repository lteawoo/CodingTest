package kr.taeu.codingtest.math.fraction;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;
        int sum = 0;
        int sub;
        while (n > sum) {
            i++;
            sum += i;
        }
        sub = sum - n;

        if (i % 2 != 0) {
            System.out.print((1 + sub) + "/" + (i - sub));
        } else {
            System.out.print((i - sub) + "/" + (1 + sub));
        }
    }
}
