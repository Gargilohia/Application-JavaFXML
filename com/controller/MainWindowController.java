package com.controller;
import com.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {
    @FXML
    private AnchorPane color;

    @FXML
    private WebView articlesWebView;

    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
    }
}
