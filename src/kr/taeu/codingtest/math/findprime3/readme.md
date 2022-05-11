# 소수 구하기 - 수학
https://www.acmicpc.net/problem/1929

## 풀이
`에라토스테네스의 채`참고
https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4

기본원리
1. 2의 배수를 숫자배열에서 제거
2. 3의 배수를 숫자배열에서 제거
3. ...의 배수를 숫자배열에서 제거

최종적으로 숫자배열에는 소수만 남는다.

```java
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
```