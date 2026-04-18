//1c.1Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package listoperations;

import java.util.LinkedList;
import java.util.ListIterator;

public class p6 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> listobj = new LinkedList<>();

        // Adding elements
        listobj.add("Red");
        listobj.add("Blue");
        listobj.add("Green");
        listobj.add("Yellow");
        listobj.add("White");

        // Display original list
        System.out.println("LinkedList: " + listobj);

        // Creating iterator starting from index 1 (2nd position)
        ListIterator<String> iteratorobj = listobj.listIterator(1);

        // Iterating from 2nd position
        System.out.print("Elements from 2nd position: ");
        while (iteratorobj.hasNext()) {
            System.out.print(iteratorobj.next() + " ");
        }
    }
}