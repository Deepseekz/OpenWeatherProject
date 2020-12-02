package com.example.openweathertp;

public class City {
    private int _id;
    private String _name;
    private Coord _coord;
    private String _country;

    public City(int _id, String _name, Coord _coord, String _country) {
        this._id = _id;
        this._name = _name;
        this._coord = _coord;
        this._country = _country;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public Coord getCoord() {
        return _coord;
    }

    public void setCoord(Coord _coord) {
        this._coord = _coord;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String _country) {
        this._country = _country;
    }
}
