package fr.ensim.tp5.model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String auteur;

    public Long getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() { return content; }

    public String getAuteur() { return auteur; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuteur(String auteur) { this.auteur = auteur; }

}
