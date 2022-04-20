package kr.taeu.codingtest.math.honeycomb;

import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        long i = 1;
        long j = 0;
        while (true) {
            j += i * 6;
            if (n > j + 1) {
                i++;
            } else {
                break;
            }
        }
        System.out.print(i + 1);
    }
}