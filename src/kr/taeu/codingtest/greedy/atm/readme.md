# ATM - 탐욕법
https://www.acmicpc.net/problem/11399

## 풀이
모든 사람이 최소 시간으로 돈을 인출 하는 방법은 시간 소요가 적은 순으로 인출하는 것

1. 입력 배열을 오름 차순 정렬
2. sum = i1 + (i1+i2) + (i1+i2+i3) + .. 

```java
int sum = arr[0];
int prev = arr[0];
for (int i = 1; i < arr.length; i++) {
    prev += arr[i];
    sum += prev;
}
```