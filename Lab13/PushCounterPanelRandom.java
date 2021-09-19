package Lab13;
//Lab13 9am
//Daniel Rochefort

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PushCounterPanelRandom extends JPanel
{
    private int count;
    private JButton push;
    private JLabel label;
    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanelRandom()
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
            Random rand = new Random();
            count = (rand.nextInt(100)+1);
            label.setText("Pushes: " + count);
        }
    }
}