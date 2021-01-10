package Models;

public class Main {
    private double temp;
    private double temp_min;
    private double temp_max;
    private double feels_like;

    public Main(double temp, double temp_min, double temp_max, double feels_like) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.feels_like = feels_like;
    }

    public double getTemp() {
        return temp;
    }
}
