package controlCalorias;

import general.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Miembro extends Persona {
    private String nombree;
    private LocalDate fechaNac;
    private HashSet<Miembro>familia;
    private int caloriasConsumidas = 0;

    public Miembro(String nombre, LocalDate f, HashSet<Miembro>familia, String nombree, LocalDate fechaNac){
        super(nombre,f);
        this.familia=familia;
        this.nombree=nombree;
        this.fechaNac=fechaNac;
    }

    public Miembro(){
        super();
    }

    public Miembro(String nombree, LocalDate fechaNac) {
    }

    public HashSet<Miembro> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<Miembro> familia) {
        this.familia = familia;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }


    public void platoComido(Miembro m, HashSet<Platos>platos, Platos p){
        for (Platos pAux:platos){
            if (familia.contains(m)){
                caloriasConsumidas+= pAux.getCantCalorias();
            }
        }
    }

    public static void main (String args[]) {
        HashSet<Miembro> familia = new HashSet<Miembro>();
        Miembro m = new Miembro("Paola",LocalDate.of(1987,5,6));
        familia.add(m);
        Platos p = new Platos();
        System.out.println("Ha consumido: " + m.caloriasConsumidas + " calorias.");
    }
}
