package kz.example.data_structures;

import java.util.Objects;

public record Student(int year, String name, double average) implements Comparable<Student> {

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
