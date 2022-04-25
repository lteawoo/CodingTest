# 분수찾기 - 수학
https://www.acmicpc.net/problem/1193

## 풀이
주어진 분수의 규칙은, 1, 2, 3.. 1씩 증가되는 숫자가 짝수냐 홀수냐에 따라 분자에 위치하고 분모에 위치하는 기준이 된다.

예를 들어 6은 6 == 1 + 2 + 3 이므로 분자 또는 분모가 3이하 이다.

15는 1 + 2 + 3 + 4 + 5 이므로 5이하 이다.

13은? 1 + 2 + 3 + 4 + 5 보다 작으므로 5이하이다.

즉 주어진 값이 1씩 증가되는 값의 합보다 작으면 해당 값이 분모 분자의 기준이 된다.

또 하나는 짝수는 시작이 분자가 1이고 홀수는 시작이 분자가 찾은 값이 된다.

```java
public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;
        int sum = 0;
        int sub;
        
        // i를 1씩 증가시키며 n이 sum 이하일때 까지 반복
        while (n > sum) {
            i++;
            sum += i;
        }
        // 찾은 sum - n은 주어진 변수가 몇번째에 위치하는지 알 수 있는 키가 된다.
        sub = sum - n;
        
        // 짝수/홀수 규칙에 맞게 프린트
        if (i % 2 != 0) {
            System.out.print((1 + sub) + "/" + (i - sub));
        } else {
            System.out.print((i - sub) + "/" + (1 + sub));
        }
    }
}
```