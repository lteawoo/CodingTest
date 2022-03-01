package kr.taeu.codingtest.exhaustivesearch.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prime {
    public int solution(String numbers) {
        Set<Integer> ret = new HashSet<Integer>();
        calc("", Arrays.asList(numbers.split("")), ret);
        return ret.size();
    }

    public void calc (String str, List<String> strList, Set<Integer> ret) {
        for (int i = 0; i < strList.size(); i++) {
            String s = str + strList.get(i);
            if (isPrime(Integer.valueOf(s))) ret.add(Integer.valueOf(s));

            List<String> sub = new ArrayList<>();
            for (int j = 0; j < strList.size(); j++) {
                if (j == i) continue;
                sub.add(strList.get(j));
            }
            if (!sub.isEmpty()) {
                calc(s, sub, ret);
            }
        }
    }

    public boolean isPrime (Integer num) {
        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
