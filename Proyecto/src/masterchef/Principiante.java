package masterchef;

import java.util.HashSet;

public class Principiante extends Participante{
    private HashSet<String>ingredientesProhibidos;

    public Principiante(String nombre, String apellido, String direccion, ColorEquipo equipo, HashSet<String> ingredientesProhibidos) {
        super(nombre, apellido, direccion, equipo);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<String> getingredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setingredientesProhibidos(HashSet<String> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    @Override
    public void prepararLugarTrabajo(){
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar:");
        for(String aux:this.ingredientesProhibidos){
            System.out.print(aux+"-");
        }
    }
}
