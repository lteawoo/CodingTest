# 구명보트 - 탐욕법
https://programmers.co.kr/learn/courses/30/lessons/42885

## 풀이
1. 제일 작은 수와 제일 큰 수를 더 해서 태운다.
2. 그 다음으로 작은 수와 그 다음 큰 수를 더 해서 태운다.
3. 과정에서 짝을 지어 못태우면 못태우는 쪽은 다음 짝과 태운다.
4. 사람이 1명이면 보트도 1대
5. 오름차순 정렬 후 0번째와 1번째를 더해서 limit보다 크면 사람들은 다 혼자 탈 수 밖에 없다.

처음에는 Deque로 접근했다가 제일 작은 수를 가리키는 idx 한개와 제일 큰 수를 가리키는 idx 한개면 될 것 같아서 변경

```java
// 1명 일때
        if (people.length == 1) return 1;
        
        Arrays.sort(people);
        
        // 다 혼자 탈 수 밖에 없는 경우
        if (people[0] + people[1] > limit) return people.length;
```
위의 두 예외를 선 처리 후에 시작한다

우선 조건 중에 중요한건 *2명밖에 못탄다*, *무게제한을 못넘는다*다.

```java
int left = 0;
        int right = people.length - 1;
        
        while (right >= left) {
            if (people[right--] + people[left] <= limit) {
                left++;
            }
            answer++;
        }
```
처음에는 2중 반복으로 작은 사람과 큰사람 끼리의 비교를 따로 했는데 굳이 그럴 필요 없이 동시에 진행하면 된다.

몸무게가 큰 사람을 먼저 태우는 방식으로`people[right--]`, 작은 사람과 몸무게를 합산하여 무게제한보다 작거나 같으면 `+ people[left] <= limit` 작은사람도 태운다.`left--`