package template.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map<String, Integer> stocuri;

    public Template() {
        stocuri = new HashMap<>();
        stocuri.put("Nurofen", 1);
        stocuri.put("Paracetamol", 2);
        stocuri.put("Algocalmin", 3);
    }
    public final void cumparareMedicament(){
        primireReteta();
        if(verificaStoc()) {
            aducereMedicamente();
            incaseaza();
            emiteBon();
        }else {
            respingeAchizitie();
        }
    }

    protected abstract void emiteBon();

    protected abstract void aducereMedicamente();

    protected abstract void respingeAchizitie();

    protected abstract void incaseaza();

    protected abstract boolean verificaStoc();

    protected abstract void primireReteta();

}
