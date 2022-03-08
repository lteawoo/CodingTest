package kr.taeu.codingtest.greedy.peuniform;

// Physical Edu Uniform .... 체육복이 영어로..?
public class PEUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] pFlags = new int[n];

        for (int i = 0; i < lost.length; i++) {
            pFlags[lost[i] - 1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            pFlags[reserve[i] - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (pFlags[i] >= 0) {
                answer++;
            } else {
                if (i > 0 && pFlags[i - 1] > 0) {
                    pFlags[i - 1]--;
                    answer++;
                } else if (i < n-1 && pFlags[i + 1] > 0) {
                    pFlags[i + 1]--;
                    answer++;
                }
            }
        }

        return answer;
    }
}
