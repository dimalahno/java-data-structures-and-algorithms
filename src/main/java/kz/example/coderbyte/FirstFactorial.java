package kz.example.coderbyte;

import java.util.Scanner;

public class FirstFactorial {

    public static void main (String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(multiply(Integer.parseInt(s.nextLine())));
    }

    private static int multiply(int num) {
        if (num != 0) {
            return num * multiply(num - 1);
        }
        return 1;
    }
}
