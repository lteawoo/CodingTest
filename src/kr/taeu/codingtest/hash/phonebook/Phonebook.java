package kr.taeu.codingtest.hash.phonebook;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    public boolean solution1(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean solution2(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
