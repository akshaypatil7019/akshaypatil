//3c.Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()
package stringoperations;

import java.util.Random;
import java.util.Scanner;

public class p9 {

    // User-defined function to generate random string
    public static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input length
        System.out.print("Enter length of random string: ");
        int len = sc.nextInt();

        // Generate random string
        String randomStr = generateRandomString(len);

        // Output result
        System.out.println("Random String: " + randomStr);

        sc.close();
    }
}