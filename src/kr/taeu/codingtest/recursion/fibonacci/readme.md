# 피보나치 - 재귀
https://www.acmicpc.net/problem/10870

## 풀이
F0 = 0
F1 = 1
F2 = 0 + 1 = 1
F3 = 1 + 1 = 2
F4 = 1 + 2 = 3
F5 = 2 + 3 = 5
...
Fn = Fn-2 + Fn-1

## 처리 순서
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n < 2) {
            System.out.println(n);
            return;
        }

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        return calc(0, 1, n);
    }

    private static int calc(int a, int b, int n) {
        if (n - 2 == 0) {
            return a + b;
        }

        return calc(b, a + b, n - 1);
    }
}
```