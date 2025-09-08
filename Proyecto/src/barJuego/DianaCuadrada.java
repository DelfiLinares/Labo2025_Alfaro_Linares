package barJuego;

import receta.Nivel;

import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private double lado;

    public DianaCuadrada(String nombre, Nivel nivel, double lado,HashMap<Integer,ColorDiana> colorPuntaje) {
        super(nombre, nivel, colorPuntaje);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}
