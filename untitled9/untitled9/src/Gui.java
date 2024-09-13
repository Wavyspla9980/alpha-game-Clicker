import javax.swing.*;

public class Gui {
    ImageIcon pngCoin = new ImageIcon("src/Image/coin.png");
    ImageIcon icon = new ImageIcon("src/Image/pers.png");

    int Coin =0;

    JLabel label1 = new JLabel(String.valueOf("coin "+ Coin));
    JLabel coin = new JLabel(pngCoin);
    JButton button = new JButton(icon);
    JButton shop = new JButton("Shop");

    public  Gui(){
        button.addActionListener(e -> {
            Coin +=1;

            JLabel label2 = new JLabel(String.valueOf("coin "+ Coin));
            Main.frame.getContentPane().removeAll();

            SwingUtilities.updateComponentTreeUI(Main.frame);


            Main.frame.add(label2).setBounds(200,200,800,800);
            Main.frame.add(button).setBounds(700,300,290,350);
            Main.frame.add(new Gui().coin).setBounds(20,400,400,200);
            System.out.println(Coin);
        });
    }
}
