package com.controller;

import com.model.dB;
import com.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.*;


public class LoginWindowController extends BaseController {

    public String email;
    public String pwd;

    @FXML
    private TextField emailAddress;

    @FXML
    private Label errorLabel;

    @FXML
    private PasswordField passwordField;

    public LoginWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }

    @FXML
    public void LoginButtonAction() throws SQLException {
        Stage stage = (Stage) errorLabel.getScene().getWindow();
        email = emailAddress.getText();
        pwd = passwordField.getText();
        dB database = new dB();
        int login = database.CheckLogin(email,pwd);
        if(login == 1) {
            viewFactory.showMainWindow1();
            viewFactory.closeStage(stage);
        }
        else if(login==2){
            viewFactory.showMainWindow2();
            viewFactory.closeStage(stage);
        }
        else errorLabel.setText("Wrong email id or password!");
    }

}
