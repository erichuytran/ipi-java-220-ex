package com.ipiecoles.java.java220;


import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */

public class Employe extends Entreprise {
    private String nom = "";
    private String prenom = "";
    private String matricule = "";
    private LocalDate dateEmbauche;
    private Double salaire = 0.0;

    public Employe() {
        //default constructor
    }

    public Employe(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        setNom(nom);
        setPrenom(prenom);
        setMatricule(matricule);
        setDateEmbauche(dateEmbauche);
        setSalaire(salaire);
    }

    //nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //prenom
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //matricule
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    //dateEmbauche
    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) throws RuntimeException {
        if (dateEmbauche.isAfter(LocalDate.now())) {
            throw new RuntimeException("La date d'embauche ne peut être postérieure à la date courante");
        }
        this.dateEmbauche = dateEmbauche;
    }

    //salaire
    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    //nombre d'annees d'anciennete
    final public Integer getNombreAnneeAnciennete() throws RuntimeException {
        Integer nombreAnneeAnciennete = LocalDate.now().getYear() - getDateEmbauche().getYear();

        if (nombreAnneeAnciennete < 0) {
            throw new RuntimeException("L'année d'ancienneté ne peut pas être négative");
        }
        return nombreAnneeAnciennete;
    }

    public final Integer getNbConges() {
        return Entreprise.NB_CONGES_BASE;
    }
}
