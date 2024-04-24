package composite.composite;

import composite.clase.Sediu;

public class Filiala implements Sediu {
    private String nume;
    private int numarAnajati;

    public Filiala(String nume, int numarAnajati) {
        this.nume = nume;
        this.numarAnajati = numarAnajati;
    }

    @Override
    public void adauga(Sediu sediu) throws Exception {
        throw new Exception("Filiala nu poate adauga sedii");
    }

    @Override
    public void sterge(Sediu sediu) throws Exception {
        throw new Exception("Filiala nu poate sterge sedii");
    }

    @Override
    public Sediu get(int index) throws Exception {
        throw new Exception("Filiala nu poate accesa un sediu");
    }

    @Override
    public void afisare(String identare) {
        System.out.println(identare + "Filiala " + this.nume + " are " + this.numarAnajati + " angajati");
    }

    @Override
    public int calculeazaNumaraAngajati() {
        return this.numarAnajati;
    }
}
