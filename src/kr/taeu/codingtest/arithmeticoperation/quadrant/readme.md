# 사분면 - 사칙연산
https://www.acmicpc.net/problem/14681

## 풀이
* 제1사분면: x > 0, y > 0
* 제2사분면: x < 0, y > 0
* 제3사분면: x < 0, y < 0
* 제4사분면: x > 0, y < 0

```java
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int ret = 1;
        if (x > 0 && y < 0) ret = 4;
        else if (x < 0 && y < 0) ret = 3;
        else if (x < 0 && y > 0) ret = 2;

        System.out.println(ret);
    }
}
```