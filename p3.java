//3b.Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
package stringoperations;

import java.util.Scanner;

public class p3 {

    // User-defined function to reverse string
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call function
        String result = reverseString(input);

        // Output result
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}