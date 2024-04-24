package program;

import strategy.*;

public class Program {

    public static void plateste(Validator validator, ModPlata modPlata, float pret){
        validator.setModPlata(modPlata);
        validator.efectueazaPlata(pret);
    }

    public static void main(String[] args) {
        Validator validator = new Validator(123);
        ModPlata plataSMS = new PlataSMS();
        ModPlata plataCardCalaotrii = new PlataCardCalatorii();
        ModPlata plataCardBancar = new PlataCardBancar();
        plateste(validator, plataCardBancar, 89);
    }
}
