package soft_vechi;

public abstract class AbstractProdus {
    private String denumire;
    private double pret;

    public AbstractProdus(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
