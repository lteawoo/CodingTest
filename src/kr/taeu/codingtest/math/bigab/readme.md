# 큰 수 A+B - 수학
https://www.acmicpc.net/problem/10757

## 풀이
BigInteger 사용하면 편하게 풀 수 있지만 나름대로 풀어봄

1. A, B입력 받는대신 자리수가 큰수를 A에 배치
2. B의 한자리씩 A에 한자리씩 더 하면서 10으로 나눈 몫과 나머지를 저장
3. 나머지는 sb에 앞자리부터 쌓아가고, 몫은 A의 다음 자리수에 더함
4. B 자리수를 벗어난 A의 나머지 길이에 대해서도 마지막으로 쌓인 몫을 더하는 계산을 진행

```java
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
```