package masterchef;

import receta.Entrada;
import receta.Plato;
import receta.Temperatura;

import java.util.ArrayList;
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

    @Override//a la clase padre
    public void prepararLugarTrabajo(){
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar:");
        for(String aux:this.ingredientesProhibidos){
            System.out.print(aux+"-");
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
                System.out.println("Se pudo cocinar el plato");
            } else {
                throw new itemProhibidoEncontrado("Hay ingredientes prohibidos en esta Entrada");
            }
        }
        else{
            System.out.println("Los principiantes solo pueden cocinar Entradas");
        }
    }

    public static void main(String[] args) {
        Principiante juancito=new Principiante("Juancito","Cito","CitoCito 6578",ColorEquipo.azul,new HashSet<>());
        juancito.ingredientesProhibidos.add("Tomate");
        juancito.ingredientesProhibidos.add("Queso");

        Intermedio lucia=new Intermedio("Lucia","Cia","Lulu 2928",ColorEquipo.azul,)

        HashSet<String>ingredientesPalitosQueso=new HashSet<>();
        ingredientesPalitosQueso.add("Harina");
        ingredientesPalitosQueso.add("Agua");
        ingredientesPalitosQueso.add("Sal");
        ingredientesPalitosQueso.add("Queso");
        Entrada entrada1=new Entrada("Palitos de Queso",ingredientesPalitosQueso,20, Temperatura.CALIENTE);
        try{
            juancito.cocinar(entrada1);
        }
        catch(itemProhibidoEncontrado exc){
            exc.printStackTrace();
            exc.getMessage();
        }
    }
}
