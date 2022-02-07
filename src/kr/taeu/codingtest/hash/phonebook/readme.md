# 전화번호 목록 - 해시
https://programmers.co.kr/learn/courses/30/lessons/42577

## 사전순서식 정렬을 이용한 풀이
String의 compareTo는 lexicographical(사전순서식)로 비교한다.
   * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
   * ex: ["11", "1123", "1000"]의 정렬은 ["1000", "11", "1123"]이다.

이를 이용하여 s[i]가 s[i+1]의 접두사인지만 비교하면 된다.

```java
public boolean solution1(String[] phone_book) {
    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i++) {
        if (phone_book[i + 1].startsWith(phone_book[i])) {
            return false;
        }
    }
    return true;
}
```