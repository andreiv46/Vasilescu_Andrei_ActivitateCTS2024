package template.clase;

public class AchizitieMedicamentePeBazaDeReteta extends Template {
    private String numeMedicament;

    public AchizitieMedicamentePeBazaDeReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;
    }

    @Override
    protected void emiteBon() {
        System.out.println("S-a emis bon pentru medicamentul " + numeMedicament);
    }

    @Override
    protected void aducereMedicamente() {
        System.out.println("S-a adus medicamentul " + numeMedicament);
        if(super.stocuri.get(numeMedicament) > 1) {
            super.stocuri.replace(numeMedicament, super.stocuri.get(numeMedicament) - 1);
        }
        else{
            super.stocuri.remove(numeMedicament);
        }
    }

    @Override
    protected void respingeAchizitie() {
        System.out.println("Nu avem medicamentul " + numeMedicament + " in stoc");
    }

    @Override
    protected void incaseaza() {
        System.out.println("S-a incasat suma pentru medicamentul " + numeMedicament);
    }

    @Override
    protected boolean verificaStoc() {
        return super.stocuri.containsKey(numeMedicament);
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru medicamentul " + numeMedicament);
    }
}
