package proxy.program;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzAbstract;
import proxy.clase.Statie;
import proxy.proxy.AutobuzDeNoapte;
import proxy.proxy.AutobuzProxy;

public class Program {
    public static void main(String[] args) {
        Statie statie1 = new Statie(12, "piata roaman");
        Statie statie2 = new Statie(0, "piata victoriei");
        Statie statie3 = new Statie(4, "piata 1 mai");
        AutobuzAbstract autobuzDeNoapte = new AutobuzDeNoapte(new Autobuz(123, 15, 0, "Marian"));
        autobuzDeNoapte.opresteInStatie(statie1);
        autobuzDeNoapte.opresteInStatie(statie2);
        autobuzDeNoapte.opresteInStatie(statie3);

        AutobuzProxy autobuzProxy = new AutobuzProxy(new Autobuz(124, 20, 0, "Gab"));
        autobuzProxy.adaugaStatie(statie1.getDenumire());
        autobuzProxy.opresteInStatie(statie1);
        autobuzProxy.opresteInStatie(statie3);
    }
}
