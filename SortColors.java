//1b.3Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
package listoperations;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sorting using Collections.sort()
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}