# 크로아티아 알파벳 - 문자열
https://www.acmicpc.net/problem/2941

## 풀이
크로아티아 알파벳을 특정문자로 치환 후 문자열의 길이를 반환

```java
import java.util.Scanner;

public class Croatia {
    private static final String[] croatiaChars = {
            "c=",
            "c-",
            "dz=",
            "d-",
            "lj",
            "nj",
            "s=",
            "z="
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (String croatiaChar : croatiaChars) {
            s = s.replace(croatiaChar, "!");
        }

        System.out.println(s.length());
    }
}
```