package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Technicien extends Employe {
    Integer grade = 0;

    public Technicien() { }

    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
