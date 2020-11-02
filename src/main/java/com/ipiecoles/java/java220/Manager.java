package com.ipiecoles.java.java220;

import java.util.Collections;
import java.util.HashSet;

public class Manager extends Employe {

    private HashSet<Technicien> equipe = new HashSet<>();

    public HashSet<Technicien> getEquipe() {
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe) {
        this.equipe = equipe;
    }

    @Override
    public Double getPrimeAnnuelle() {
        return null;
    }
}
