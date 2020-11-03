package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

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

    public void ajoutTechnicienEquipe(String nom, String prenom, String matricule,
                                      LocalDate dateEmbauche, Double salaire, Integer grade) {
        Technicien technicien = new Technicien(nom, prenom, matricule, dateEmbauche, salaire, grade);
        this.ajoutTechnicienEquipe(technicien);
    }

    private void augmenterSalaireEquipe(Double augmentation) {
        for (Technicien technicien : this.equipe) {
            technicien.augmenterSalaire(augmentation);
        }
    }

    @Override
    public void setSalaire(Double salaire) {
        super.setSalaire((salaire * Entreprise.INDICE_MANAGER) + ((0.1 * salaire) * equipe.size()));
    }

    @Override
    public void augmenterSalaire(Double augmentationPourcentage) {
        for (Technicien technicien : this.equipe) {
            technicien.augmenterSalaire(augmentationPourcentage);
        }
        super.augmenterSalaire(augmentationPourcentage);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(equipe, manager.equipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), equipe);
    }
}
