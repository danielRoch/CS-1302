package Lab13;
//Lab13 9am
//Daniel Rochefort

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel
{
    private int count;
    private JButton push;
    private JLabel label;
    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanel()
    {
        count = 0;
        push = new JButton("Push Me!");
        label = new JLabel();
        push.addActionListener(new ButtonListener());
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 40));
    }

    //-----------------------------------------------------------------
    // Represents a listener for button push (action) events.
    //-----------------------------------------------------------------
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pushes: " + count);
        }
    }
} //end of PushCounterPanel.java