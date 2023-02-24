package kz.example.data_structures;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private final int year;
    private final String name;
    private final double average;

    public Student(int year, String name, double average) {
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

    public double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }

    @Override
    public int compareTo(Student s) {
        int result = Integer.compare(year, s.year);
        return result != 0 ? result : name.compareTo(s.name);
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
