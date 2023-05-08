package kz.example.coderbyte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(longestWord(s.nextLine()));
    }

    public static String longestWord(String sen) {
        // code goes here
        String[] arr = sen.split(" ");
        var list = Arrays.stream(arr).filter(s -> s.matches("^[a-zA-Z]*$"))
                        .toList();
        return list.stream().max(Comparator.comparing(String::length)).get();
    }
}
