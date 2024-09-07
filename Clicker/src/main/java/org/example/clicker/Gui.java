package org.example.clicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Gui {
    int click = 1;
    int Coin = 0;

    int a = 50;
    int b = 9;

    @FXML
    private Label Cheeck;

    @FXML
    private Button ButtonClick;

    @FXML
    void ButtonClick(ActionEvent event) {
        Coin+=click;
        Cheeck.setText(String.valueOf(Coin));
    }

    @FXML
    void Button_lvl(ActionEvent event) {
        if (Coin >=a){
            click+=b;

            Coin-=50;
            Cheeck.setText(String.valueOf(Coin));

            a += 50;

            ButtonClick.setText(String.valueOf(a + " coin = lvl up"));
        }
    }


    public void Click(ActionEvent actionEvent) {

    }
}

