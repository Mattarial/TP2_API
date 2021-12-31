package fr.ensim.tp5.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Geometry {

    @Id
    @GeneratedValue
    String type;
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Geometry.class)
    List<Float> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
