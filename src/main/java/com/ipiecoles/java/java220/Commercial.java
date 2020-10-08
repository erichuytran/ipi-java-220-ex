package com.ipiecoles.java.java220;

public class Commercial extends Employe {
    private Double caAnnuel = 0.0;

    Commercial() {
        super();
    }

    public Double getCaAnnuel() {
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    @Override
    public Double getPrimeAnnuelle() {
        Double primeAnnuelle = Math.ceil(0.05 * caAnnuel);

        if (primeAnnuelle < 500.0 || caAnnuel.equals(null)) {
            primeAnnuelle = 500.0;
        }
        return primeAnnuelle;
    }
}
