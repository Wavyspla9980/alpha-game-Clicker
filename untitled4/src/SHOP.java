import javax.swing.*;

public class SHOP {

    int a = 1;
    private int b = 100;


    int click = a;

    JButton button = new JButton("lol");

    public  SHOP(){
        button.addActionListener(e -> {
            System.out.println(new ClickButton().Coin);
           Main.frame.add(button).setBounds(200,200,100,40);
        });
    }
}
