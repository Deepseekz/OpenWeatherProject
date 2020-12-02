package com.example.openweathertp;

import java.io.Serializable;

public class Prevision implements Serializable {
    private String debug;
    private Window window;

    public Prevision(String debug, Window window) {
        this.debug = debug;
        this.window = window;
    }

    public String getDebug() {
    }

    public Window getWindow() {
    }
}