package receta;

import java.time.LocalTime;
import java.util.ArrayList;

public class platoPrincipal extends Plato{
    LocalTime tiempoCoccion;
    int comensales;

    public platoPrincipal(String nombre, Nivel nivel, ArrayList<String> pasos, LocalTime tiempo, int comensales){
        super(nombre, nivel, pasos);
        this.tiempoCoccion=tiempo;
        this.comensales=comensales;
    }
    public platoPrincipal(){
        super();
        this.tiempoCoccion=LocalTime.of(2,10,4);
        this.comensales=3;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public LocalTime getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(LocalTime tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    @Override
    public void instrucciones() {
        System.out.println("Esta receta tarda en cocinarse "+this.tiempoCoccion.toString()+". Los pasos son...");
        for(String aux: this.getPasos()){
            System.out.println(aux);
        }
    }

}
