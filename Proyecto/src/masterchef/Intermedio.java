package masterchef;

import receta.Entrada;
import receta.Plato;
import receta.platoPrincipal;

import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante{
    private HashMap<String,Integer>ingrediente_stock;

    public Intermedio(String nombre, String apellido, String direccion, ColorEquipo equipo, HashMap<String, Integer> ingrediente_stock) {
        super(nombre, apellido, direccion, equipo);
        this.ingrediente_stock = ingrediente_stock;
    }

    public HashMap<String, Integer> getIngrediente_stock() {
        return ingrediente_stock;
    }

    public void setIngrediente_stock(HashMap<String, Integer> ingrediente_stock) {
        this.ingrediente_stock = ingrediente_stock;
    }
    @Override
    public void prepararLugarTrabajo(){
        System.out.println("Mi stock a utilizar es de ….");
        for(Map.Entry<String,Integer>mapAuxiliar:this.ingrediente_stock.entrySet()){
            String ingredienteAuxiliar=mapAuxiliar.getKey();
            int stockAuxiliar= mapAuxiliar.getValue();
            if(stockAuxiliar>1){
                System.out.println(ingredienteAuxiliar+", "+stockAuxiliar);
            }
        }
    }
    @Override//a la interfaz
    public String cocinar(Plato plato) throws itemNoEncontradoEnHash {
        String mensaje = "NO SE PUDO COCINAR";
        if(plato instanceof platoPrincipal) {
            int contador = 0;
            for (String ingrediente : plato.getIngredientes()) {
                if (this.ingrediente_stock.containsKey(ingrediente) && this.ingrediente_stock.get(ingrediente)>0) {
                    contador++;
                    if(this.ingrediente_stock.get(ingrediente)==1){
                        this.ingrediente_stock.remove(ingrediente);
                        System.out.println("Con esta receta te quedaste sin "+ingrediente);
                    }
                }
            }
            if (contador == plato.getIngredientes().size()) {
                mensaje="intermedio cocinó plato principal";
            } else {
                throw new itemNoEncontradoEnHash("No tiene los ingredientes necesarios");
            }
        }
        else{
            System.out.println("Los principiantes solo pueden cocinar Entradas");
        }
        return mensaje;
    }
}
