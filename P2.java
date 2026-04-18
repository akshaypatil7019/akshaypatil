//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
//depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
//mechanism with addActionListener( ).


package swingprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P2 {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Button Event Example");

        // Create label
        JLabel label = new JLabel("Press a button");
        label.setBounds(100, 50, 300, 30);

        // Create buttons
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        btnIndia.setBounds(100, 100, 100, 30);
        btnSrilanka.setBounds(220, 100, 100, 30);

        // Add ActionListener for India button
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Add ActionListener for Srilanka button
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        // Layout settings
        frame.setSize(450, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}