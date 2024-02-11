import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Sample");
        frame.setLayout(new BorderLayout()); // Set layout of JFrame to BorderLayout
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton b1 = new JButton("Red");
        JButton b2 = new JButton("Green");
        JButton b3 = new JButton("Blue");
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
//        frame.add(panel, BorderLayout.CENTER); // Add panel to CENTER position
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.RED);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.GREEN);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.BLUE);
            }
        });
        
        frame.setVisible(true);
    }
}