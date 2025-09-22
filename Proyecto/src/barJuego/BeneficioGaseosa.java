package barJuego;

import bar.Azucarada;
import bar.Bebida;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements beneficioAcumulable {
    private HashSet<Azucarada>gaseosas;

    public BeneficioGaseosa(String nombre, String creador, HashSet<Azucarada> gaseosa) {
        super(nombre, creador);
        this.gaseosas = gaseosas;
    }

    public HashSet<Azucarada> getGaseosas() {
        return gaseosas;
    }

    public void setBebida(HashSet<Azucarada> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public int aplicarDescuentoExtra(){
        return 1000;
    }

    @Override
    public String tipo(){
        return "Acumulable";
    }
}
