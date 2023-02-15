package kz.example.data_structures;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ThreadLocalRandom;

public class ConcurrentSkipListSetExamples {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> numbers = new ConcurrentSkipListSet<>();
        ThreadLocalRandom.current().ints(100).forEach(numbers::add);
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers = " + numbers);
    }
}
