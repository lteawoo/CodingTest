# 카펫 - 완전 탐색
https://programmers.co.kr/learn/courses/30/lessons/42842

## 풀이
너무 머리아프게 생각하다 식을 세우니 편해졌다.

a: 가로, b: 세로
* brown = 2 * a + 2 * (b - 2) = 2a + 2b - 4
* yellow = a * b - brown

심플하다.. 이렇게 시작해볼껄, 목적은 가로, 세로 길이를 구하는 것, 가로의 길이 제한은 5000까지이고 세로는 가로보다 같거나 작다

```java
public int[] solution(int brown, int yellow) {
    for (int i = 1; i <= 5000; i++) {
        for (int j = 1; j <= i; j++) {
            int h = 2 * i + 2 * j - 4;
            if (h == brown) {
                if (i * j - h == yellow) {
                    return new int[]{i, j};
                }
            }
        }
    }

    return null;
}
```