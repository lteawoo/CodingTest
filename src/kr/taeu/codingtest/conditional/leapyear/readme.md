# 윤년 - 조건문
https://www.acmicpc.net/problem/2753

## 풀이
윤년: 4의 배수이면서 100의 배수가 아니거나 400의 배수인 년도

```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0);
    }
}
```