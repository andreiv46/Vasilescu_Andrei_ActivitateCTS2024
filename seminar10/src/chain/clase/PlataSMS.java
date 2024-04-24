package chain.clase;

public class PlataSMS extends ModPlata {
    private double credit;

    public PlataSMS(double credit) {
        this.credit = credit;
    }

    @Override
    public void platesteCalatorie(float pret) {
        if (this.credit - pret >= 0){
            System.out.printf("S-a efectuat plata in valoare de %.2f print SMS%n", pret);
            this.credit -= pret;
            return;
        }
        super.succesor.platesteCalatorie(pret);
    }
}
