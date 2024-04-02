package builder_inner.main;

import builder_inner.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder1 = new Pacient.PacientBuilder();
        Pacient pacient1 = pacientBuilder1.setHalatPentruInterior(true).
                setPatRabatabil(true).setMicDejunInclus(true).setPapuciDeCamera(true).build();
        Pacient.PacientBuilder pacientBuilder2 = new Pacient.PacientBuilder();
        Pacient pacient2 = pacientBuilder2.setHalatPentruInterior(true).setPatRabatabil(false).build();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}
