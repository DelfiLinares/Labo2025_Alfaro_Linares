package receta;

import java.util.ArrayList;
import java.util.HashSet;

public class Postre extends Plato{
    int temperatura;
    boolean diabetico;

    public Postre(String nombre, Nivel nivel, ArrayList<String> pasos, int temp, boolean diab){
        super(nombre, nivel, pasos);
        this.temperatura=temp;
        this.diabetico=true;
    }
    public Postre(String nombre, int temp, boolean diab, HashSet<String> ingredientes, int tiempo){
        super(nombre, ingredientes,tiempo);
        this.temperatura=temp;
        this.diabetico=true;
    }

    public Postre(){
        super();
        this.temperatura=10;
        this.diabetico=true;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isDiabetico() {
        return diabetico;
    }

    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }
    public void instrucciones(){
        System.out.println("Los pasos son...");
        for(String aux: this.getPasos()){
            System.out.println("Recordar mantener la cocina limpia y el horno al mínimo!");
            System.out.println(aux);
        }
    }
}
