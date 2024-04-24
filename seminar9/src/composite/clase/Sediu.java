package composite.clase;

public interface Sediu {
    void adauga(Sediu sediu) throws Exception;
    void sterge(Sediu sediu) throws Exception;
    Sediu get(int index) throws Exception;
    void afisare(String identare);
    int calculeazaNumaraAngajati();
}