package kz.example.data_structures;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.IntStream;

public class HashTableExamples {
    public static void main(String[] args) {
        Map<Integer, Long> squares = new Hashtable<>();
        IntStream.range(0, 10_000_000).parallel().forEach(i -> squares.put(i, ((long)i)*i));
        System.out.println("squares = " + squares);
        System.out.println("squares.size() = " + squares.size());
    }
}
