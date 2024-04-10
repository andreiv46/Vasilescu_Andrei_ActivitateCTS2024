package proxy.clase;

public class Autobuz implements AutobuzAbstract{

    private int nrAutobuz;
    private int nrLocuri;
    private int nrCalatori;
    private String numeleSoferului;

    public Autobuz(int nrAutobuz, int nrLocuri, int nrCalatori, String numeleSoferului) {
        this.nrAutobuz = nrAutobuz;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
        this.numeleSoferului = numeleSoferului;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public String getNumeleSoferului() {
        return numeleSoferului;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul a oprit in statia " + statie.getDenumire());
    }
}
