import javax.swing.*;

public class Gui {
    int a =0;
    JButton button = new JButton("click");

    public  Gui(){
        button.addActionListener(e -> {
            a+=1;
            JLabel label = new JLabel(String.valueOf("coin "+a));

            Main.frame.getContentPane().removeAll();

            SwingUtilities.updateComponentTreeUI(Main.frame);


            Main.frame.add(label).setBounds(700,200,400,200);
            Main.frame.add(button).setBounds(600,500,200,90);
            System.out.println(a);
        });
    }
}
