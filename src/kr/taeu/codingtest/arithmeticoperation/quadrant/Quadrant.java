package kr.taeu.codingtest.arithmeticoperation.quadrant;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int ret = 1;
        if (x > 0 && y < 0) ret = 4;
        else if (x < 0 && y < 0) ret = 3;
        else if (x < 0 && y > 0) ret = 2;

        System.out.println(ret);
    }
}
