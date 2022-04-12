# 다이얼 - 문자열
https://www.acmicpc.net/problem/5622

## 풀이
문자에 해당하는 다이얼 번호를 찾아서 계산

1. 1차원 A-Z배열을 만들고 각 문자의 `인덱스 / 3의 몫 + 3`으로 계산하는 방법
2. 다이얼 모양대로 배열을 만들어서 문자로 배열의 인덱스를 찾아서 계산하는 방법

나는 2번으로 했다. 제일 직관적이기도하고 쉽기도 해서, 1의 방법은 4개씩 들어있는 S, Z는 따로 별도로 계산해야함

```java
import java.util.Scanner;

public class Dial {
    private static final char[][] DIAL = {
            {},
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'},
            {'J', 'K', 'L'},
            {'M', 'N', 'O'},
            {'P', 'Q', 'R', 'S'},
            {'T', 'U', 'V'},
            {'W', 'X', 'Y', 'Z'}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int result = 0;
        for (char c : s.toCharArray()) {
            int i = 1;
            for (; i < DIAL.length + 1; i++) {
                boolean flag = false;
                for (char alpha : DIAL[i - 1]) {
                    if (c == alpha) {
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }

            result += i + 1;
        }

        System.out.print(result);
    }
}
```