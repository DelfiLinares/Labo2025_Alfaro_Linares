package controlCalorias;

import sistema_almuerzos.Plato;

import java.util.ArrayList;
import java.util.HashSet;

public class Platos {
    private String nombre;
    private HashSet<String>ingredientes = new HashSet<String>();
    private int cantCalorias;

    public Platos (String nombre, HashSet<String>ingredientes, int cantCalorias){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
        this.cantCalorias=cantCalorias;
    }

    public Platos(){
        this.nombre="Ensalada de palta y kanikama";
        ingredientes.add("palta");
        ingredientes.add("kanikama");
        ingredientes.add("sal");
        ingredientes.add("aceite");
        this.cantCalorias=280;
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

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
