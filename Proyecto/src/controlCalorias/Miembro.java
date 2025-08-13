package controlCalorias;

import general.Persona;
import java.time.LocalDate;
import java.util.HashSet;

public class Miembro extends Persona {
    private int caloriasConsumidas;
    private HashSet<PlatoCal>platos;
    

    public Miembro(String nombre, LocalDate f, HashSet<PlatoCal>platos){
        super(nombre,f);
        this.platos=platos;

    }

    public Miembro(){
        super();
        this.platos=new HashSet<>();
        this.agregarPlato(new PlatoCal("Ejemplo",new HashSet<>(),1000000000));
    }

    public HashSet<PlatoCal> getPlatos() {
        return platos;
    }

    public void setPlato(HashSet<PlatoCal> Plato) {
        this.platos = platos;
    }

    public int getCaloriasConsumidas() {
        return this.caloriasConsumidas;
    }

    public void setCaloriasConsumidas(int caloriasConsumidas) {
        this.caloriasConsumidas = caloriasConsumidas;
    }


    public int cantCalorias(){
        int totalCals = 0;
        for (PlatoCal pAux:this.platos){
            totalCals+=pAux.getCantCalorias();
        }return totalCals;
    }
    public void agregarPlato(PlatoCal pNuevo){
        this.platos.add(pNuevo);
    }

}
