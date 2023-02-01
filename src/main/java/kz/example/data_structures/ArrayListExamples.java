package kz.example.data_structures;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Winter");
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Autumn");

        for (int i = 0; i < 10000; i++) {
            seasons.add("Pretty warm");
        }

        seasons.removeIf(s -> s.equals("Pretty warm"));

        seasons.trimToSize(); //don't use a lot

        System.out.println(seasons);
    }
}
