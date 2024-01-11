package com.chedi.Projet_Rest.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id_categorie;
    private String designationCat;
    private Date date_created;

    public Category() {
    }

    public Category(int id_categorie, String designationCat,Date date_created) {
        this.id_categorie = id_categorie;
        this.designationCat = designationCat;
        this.date_created = date_created;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getDesignationCat() {
        return designationCat;
    }

    public void setDesignationCat(String designationCat) {
        this.designationCat = designationCat;
    }
}
