package chain.clase;

public abstract class ModPlata {
    protected ModPlata succesor;

    public abstract void platesteCalatorie(float pret);

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }
}
