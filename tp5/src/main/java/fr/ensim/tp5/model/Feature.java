package fr.ensim.tp5.model;

import javax.persistence.*;

@Entity
public class Feature {

    @Id
    @GeneratedValue
    String type;
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Feature.class)
    Geometry geometry;
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Feature.class)
    Properties properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
