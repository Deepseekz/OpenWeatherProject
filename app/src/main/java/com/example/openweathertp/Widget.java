package com.example.openweathertp;

import java.io.Serializable;

public class Widget implements Serializable {
    private String debug;
    private Window window;

    public Widget(String debug, Window window) {
        this.debug = debug;
        this.window = window;
    }

    public String getDebug() {
    }

    public Window getWindow() {
    }
}