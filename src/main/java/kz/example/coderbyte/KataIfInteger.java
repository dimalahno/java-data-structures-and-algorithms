package kz.example.coderbyte;

import java.util.List;

public class KataIfInteger {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(Integer.class::isInstance)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));
        System.out.println(filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }
}
