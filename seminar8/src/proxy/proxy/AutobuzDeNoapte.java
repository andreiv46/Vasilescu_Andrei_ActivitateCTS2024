package proxy.proxy;

import proxy.clase.AutobuzAbstract;
import proxy.clase.Statie;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private AutobuzAbstract autobuz;

    public AutobuzDeNoapte(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statie.getNrCalatori() == 0){
            System.out.println("Autobuzul nu a oprit in statie deoarece nu erau calatori in statie");
            return;
        }
        if(statie.getNrCalatori() + this.autobuz.getNrCalatori() > this.autobuz.getNrLocuri()){
            System.out.println("Autobuzul nu a oprit in statie deoarece nu era destul loc in autobuz");
            return;
        }
        this.autobuz.setNrCalatori(this.autobuz.getNrCalatori() + statie.getNrCalatori());
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
