package chain.clase;

public class Validator {
    private int nrAutobuz;
    private ModPlata modPlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;

        ModPlata plataSMS = new PlataSMS(23);
        ModPlata plataCardCalatorii = new PlataCardCalatorii(3);
        ModPlata controlor = new Controlor();

        this.modPlata = new PlataCardBancar(100);
        this.modPlata.setSuccesor(plataSMS);
        plataSMS.setSuccesor(plataCardCalatorii);
        plataCardCalatorii.setSuccesor(controlor);
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    protected void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void efectueazaPlata(float pret){
        this.modPlata.platesteCalatorie(pret);
    }
}
