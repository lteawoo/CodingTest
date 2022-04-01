package kr.taeu.codingtest.greedy.coin;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCount = sc.nextInt();
        int targetPrice = sc.nextInt();
        int[] arr = new int[lineCount];
        for (int i = lineCount - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int coin : arr) {
            if (targetPrice >= coin) {
                result += targetPrice / coin;
                targetPrice %= coin;
            }
        }

        System.out.println(result);
    }
}
