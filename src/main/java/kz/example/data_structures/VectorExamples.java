package kz.example.data_structures;

import java.util.*;

public class VectorExamples {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("John", "Anton", "Heinz"));
        System.out.println(vector);

        List<String> namesSafe = Collections.synchronizedList(new ArrayList<>(Arrays.asList("John", "Anton", "Heinz")));
        System.out.println(namesSafe);
    }
}
