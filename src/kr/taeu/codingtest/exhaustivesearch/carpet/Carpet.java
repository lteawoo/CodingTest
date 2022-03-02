package kr.taeu.codingtest.exhaustivesearch.carpet;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        for (int i = 1; i <= 5000; i++) {
            for (int j = 1; j <= i; j++) {
                int h = 2 * i + 2 * j - 4;
                if (h == brown) {
                    if (i * j - h == yellow) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return null;
    }
}
