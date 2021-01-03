package Model;

import java.io.Serializable;

public class Window implements Serializable {
    private String title;
    private String name;
    private int width;
    private int height;

    public Window(String title, String name, int width, int height) {
        this.title = title;
        this.name = name;
        this.width = width;
        this.height = height;
    }
}