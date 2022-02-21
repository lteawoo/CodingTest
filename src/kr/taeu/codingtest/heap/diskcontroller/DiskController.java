package kr.taeu.codingtest.heap.diskcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiskController {
    public int solution(int[][] jobs) {
        Queue<Integer> q = new PriorityQueue<>((a, b) -> jobs[a][1] - jobs[b][1]);

        Map<Integer, List<Integer>> timeMap = new HashMap<>();
        for (int i = 0; i < jobs.length; i++) {
            List<Integer> l = timeMap.getOrDefault(jobs[i][0], new ArrayList<Integer>());
            l.add(i);
            timeMap.putIfAbsent(jobs[i][0], l);
        }

        int time = 0;
        int startTime = 0;
        Integer workIdx = null;
        int sum = 0;
        int complete = 0;
        while (true) {
            List<Integer> l = timeMap.get(time);
            if (l != null) {
                q.addAll(l);
            }

            if (workIdx != null) {
                if (time - startTime == jobs[workIdx][1]) {
                    sum += jobs[workIdx][1] + (startTime - jobs[workIdx][0]);
                    complete += 1;
                    workIdx = null;
                }
            }

            if (workIdx == null && !q.isEmpty()) {
                workIdx = q.poll();
                startTime = time;
            }

            if (complete == jobs.length) break;
            time += 1;
        }

        return sum / jobs.length;
    }
}
