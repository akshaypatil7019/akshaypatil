//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.

package p5a;   // optional

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class P5C extends JFrame implements ListSelectionListener {

    JList<String> countryList;
    HashMap<String, String> capitalMap;

    public P5C() {
        setTitle("Country & Capital Example");
        setSize(350, 300);
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

        // Create HashMap for capitals
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Add listener
        countryList.addListSelectionListener(this);

        // Add to frame
        add(new JScrollPane(countryList));

        setVisible(true);
    }

    // Event handling
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            System.out.println("Selected Country & Capital:");

            for (String country : countryList.getSelectedValuesList()) {
                String capital = capitalMap.get(country);
                System.out.println(country + " -> " + capital);
            }

            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        new P5C();
    }
}