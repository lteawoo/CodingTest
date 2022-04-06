package kr.taeu.codingtest.conditional.alarmclock;

import java.util.Scanner;

public class AlarmClock {
    private final static int CY_TIME = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - CY_TIME;

        if (m < 0) {
            h -= 1;
            m += 60;
        }

        if (h >= 24) {
            h = 0;
        } else if (h < 0) {
            h = 23;
        }

        System.out.println(h + " " + m);
    }
}
