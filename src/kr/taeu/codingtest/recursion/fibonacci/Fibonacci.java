package kr.taeu.codingtest.recursion.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n < 2) {
            System.out.println(n);
            return;
        }

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        return calc(0, 1, n);
    }

    private static int calc(int a, int b, int n) {
        if (n - 2 == 0) {
            return a + b;
        }

        return calc(b, a + b, n - 1);
    }
}
