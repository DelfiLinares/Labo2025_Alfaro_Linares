package barJuego;


import receta.Plato;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements beneficioAcumulable {
    private HashSet<Plato> comidas;

    public BeneficioComida(HashSet<Plato> comidas, String nombre, String creador) {
        super(nombre, creador);
        this.comidas = comidas;
    }

    public HashSet<Plato> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<Plato> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int aplicarDescuentoExtra(){
        return 4500;
    }
}