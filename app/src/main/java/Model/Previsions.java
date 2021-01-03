package Model;

import java.io.Serializable;
import java.util.List;

public class Previsions implements Serializable {
    private List<Prevision> list;
    private City city;

    public Previsions(List<Prevision> list, City city) {
        this.list = list;
        this.city = city;
    }

    public List<Prevision> getPrevisions() {
        return list;
    }

    public void setPrevisions(List<Prevision> list) { this.list = list; }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String resultat = city.toString();
        for (Prevision prev : list)
        {
            resultat +=prev.toString();
        }
        return resultat;
    }
}