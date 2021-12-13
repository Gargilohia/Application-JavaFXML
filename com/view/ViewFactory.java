package com.view;

import com.controller.BaseController;
import com.controller.LoginWindowController;
import com.controller.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    public void showLoginWindow() {

        BaseController controller = new LoginWindowController(this, "LoginWindow.fxml");
        initializeStage(controller);

    }

    public void showMainWindow1() {

        BaseController controller = new MainWindowController(this, "MainWindow.fxml");
        initializeStage(controller);
    }

    public void showMainWindow2() {

        BaseController controller = new MainWindowController(this, "MainWindow2.fxml");
        initializeStage(controller);
    }


    private void initializeStage(BaseController controller)
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getfxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stageToClose){
        stageToClose.close();
    }
}
