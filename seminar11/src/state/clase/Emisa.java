package state.clase;

public class Emisa implements State{
    protected Emisa() {
    }
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setState(this);
    }
}
