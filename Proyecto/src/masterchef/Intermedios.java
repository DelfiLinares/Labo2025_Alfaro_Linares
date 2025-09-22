package masterchef;

import java.util.HashMap;
import java.util.Map;

public class Intermedios extends Participante{
    private HashMap<String,Integer>ingrediente_stock;

    public Intermedios(String nombre, String apellido, String direccion, ColorEquipo equipo, HashMap<String, Integer> ingrediente_stock) {
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
                System.out.println(ingredienteAuxiliar);
            }
        }
    }
}
