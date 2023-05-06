package kz.example.coderbyte;

import java.util.Scanner;

public class CodelandUsernameValidation {

    public static void main (String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(validate(s.nextLine()));
    }

    private static String validate(String str) {
        int length = str.length();
        if (length <= 4 || length >= 25) {
            return "false";
        }

        if (!str.substring(0, 1).matches("[a-zA-Z]")) {
            return "false";
        }

        if (str.substring(length - 1).equals("_")) {
            return "false";
        }

        if (!str.matches("^[a-zA-Z0-9_]*$")) {
            return "false";
        }

        return "true";
    }
}
