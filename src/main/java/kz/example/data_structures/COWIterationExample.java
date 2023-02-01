package kz.example.data_structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWIterationExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>(Arrays.asList("John", "Anton", "Heinz"));

        Collections.sort(names);
        System.out.println("names: " + names);
        // itco - iterate collection
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            System.out.println("Checking: " + name);
            if (name.contains("o")) names.remove(name);
        }
        System.out.println("names: " + names);
    }
}
