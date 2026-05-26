package org.example.calculadordeimc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label lResult;

    @FXML
    private TextField tf1, tf2;

    @FXML
    protected void onHelloButtonClick() {
        double numero = Double.parseDouble(tf1.getText()) / ((Double.parseDouble(tf2.getText())) * (Double.parseDouble(tf2.getText())));

        lResult.setText("Resultado: " + String.format("%.2f", numero)); //mostra só os primeiras 2 casas decimais da variável
    }
}
