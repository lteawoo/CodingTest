package kr.taeu.codingtest.greedy.atm;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int sum = arr[0];
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prev += arr[i];
            sum += prev;
        }

        System.out.println(sum);
    }
}
