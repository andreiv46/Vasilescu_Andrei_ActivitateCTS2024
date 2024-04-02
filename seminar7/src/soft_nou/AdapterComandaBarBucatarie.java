package soft_nou;

import soft_vechi.AbstractProdus;
import soft_vechi.SoftComanda;

public class AdapterComandaBarBucatarie extends ComandaBar implements SoftComanda {
    @Override
    public void printeazaBon() {
        this.tiparesteBon();
    }

    @Override
    public void adaugaProdus(AbstractProdus abstractProdus) {
        this.adaugaBautura((Bautura) abstractProdus);
    }
}
