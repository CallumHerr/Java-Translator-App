package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Color;

public class AppGUI {
	
public static void main(String[] args) {
    	
    	//Create JFrame/Panel and set layout to Grid.
        JFrame frame = new JFrame("Translator Application");
        frame.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel gridPanel = new JPanel(new GridLayout(6, 1));
        gridPanel.setBackground(Color.DARK_GRAY);
        
        
        //Blank panel for aesthetics.
        JPanel blankPanel = new JPanel();
        blankPanel.setBackground(Color.DARK_GRAY);
        
        
        //Create a panel for the input text box.
        JPanel textInputPanel = new JPanel();
        textInputPanel.setBackground(Color.DARK_GRAY);
        textInputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JTextArea inputArea = new JTextArea();
        inputArea.setTabSize(5);
        inputArea.setRows(4);
        inputArea.setColumns(35);
        textInputPanel.add(inputArea);
        
        
        // Create a panel for the combo boxes.
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setBackground(Color.DARK_GRAY);
        comboBoxPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 25));
        
        JComboBox comboBoxFrom = new JComboBox();
        comboBoxFrom.addItem("From");
        comboBoxFrom.setMaximumRowCount(300);
        comboBoxPanel.add(comboBoxFrom);
        
        JComboBox comboBoxTo = new JComboBox();
        comboBoxTo.addItem("To");
        comboBoxTo.setMaximumRowCount(300);
        comboBoxPanel.add(comboBoxTo);
        
                
        // Create a panel for the output text box.
        JPanel textOutputPanel = new JPanel();
        textOutputPanel.setBackground(Color.DARK_GRAY);
        textOutputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setRows(4);
        outputArea.setColumns(35);
        textOutputPanel.add(outputArea);
        
        
        // Create a panel for the buttons "close" and "translate".
        JPanel translatePanel = new JPanel();
        translatePanel.setBackground(Color.DARK_GRAY);
        FlowLayout flowLayout = (FlowLayout) translatePanel.getLayout();
        flowLayout.setHgap(0);
        flowLayout.setVgap(25);
        JButton translateButton = new JButton("Translate");
        translatePanel.add(translateButton);
        
        
        JPanel closePanel = new JPanel();
        closePanel.setBackground(Color.DARK_GRAY);
        FlowLayout flowLayout_1 = (FlowLayout) closePanel.getLayout();
        flowLayout_1.setVgap(30);
        flowLayout_1.setAlignment(FlowLayout.RIGHT);
        JButton closeButton = new JButton("Close");
        closePanel.add(closeButton);
        
        
        //Add all of the above panels to the Pane in order.
        gridPanel.add(blankPanel);
        gridPanel.add(textInputPanel);
        gridPanel.add(comboBoxPanel);
        gridPanel.add(textOutputPanel);
        gridPanel.add(translatePanel);
        gridPanel.add(closePanel);

        
        // Add the grid panel to the frame + sets position and visibility. 
        frame.getContentPane().add(gridPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}