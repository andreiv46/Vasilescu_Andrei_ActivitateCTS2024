package builder.main;

import builder.clase.Pacient;
import builder.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder().setHalatPentruInterior(true).setMicDejunInclus(true).setPatRabatabil(true).setPapuciDeCamera(true).build();
        Pacient pacient2 = new PacientBuilder().setPatRabatabil(true).build();
        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}