# H-Index - 정렬
https://programmers.co.kr/learn/courses/30/lessons/42747

## 풀이
우선 정렬로 시작한다. 이유는 정렬을 하게 되면 특징이 i번째 이후의 값은 오름차순/내림차순에 따라 그 이후의 값은 i보다 크다/작다로 결과를 내릴 수 있기 때문

예시 값 [3, 0, 6, 1, 5]를 오름차순 정렬 시 [0, 1, 3, 5, 6]이고 i가 2이면 3이므로 그 이후의 값은 3보다 크다. 즉 인용 수 3이상은 3개 이상이라는 결과

i = 0일때 arr[0] = 0, 인용수 0 이상의 개수는 length - 0 이므로 5개이다.

i = 1일때 arr[1] = 1, 인용수 1 이상의 개수는 4개이다.

i = 2일때 arr[2] = 3, 인용수 3 이상의 개수는 3개이다. h의 값이 최대치이다.

i = 3일때 arr[3] = 5, 인용수 5이상의 개수는 2개이다.

즉 arr[i]의 값이 length - i 값보다 크거나 같으면 length - i가 답이다.

```java
public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        if (citations[citations.length-1] == 0) return 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) return citations.length - i;
        }

        return 0;
    }
}
```

