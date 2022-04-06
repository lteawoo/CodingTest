# 알람시계 - 조건문
https://www.acmicpc.net/problem/2884

## 풀이
24시 표현식 하루의 시작은 0:0 끝은 23:59이고, 분에 45분을 뺀다. 
* 분 < 0이면 시 - 1, 분 + 60
* 시가 >= 24면 시 = 0
* 시가 < 0이면 시 = 23
```java
import java.util.Scanner;

public class AlarmClock {
    private final static int CY_TIME = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - CY_TIME;

        if (m < 0) {
            h -= 1;
            m += 60;
        }

        if (h >= 24) {
            h = 0;
        } else if (h < 0) {
            h = 23;
        }

        System.out.println(h + " " + m);
    }
}
```