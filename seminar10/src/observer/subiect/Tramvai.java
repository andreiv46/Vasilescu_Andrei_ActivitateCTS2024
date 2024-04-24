package observer.subiect;

public class Tramvai extends Subject{

    private int nrLinie;

    public Tramvai(int nrLinie) {
        super();
        this.nrLinie = nrLinie;
    }

    @Override
    public void anuntaPlecare() {
        super.notificareObservers("Tramvaiul de pe linia" + this.nrLinie + " pleaca de la capat");
    }
}
