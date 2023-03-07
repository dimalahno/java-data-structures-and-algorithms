package kz.example.data_structures;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> oddBelowTen = new HashSet<>();
        oddBelowTen.add("1");
        oddBelowTen.add("3");
        oddBelowTen.add("5");
        oddBelowTen.add("7");
        oddBelowTen.add("9");
        oddBelowTen.add("11");
        oddBelowTen.add("13");
        oddBelowTen.add("15");
        System.out.println("oddBelowTen = " + oddBelowTen);

        Student s1 = new Student(1, "Peter", 33);
        Student s2 = new Student(1, "Peter", 98);
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("students = " + students);

        int x = 1024;
        int y = 768;

        System.out.println("(x * y) = " + (x * y));
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                unique.add(new Pixel(i, j).hashCode());
            }
        }
        System.out.println("unique = " + unique.size());
    }
}
