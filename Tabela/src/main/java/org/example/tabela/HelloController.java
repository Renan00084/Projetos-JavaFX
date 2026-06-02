package org.example.tabela;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.control.TableColumn;

public class HelloController {
    @FXML
    private TextField tNome;

    @FXML
    private TextField tEmail;

    @FXML
    private TableView tabela;

    @FXML
    private TableColumn colNome;

    @FXML
    private TableColumn colEmail;

    ObservableList lista;

    @FXML
    protected void onHelloButtonClick(){
        String nome, email;

        nome = tNome.getText();

        email = tEmail.getText();

        lista.add(new Usuario(nome, email));

    }

    @FXML
    public void initialize(){
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        lista = FXCollections.observableArrayList();
        tabela.setItems(lista);

    }

    @FXML
    protected void textField(){
        System.out.println("OI");


    }

}
