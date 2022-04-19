# 손익분기점 - 수학
https://www.acmicpc.net/problem/1712

## 풀이
처음에는 반복문으로 풀었다가 시간초과

다시 생각해보니 수식은 다음과 같았음 `amount = fixed / (price - variableCost) + 1`

우선 가변비용이 판매가 이상이면 -1 출력, 절대 이익이 발생하지 않음 (같아도 고정비용이 있음)

판매가와 가변비용의 차를 고정비용에 나눠서 몇개 이상 팔아야 손익분기점인지 개수를 산출

거기에 +1하면 이득
```java
import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fixed = sc.nextLong();
        long variableCost = sc.nextLong();
        long price = sc.nextLong();

        if (variableCost >= price) {
            System.out.println(-1);
            return;
        }

        System.out.print(fixed / (price - variableCost) + 1);
    }
}
```