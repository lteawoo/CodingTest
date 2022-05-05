package kr.taeu.codingtest.math.findprime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(st.nextToken());

            boolean b = true;
            for (int j = 2; j < p; j++) {
                if (p % j == 0) {
                    b = false;
                    break;
                }
            }
            if (p != 1 && b) result++;
        }

        System.out.print(result);
    }
}
