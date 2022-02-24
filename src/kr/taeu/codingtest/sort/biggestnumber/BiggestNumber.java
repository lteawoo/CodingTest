package kr.taeu.codingtest.sort.biggestnumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BiggestNumber {
    public String solution(int[] numbers) {
        String str = Arrays.stream(numbers)
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
        return '0' == str.charAt(0) ? "0" : str;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"30", "3"};
        System.out.println(Arrays.stream(str)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
