module JavaFXpractice {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.sql;


    opens com.view;
    opens com;
    opens com.controller;
    opens com.model;
}