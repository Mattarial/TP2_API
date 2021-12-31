package fr.ensim.tp5.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class EtelabAddresse {

    @Id
    @Access(AccessType.PROPERTY)
    String type;
    @ManyToOne(targetEntity = EtelabAddresse.class)
    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    String version;
    @ManyToOne(targetEntity = EtelabAddresse.class)
    List<Feature> features;

    public EtelabAddresse(){

    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "EtelabAddresse{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", addr=" + features.get(1).getProperties().getLabel() +
                '}';
    }
}
