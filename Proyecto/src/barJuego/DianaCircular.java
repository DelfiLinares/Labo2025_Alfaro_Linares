package barJuego;

import receta.Nivel;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radio = 13;

    public DianaCircular(String nombre, Nivel nivel,HashMap<Integer,ColorDiana>colorPuntaje) {
        super(nombre, nivel,colorPuntaje);
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        DianaCircular.radio = radio;
    }

    @Override
    public double calcularArea(){
        double area=radio*radio*Math.PI;
        return area;
    }

}
