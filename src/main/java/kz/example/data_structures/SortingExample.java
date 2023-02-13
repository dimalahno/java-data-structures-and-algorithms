package kz.example.data_structures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    private static class Student implements Comparable<Student> {
        private final int year;
        private final String name;
        private final Double average;

        private Student(int year, String name, Double average) {
            this.year = year;
            this.name = name;
            this.average = average;
        }

        public int getYear() {
            return year;
        }

        public String getName() {
            return name;
        }

        public Double getAverage() {
            return average;
        }

        @Override
        public int compareTo(Student o) {
            int result = Integer.compare(year, o.year);
            return result == 0 ? name.compareTo(o.name) : result;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "year=" + year +
                    ", name='" + name + '\'' +
                    ", average=" + average +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Anton", "Heinz");
        List<Student> students = Arrays.asList(
                new Student(1, "John", 56.5),
                new Student(2, "Dima", 57.4),
                new Student(3, "Anton", 32.4),
                new Student(4, "Heinz", 17.9)
        );
//        names.sort(null);
//        System.out.println(names);
//        students.sort(null);
//        System.out.println(students);
//        students.sort(Comparator.comparing(s -> s.name));
//        System.out.println(students);
        students.sort(Comparator.comparing(Student::getAverage)
                        .reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getYear));
        System.out.println(students);
    }
}
