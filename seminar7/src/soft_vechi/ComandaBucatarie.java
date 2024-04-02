package soft_vechi;

import java.util.ArrayList;
import java.util.List;

public class ComandaBucatarie implements SoftComanda {
    List<AbstractProdus> produse;

    public ComandaBucatarie() {
        this.produse = new ArrayList<>();
    }

    public void adaugaProdus(AbstractProdus abstractProdus) {
        this.produse.add(abstractProdus);
    }

    @Override
    public void printeazaBon() {
        System.out.println("Bonul contine: ");
        for (AbstractProdus abstractProdus : produse) {
            System.out.println(abstractProdus.getDenumire() + " - " + abstractProdus.getPret() + " lei");
        }
        System.out.println("Total: " + produse.stream().mapToDouble(AbstractProdus::getPret).sum());
    }
}
