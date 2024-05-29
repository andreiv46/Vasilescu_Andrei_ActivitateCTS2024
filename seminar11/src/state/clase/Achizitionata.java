package state.clase;

public class Achizitionata implements State{
    protected Achizitionata() {
    }
    @Override
    public void schimbaStare(Reteta state) {
        state.setState(this);
    }
}
