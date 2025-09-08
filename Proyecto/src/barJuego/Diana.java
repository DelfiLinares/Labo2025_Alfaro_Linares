package barJuego;

import receta.Nivel;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private Nivel nivel;
    private HashMap<Integer, ColorDiana>colorPuntaje;

    public Diana(String nombre, Nivel nivel, HashMap<Integer,ColorDiana>colorPuntaje) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.colorPuntaje = colorPuntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public HashMap<Integer, ColorDiana> getColorPuntaje() {
        return colorPuntaje;
    }

    public void setColorPuntaje(HashMap<Integer, ColorDiana> colorPuntaje) {
        this.colorPuntaje = colorPuntaje;
    }

    public int cantidadPuntajes(){
        return this.colorPuntaje.keySet().size();
    }
    public abstract double calcularArea();

}
