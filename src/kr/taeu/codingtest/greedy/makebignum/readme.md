# 큰 수 만들기 - 탐욕법
https://programmers.co.kr/learn/courses/30/lessons/42883

## 풀이
탐욕법의 특징은 부분해가 전체해가 되는 것, 다시 말해서 매 순간 최적의 선택을 하다보면 답이나온다.

1231234에서 3개를 제외하고 만들 수 있는 제일 큰 수는?
1. 만들어져야 하는 자리수는 7 - 3 = 4자리
2. 자리 수마다 제일 큰 수를 선택하면 될 것
3. 첫 번째 자리의 수가 될 수 있는 범위는? 1, 2, 3, 1 (뒤에 3자리가 와야함) -> 3 선택
4. 두 번째 자리의 수가 될 수 있는 범위는? 1, 2 (뒤에 2자리가 와야함) -> 2 선택
5. 세 번째 자리의 수가 될 수 있는 범위는? 3 (뒤에 1자리가 와야함) -> 3 선택
6. 네 번째 자리의 수가 될 수 있는 범위는? 4 (뒤에 못옴) -> 4 선택

즉 각 자리의 수가 될 수 있는 범위를 나타내는 산식을 구하면 된다.
1. 첫 번째 자리 범위 산식 -> 0부터 3까지, 여기서 2번째 자리 선택됨
2. 두 번째 -> 3부터 4까지, 여기서 4번째 자리 선택됨
3. 세 번째 -> 5부터 5까지, 여기서 5번째 자리 선택됨
4. 네 번째 -> 6부터 6까지, 여기서 6번째 자리 선택됨

즉, 최댓값자리 + 1 부터 제외 개수 + 자릿수 - 1 까지가 범위 산식이다.

```java
public class MakeBigNum {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;

            for (int j = idx; j <= k + i; j++) {
                char c = number.charAt(j);
                if (c == 9) {
                    idx = j + 1;
                    break;
                }

                if (max < c) {
                    max = c;
                    idx = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}

```
