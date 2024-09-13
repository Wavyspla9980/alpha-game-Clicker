import javax.swing.*;

public class Start {
    JButton button = new JButton("Start");

    public  Start(){
        button.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();

            Main.frame.add(new Gui().label1).setBounds(200,200,800,800);
            Main.frame.add(new Gui().button).setBounds(700,300,290,350);
            Main.frame.add(new Gui().coin).setBounds(20,400,400,200);
        });
    }
}
