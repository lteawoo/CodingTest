package kr.taeu.codingtest.hash.bestalbum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresSum = new HashMap<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genresSum.put(genres[i], genresSum.getOrDefault(genres[i], 0) + plays[i]);

            List<Integer> list = map.getOrDefault(genres[i], new ArrayList<Integer>());
            list.add(i);
            list.sort((a, b) -> {
                if (plays[a] > plays[b]) {
                    return -1;
                } else if (plays[a] < plays[b]) {
                    return 1;
                } else if (a < b) {
                    return -1;
                } else {
                    return 0;
                }
            });
            map.putIfAbsent(genres[i], list);
        }

        List<String> keyList = new ArrayList<>(genresSum.keySet());
        keyList.sort((a, b) -> Integer.compare(genresSum.get(b), genresSum.get(a)));

        List<Integer> retList = new ArrayList<>();
        for (String key : keyList) {
            List<Integer> idxList = map.get(key);
            for (int i = 0; i < idxList.size() && i < 2; i++) {
                retList.add(idxList.get(i));
            }
        }

        int[] ret = new int[retList.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = retList.get(i);
        }

        return ret;
    }
}
