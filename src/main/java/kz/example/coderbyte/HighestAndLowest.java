package kz.example.coderbyte;

import static java.util.Arrays.stream;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }

    public static String highAndLow(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
