package receta;

import java.util.ArrayList;
import java.util.HashSet;

public class Entrada extends Plato {
    Temperatura temp;

    public Entrada(String nombre, Nivel nivel, ArrayList<String> pasos, Temperatura temp){
        super(nombre, nivel, pasos);
        this.temp=temp;
    }
    //constructor para masterchef
    public Entrada(String nombre, HashSet<String> ingredientes, int tiempo, Temperatura temp){
        super(nombre, ingredientes, tiempo);
        this.temp=temp;
    }
    public Entrada(){
        super();
        this.temp=Temperatura.FRIO;
    }

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    @Override
    public void instrucciones() {
        Temperatura f=Temperatura.FRIO;
        Temperatura c=Temperatura.CALIENTE;
        System.out.println("Los pasos son...");
        if (this.temp.equals(f)){
            for(String aux: this.getPasos()){
                System.out.println(aux);
            }
            System.out.println("Recuerde guardarlo en la heladera!");
        }
        if(this.temp.equals(c)){
            System.out.println("Recuerde prender el horno!");
            for(String aux: this.getPasos()){
                System.out.println(aux);
            }
        }
    }
}
