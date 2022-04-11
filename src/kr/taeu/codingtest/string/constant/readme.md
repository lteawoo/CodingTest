# 상수 - 문자열
https://www.acmicpc.net/problem/2908

## 풀이
문자열로 입력받아서 뒤집고 비교

```java
import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = reverse(sc.next());
        int n2 = reverse(sc.next());

        System.out.println(Math.max(n1, n2));
    }

    private static int reverse (String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }
}
```