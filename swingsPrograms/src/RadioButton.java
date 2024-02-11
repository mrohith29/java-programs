//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class RadioButton {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Radio Box Sample");
//        JPanel panel = new JPanel();
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
////        JRadioButton jrb = new JRadioButton();
////        String[] nums = new String[] {"one", "two", "three"};
////        jrb.add(nums);
//
//        JRadioButton b1 = new JRadioButton("One");
//        JRadioButton b2 = new JRadioButton("Two");
//        JRadioButton b3 = new JRadioButton("three");
//
//        ButtonGroup group = new ButtonGroup();
//        group.add(b1);
//        group.add(b2);
//        group.add(b3);
//
//        panel.add(b1);
//        panel.add(b2);
//        panel.add(b3);
//
//        frame.add(panel);
//
//        JTextArea ta = new JTextArea();
//        panel.add(ta);
//
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ta.setText("One is selected");
//            }
//        });
//
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ta.setText("Two is selected");
//            }
//        });
//
//        b3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ta.setText("Three is selected");
//            }
//        });
//
//        frame.setVisible(true);
//    }
//}


import javax.swing.*;
//import java.awt.*;

public class RadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Box Sample");
        JPanel panel = new JPanel();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonGroup group = new ButtonGroup();
        JTextArea ta = new JTextArea();
        String[] options = {"One", "Two", "Three"};

        for (String option : options) {
            JRadioButton button = new JRadioButton(option);
            button.addActionListener(e -> ta.setText(option + " is selected"));
            group.add(button);
            panel.add(button);
        }

        panel.add(ta);
        frame.add(panel);
        frame.setVisible(true);
    }
}