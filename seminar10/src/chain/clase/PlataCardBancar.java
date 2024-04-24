package chain.clase;

public class PlataCardBancar extends ModPlata {
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void platesteCalatorie(float pret) {
        if(pret <= this.sold) {
            System.out.printf("S-a efectuat plata in valoare de %.2f cu Cardul bancar%n", pret);
            this.sold -= pret;
            return;
        }
        super.succesor.platesteCalatorie(pret);
    }
}
