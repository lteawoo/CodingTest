package kr.taeu.codingtest.greedy.makebignum;

public class MakeBigNum {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        for (int i = 0; i < number.length() - k; i++) {
            char max = 0;

            for (int j = idx; j <= k + i; j++) {
                char c = number.charAt(j);
                if (c == 9) {
                    idx = j + 1;
                    break;
                }

                if (max < c) {
                    max = c;
                    idx = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}
