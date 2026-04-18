//3b.Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()
package stringoperations;

import java.util.Scanner;

public class p5 {

    // User-defined function to remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call function
        String result = removeWhitespace(input);

        // Output result
        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}