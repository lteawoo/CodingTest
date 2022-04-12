package kr.taeu.codingtest.string.dial;

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
