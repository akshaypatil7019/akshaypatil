//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
//the concerned color whenever the specific tab is selected in the Pan.

package p5a;   // optional (remove if not needed)

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class P5B extends JFrame implements ChangeListener {

    JTabbedPane tabbedPane;

    public P5B() {
        setTitle("Tabbed Pane Color Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane
        tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(this);

        add(tabbedPane);
        setVisible(true);
    }

    // Event handling when tab is changed
    public void stateChanged(ChangeEvent e) {
        int index = tabbedPane.getSelectedIndex();
        String tabName = tabbedPane.getTitleAt(index);

        System.out.println(tabName + " tab is selected");
    }

    public static void main(String[] args) {
        new P5B();
    }
}