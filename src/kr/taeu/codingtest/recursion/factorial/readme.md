# 팩토리얼 - 재귀
https://www.acmicpc.net/problem/10872

## 풀이
2! = 1 * 2;
3! = 1 * 2 * 3;
n! = 1 * 2 * 3 * ... * n;

## 처리 순서
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

//        int sum = 1;
//        for (int i = 2; i <= n; i++) {
//            sum *= i;
//        }

        int sum = factorial(n);
        System.out.println(sum);
    }

    private static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }
}
```