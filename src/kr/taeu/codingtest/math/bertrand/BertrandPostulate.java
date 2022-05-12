package kr.taeu.codingtest.math.bertrand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandPostulate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int end = 2 * n;
            boolean[] b = new boolean[end + 1];
            b[0] = b[1] = true;
            for (int i = 2; i * i <= end; i++) {
                if (!b[i]) {
                    for (int j = i * i; j <= end; j += i) {
                        b[j] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = n + 1; i < b.length; i++) {
                if (!b[i]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
