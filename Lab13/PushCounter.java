package Lab13;
//Lab13 9am
//Daniel Rochefort

import javax.swing.JFrame;
public class PushCounter
{
//-----------------------------------------------------------------
// Creates and displays the main program frame.
//-----------------------------------------------------------------
    public static void main(String[] args)
    {
        //1
//        JFrame frame = new JFrame("Push Counter");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        PushCounterPanel panel = new PushCounterPanel();
//        frame.getContentPane().add(panel);
//        frame.pack();
//        frame.setVisible(true);

        //2
//        JFrame frame = new JFrame("Push Counter Random");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        PushCounterPanelRandom panel = new PushCounterPanelRandom();
//        frame.getContentPane().add(panel);
//        frame.pack();
//        frame.setVisible(true);

        //3
//        JFrame frame = new JFrame("Push Counter Math");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        PushCounterPanelMath panel = new PushCounterPanelMath();
//        frame.getContentPane().add(panel);
//        frame.pack();
//        frame.setVisible(true);

        //4
        JFrame frame = new JFrame("Push Counter Sorter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PushCounterPanelSorter panel = new PushCounterPanelSorter();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
} //end of PushCounter.java
