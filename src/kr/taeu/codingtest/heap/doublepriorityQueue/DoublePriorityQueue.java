package kr.taeu.codingtest.heap.doublepriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        Queue<Integer> minQueue = new PriorityQueue<>();
        Queue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(String operation : operations) {
            String[] c = operation.split(" ");
            Integer num = Integer.valueOf(c[1]);
            switch (c[0]) {
                case "I": {
                    minQueue.add(num);
                    maxQueue.add(num);
                    break;
                }
                case "D": {
                    if (num == 1) {
                        minQueue.remove(maxQueue.poll());
                    } else {
                        maxQueue.remove(minQueue.poll());
                    }
                    break;
                }
            }
        }

        int max = !maxQueue.isEmpty() ? maxQueue.poll() : 0;
        int min = !minQueue.isEmpty() ? minQueue.poll() : 0;

        return new int[]{max, min};
    }
}
