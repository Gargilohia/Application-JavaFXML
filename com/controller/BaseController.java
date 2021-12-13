package com.controller;

import com.view.ViewFactory;

public abstract class BaseController {


    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(ViewFactory viewFactory, String fxmlName) {
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getfxmlName() {
        return fxmlName;
    }
}
