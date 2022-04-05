package kr.taeu.codingtest.greedy.treasure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }
}
