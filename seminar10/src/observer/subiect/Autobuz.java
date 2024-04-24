package observer.subiect;

public class Autobuz extends Subject{
    @Override
    public void anuntaPlecare() {
        super.notificareObservers("Pleaca de la capat");
    }
    public void anuntaDeviereTraseu(){
        super.notificareObservers("A existat o deviere pe acest traseu");
    }
}
