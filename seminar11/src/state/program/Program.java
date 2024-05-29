package state.program;

import state.clase.Reteta;

public class Program {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1, 3, 100);
        reteta.cerereMedicamente();
        reteta.cumparareMedicamente();
    }
}