package Lab13;
//Lab13 9am
//Daniel Rochefort

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class PushCounterPanelSorter extends JPanel
{
    private JButton push;
    private JLabel label;
    private int[] array = new int[5];
    private JTextField text1 = new JFormattedTextField(10);
    private JTextField text2 = new JFormattedTextField(10);
    private JTextField text3 = new JFormattedTextField(10);
    private JTextField text4 = new JFormattedTextField(10);
    private JTextField text5 = new JFormattedTextField(10);
    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanelSorter()
    {
        push = new JButton("Sort");
        label = new JLabel();
        push.addActionListener(new ButtonListener());
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 200));
    }

    //-----------------------------------------------------------------
    // Represents a listener for button push (action) events.
    //-----------------------------------------------------------------
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            array[0] = Integer.parseInt(text1.getText());
            array[1] = Integer.parseInt(text2.getText());
            array[2] = Integer.parseInt(text3.getText());
            array[3] = Integer.parseInt(text4.getText());
            array[4] = Integer.parseInt(text5.getText());

            //Sorting using java.util.Arrays
//            Arrays.sort(array);

            //Sorting using Bubble Sort
            for(int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

            label.setText("Sorted Array: " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);
        }
    }
}