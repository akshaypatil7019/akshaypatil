//3b.Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().
package stringoperations;

import java.util.Scanner;

public class p1 {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check condition
        if (isNullOrEmpty(input)) {
            System.out.println("The string is NULL or contains only whitespace.");
        } else {
            System.out.println("The string is NOT null and contains characters.");
        }

        sc.close();
    }
}