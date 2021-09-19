package MindTap.Unit14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSandwich extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Sublime Sandwich");
    JComboBox<String> mainBox = new JComboBox<String>();
    JLabel mainList = new JLabel("Main ingredient");
    JComboBox<String> breadBox = new JComboBox<String>();
    JLabel breadList = new JLabel("Breads");
    JTextField totPrice = new JTextField(10);
    int mainNum, breadNum;
    double[] mainPrices = {6.99, 7.99, 8.99};
    double sumPrice = mainPrices[0];
    double breadPrice = 0;
    double mainPrice = mainPrices[0];
    double[] breadPrices = {0, 0, 0};
    String output;

    double total = 0;

    public JSandwich() {
        // Write your code here

        super.setLayout(flow);
        super.add(companyName);

        super.add(mainList);
        super.add(mainBox);

        super.add(breadList);
        super.add(breadBox);

        super.add(totPrice);
        totPrice.setText("$" + String.valueOf(mainPrice));
        totPrice.setEditable(false);

        mainBox.addItem("Chicken");
        mainBox.addItem("Beef");
        mainBox.addItem("Tuna");
        mainBox.addItemListener(this);

        breadBox.addItem("White");
        breadBox.addItem("Rye");
        breadBox.addItem("Whole Wheat");


    }
    public static void main(String[] arguments) {
        JSandwich sandframe = new JSandwich();
        sandframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sandframe.setTitle("Sublime Sandwich");
        sandframe.setSize(240, 200);
        sandframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        // Write your code here
        if(list.getStateChange()==1){
            mainPrice = mainPrices[mainBox.getSelectedIndex()];
            totPrice.setText("$" + String.valueOf(mainPrice));
        }
    }
}
