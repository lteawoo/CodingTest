# 소수 찾기 - 완전 탐색
https://programmers.co.kr/learn/courses/30/lessons/42839

## 풀이
과거에 재귀로 삽질한게 도움이 되었다. 입력값의 길이가 1 ~ 7로 완전 탐색할만 하겠다 싶었다.

`calc("", Arrays.asList(numbers.split("")), ret);`로 첫 재귀를 호출

```java
public void calc (String str, List<String> strList, Set<Integer> ret) {
    for (int i = 0; i < strList.size(); i++) {
        String s = str + strList.get(i);
        if (isPrime(Integer.valueOf(s))) ret.add(Integer.valueOf(s));

        List<String> sub = new ArrayList<>();
        for (int j = 0; j < strList.size(); j++) {
            if (j == i) continue;
            sub.add(strList.get(j));
        }
        if (!sub.isEmpty()) {
            calc(s, sub, ret);
        }
    }
}
```
위와 같은데 뜯어보자면

- 결과 Set에는 소수만 add
- 부모의 문자와 자신의 문자를 이어서 Set에 add한다 (중복제거)
- 그 후 본래 리스트에서 자신의 문자를 제외한 나머지를 sublist화 하여 다시 재귀를 호출
- 모든 경우의 수에 대해 탐색을 하게 되고 Set에 추가된다.

풀고나니 Set보다 Map을 이용한 메모라이징을 했으면 좀더 빨랐으려나...