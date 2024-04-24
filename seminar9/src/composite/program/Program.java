package composite.program;

import composite.clase.Sediu;
import composite.composite.AgentieComposite;
import composite.composite.Filiala;
import composite.composite.SucursalaComposite;

public class Program {
    public static void main(String[] args) throws Exception {
        Sediu sediu = new AgentieComposite("Banca", 10);

        Sediu sucursala_brd = new SucursalaComposite("BRD", 9);
        Sediu agentie_brd_sector_1 = new AgentieComposite("BRD-Sector1", 23);
        Sediu agentie_brd_sector_2 = new AgentieComposite("BRD-Sector2", 14);

        Sediu filiala_brd_romana = new Filiala("BRD-Romana", 5);
        Sediu filiala_brd_victoriei = new Filiala("BRD-Victoriei", 10);
        Sediu filiala_brd_obor = new Filiala("BRD-Obor", 4);
        Sediu filiala_brd_muncii = new Filiala("BRD-Muncii", 2);

        // creare structura arborescenta
        agentie_brd_sector_1.adauga(filiala_brd_romana);
        agentie_brd_sector_1.adauga(filiala_brd_victoriei);

        agentie_brd_sector_2.adauga(filiala_brd_obor);
        agentie_brd_sector_2.adauga(filiala_brd_muncii);

        sucursala_brd.adauga(agentie_brd_sector_1);
        sucursala_brd.adauga(agentie_brd_sector_2);

        sediu.adauga(sucursala_brd);

        sediu.afisare("\t");

        System.out.println("Agentie Sector 1: " + agentie_brd_sector_1.calculeazaNumaraAngajati());
        System.out.println("Tot sediul: " + sediu.calculeazaNumaraAngajati());
    }
}
