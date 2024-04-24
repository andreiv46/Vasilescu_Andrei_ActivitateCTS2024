package observer.program;

import observer.observer.Client;
import observer.subiect.Autobuz;
import observer.subiect.Tramvai;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Liviu");
        Client client1 = new Client("Andrei");
        Tramvai tramvai = new Tramvai(41);

        tramvai.abonareObservers(client);
        tramvai.abonareObservers(client1);

        tramvai.anuntaPlecare();
        tramvai.dezabonareObservers(client);

        Client client3 = new Client("Gabi");
        tramvai.abonareObservers(client3);
        tramvai.anuntaPlecare();

        Autobuz autobuz = new Autobuz();
        autobuz.abonareObservers(client);
        autobuz.abonareObservers(client1);
        autobuz.abonareObservers(client3);

        autobuz.anuntaDeviereTraseu();
        autobuz.anuntaPlecare();

    }
}
