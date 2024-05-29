package state.clase;

public class Solicitata implements State{
    protected Solicitata() {
    }
    @Override
    public void schimbaStare(Reteta state) {
        state.setState(this);
    }
}
