package kr.taeu.codingtest.string.groupwordchecker;

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
