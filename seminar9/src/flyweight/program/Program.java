package flyweight.program;

import flyweight.clase.Banca;
import flyweight.clase.Cont;

public class Program {
    public static void main(String[] args) {
        Banca banca = new Banca(1234, 32532.4332);
        Cont cont_1 = new Cont("RF", 123.324);
        Cont cont_2 = new Cont("BT", 432.32);
        Cont cont_3 = new Cont("George", 234.44);
        banca.getDetaliiClient("0799586535", "Str. Aleea Cetatuia 4", "Gigel").afiseazaInformatie(cont_1);
        banca.getDetaliiClient("0799586535").afiseazaInformatie(cont_2);
        banca.getDetaliiClient("0755112233", "Str. Aleea Cetatuia 6", "Ionel").afiseazaInformatie(cont_3);
    }
}
