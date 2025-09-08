package electricidad;

import java.util.HashMap;

public class controlAnual {
    private HashMap<Mes, Double> control;

    public controlAnual(HashMap<Mes, Double> control) {
        this.control = control;
    }

    public HashMap<Mes, Double> getControl() {
        return control;
    }

    public void setControl(HashMap<Mes, Double> control) {
        this.control = control;
    }
}
