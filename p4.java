//3b.Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
package stringoperations;

import java.util.Scanner;

public class p4 {

    // User-defined function to check palindrome
    public static boolean isPalindrome(String str) {

        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a PALINDROME.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}