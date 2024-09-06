import javax.swing.*;

public class ClickButton {
    public  int Coin = 10;
    private  int lvl = 0;
    private String text = "click";
    JButton button = new JButton(text);


   public  ClickButton(){
       SHOP shop = new SHOP();

       button.addActionListener(e ->{


           Main.frame.getContentPane().removeAll();

           Main.frame.add(new  SHOP().button).setBounds(200,200,100,40);

           Main.frame.add(button).setBounds(90,90,200,30);

           JLabel label = new JLabel(String.valueOf(Coin));

           Coin +=shop.click;

           Main.frame.add(label);
           label.setBounds(60,90,900,200);


           System.out.println(Coin);
       });
   }
}
