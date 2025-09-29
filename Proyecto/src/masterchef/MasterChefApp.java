package masterchef;

import receta.Entrada;
import receta.Temperatura;
import receta.platoPrincipal;

import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        Principiante principiante=new Principiante("Juancito","Cito","CitoCito 6578",ColorEquipo.azul,new HashSet<>());
        principiante.getingredientesProhibidos().add("Tomate");
        principiante.getingredientesProhibidos().add("Queso");

        HashMap<String, Integer> ingStock=new HashMap<>();
        ingStock.put("Carne",2);
        ingStock.put("Papa",5);
        Intermedio intermedio=new Intermedio("Lucia","Cia","Lulu 2928",ColorEquipo.azul,ingStock);

        HashSet<String>ingredientesPalitosQueso=new HashSet<>();
        ingredientesPalitosQueso.add("Harina");
        ingredientesPalitosQueso.add("Agua");
        ingredientesPalitosQueso.add("Sal");
        ingredientesPalitosQueso.add("Queso");

        HashSet<String>ingredientesMilanesa=new HashSet<>();
        ingredientesMilanesa.add("Carne");
        ingredientesMilanesa.add("Pan Rallado");


        Experto experto=new Experto("Aby","Chus","Chuschus 8989",ColorEquipo.verde);

        platoPrincipal principal=new platoPrincipal("Milanesa",ingredientesMilanesa,81,5);
        Entrada entrada=new Entrada("Palitos de Queso",ingredientesPalitosQueso,20, Temperatura.CALIENTE);
        try{

            System.out.println("Participante "+principiante.getNombre()+":");
            principiante.prepararLugarTrabajo();
            principiante.cocinar(entrada);
        }
        catch(itemProhibidoEncontrado exc){
            exc.printStackTrace();
            exc.getMessage();
        }
        try{

            System.out.println("Participante "+intermedio.getNombre()+":");
            intermedio.prepararLugarTrabajo();
            intermedio.cocinar(principal);
        }
        catch(itemNoEncontradoEnHash exc){
            exc.printStackTrace();
            exc.getMessage();
        }
        try{
            System.out.println("Participante "+experto.getNombre()+":");
            experto.prepararLugarTrabajo();
            experto.cocinar(principal);
            experto.cocinar(entrada);
        }
        catch(NullPointerException exc){
            exc.printStackTrace();
            exc.getMessage();
        }
    }
}
