package decorator.program;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;
import decorator.decorator.BiletAniversareSTB;
import decorator.decorator.BiletDecorator;
import decorator.decorator.BiletSarbatori;

public class Program {

    public static void printare(BiletAbstract biletAbstract){
        biletAbstract.printareBilet();
    }

    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet("dab2", 0.99);
//        printare(bilet);

        BiletDecorator biletSarbatori = new BiletSarbatori(new Bilet("gabidab12", 4.99));
        biletSarbatori.reducerePret();
//        printare(biletSarbatori);

        BiletDecorator biletAniversarePaste = new BiletAniversareSTB(new BiletSarbatori(new Bilet("paste123", 32)));
        printare(biletAniversarePaste);
    }
}
