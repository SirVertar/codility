package lesson7.nesting;

import java.util.*;

public class Nesting {
    public int solution(String S) {
        if (S.length() % 2 != 0) {
            return 0;
        }
        if (S.length() == 0) {
            return 1;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        List<Character> list = new ArrayList<>();

        if (S.toCharArray()[S.length()-1] != ')') {
            return 0;
        }
        for (Character letter : S.toCharArray()) {
            if (letter == '(') {
                list.add(0, letter);
            } else if (list.size() != 0 && letter == ')' && map.get(letter) == list.get(0)) {
                list.remove(0);
            } else {
                return 0;
            }
        }
        if (list.size() == 0) {
            return 1;
        }
        return 0;
    }
}
