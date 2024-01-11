package com.chedi.Projet_Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_produit;
    private String designation;
    private float prix;
    private String url;
    private float qte;
    @ManyToOne
    @JoinColumn(name= "id_categorie")
    private Category categorie;




   public product(){}

    public product(int id_produit, String designation, float prix, float qte, Category categorie,String url) {
        this.id_produit = id_produit;
        this.designation = designation;
        this.prix = prix;
        this.qte = qte;
        this.categorie = categorie;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getQte() {
        return qte;
    }

    public void setQte(float qte) {
        this.qte = qte;
    }

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }
}
