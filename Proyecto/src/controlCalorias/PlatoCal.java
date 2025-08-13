package controlCalorias;

import receta.Plato;

import java.util.HashSet;

public class PlatoCal extends Plato {
    private HashSet<String> ingredientes = new HashSet<String>();
    private int cantCalorias;

    public PlatoCal (String nombre, HashSet<String>ingredientes, int cantCalorias){
        super(nombre);
        this.ingredientes=ingredientes;
        this.cantCalorias=cantCalorias;
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

    public void instrucciones(){

    }
}
