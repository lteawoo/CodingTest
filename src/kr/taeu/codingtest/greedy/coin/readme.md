# 동전 0 - 탐욕법
https://www.acmicpc.net/problem/11047

## 풀이
전형적인 그리디 문제 - 동전을 잘 사용해서 목표 가치 만들기

그리디스럽게 큰 액수부터 만들어 나가면 전체해가 만들어진다

```java
        int result = 0;

        for (int coin : arr) {
            if (targetPrice >= coin) {
                result += targetPrice / coin;
                targetPrice %= coin;
            }
        }

        System.out.println(result);
```