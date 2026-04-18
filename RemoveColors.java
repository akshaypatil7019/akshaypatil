//1b.2Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color &quot;Blue&quot; from the ArrayList
package listoperations;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        // Display original list
        System.out.println("Original List: " + colors);

        // Removing 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Removing "Blue"
        boolean removed = colors.remove("Blue");

        if (removed) {
            System.out.println("After removing 'Blue': " + colors);
        } else {
            System.out.println("'Blue' is not found in the list.");
        }
    }
}