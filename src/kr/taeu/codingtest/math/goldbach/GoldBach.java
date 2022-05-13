package kr.taeu.codingtest.math.goldbach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBach {

    private final static int LIMIT = 10000;

    public static void main(String[] args) throws IOException {
        boolean[] b = new boolean[LIMIT + 1];

        b[0] = b[1] = true;
        for (int i = 2; i * i <= LIMIT; i++) {
            if (!b[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    b[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int x = 0, y = LIMIT;
            for (int j = 2; j <= n / 2; j++) {
                if (b[j] || b[n - j]) {
                    continue;
                }
                if (n - j - j < y - x) {
                    x = j;
                    y = n - j;
                }
            }

            System.out.println(x + " " + y);
        }
    }
}
