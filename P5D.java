//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan

package p5a;   // optional

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class P5D extends JFrame implements ChangeListener {

    JTabbedPane tabbedPane;

    public P5D() {
        setTitle("Tabbed Pane Color Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        tabbedPane = new JTabbedPane();

        // Create panels with colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(this);

        add(tabbedPane);
        setVisible(true);
    }

    // Event handling
    public void stateChanged(ChangeEvent e) {
        int index = tabbedPane.getSelectedIndex();
        String tabName = tabbedPane.getTitleAt(index);

        System.out.println(tabName + " tab is selected");
    }

    public static void main(String[] args) {
        new P5D();
    }
}