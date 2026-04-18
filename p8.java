//3c.Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package stringoperations;

import java.util.Scanner;

public class p8 {

    // User-defined function to check numeric string
    public static boolean isNumeric(String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check numeric
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        sc.close();
    }
}