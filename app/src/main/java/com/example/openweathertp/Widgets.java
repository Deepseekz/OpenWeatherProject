package com.example.openweathertp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Widgets implements Serializable {
    private List<Widget> widgets;

    public ArrayList<Widget> getWidgetsArrayList() {
        ArrayList<Widget> widgetsList = new ArrayList<>();
        for (Widget widget : this.widgets) {
            Widget w = new Widget(widget.getDebug(), widget.getWindow());
            widgetsList.add(w);
        }
        return widgetsList;
    }
}