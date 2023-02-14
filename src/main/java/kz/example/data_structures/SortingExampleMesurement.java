package kz.example.data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class SortingExampleMesurement {

    public static void main(String[] args) {
        List<Integer> numbers = fillWithLotsOfRandomValues();
        for (int i = 0; i < 5; i++) {
            testSortingSpeed(numbers);
        }
    }

    private static void testSortingSpeed(List<Integer> numbers) {
        List<Integer> arraysList = new ArrayList<>(numbers);
        List<Integer> linkedList = new LinkedList<>(numbers);
        List<Integer> cowList = new CopyOnWriteArrayList<>(numbers);
        sortList(arraysList);
        sortList(linkedList);
        sortList(cowList);
        System.out.println("Already sorted");
        for (int i = 0; i < 5; i++) {
            sortList(arraysList);
            sortList(linkedList);
            sortList(cowList);
        }
    }

    private static void sortList(List<Integer> list) {
        long time = System.currentTimeMillis();
        list.sort(null);
        time = System.currentTimeMillis() - time;
        System.out.println(list.getClass().getSimpleName() + " time = " + time);
    }

    private static void parallelSortList(List<Integer> list) {
        long time = System.currentTimeMillis();
        list.sort(null);
        time = System.currentTimeMillis() - time;
        System.out.println(list.getClass().getSimpleName() + " time = " + time);
    }

    private static List<Integer> fillWithLotsOfRandomValues() {
        return ThreadLocalRandom.current().ints(10_000_000).parallel().boxed()
                .collect(Collectors.toList());
    }
}
