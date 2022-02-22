# 이중우선순위큐 - 힙(Heap)
https://programmers.co.kr/learn/courses/30/lessons/42628

## 풀이
1. 최솟값 우선순위큐와 최댓값 우선순위 큐를 생성
2. 삽입 연산자 -> 두개의 큐에 데이터 삽입
3. 삭제 연산자 -> 두번째 입력값에 따라 데이터 poll 및 remove
```java
case "D": {
    if (num == 1) {
        minQueue.remove(maxQueue.poll());
    } else {
        maxQueue.remove(minQueue.poll());
    }
    break;
}
```