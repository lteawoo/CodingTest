package kr.taeu.codingtest.recursion.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

//        int sum = 1;
//        for (int i = 2; i <= n; i++) {
//            sum *= i;
//        }

        int sum = factorial(n);
        System.out.println(sum);
    }

    private static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }
}
