import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChoiceSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Choice sample demonstration");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(panel);

        Choice c1 = new Choice();
        for (int i = 1; i < 31; i++) {
            c1.add(i+ " ");
        }

        Choice c2 = new Choice();
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("March");

        Choice c3 = new Choice();
        for (int i = 1990; i < 2023; i++) {
            c3.add(i+" ");
        }

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);

        JButton b1 = new JButton("Save");
//        JPanel output = new JPanel();

//        output.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(b1);


        JTextArea ta = new JTextArea();
        panel.add(ta);

//        frame.add(output);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(c1.getSelectedItem() + " " + c2.getSelectedItem() + " " + c3.getSelectedItem());
            }
        });


        frame.setVisible(true);
    }
}
