import javax.swing.*;

public class Start {
    JButton start = new JButton("Start");

    public  Start(){
        ClickButton button = new ClickButton();
        SHOP shop = new SHOP();

        start.addActionListener(e -> {
            start.setVisible(false);

            SwingUtilities.updateComponentTreeUI(Main.frame);
            Main.frame.add(button.button).setBounds(90,90,40,40);

           Main.frame.add(new  SHOP().button).setBounds(200,200,100,40);
        });
    }
}
