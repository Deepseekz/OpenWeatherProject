package Model;

public class City {
    private int id;
    private String name;
    private Coord coord;
    private String country;

    public City(int id, String name, Coord coord, String country) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord _coord) {
        this.coord = _coord;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String _country) {
        this.country = _country;
    }

    @Override
    public String toString() {
        return "Ville: " +
                "id=" + id +
                "name=" + name +
                "coord=" + coord +
                "country=" + country;
    }
}
