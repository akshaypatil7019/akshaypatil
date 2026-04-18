//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming
//in Blue color plain font with font size of 32 using Jframe and Jlabel
package swingprograms;

import javax.swing.*;
import java.awt.*;

public class P1 {

    public static void main(String[] args) {

        // Run Swing in Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                // Create JFrame
                JFrame frame = new JFrame("Swing Hello Program");

                // Create JLabel
                JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

                // Set font (Plain, Size 32)
                label.setFont(new Font("Arial", Font.PLAIN, 32));

                // Set text color Blue
                label.setForeground(Color.BLUE);

                // Center text
                label.setHorizontalAlignment(JLabel.CENTER);

                // Add label to frame
                frame.add(label);

                // Frame settings
                frame.setSize(800, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}