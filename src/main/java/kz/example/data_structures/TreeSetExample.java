package kz.example.data_structures;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeSetExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Set<Integer> oddBetweenMinusTenAndTen = new TreeSet<>();
        oddBetweenMinusTenAndTen.addAll(Arrays.asList(-9, -7, -5, -1, -3, 3, 1, 1, 1, 9, 7));
        System.out.println("oddBetweenMinusTenAndTen = " + oddBetweenMinusTenAndTen);

        // red-black tree
        TreeSet<Integer> million = new TreeSet<>(
                IntStream.range(0, 1_000_000).boxed().collect(Collectors.toSet())
        );

        TreeMap<Integer, Object> treeMap = new TreeMap<>();
        IntStream.range(0, 1_000_000).forEach(i -> treeMap.put(i,"dummy" ));
        System.out.println("treeMap.size() = " + treeMap.size());
        Field parentField = null;
        LongAccumulator maximumDepth = new LongAccumulator(Long::max, 0);
        for (Map.Entry<Integer, Object> entry : treeMap.entrySet()) {
            if (parentField == null) {
                parentField = entry.getClass().getDeclaredField("parent");
                parentField.setAccessible(true);
                System.out.println("parentField = " + parentField);
            }
            int level = 0;
            Object node = entry;
            while (node != null) {
                level++;
                node = parentField.get(node);
            }
            maximumDepth.accumulate(level);
            System.out.println("maximumDepth = " + maximumDepth);
        }
    }
}
