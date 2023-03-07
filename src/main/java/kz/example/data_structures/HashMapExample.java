package kz.example.data_structures;

import java.util.*;

public class HashMapExample {

    private static class Person{
        private final String name;
        private final int day;
        private final int month;
        private final int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return day == person.day && month == person.month && year == person.year && name.equals(person.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, day, month, year);
//        }


        @Override
        public int hashCode() {
            return (name.hashCode() << 16) ^ (day << 12) ^ (month << 8) ^ year;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>(Map.of("one", 1, "two", 2, "sixteen", 16, "unlucky", 13));
        HashMap<String, List<Integer>> superstition = new HashMap<>();
        add(superstition, "unlucky", 13);
        add(superstition, "unlucky", 7);
        add(superstition, "unlucky", 3);
        add(superstition, "lucky", 65);
        add(superstition, "lucky", 60);
        add(superstition, "lucky", 5);

        superstition.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    private static void add(HashMap<String, List<Integer>> superstition, String key, int number) {
        superstition.computeIfAbsent(key, k -> new ArrayList<>()).add(number);
    }
}
