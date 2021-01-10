package Models;

import java.io.Serializable;

public class Coord implements Serializable {
    private double lat;
    private double lon;

    public Coord(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
}
