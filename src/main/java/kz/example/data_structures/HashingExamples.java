package kz.example.data_structures;

public class HashingExamples {
    public static void main(String[] args) {
        BasicHashtable<Integer, String> numbers = new BasicHashtable<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(42, "THE number");
        numbers.put(243, "two-four-three");
        numbers.put(244, "two-four-four");

        System.out.println("numbers = " + numbers);
    }
}
