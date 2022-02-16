# 베스트 앨범 - 해시
https://programmers.co.kr/learn/courses/30/lessons/42579

## 풀이
노래를 수록하는 조건은 다음과 같다.
1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

필요한 것
* 1의 해결을 위한 **장르별 합계**
* 2의 해결을 위한 **장르별 노래의 오름차순 정렬**
* 3의 해결을 위한 노래의 정렬중 같은 재생횟수면 **고유 번호가 낮은 노래가 먼저 정렬**

준비한 것
* 장르별 합계 기록 -> Map<장르, 노래합계>
* 장르별로 노래 인덱스를 재생횟수 오름차순으로 리스트화(고유번호 고려) -> Map<장르, List<노래인덱스>>

처리
1. 장르별 합계 및 장르별 노래의 오름차순 정렬(조건2, 3처리)
```java
Map<String, Integer> genresSum = new HashMap<>();
Map<String, List<Integer>> map = new HashMap<>();

for (int i = 0; i < genres.length; i++) {
    genresSum.put(genres[i], genresSum.getOrDefault(genres[i], 0) + plays[i]);

    List<Integer> list = map.getOrDefault(genres[i], new ArrayList<Integer>());
    list.add(i);
    list.sort((a, b) -> {
        if (plays[a] > plays[b]) {
            return -1;
        } else if (plays[a] < plays[b]) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    });
    map.putIfAbsent(genres[i], list);
}
```
2. 장르의 정렬(조건1 처리)
```java
List<String> keyList = new ArrayList<>(genresSum.keySet());
keyList.sort((a, b) -> Integer.compare(genresSum.get(b), genresSum.get(a)));
```
3. 장르별로 2개씩 기록
```java
List<Integer> retList = new ArrayList<>();
for (String key : keyList) {
    List<Integer> idxList = map.get(key);
    for (int i = 0; i < idxList.size() && i < 2; i++) {
        retList.add(idxList.get(i));
    }
}

int[] ret = new int[retList.size()];
for (int i = 0; i < ret.length; i++) {
    ret[i] = retList.get(i);
}

return ret;
```