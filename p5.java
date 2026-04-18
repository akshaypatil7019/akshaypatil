//1b.5 Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
package listoperations;

import java.util.ArrayList;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        // Display original list
        System.out.println("Original List: " + colors);

        // Taking input for n-th element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position (n) to delete: ");
        int n = sc.nextInt();

        // Removing n-th element (user gives 1-based index)
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1); // convert to 0-based index
            System.out.println("After deleting " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}