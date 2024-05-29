package state.clase;

public class Reteta {
    private int nrRetetea;
    private int nrMedicamente;
    private float pret;
    private State state;

    public Reteta(int nrRetetea, int nrMedicamente, float pret) {
        this.nrRetetea = nrRetetea;
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.state = new Emisa();
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void cerereMedicamente(){
        if(this.state instanceof Emisa){
            System.out.printf("Au fost solicitate %d medicamente in baza retetei cu numarul %d\n",
                    this.nrMedicamente,
                    this.nrRetetea);
            State solicitata = new Solicitata();
            solicitata.schimbaStare(this);
        }
        else{
            System.out.println("Nu puteti solicita medicamente in baza acestei retete");
        }
    }

    public void cumparareMedicamente(){
        if(this.state instanceof Solicitata){
            System.out.printf("Au fost achizitionate %d medicamente in baza retetei cu numarul %d\n",
                    this.nrMedicamente,
                    this.nrRetetea);
            State achizitionata = new Achizitionata();
            achizitionata.schimbaStare(this);
        }
        else{
            System.out.println("Nu puteti lua medicamente in baza acestei retete");
        }
    }

    public void respingeReteta(){
        if(this.state instanceof Solicitata){
            System.out.printf("Reteta cu numarul %d a fost respinsa deoarece nu avem aceste medicamente in stoc\n",
                    this.nrRetetea);
            State emisa = new Emisa();
            emisa.schimbaStare(this);
        }
        else{
            System.out.println("Reteta nu a fost solicitata");
        }
    }
}
