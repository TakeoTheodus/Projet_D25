package fr.univtln.xdurbec066.reseau.objets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by xdurbec066 on 14/03/16.
 */

@Entity
public class Utilisateur {

    private String nom;
    private String prenom;
    private  String adresse;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;

    public Utilisateur(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Utilisateur(Utilisateur utilisateur) {
        this(utilisateur.getNom(),utilisateur.getPrenom(),utilisateur.getAdresse());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Utilisateur() {
    }

    public int getId() {
        return id;
    }

}
