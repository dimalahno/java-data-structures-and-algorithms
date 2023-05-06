package kz.example.data_structures;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 0; i < 10_000; i++) {
            ad.add(i);
        }
        System.out.println(ad);

        ad.clear();
        System.out.println(ad);
    }
}
