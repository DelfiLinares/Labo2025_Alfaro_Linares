package masterchef;

import receta.Entrada;
import receta.Plato;
import receta.platoPrincipal;

public class Experto extends Participante{
    private static int minutosCocina=80;

    public Experto(String nombre, String apellido, String direccion, ColorEquipo equipo) {
        super(nombre, apellido, direccion, equipo);
    }

    public static int getMinutosCocina() {
        return minutosCocina;
    }

    public static void setMinutosCocina(int minutosCocina) {
        Experto.minutosCocina = minutosCocina;
    }
    @Override
    public void prepararLugarTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es de "+(minutosCocina-5)+" minutos");
        minutosCocina=minutosCocina-5;
    }
    @Override//a la interfaz
    public String cocinar(Plato plato) throws NullPointerException {
        String mensaje = "NO SE PUDO COCINAR";
                if (minutosCocina>=plato.getTiempoPreparado()) {
                    minutosCocina=minutosCocina- plato.getTiempoPreparado();
                    System.out.println("Tiempo sobrante:"+minutosCocina);
                    if(minutosCocina==0){
                        System.out.println("Con esta receta te quedaste sin tiempo disponible");
                    }
                    if(plato instanceof Entrada){
                        mensaje="Experto cocinó entrada";
                    }
                    else{
                        mensaje="Experto cocinó plato principal";
                    }
                }
                else{
                    throw new NullPointerException("No tiene el tiempo disponible suficiente");
                }
                return mensaje;
    }
}
