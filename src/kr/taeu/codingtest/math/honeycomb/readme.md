# 벌집 - 수학
https://www.acmicpc.net/problem/2292

## 풀이
증가량이 6 * 1, 6 * 1 + 6 * 2, 6 * 1 + 6 * 2 + 6 * 3 + ... + 6 * N 이다.

즉 초기값 1 + 증가량 보다 작거나 같으면 N번째 외곽에 위치해 있는 것

시작과 끝을 포함해야하니 결과에 +1 해주면 된다

```java
import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        long i = 1;
        long j = 0;
        while (true) {
            j += i * 6;
            if (n > j + 1) {
                i++;
            } else {
                break;
            }
        }
        System.out.print(i + 1);
    }
}
```