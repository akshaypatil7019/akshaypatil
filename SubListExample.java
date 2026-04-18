//1b.4Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()
package listoperations;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
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

        // Extracting 1st and 2nd elements (index 0 to 2)
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted SubList (1st & 2nd elements): " + subList);
    }
}