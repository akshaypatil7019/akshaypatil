//3c.Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package stringoperations;

import java.util.Scanner;

public class p10 {

    // User-defined function to count words
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split string by whitespace
        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Count words
        int count = countWords(input);

        // Output result
        System.out.println("Number of words: " + count);

        sc.close();
    }
}