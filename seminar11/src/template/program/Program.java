package template.program;

import template.clase.AchizitieMedicamentePeBazaDeReteta;
import template.clase.Template;

public class Program {
    public static void main(String[] args) {
        Template achizitieMedicamentePeBazaDeReteta = new AchizitieMedicamentePeBazaDeReteta("Nurofen");
        achizitieMedicamentePeBazaDeReteta.cumparareMedicament();
    }
}