//1c.3Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast(&quot;Pink&quot;))
package listoperations;

import java.util.LinkedList;

public class p8 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Adding elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        // Display original list
        System.out.println("Original LinkedList: " + l_listobj);

        // Inserting element at the end using offerLast()
        l_listobj.offerLast("Pink");

        // Display updated list
        System.out.println("After adding 'Pink' at end: " + l_listobj);
    }
}