package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Iterator;

public class Manager extends Employe {

    private HashSet<Technicien> equipe = new HashSet<>();

    public Manager() {
        super();
    }

    public Manager(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, HashSet<Technicien> equipe) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.equipe = equipe;
    }

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien) {
        this.equipe.add(technicien);
    }



    @Override
    public void setSalaire(Double salaire) {
        super.setSalaire((salaire * Entreprise.INDICE_MANAGER) + ((0.1 * salaire) * equipe.size()));
    }

    @Override
    public Double getPrimeAnnuelle() {
        return (Entreprise.primeAnnuelleBase() + (Entreprise.PRIME_MANAGER_PAR_TECHNICIEN * equipe.size()));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "equipe=" + equipe +
                '}';
    }
}
