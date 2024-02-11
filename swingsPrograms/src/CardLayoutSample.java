import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Layout Sample");
        JPanel panel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox winXP = new JCheckBox("Windows XP");
        JCheckBox winVista = new JCheckBox("Windows Vista", null, true);
        JCheckBox solaris = new JCheckBox("Solaris");
        JCheckBox mac = new JCheckBox("mac");

        JButton next = new JButton("Next");
        JButton back = new JButton("Back");

        JPanel winPan = new JPanel();
        winPan.add(winXP);
        winPan.add(winVista);

        JPanel otherPan = new JPanel();
        otherPan.add(solaris);
        otherPan.add(mac);

        winPan.add(next);
        otherPan.add(back);

        panel.add(winPan, "windows");
        panel.add(otherPan, "Others");


        frame.add(panel);
        frame.setVisible(true);

        next.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cardLayout.next(panel);
            }
        });

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cardLayout.previous(panel);
            }
        });

    }
}
