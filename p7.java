//1c.2Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
package listoperations;

import java.util.LinkedList;
import java.util.Iterator;

public class p7 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> objlist = new LinkedList<>();

        // Adding elements
        objlist.add("Red");
        objlist.add("Blue");
        objlist.add("Green");
        objlist.add("Yellow");
        objlist.add("White");

        // Display original list
        System.out.println("Original LinkedList: " + objlist);

        // Using descendingIterator for reverse iteration
        Iterator<String> iterator = objlist.descendingIterator();

        // Iterating in reverse order
        System.out.print("Reverse order: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}