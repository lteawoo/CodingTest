package kr.taeu.codingtest.math.breakevenpoint;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fixed = sc.nextLong();
        long variableCost = sc.nextLong();
        long price = sc.nextLong();

        if (variableCost >= price) {
            System.out.println(-1);
            return;
        }

        System.out.print(fixed / (price - variableCost) + 1);
    }
}
