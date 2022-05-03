package kr.taeu.codingtest.math.bigab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        StringBuffer sb = new StringBuffer();

        int q = 0;
        int r = 0;
        int diff = a.length() - b.length();

        // B의 1의 자리부터 A에 더한다.
        for (int i = b.length() - 1; i >= 0; i--) {
            int c = Character.getNumericValue(a.charAt(i + diff)) + q;
            int c1 = Character.getNumericValue(b.charAt(i));
            q = (c + c1) / 10;
            r = (c + c1) % 10;
            sb.insert(0, r);
        }

        // A의 잉여자리수에 대해 나머지 몫을 더하면서 올림 계산
        if (diff > 0) {
            for (int i = 0; diff - 1 - i >= 0; i++) {
                int c = Character.getNumericValue(a.charAt(diff - 1 - i)) + q;
                q = c / 10;
                r = c % 10;
                sb.insert(0, r);
            }
        }

        // 최종적으로 남은 몫은 맨 앞에 붙혀 준다.
        if (q > 0) {
            sb.insert(0, q);
        }

        System.out.print(sb);
    }
}
