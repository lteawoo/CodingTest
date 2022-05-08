package kr.taeu.codingtest.math.primefactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) return;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
                i--;
            }
        }
        System.out.print(n);
    }
}
