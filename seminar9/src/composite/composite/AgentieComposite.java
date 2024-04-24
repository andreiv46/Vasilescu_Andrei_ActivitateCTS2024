package composite.composite;

import composite.clase.Sediu;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite implements Sediu {
    private String nume;
    private int numarOperatori;
    private List<Sediu> listaSedii;

    public AgentieComposite(String nume, int numarOperatori) {
        this.nume = nume;
        this.numarOperatori = numarOperatori;
        this.listaSedii = new ArrayList<>();
    }

    @Override
    public void adauga(Sediu sediu) {
        this.listaSedii.add(sediu);
    }

    @Override
    public void sterge(Sediu sediu) {
        this.listaSedii.remove(sediu);
    }

    @Override
    public Sediu get(int index) {
        return this.listaSedii.get(index);
    }

    @Override
    public void afisare(String identare) {
        System.out.println(identare + "Agentia cu numele " + this.nume + " are " + this.numarOperatori + " operatori si contine " + this.listaSedii.size() + " sedii:");
        for (Sediu sediu : this.listaSedii) {
            sediu.afisare(identare + "        ");
        }
    }

    @Override
    public int calculeazaNumaraAngajati() {
        int sum = this.numarOperatori;
        for (Sediu sediu : this.listaSedii) {
            sum += sediu.calculeazaNumaraAngajati();
        }
        return sum;
    }
}