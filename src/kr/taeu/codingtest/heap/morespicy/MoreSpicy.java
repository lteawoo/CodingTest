package kr.taeu.codingtest.heap.morespicy;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        Queue<Integer> q = new PriorityQueue<>();
        for (int i : scoville) {
            q.add(i);
        }

        while (q.size() > 1 && q.peek() < K) {
            Integer mix = q.poll() + q.poll() * 2;
            q.add(mix);

            cnt++;
        }

        if (q.peek() < K) return -1;

        return cnt;
    }
}
