package kr.taeu.codingtest.math.findprime3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] b = new boolean[n + 1];

        b[0] = b[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!b[i]) {
                for (int j = i * i; j <= n; j += i) {
                    b[j] = true;
                }
            }
        }

        for(int i = m; i <= n; i++) {
            if (!b[i]) System.out.println(i);
        }
    }
}
