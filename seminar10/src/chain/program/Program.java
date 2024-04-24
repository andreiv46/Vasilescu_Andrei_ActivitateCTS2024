package chain.program;

import chain.clase.Validator;

public class Program {
    public static void main(String[] args) {
        Validator validator = new Validator(32);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
        validator.efectueazaPlata(20);
    }
}
