package masterchef;

import receta.Entrada;
import receta.Plato;
import receta.Temperatura;
import receta.platoPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

    @Override//a la clase padre
    public void prepararLugarTrabajo(){
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar:");
        for(String aux:this.ingredientesProhibidos){
            System.out.println(aux);
        }
    }
    @Override//a la interfaz
    public void cocinar(Plato plato) throws itemProhibidoEncontrado {
        if(plato instanceof Entrada) {
            int contador = 0;
            for (String ingrediente : plato.getIngredientes()) {
                if (!this.ingredientesProhibidos.contains(ingrediente)) {
                    contador++;
                }
            }
            if (contador == plato.getIngredientes().size()) {
                System.out.println("SE PUDO COCINAR EL PLATO");
            } else {
                throw new itemProhibidoEncontrado("Hay ingredientes prohibidos en esta Entrada");
            }
        }
        else{
            System.out.println("Los principiantes solo pueden cocinar Entradas");
        }
    }

}
