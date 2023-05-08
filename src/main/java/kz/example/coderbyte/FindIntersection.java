package kz.example.coderbyte;

import java.util.*;
import java.util.stream.Collectors;

public class FindIntersection {
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        var readLine = findIntersection(s.nextLine());
        System.out.print(readLine);
    }

    public static String findIntersection(String [] strArr) {
        List<String> list1 = List.of(strArr[0].split(","));
        List<String> list2 = List.of(strArr[1].split(","));

        List<String> result = list1.stream()
                .distinct()
                .filter(list2::contains)
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(result);
        return result.isEmpty() ? "false" : String.join(",", result);
    }
}
