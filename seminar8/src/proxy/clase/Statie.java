package proxy.clase;

public class Statie {
    private int nrCalatori;
    private String denumire;

    public Statie(int nrCalatori, String denumire) {
        this.nrCalatori = nrCalatori;
        this.denumire = denumire;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public String getDenumire() {
        return denumire;
    }
}
