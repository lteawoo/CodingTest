# 소인수분해 - 수학
https://www.acmicpc.net/problem/11653

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

public class PrimeFactor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 1) return;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
                i--;
            }
        }
        System.out.print(n);
    }
}
```