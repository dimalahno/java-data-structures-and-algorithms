package kz.example.data_structures;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CopyOnWriteArraySetExamples {
    public static void main(String[] args) {
        Set<Integer> oddBetweenMinusTenAndTen = new CopyOnWriteArraySet<>();
        oddBetweenMinusTenAndTen.addAll(Arrays.asList(-9, -7, -5, -1, -3, 3, 1, 1, 9, 7));
        System.out.println("oddBetweenMinusTenAndTen = " + oddBetweenMinusTenAndTen);

        Student s1 = new Student(1, "Peter", 33);
        Student s2 = new Student(1, "Peter", 98);

        Set<Student> students = new CopyOnWriteArraySet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("students = " + students);

        for (int size = 1000; size <= 128_000 ; size *= 2) {
            List<Integer> list = IntStream.range(0, size).boxed().collect(Collectors.toList());
            long time = System.currentTimeMillis();
            CopyOnWriteArraySet<Integer> million = new CopyOnWriteArraySet<>(list);
            time = System.currentTimeMillis() - time;
            System.out.println("size = " + size + ", time = " + time + " ms");
        }
    }
}
