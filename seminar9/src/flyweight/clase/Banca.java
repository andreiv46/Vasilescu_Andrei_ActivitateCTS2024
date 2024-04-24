package flyweight.clase;

import flyweight.flyweight.FlyweightClient;

import java.util.HashMap;

public class Banca {
    private int numarCont;
    private double suma;
    private HashMap<String, FlyweightClient> detaliiClient;

    public Banca(int numarCont, double suma) {
        this.numarCont = numarCont;
        this.suma = suma;
        this.detaliiClient = new HashMap<>();
    }

    public FlyweightClient getDetaliiClient(String numarTelefon, String adresa, String nume) {
        if (detaliiClient.containsKey(numarTelefon)) {
            return detaliiClient.get(numarTelefon);
        }
        Client client = new Client(nume, adresa, numarTelefon);
        this.detaliiClient.put(numarTelefon, client);
        return this.detaliiClient.get(numarTelefon);
    }

    public FlyweightClient getDetaliiClient(String numarTelefon) {
        return detaliiClient.get(numarTelefon);
    }

    public void adaugaClient(FlyweightClient client) {
        Client fullClient = (Client)client;
        this.detaliiClient.putIfAbsent(fullClient.getNumarTelefon(), client);
    }

    @Override
    public String toString() {
        return "Banca{" +
                "numarCont=" + numarCont +
                ", suma=" + suma +
                ", detaliiClient=" + detaliiClient +
                '}';
    }
}