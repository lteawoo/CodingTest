package kr.taeu.codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arg1 = br.readLine().split(" ");
//        long[] arg2 = Arrays.stream(br.readLine().split(" "))
//                .mapToLong(Long::parseLong)
//                .toArray();
        long highest = 0;
        long[] arg2 = new long[]{1, 3, 5, 7, 10000};

        int durablity = Integer.parseInt(arg1[0]);
        double sum = 0;

        long max = Arrays.stream(arg2).max().getAsLong();

        for (int i = arg2.length - 1; i > 0; i--) {
            sum += arg2[i] - arg2[i - 1];
        }
    }
}
