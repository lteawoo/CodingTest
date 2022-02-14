package kr.taeu.codingtest.hash.camouflage;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {
        int cnt = 1;
        if (clothes.length == 1) return cnt;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (Integer i : map.values()) {
            cnt *= (i + 1);
        }
        cnt-=1;

        return cnt;
    }
}
