package soft_nou;

import soft_vechi.AbstractProdus;

public class Bautura extends AbstractProdus {
    private double gradAlcool;

    public Bautura(String denumire, double pret, double gradAlcool) {
        super(denumire, pret);
        this.gradAlcool = gradAlcool;
    }
    public double getGradAlcool() {
        return gradAlcool;
    }
}
