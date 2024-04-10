package decorator.decorator;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;

public class BiletAniversareSTB extends BiletDecorator{

    private static final double PROCENT_DISCOUNT =  0.1;

    public BiletAniversareSTB(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void printareBilet() {
        super.biletAbstract.printareBilet();
        System.out.println("LA MULTI ANI");
    }

    @Override
    public void reducerePret() {
        ((Bilet)super.biletAbstract).setPret(0);
    }
}
