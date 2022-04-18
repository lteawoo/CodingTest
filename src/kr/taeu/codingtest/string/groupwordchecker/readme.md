# 그룹 단어 체커 - 문자열
https://www.acmicpc.net/problem/1316

## 풀이
1. 이전 글자와 현 글자가 같으면 반복
2. 아니면 기존에 등장했던 문자인지(map이나 배열에 메모라이징)
3. 없으면 처음 등장, 메모라이징하고 이전 글자 변수에 저장해둠
4. 있는데 false면(기존 등장했었고 다른문자에서 다시 등장했으면) 반복문 탈출, 그룹단어 아님
5. 글자 끝까지 true면 증가

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] chars = s.toCharArray();

            boolean b = true;
            char pre = 0;
            Map<Character, Boolean> map = new HashMap<>();
            for (char c : chars) {
                if (c != pre) {
                    if (map.get(c) == null) {
                        map.put(c, true);
                        if (pre != 0) {
                            map.put(pre, false);
                        }
                        pre = c;
                    } else if (!map.get(c)) {
                        b = false;
                        break;
                    }
                }
            }

            if (b) {
                result++;
            }
        }

        System.out.println(result);
    }
}
```