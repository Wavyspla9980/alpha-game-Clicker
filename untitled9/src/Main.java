import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    static  JFrame frame = new JFrame("Clicker");
    static private JButton button = new Start().button;

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("src/Image/icon.png");

        frame.setSize(500,500);
        frame.setIconImage(icon.getImage());

        frame.getContentPane().setBackground(Color.CYAN);
        SwingUtilities.updateComponentTreeUI(frame);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button).setBounds(600,500,200,90);
    }
}