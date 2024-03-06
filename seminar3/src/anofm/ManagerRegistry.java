package anofm;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instance = null;

    private ManagerRegistry() {
        this.manageri = new HashMap<>();
    }

    public synchronized static ManagerRegistry getInstance() {
        if (instance == null) {
            instance = new ManagerRegistry();
        }
        return instance;
    }
    public void inregistreazaManager(String numeFirma, String numeManager, float salariu) {
        manageri.putIfAbsent(numeFirma, new Manager(numeFirma, numeManager, salariu));
    }

    public Map<String, Manager> getManageri() {
        return manageri;
    }
}
