import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Sample");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JTextArea ta = new JTextArea();

        panel.add(b1, BorderLayout.NORTH);
        panel.add(b2, BorderLayout.SOUTH);
        panel.add(b3, BorderLayout.EAST);
        panel.add(b4, BorderLayout.WEST);
        panel.add(ta, BorderLayout.CENTER);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("North Button is clicked");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("South Button is clicked");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("East Button is clicked");
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ta.setText("West Button is clicked");
            }
        });

        frame.setVisible(true);
    }
}
