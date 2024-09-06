import javax.swing.*;

import static java.awt.Color.*;

public class Main {
    static JFrame frame = new JFrame();

    public static void main(String[] args) {

        int wh = 500;
        int ht = 500;


        frame.setSize(wh,ht);
        frame.getContentPane().setBackground(cyan);

        SwingUtilities.updateComponentTreeUI(frame);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        Start button = new Start();
        JButton clickStart = button.start;


        Main.frame.add(clickStart).setBounds(50,200,100,40);;
    }
}