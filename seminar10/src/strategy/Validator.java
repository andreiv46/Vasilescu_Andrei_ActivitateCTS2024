package strategy;

public class Validator {
    private int nrAutobuz;
    private ModPlata modPlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void efectueazaPlata(float pret){
        this.modPlata.platesteCalatorie(pret);
    }
}
