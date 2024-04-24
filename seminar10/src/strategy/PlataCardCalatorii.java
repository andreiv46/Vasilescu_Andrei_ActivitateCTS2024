package strategy;

public class PlataCardCalatorii implements ModPlata{
    @Override
    public void platesteCalatorie(float pret) {
        System.out.printf("S-a efectuat plata in valoare de %.2f cu Cardul de calatorii", pret);
    }
}
