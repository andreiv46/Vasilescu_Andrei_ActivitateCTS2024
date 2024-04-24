package composite.composite;

import composite.clase.Sediu;

import java.util.ArrayList;
import java.util.List;

public class SucursalaComposite implements Sediu {
    private String nume;
    private int numarProgramatori;
    private List<Sediu> sedii;

    public SucursalaComposite(String nume, int numarProgramatori) {
        this.nume = nume;
        this.numarProgramatori = numarProgramatori;
        this.sedii = new ArrayList<>();
    }

    public int getNumarProgramatori() {
        return numarProgramatori;
    }

    @Override
    public void adauga(Sediu sediu) {
        this.sedii.add(sediu);
    }

    @Override
    public void sterge(Sediu sediu) {
        this.sedii.remove(sediu);
    }

    @Override
    public Sediu get(int index) {
        return this.sedii.get(index);
    }

    @Override
    public void afisare(String identare) {
        System.out.println(identare + "Sucursala cu numele " + this.nume + " are " + this.numarProgramatori + " programatori si contine " + this.sedii.size() + " sedii:");
        for (Sediu sediu : this.sedii) {
            sediu.afisare(identare + "        ");
        }
    }

    @Override
    public int calculeazaNumaraAngajati() {
        int sum = this.numarProgramatori;
        for (Sediu sediu : sedii) {
            sum += sediu.calculeazaNumaraAngajati();
        }
        return sum;
    }
}