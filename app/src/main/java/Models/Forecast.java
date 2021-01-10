package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Forecast implements Serializable {
    private Main main;
    private ArrayList<Weather> weather;
    private String dt_txt;

    public Forecast(Main main, ArrayList<Weather> weather, String dt_txt) {
        this.main = main;
        this.weather = weather;
        this.dt_txt = dt_txt;
    }

    @Override
    public String toString() {
        String result = "";
        for (Weather weather : weather) {
            result += weather.toString();
        }
        return result;
    }

    public Main getMain() {
        return main;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public String getDate(){
        return dt_txt.substring(0, 9);
    }

    public String getTime(){
        return dt_txt.substring(10);
    }
}
