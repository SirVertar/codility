import recruitment.sollers.Second;

import java.util.*;

public class main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 4);
        list.add(0, 5);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.stream()
                .forEach(System.out::println);
    }
}
