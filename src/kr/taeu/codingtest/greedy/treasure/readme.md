# 보물 -탐욕법
https://www.acmicpc.net/problem/1026

## 풀이
A의 모든 원소와 B의 모든 원소를 각각 곱한 값을 다 더한 값이 최소값이 되도록 A를 재배열 하는 문제

B를 재배열하지 말라는 말 때문에 오해하기 쉬운데 그에 맞게 A를 재배열하기 때문에 사실 의미있는 말은 아니다.

핵심은 작은수와 큰수가 곱해져야 작은 수가 나온다는 것이고, 작은 A는 큰 B와 곱해져야 한다는 것이다.

이를 위해 A는 오름차순, B는 내림차순으로 정렬하고,
서로 순서대로 곱해주면 결국 문제의 수식인 `S = A[0] × B[0] + ... + A[N-1] × B[N-1]`를 달성 할 수 있다.

```java
public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }
}
```