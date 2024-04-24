package flyweight.clase;

import flyweight.flyweight.FlyweightClient;

public class Client implements FlyweightClient {
    private String nume;
    private String adresa;
    private String numarTelefon;

    public Client(String nume, String adresa, String numarTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public void afiseazaInformatie(Cont cont) {
        System.out.println(cont);
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }
}
