package main;

import soft_nou.AdapterComandaBarBucatarie;
import soft_nou.ComandaBar;
import soft_nou.Bautura;
import soft_vechi.ComandaBucatarie;
import soft_vechi.AbstractProdus;
import soft_vechi.ProdusBucatarie;
import soft_vechi.SoftComanda;

public class Program {
    public static void platesteConsumatie(SoftComanda comanda) {
        comanda.printeazaBon();
    }
    public static void main(String[] args) {
        ComandaBucatarie bucatarie = new ComandaBucatarie();
        bucatarie.adaugaProdus(new ProdusBucatarie("Paine", 2.5));
        bucatarie.adaugaProdus(new ProdusBucatarie("Lapte", 3.5));
        platesteConsumatie(bucatarie);

        ComandaBar bar = new ComandaBar();
        bar.adaugaBautura(new Bautura("Bere", 5, 0.5));
        bar.adaugaBautura(new Bautura("Vin", 20, 0.75));

        AdapterComandaBarBucatarie adapter = new AdapterComandaBarBucatarie();
        adapter.adaugaProdus(new Bautura("Whiskey", 50.4, 0.4));
        adapter.adaugaProdus(new Bautura("Vodka", 30.4, 0.4));
        platesteConsumatie(adapter);
    }
}
