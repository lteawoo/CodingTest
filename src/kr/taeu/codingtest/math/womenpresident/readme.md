# 부녀회장이 될테야 - 수학
https://www.acmicpc.net/problem/2775

## 풀이
생각은 많이했는데 의외로 심플

1. 0층은 1...14까지 1씩 증가하는 층
2. 1층부터는 1층의 n호실 = 0층의 1호실 ~ n호실까지의 합이다.
3. 즉 1층의 n호실 = 1층의 n-1호실 + 0층의 n호실의 합
4. 그러므로 목표 층의 목표 호실까지 1층 1호실부터 계산해 나가면 결과 값을 찾을 수 있음

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomenPresident {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            // 0층 초기화
            int[] peopleCnt = new int[room];
            for (int j = 0; j < peopleCnt.length; j++) {
                peopleCnt[j] = j + 1;
            }

            // 1층 1호실부터 계산함
            for (int j = 0; j < floor; j++) {
                for (int k = 1; k < room; k++) {
                    peopleCnt[k] += peopleCnt[k - 1];
                }
            }
            System.out.println(peopleCnt[room - 1]);
        }
    }
}
```