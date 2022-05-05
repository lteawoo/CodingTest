# 소수찾기 - 수학
https://www.acmicpc.net/problem/1978

## 풀이
주어진 숫자의 -1까지 증가시키며 증가시킨 숫자로 나누어 떨어지지 않으면 소수다.

1은 소수가 아니다.

```java
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
            if (p == 1) continue;
            
            boolean b = true;
            for (int j = 2; j < p; j++) {
                if (p % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) result++;
        }

        System.out.print(result);
    }
}
```