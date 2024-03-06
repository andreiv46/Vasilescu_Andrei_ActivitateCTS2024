package clase;

public class Manager {
    private String nume;
    private float salariu;
    private int nrSubordonati;
    private static Manager instance = null;

    private Manager() {
        this.nume = "Zavoianu Gabriel";
        this.salariu = 15000;
        this.nrSubordonati = 0;
    }

    private Manager(String nume, float salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    public synchronized static Manager getInstance(String nume, float salariu, int nrSubordonati) {
        if (instance == null) {
            instance = new Manager(nume, salariu, nrSubordonati);
        }
        return instance;
    }

    public synchronized static Manager getInstance() {
        return getInstance("Zavoianu Gabriel", 15000, 2);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }
}
