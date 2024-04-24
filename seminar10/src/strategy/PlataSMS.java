package strategy;

public class PlataSMS implements ModPlata{
    @Override
    public void platesteCalatorie(float pret) {
        System.out.printf("S-a efectuat plata in valoare de %.2f print SMS", pret);
    }
}
