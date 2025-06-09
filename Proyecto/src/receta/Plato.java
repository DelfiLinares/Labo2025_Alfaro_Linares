package receta;

import java.util.ArrayList;

public abstract class Plato {
    String nombre;
    Nivel nivel;
    ArrayList<String> pasos;

    public Plato(String nombre, Nivel nivel,ArrayList<String> pasos){
        this.nombre=nombre;
        this.nivel=nivel;
        this.pasos=pasos;
    }

    public Plato(){
        this.nombre="suchi";
        this.nivel=Nivel.AVANZADO;
        this.pasos=new ArrayList<>();
        pasos.add("Paso 1...");
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void instrucciones();
}
