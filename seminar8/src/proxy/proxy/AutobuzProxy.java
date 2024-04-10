package proxy.proxy;

import proxy.clase.AutobuzAbstract;
import proxy.clase.Statie;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProxy implements AutobuzAbstract {
    AutobuzAbstract autobuz;
    List<String> statiiInterzise;

    public AutobuzProxy(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
        statiiInterzise = new ArrayList<>();
    }

    public void adaugaStatie(String statie){
        statiiInterzise.add(statie);
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statiiInterzise.contains(statie.getDenumire())){
            System.out.println("Nu opreste in statie deoarece este interzia!");
            return;
        }
        this.autobuz.setNrCalatori(statie.getNrCalatori());
        this.autobuz.opresteInStatie(statie);
    }

    @Override
    public int getNrLocuri() {
        return this.autobuz.getNrLocuri();
    }

    @Override
    public int getNrCalatori() {
        return this.autobuz.getNrCalatori();
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.autobuz.setNrCalatori(nrCalatori);
    }
}
