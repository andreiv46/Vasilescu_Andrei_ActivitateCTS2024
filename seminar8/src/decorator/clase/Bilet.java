package decorator.clase;

public class Bilet implements BiletAbstract {
    private String cod;
    private double pret;

    public Bilet(String cod, double pret) {
        this.cod = cod;
        this.pret = pret;
    }

    public String getCod() {
        return cod;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "cod='" + cod + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void printareBilet() {
        System.out.println(this);
    }
}
