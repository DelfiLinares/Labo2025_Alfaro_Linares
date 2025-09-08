package barJuego;

import receta.Nivel;

import java.util.HashMap;

public class DianaRectangular extends Diana{
    private double base;
    private double altura;

    public DianaRectangular(String nombre, Nivel nivel, HashMap<Integer,ColorDiana> colorPuntaje, double base, double altura) {
        super(nombre, nivel, colorPuntaje);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area=base * altura;
        return area;
    }
}
