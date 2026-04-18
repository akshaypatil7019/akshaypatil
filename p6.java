//3c.Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
package stringoperations;

import java.util.Scanner;

public class p6 {

    // User-defined function to capitalize words
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Call function
        String output = capitalizeWords(input);

        // Output result
        System.out.println("Capitalized String: " + output);

        sc.close();
    }
}