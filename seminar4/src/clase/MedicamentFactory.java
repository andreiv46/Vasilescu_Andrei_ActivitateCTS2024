package clase;

public abstract class MedicamentFactory {
    private float pret;
    private String nume;

    public MedicamentFactory(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public abstract Medicament createMedicament(String nume, float pret);
}
