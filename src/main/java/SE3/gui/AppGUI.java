package SE3.gui;

import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AppGUI {

    public AppGUI() {
        buildGUI();
    }

    public void buildGUI() {

        JFrame welcomeF = new JFrame("Text Translator");
        welcomeF.setSize(700, 500);

        JPanel welcomeP = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        welcomeF.add(welcomeP);

        // Title
        JLabel welcomeLbl = new JLabel("Text Translator", JLabel.CENTER);
        c.weightx = 1;
        c.weighty = 0.1;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(0, 0, 0, 0);
        welcomeLbl.setOpaque(true);
        welcomeLbl.setBackground(Color.decode("#333333"));
        welcomeLbl.setForeground(Color.white);
        welcomeLbl.setFont(new Font("Nirmala UI", Font.BOLD, 25));
        welcomeP.add(welcomeLbl, c);

        // Welcome text
        JLabel subLbl = new JLabel("Simply enter you text below and select your language to translate.", JLabel.CENTER);
        c.weightx = 0;
        c.weighty = 0.05;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        subLbl.setOpaque(true);
        subLbl.setBackground(Color.decode("#404040"));
        subLbl.setForeground(Color.white);
        subLbl.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
        c.insets = new Insets(0, 0, 10, 0);
        welcomeP.add(subLbl, c);

        // Dropdown 1 (Left)
        JComboBox toCB = new JComboBox();
        c.weightx = 1;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        toCB.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        toCB.addItem("To");
        welcomeP.add(toCB, c);

        // Dropdown 2 (Right)
        JComboBox fromCB = new JComboBox();
        c.weightx = 1;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        fromCB.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        fromCB.addItem("From");
        welcomeP.add(fromCB, c);

        // TextArea (Left)
        JTextArea toTXT = new JTextArea();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        toTXT.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        welcomeP.add(toTXT, c);

        // TextArea (Right)
        JTextArea fromTXT = new JTextArea();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        fromTXT.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        welcomeP.add(fromTXT, c);

        // Translate Button
        JButton translateBTN = new JButton("Translate");
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        translateBTN.setFont(new Font("Nirmala UI", Font.BOLD, 16));
        translateBTN.setPreferredSize(new Dimension(200, 30));
        c.insets = new Insets(0, 0, 5, 0);
        welcomeP.add(translateBTN, c);

        // Close Button
        JButton closeBTN = new JButton("Close");
        c.weightx = 1;
        c.weighty = 0;
        c.anchor = GridBagConstraints.SOUTHEAST;
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(10, 0, 5, 0);
        closeBTN.setFont(new Font("Nirmala UI", Font.BOLD, 12));
        c.gridwidth = 1;
        welcomeP.add(closeBTN, c);
        closeBTN.addActionListener(e -> {
                    welcomeF.dispose();
                }

        );

        welcomeF.setVisible(true);
        welcomeF.setLocationRelativeTo(null);
        welcomeP.setVisible(true);
        welcomeF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}