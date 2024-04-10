package decorator.decorator;

import decorator.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract {
    protected BiletAbstract biletAbstract;

    public BiletDecorator(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    public abstract void reducerePret();
}
