# 가장 큰 수 - 정렬
https://programmers.co.kr/learn/courses/30/lessons/42746#

## 풀이
처음엔 재귀로 접근했다가 시간초과로 틀렸다, 해당 로직으로 작성해볼 시 시간복잡도가 어느정도일지 대충이라도 가늠해봐야한다

다시 돌아가서 

해당 문제의 접근은 요소들의 크기 비교시 앞자리가 크면 비교에서 우위다.

예) 10, 3, 34 -> 3 34 10 으로 정렬되어야 한다, 여기에서 hash 문제중 phonebook에서 아이디어를 얻었다. 사전정렬을 이용하면 빠르게 해결 가능하다

하지만 "3", "30"의 내림차순 정렬은? 330이 아닌 303이다. 문제에서는 가장 큰 수를 만드는 것이므로 330이 나와야한다.

"3"과 "33"은 결과가 어떤가? 같다(3333, 3333) 즉 "3"과 "3333"은 같다. 요소의 크기조건은 4자리 (0~1000)이다, "30"과 "3030"도 같다.

이는 4자리까지 요소를 반복시켜 붙히고 비교하면 **동일한 자리수**로 요소의 비교가 가능해진다

## 처리 순서
```java
Arrays.stream(numbers)
    .boxed()
    .map(String::valueOf)
    .sorted((a, b) -> {
        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder();
        for (int i = 0; strA.length() < 4; i++) {
            for (int j = 0; j < a.length(); j++) {
                strA.append(a.charAt(j));
            }
        }
        for (int i = 0; strB.length() < 4; i++) {
            for (int j = 0; j < b.length(); j++) {
                strB.append(b.charAt(j));
            }
        }
        return strB.toString().compareTo(strA.toString());
    })
    .collect(Collectors.joining(""));
```

stream을 이용하여 좀 짧게 해볼까 했는데 역시 쉬운건 없다.

위만 봐서는 결과가 잘 나올거 같지만 작성한 테스트케이스 중 하나는 [0, 0, 0, 0, 0, 0]인데, 이는 위 로직으로는 000000이 나온다.

하지만 문제는 "숫자의 문자화다". 000000을 숫자로 변경하면 0이므로 문자인 "0"을 반환해야한다.

정렬 후 제일 첫 문자가 0이면 제일 큰수가 0이고, 이는 0밖에 없다는 말과 같다.
`return '0' == str.charAt(0) ? "0" : str;`