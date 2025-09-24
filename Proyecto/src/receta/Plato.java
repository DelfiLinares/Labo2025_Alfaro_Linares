package receta;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Plato {
    private String nombre;
    private Nivel nivel;
    private ArrayList<String> pasos;
    private HashSet<String>ingredientes;
    private int tiempoPreparado;


    /*Constructor para receta*/
    public Plato(String nombre, Nivel nivel,ArrayList<String> pasos){
        this.nombre=nombre;
        this.nivel=nivel;
        this.pasos=pasos;
    }

    /*Constructor para masterchef*/
    public Plato(String nombre, HashSet<String>ingredientes,int tiempo){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
        this.tiempoPreparado=tiempo;
    }
    public Plato(String nombre){
        this.nombre=nombre;
    }

    public Plato(){
        this.nombre="Ensalada de palta y kanikama";
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

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPreparado() {
        return tiempoPreparado;
    }

    public void setTiempoPreparado(int tiempoPreparado) {
        this.tiempoPreparado = tiempoPreparado;
    }

    public abstract void instrucciones();
}
