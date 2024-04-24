package chain.clase;

public class PlataCardCalatorii extends ModPlata {
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void platesteCalatorie(float pret) {
        if(this.nrCalatorii > 0) {
            System.out.printf("S-a efectuat plata in valoare de %.2f cu Cardul de calatorii%n", pret);
            this.nrCalatorii--;
            return;
        }
        super.succesor.platesteCalatorie(pret);
    }
}
