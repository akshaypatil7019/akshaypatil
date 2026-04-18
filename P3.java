//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
//is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
//implementing the event handling mechanism with addActionListener( ).   
package swingprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P3 extends JFrame implements ActionListener {

    JLabel label;
    JButton btnClock, btnHourGlass;

    public P3() {

        // Frame settings
        setTitle("Image Button Demo");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (ensure images are in same project folder)
        ImageIcon clockIcon = new ImageIcon("digitalclock.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.jpg");

        // Create buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

        // Create label
        label = new JLabel("Press a button");

        // Add ActionListener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components
        add(btnClock);
        add(btnHourGlass);
        add(label);

        // Make visible
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new P3();
    }
}