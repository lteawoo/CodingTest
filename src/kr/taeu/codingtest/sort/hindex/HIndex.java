package kr.taeu.codingtest.sort.hindex;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        if (citations[citations.length-1] == 0) return 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations.length - i <= citations[i]) return citations.length - i;
        }

        return 0;
    }
}
