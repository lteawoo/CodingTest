# 디스크 컨트롤러 - 힙(Heap)
https://programmers.co.kr/learn/courses/30/lessons/42627

## 풀이
작업이 시작해야할 때, 큐에 있는 항목중 소요시간이 제일 짧은 것 먼저 시작해야 평균 소요시간이 적다.

그러므로 우선순위 큐에 시간에 맞춰 소요시간순으로 정렬되게 작업을 넣어두고 꺼내는게 핵심

처리 순서
1. 초 별로 Map<초, List<job인덱스>> timeMap을 생성
   * 같은 시간대의 작업이 여러 존재할 수 있으므로 메모라이징
2. 모든 작업이 끝날때까지 초를 증가시키며 반복
   1. 반복의 시작에 timeMap에서 jobList를 가져옴 -> 해당 초에 jobList가 존재할 경우
      * 큐에 job을 다 넣어 소요시간 별 정렬
   2. 진행중인 작업이 존재하고, 작업이 완료되었을 경우(초 - 작업의 실제 시작시간 == 작업의 소요시간)
      1. 평균을 계산하기위해 `작업의 소요시간 + 작업의 대기시간(작업의 실제 시작시간 - 작업의 소요시간)`을 누적한다.
      2. 진행중인 작업을 초기화
      3. 작업의 완료 개수를 증가
   3. 진행중인 작업이 없고, 큐에 작업이 있는 경우
      1. 큐에서 작업을 가져온다
      2. 작업의 실제 시작시간을 기록
   4. 작업의 완료 개수가 총 작업수와 같으면 종료 후 평균 반환