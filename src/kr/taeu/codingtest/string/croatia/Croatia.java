package kr.taeu.codingtest.string.croatia;

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
