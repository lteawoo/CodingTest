package kr.taeu.codingtest.greedy.meetroom;

import java.util.Arrays;
import java.util.Scanner;

public class MeetRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int lineCount = sc.nextInt();
        int arr[][] = new int[lineCount][2];
        for (int i = 0; i < lineCount; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] > o2[1]) {
                return 1;
            } else if (o1[1] == o2[1]) {
                if (o1[0] < o2[0]) {
                    return -1;
                }
                return 0;
            } else {
                return -1;
            }
        });

        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >= end) {
                result++;
                end = arr[i][1];
            }
        }

        System.out.println(result);
    }
}
