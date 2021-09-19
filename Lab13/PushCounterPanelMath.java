package Lab13;
//Lab13 9am
//Daniel Rochefort

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanelMath extends JPanel
{
    private int count;
    private JButton decrement;
    private JButton increment;
    private JLabel label;
    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanelMath()
    {
        count = 50;
        decrement = new JButton("Decrement");
        increment = new JButton("Increment");
        label = new JLabel();
        decrement.addActionListener(new DecrementButtonListener());
        increment.addActionListener(new IncrementButtonListener());
        label.setText("Value: " + count);
        add(decrement);
        add(increment);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 40));
    }

    //-----------------------------------------------------------------
    // Represents a listener for button push (action) events.
    //-----------------------------------------------------------------
    private class DecrementButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count--;
            label.setText("Value: " + count);
        }
    }
    private class IncrementButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Value: " + count);
        }
    }
}