package decorator.decorator;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;

public class BiletSarbatori extends BiletDecorator{
    private static final double PROCENT_DISCOUNT = 0.1;
    public BiletSarbatori(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void printareBilet() {
        super.biletAbstract.printareBilet();
        System.out.println("SARBATORI FERICITE BAAA");
    }

    @Override
    public void reducerePret() {
        ((Bilet)super.biletAbstract).setPret(((Bilet) super.biletAbstract).getPret() * (1 - PROCENT_DISCOUNT));
    }
}
