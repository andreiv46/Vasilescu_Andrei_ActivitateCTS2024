package flyweight.clase;

public class Cont {
    private String nume;
    private double capital;

    public Cont(String nume, double capital) {
        this.nume = nume;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", capital=" + capital +
                '}';
    }
}