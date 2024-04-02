package soft_nou;

import java.util.ArrayList;
import java.util.List;

public class ComandaBar {
    List<Bautura> bauturi;

    public ComandaBar() {
        this.bauturi = new ArrayList<>();
    }
    public void adaugaBautura(Bautura bautura) {
        this.bauturi.add(bautura);
    }
    public void tiparesteBon() {
        System.out.println("Bonul contine: ");
        for (Bautura bautura : bauturi) {
            System.out.println(bautura.getDenumire() + " - " + bautura.getPret() + " lei");
        }
        System.out.println("Total: " + bauturi.stream().mapToDouble(Bautura::getPret).sum());
    }
}
