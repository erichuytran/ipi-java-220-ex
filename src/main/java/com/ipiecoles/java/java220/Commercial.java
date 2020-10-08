package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe {
    private Double caAnnuel = 0.0;
    private Integer performance = 0;

    public Commercial() {
        super();
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance) {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
        this.performance = performance;
    }

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    public Boolean performanceEgale(Integer performanceRef) {
        if (performance.equals(performanceRef)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Double getPrimeAnnuelle() {
        Double primeAnnuelle = Math.ceil(0.05 * caAnnuel);

        if (primeAnnuelle < 500.0 || caAnnuel.equals(null)) {
            primeAnnuelle = 500.0;
        }
        return primeAnnuelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Commercial that = (Commercial) o;
        return Objects.equals(caAnnuel, that.caAnnuel);
    }
}
