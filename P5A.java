//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
//whenever the countries are selected on the list.

package p5a;   // <-- Package name

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class P5A extends JFrame implements ListSelectionListener {

    JList<String> countryList;

    public P5A() {
        setTitle("Country List Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Countries array
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        countryList = new JList<>(countries);

        // Allow multiple selection
        countryList.setSelectionMode(
            ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
        );

        // Add listener
        countryList.addListSelectionListener(this);

        // Add to frame with scroll
        add(new JScrollPane(countryList));

        setVisible(true);
    }

    // Event handling
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            System.out.println("Selected Countries:");

            for (String country : countryList.getSelectedValuesList()) {
                System.out.println(country);
            }

            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        new P5A();
    }
}