package lesson7.brackets;

import java.util.*;

public class Brackets {

    public int solution(String S) {
        if (S.length() % 2 != 0) {
            return 0;
        }
        if (S.length() == 0) {
            return 1;
        }

        Set<Character> leftSet = new HashSet();
        leftSet.add('{');
        leftSet.add('(');
        leftSet.add('[');

        Set<Character> rightSet = new HashSet();
        rightSet.add('}');
        rightSet.add(')');
        rightSet.add(']');

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        List<Character> list = new ArrayList<>();

        if (!rightSet.contains(S.toCharArray()[S.length()-1])) {
            return 0;
        }
        for (Character letter : S.toCharArray()) {
            if (leftSet.contains(letter)) {
                list.add(0, letter);
            } else if (list.size() != 0 && rightSet.contains(letter) && map.get(letter) == list.get(0)) {
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
