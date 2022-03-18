package kr.taeu.codingtest.greedy.boat;

import java.util.Arrays;

public class Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        // 1명 일때
        if (people.length == 1) return 1;

        Arrays.sort(people);

        // 다 혼자 탈 수 밖에 없는 경우
        if (people[0] + people[1] > limit) return people.length;

        int left = 0;
        int right = people.length - 1;

        while (right >= left) {
            if (people[right--] + people[left] <= limit) {
                left++;
            }
            answer++;
        }

        return answer;
    }
}
