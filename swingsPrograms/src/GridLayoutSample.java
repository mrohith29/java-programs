import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GridLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid layout sample");
        JPanel panel = new JPanel();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(2, 2, 5, 5));
        frame.add(panel);
        JButton buttons[] = new JButton[4];
        for (int i = 0; i < 4; i++) {
            buttons[i] = new JButton("Button " + i + 1);
            buttons[i].setPreferredSize(new Dimension(5, 5));
            panel.add(buttons[i]);
        }
        frame.setVisible(true);
    }
}
