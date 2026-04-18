//3b.Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package stringoperations;

import java.util.Scanner;

public class p2 {

    // User-defined function to count occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move ahead
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        // Input substring
        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        // Count occurrences
        int result = countOccurrences(mainStr, subStr);

        // Output result
        System.out.println("Substring occurs " + result + " times.");

        sc.close();
    }
}