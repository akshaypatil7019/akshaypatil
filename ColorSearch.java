//1b.1Write a java program for getting different colors through ArrayList interface and search whether
//the color &quot;Red&quot; is available or not
package listoperations;

import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");

        // Displaying colors
        System.out.println("List of colors: " + colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red color is available in the list.");
        } else {
            System.out.println("Red color is NOT available in the list.");
        }
    }
}