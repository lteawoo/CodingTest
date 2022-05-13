# 골드바흐의 추측 - 수학
https://www.acmicpc.net/problem/9020

## 풀이
`에라토스테네스의 채`참고
https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4

기본원리
1. 2의 배수를 숫자배열에서 제거
2. 3의 배수를 숫자배열에서 제거
3. ...의 배수를 숫자배열에서 제거

최종적으로 숫자배열에는 소수만 남는다.

에라토스테네스의 채로 10000까지의 소수를 다 구해놓고 계산했다

우선 n과 n - j의 값은 소수여야 한다.

그리고 n과 n - j의 차가 제일 작은 소수 조합만 출력 한다.

반복은 n의 반절까지만 하면 된다.

```java
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

```