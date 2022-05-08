# 소수 - 수학
https://www.acmicpc.net/problem/2581

## 풀이
기본은 소수찾기와 똑같다.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrime2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 10000;
        while (m <= n) {
            if (m == 1) {
                m++;
                continue;
            }

            boolean f = true;
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    f = false;
                    break;
                }
            }

            if (f) {
                sum += m;
                if (min > m) min = m;
            }
            m++;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
```